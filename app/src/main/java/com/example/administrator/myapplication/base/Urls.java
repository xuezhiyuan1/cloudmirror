package com.example.administrator.myapplication.base;

/**
 * 作者：zhiyuan Xue on 2018/8/30 20:43
 * 邮箱：xzy7319@sina.com
 */

public class Urls {
    //服务器地址
    public static final String BASEURL = "http://112.126.65.23:10100/";
    //地址
    public static final String DATAURL = "machineAdmin/main/welcome";
    //图片前缀地址
    public static final String BASEIMAGEBEFORE = "http://cmoss.cloudmirror.cn/api/v1/file/";
    //图片后缀地址
    public static final String BASEIMAGEAFTER = "/stream";
    //生成支付二维码
    public static final String PAYQCODE = "machineAdmin/main/getQcode";
    //单个购买时订单状态查询接口   ?orderId=
    public static final String CHECKONESBUY = "machineAdmin/payment/commonPayState";
    //预支付
    public static final String PREPAYURL = "machineAdmin/main/prePay";
    //货舱有货  打开货舱门
    public static final String OPENDOOR = "machineAdmin/main/getProduct";
}
