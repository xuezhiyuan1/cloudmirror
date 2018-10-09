package com.example.administrator.myapplication.model.entity;

import java.util.List;

/**
 * classDescription
 *
 * @author Jun Zhang
 * @date 2018/9/6
 *
 *
 * {"id":1102,"machineId":22200039,"productSkuId":"33330337","machineSkuPriceOriginal":89900,
 * "machineSkuPriceCurrent":1,"productName1":"（裸瓶）52度国窖1573   浓香型高度白酒 500ml",
 * "productName2":"","maxQuantity":5,"replenishmentValue":1,"image":"0838845b83bb4d1fbecbcc294ccb3633",
 * "productLogoImage":"","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,
 * "remarks":null,"delFlag":"0","currentQuan":0,"labelList":null}
 */
public class MachineProduct {
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
    private List<ShopContentBean.LabelListBean> labelList;

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

    public List<ShopContentBean.LabelListBean> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<ShopContentBean.LabelListBean> labelList) {
        this.labelList = labelList;
    }
}
