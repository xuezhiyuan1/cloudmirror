package com.example.administrator.myapplication.queen;

import android.os.Environment;
import android.util.Log;
import com.example.administrator.myapplication.base.Keys;
import com.example.administrator.myapplication.model.util.MakeFileUtils;
import com.rabbitmq.client.Channel;
import org.json.JSONObject;
import org.springframework.amqp.core.Address;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Map;


/**
 * Error:Execution failed for task ':app:transformResourcesWithMergeJavaResForDebug'.
 * > More than one file was found with OS independent path 'META-INF/spring.tooling'
 */

/**
 * Created by ZhiYuan
 */

public class ClientConsumer implements ChannelAwareMessageListener {

    private RabbitTemplate rabbitTemplate;
    private BufferedWriter out;
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void onMessage(Message m, Channel channel) throws Exception {
        int yAxis, xAxis, zAxis, deliverySpeed, machineId;
        Map<String, Object> message = (Map<String, Object>) new ObjectInputStream(new ByteArrayInputStream(m.getBody())).readObject();
        try {
            channel.basicAck(m.getMessageProperties().getDeliveryTag(), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //在消息中取出信息
        Integer operation = (Integer) message.get("operation");
        Map<String, String> parameters = (Map<String, String>) message.get("parameters");
        //针对消息中的不同操作，调用不同接口   1是出货成功  2机器故障，向后台返回响应  3货仓有货，但取货超时
        String machineIdStr = parameters.get("machineId");
        machineId = Integer.parseInt(machineIdStr);
        SimpleDateFormat formatter = new   SimpleDateFormat   ("yyyy年MM月dd日   HH:mm:ss");
        java.util.Date curDate = new java.util.Date(System.currentTimeMillis());
        String time = formatter.format(curDate);
        MakeFileUtils.getInstance().makeFilePath(Environment.getExternalStorageDirectory()+"/Vendor/Android/",machineId+"-客户端出货返回"+".txt");
        out = new BufferedWriter(new FileWriter(Environment.getExternalStorageDirectory()+"/Vendor/Android/"+machineId+"-客户端出货返回.txt",true));
        String resultData = "00";
        if (operation == Keys.ONE) {
            try {
                if (parameters != null) {
                    String Y_Axis = parameters.get("yAxis");
                    yAxis = Integer.parseInt(Y_Axis);
                    String X_Axis = parameters.get("xAxis");
                    xAxis = Integer.parseInt(X_Axis);
                    String Z_Axis = parameters.get("zAxis");
                    zAxis = Integer.parseInt(Z_Axis);
                    String roadName = parameters.get("cargoRoadName");
                    String[] split = roadName.split("-");
                    String sv = "";
                    if (2 == split.length) sv = split[1];
                    if ("XS".equals(sv)) {
                        deliverySpeed = 1000;
                    } else if ("S".equals(sv)) {
                        deliverySpeed = 1500;
                    } else if ("M".equals(sv)) {
                        deliverySpeed = 2000;
                    } else if ("L".equals(sv)) {
                        deliverySpeed = 2500;
                    } else if ("XL".equals(sv)) {
                        deliverySpeed = 3000;
                    } else {
                        deliverySpeed = 2000;
                    }
                    resultData = machinePushGoods(machineId, xAxis, yAxis, zAxis, deliverySpeed);
                    out.write(time+"=-------------------------------------"+resultData+"\r\n"+"\r\n");
                    out.flush(); // 把缓存区内容压入文件
                    out.close(); // 最后记得关闭文件
                }
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.TWO) {
            //判断货仓是否有货   1物品已经拿走(无货)  -1有货   0异常
            try {
                resultData = machineOrTakeGoods(machineId);
                Log.d("xuezhiyuan", resultData + "判断货仓是否有货");
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.THREE) {
            //判断货仓门是否开启   1是开  -1关闭  0是异常
            try {
                Log.d("xuezhiyuan", "判断货仓门是否开启");
                resultData = machineDoorOrOpen(machineId);
                Log.d("xuezhiyuan", resultData + "判断货仓门是否开启");
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.SIX) {
            //前置电机测试
            try {
                if (parameters != null) {
                    String Z_Axis = parameters.get("zAxis");
                    zAxis = Integer.parseInt(Z_Axis);
                    resultData = machineFrontTest(machineId, zAxis);
                }
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.SENVEN) {
            //前置电机归位
            try {
                resultData = machineFrontBack(machineId);
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.EIGHT) {
            //后置电机测试
            try {
                if (parameters != null) {
                    String Y_Axis = parameters.get("yAxis");
                    yAxis = Integer.parseInt(Y_Axis);
                    String X_Axis = parameters.get("xAxis");
                    xAxis = Integer.parseInt(X_Axis);
                    resultData = machineBehindTest(machineId, xAxis, yAxis);
                }
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.NINE) {
            //后置电机归位
            try {
                resultData = machineBehindBack(machineId);
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.TEN) {
            //新的出货流程
            try {
                if (parameters != null) {
                    String Y_Axis = parameters.get("yAxis");
                    yAxis = Integer.parseInt(Y_Axis);
                    String X_Axis = parameters.get("xAxis");
                    xAxis = Integer.parseInt(X_Axis);
                    String Z_Axis = parameters.get("zAxis");
                    zAxis = Integer.parseInt(Z_Axis);
                    String roadName = parameters.get("cargoRoadName");
                    String[] split = roadName.split("-");
                    String sv = "";
                    if (2 == split.length) sv = split[1];
                    if ("XS".equals(sv)) {
                        deliverySpeed = 1000;
                    } else if ("S".equals(sv)) {
                        deliverySpeed = 1500;
                    } else if ("M".equals(sv)) {
                        deliverySpeed = 2000;
                    } else if ("L".equals(sv)) {
                        deliverySpeed = 2500;
                    } else if ("XL".equals(sv)) {
                        deliverySpeed = 3000;
                    } else {
                        deliverySpeed = 2000;
                    }
                    resultData = machineShipment(machineId, xAxis
                            , yAxis, zAxis, deliverySpeed);
                }
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.ELEVEN) {
            //检测货仓和货仓门
            try {
                resultData = machineRedLineState(machineId);
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.TWELVE) {
            //新的取货
            try {
                resultData = machineTackShop(machineId);
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        } else if (operation == Keys.THIRTEEN) {
            //反扫器
            try {
                resultData = scanQRcode(machineId);
            } catch (Exception e) {
                Log.d("Exception", e.getMessage());
            }
        }
        Address replyTo = m.getMessageProperties().getReplyToAddress();
        rabbitTemplate.convertAndSend(replyTo.getExchangeName(), replyTo.getRoutingKey(), resultData);
    }

    //  出货接口
    private String machinePushGoods(Integer machineId, Integer x, Integer y, Integer z, Integer deliverySpeed) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/Sale?machineId=" + machineId + "&xAxis=" + x + "&yAxis=" + y + "&zAxis=" + z + "&deliverySpeed=" + deliverySpeed);
            String result = connectWithHttpURLConnection(url);
            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }

    //    前置电机测试
    private String machineFrontTest(Integer machineId, Integer z) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/TestElevator?machineId=" + machineId + "&zAxis=" + z);
            return connectWithHttpURLConnection(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }

    //    前置电机归位
    private String machineFrontBack(Integer machineId) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/ResetElevator?machineId=" + machineId);
            return connectWithHttpURLConnection(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }

    //    后置电机测试
    private String machineBehindTest(Integer machineId, Integer x, Integer y) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/TestBackMotor?machineId=" + machineId + "&xAxis=" + x + "&yAxis=" + y);
            return connectWithHttpURLConnection(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }

    //新的出货流程
    private String machineShipment(Integer machineId, Integer x, Integer y, Integer z, Integer deliverySpeed) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/NewShipMent?machineId=" + machineId + "&xAxis=" + x + "&yAxis=" + y + "&zAxis=" + z + "&deliverySpeed=" + deliverySpeed);
            String result = connectWithHttpURLConnection(url);
            Log.d("shop", result + "------新的出货返回==0");
            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }

    //电机静止查询红外状态
    private String machineRedLineState(Integer machineId) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/RedLineState?machineId=" + machineId);
            String result = connectWithHttpURLConnection(url);
            Log.d("shop", result + "------电机静止查询红外状态返回");
            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }

    //新的取货
    private String machineTackShop(Integer machineId) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/TimeOut?machineId=" + machineId);
            String result = connectWithHttpURLConnection(url);
            Log.d("shop", result + "------新的取货返回");
            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }

    //二维码反扫器
    private String scanQRcode(Integer machineId) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/ScanQRcodeResult?machineId=" + machineId);
            String result = connectWithHttpURLConnection(url);
            String sCan = result + "|" + machineId;
            return sCan;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }


    //    后置电机归位
    private String machineBehindBack(Integer machineId) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/ResetBackMotor?machineId=" + machineId);
            return connectWithHttpURLConnection(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }

    //关门
    private String machineDoorClose(Integer machineId) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/DoorCloseState?machineId=" + machineId);
            return connectWithHttpURLConnection(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }

    //  判断货物是否被取走
    private String machineOrTakeGoods(int machineId) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/IsItemPicked?machineId=" + machineId);
            return connectWithHttpURLConnection(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }


    //  判断货仓门是否开启
    private String machineDoorOrOpen(int machineId) {
        try {
            URL url = new URL("http://localhost:9000/SaleMachineWebService/IsDispenserDoorOpen?machineId=" + machineId);
            String result = connectWithHttpURLConnection(url);
            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "400";
        }
    }


    // 网络请求
    private String connectWithHttpURLConnection(URL url) {

        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
            // 设置请求方式，GET或POST
            connection.setRequestMethod("GET");
            // 设置连接超时、读取超时的时间，单位为毫秒（ms）
            connection.setConnectTimeout(200000);
            connection.setReadTimeout(200000);
            // getInputStream方法获取服务器返回的输入流
            InputStream in = connection.getInputStream();
            // 使用BufferedReader对象读取返回的数据流
            // 按行读取，存储在StringBuider对象response中
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            JSONObject json = new JSONObject(response.toString());
            String data = json.getString("options");
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            connection.disconnect();
            return "400";
        } finally {
            if (connection != null) {
                // 结束后，关闭连接
                connection.disconnect();
            }
        }
    }
}
