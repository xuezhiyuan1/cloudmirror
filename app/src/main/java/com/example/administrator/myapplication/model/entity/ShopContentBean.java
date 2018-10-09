package com.example.administrator.myapplication.model.entity;

import java.util.List;

/**
 * 作者：zhiyuan Xue on 2018/9/3 11:39
 * 邮箱：xzy7319@sina.com
 */

public class ShopContentBean {


    /**
     * id : 5624
     * machineId : 22200020
     * productSkuId : hq-sjz-149
     * machineSkuPriceOriginal : 1
     * machineSkuPriceCurrent : 1
     * productName1 : 金嗓子喉宝-test
     * productName2 :
     * maxQuantity : 100
     * replenishmentValue : 10
     * image : 2c4addef68024c109dbe87db2f176da0
     * productLogoImage : c9f031de74474c4a9c74720d41f6ee4e
     * rank : 0
     * expiryDay : 100
     * spec : 40片一盒
     * manufacturer : 新疆乌鲁木齐
     * barCode : 124234352345235
     * remarks : null
     * delFlag : 0
     * currentQuan : 45
     * labelList : [{"id":96,"labelName":"特价","labelImage":"51ca2414cdce416fa8c5f60912129832","labelType":"1","remarks":null,"delFlag":"0"},{"id":97,"labelName":"销售冠军","labelImage":"e7ad37c05fc54659b8de4e72c6e755d6","labelType":"2","remarks":null,"delFlag":"0"},{"id":101,"labelName":"freecard_label","labelImage":"e2a379dee29742e7872fddb5a58f0015","labelType":"3","remarks":null,"delFlag":"0"}]
     */

    private int id;
    private int machineId;
    private String productSkuId;
    private int machineSkuPriceOriginal;
    private int machineSkuPriceCurrent;
    private String productName1;
    private String productName2;
    private int maxQuantity;
    private int replenishmentValue;
    private String image;
    private String productLogoImage;
    private int rank;
    private int expiryDay;
    private String spec;
    private String manufacturer;
    private String barCode;
    private Object remarks;
    private String delFlag;
    private int currentQuan;
    private List<LabelListBean> labelList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public String getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(String productSkuId) {
        this.productSkuId = productSkuId;
    }

    public int getMachineSkuPriceOriginal() {
        return machineSkuPriceOriginal;
    }

    public void setMachineSkuPriceOriginal(int machineSkuPriceOriginal) {
        this.machineSkuPriceOriginal = machineSkuPriceOriginal;
    }

    public int getMachineSkuPriceCurrent() {
        return machineSkuPriceCurrent;
    }

    public void setMachineSkuPriceCurrent(int machineSkuPriceCurrent) {
        this.machineSkuPriceCurrent = machineSkuPriceCurrent;
    }

    public String getProductName1() {
        return productName1;
    }

    public void setProductName1(String productName1) {
        this.productName1 = productName1;
    }

    public String getProductName2() {
        return productName2;
    }

    public void setProductName2(String productName2) {
        this.productName2 = productName2;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public int getReplenishmentValue() {
        return replenishmentValue;
    }

    public void setReplenishmentValue(int replenishmentValue) {
        this.replenishmentValue = replenishmentValue;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProductLogoImage() {
        return productLogoImage;
    }

    public void setProductLogoImage(String productLogoImage) {
        this.productLogoImage = productLogoImage;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getExpiryDay() {
        return expiryDay;
    }

    public void setExpiryDay(int expiryDay) {
        this.expiryDay = expiryDay;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Object getRemarks() {
        return remarks;
    }

    public void setRemarks(Object remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public int getCurrentQuan() {
        return currentQuan;
    }

    public void setCurrentQuan(int currentQuan) {
        this.currentQuan = currentQuan;
    }

    public List<LabelListBean> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<LabelListBean> labelList) {
        this.labelList = labelList;
    }

    public static class LabelListBean {
        /**
         * id : 96
         * labelName : 特价
         * labelImage : 51ca2414cdce416fa8c5f60912129832
         * labelType : 1
         * remarks : null
         * delFlag : 0
         */

        private int id;
        private String labelName;
        private String labelImage;
        private String labelType;
        private Object remarks;
        private String delFlag;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLabelName() {
            return labelName;
        }

        public void setLabelName(String labelName) {
            this.labelName = labelName;
        }

        public String getLabelImage() {
            return labelImage;
        }

        public void setLabelImage(String labelImage) {
            this.labelImage = labelImage;
        }

        public String getLabelType() {
            return labelType;
        }

        public void setLabelType(String labelType) {
            this.labelType = labelType;
        }

        public Object getRemarks() {
            return remarks;
        }

        public void setRemarks(Object remarks) {
            this.remarks = remarks;
        }

        public String getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(String delFlag) {
            this.delFlag = delFlag;
        }
    }

    @Override
    public String toString() {
        return "ShopContentBean{" +
                "id=" + id +
                ", machineId=" + machineId +
                ", productSkuId='" + productSkuId + '\'' +
                ", machineSkuPriceOriginal=" + machineSkuPriceOriginal +
                ", machineSkuPriceCurrent=" + machineSkuPriceCurrent +
                ", productName1='" + productName1 + '\'' +
                ", productName2='" + productName2 + '\'' +
                ", maxQuantity=" + maxQuantity +
                ", replenishmentValue=" + replenishmentValue +
                ", image='" + image + '\'' +
                ", productLogoImage='" + productLogoImage + '\'' +
                ", rank=" + rank +
                ", expiryDay=" + expiryDay +
                ", spec='" + spec + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", barCode='" + barCode + '\'' +
                ", remarks=" + remarks +
                ", delFlag='" + delFlag + '\'' +
                ", currentQuan=" + currentQuan +
                ", labelList=" + labelList +
                '}';
    }
}
