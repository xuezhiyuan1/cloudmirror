package com.example.administrator.myapplication.model.entity;

import java.util.List;

/**
 * 作者：zhiyuan Xue on 2018/9/11 14:30
 * 邮箱：xzy7319@sina.com
 */

public class BigImgBean {

    /**
     * meta : {"success":true,"message":"ok"}
     * data : {"machineId":22200020,"merchantId":52,"machineProductImgList":[{"id":175,"machineProductId":120,"imgId":"9f24b18024e64727860694615465c6b6","remarks":null,"delFlag":"0"},{"id":176,"machineProductId":120,"imgId":"8734853e3ab8484bbf0e3789d4cddce3","remarks":null,"delFlag":"0"},{"id":177,"machineProductId":120,"imgId":"b2448fc5e36a4091a74a612d33a5f8f7","remarks":null,"delFlag":"0"},{"id":178,"machineProductId":120,"imgId":"8a270e3205814d39bccbcdbf84acb9ec","remarks":null,"delFlag":"0"}],"machineProductId":120,"machineProduct":{"id":120,"machineId":22200020,"productSkuId":"33330240","machineSkuPriceOriginal":2900,"machineSkuPriceCurrent":2900,"productName1":"哈药六牌钙加锌口服液 10ml/支*12支","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"ab6dacc2285449c4890b82b77caa4912","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":null,"labelList":null}}
     */

    private MetaBean meta;
    private DataBean data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class MetaBean {
        /**
         * success : true
         * message : ok
         */

        private boolean success;
        private String message;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static class DataBean {
        /**
         * machineId : 22200020
         * merchantId : 52
         * machineProductImgList : [{"id":175,"machineProductId":120,"imgId":"9f24b18024e64727860694615465c6b6","remarks":null,"delFlag":"0"},{"id":176,"machineProductId":120,"imgId":"8734853e3ab8484bbf0e3789d4cddce3","remarks":null,"delFlag":"0"},{"id":177,"machineProductId":120,"imgId":"b2448fc5e36a4091a74a612d33a5f8f7","remarks":null,"delFlag":"0"},{"id":178,"machineProductId":120,"imgId":"8a270e3205814d39bccbcdbf84acb9ec","remarks":null,"delFlag":"0"}]
         * machineProductId : 120
         * machineProduct : {"id":120,"machineId":22200020,"productSkuId":"33330240","machineSkuPriceOriginal":2900,"machineSkuPriceCurrent":2900,"productName1":"哈药六牌钙加锌口服液 10ml/支*12支","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"ab6dacc2285449c4890b82b77caa4912","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":null,"labelList":null}
         */

        private int machineId;
        private int merchantId;
        private int machineProductId;
        private MachineProductBean machineProduct;
        private List<MachineProductImgListBean> machineProductImgList;

        public int getMachineId() {
            return machineId;
        }

        public void setMachineId(int machineId) {
            this.machineId = machineId;
        }

        public int getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(int merchantId) {
            this.merchantId = merchantId;
        }

        public int getMachineProductId() {
            return machineProductId;
        }

        public void setMachineProductId(int machineProductId) {
            this.machineProductId = machineProductId;
        }

        public MachineProductBean getMachineProduct() {
            return machineProduct;
        }

        public void setMachineProduct(MachineProductBean machineProduct) {
            this.machineProduct = machineProduct;
        }

        public List<MachineProductImgListBean> getMachineProductImgList() {
            return machineProductImgList;
        }

        public void setMachineProductImgList(List<MachineProductImgListBean> machineProductImgList) {
            this.machineProductImgList = machineProductImgList;
        }

        public static class MachineProductBean {
            /**
             * id : 120
             * machineId : 22200020
             * productSkuId : 33330240
             * machineSkuPriceOriginal : 2900
             * machineSkuPriceCurrent : 2900
             * productName1 : 哈药六牌钙加锌口服液 10ml/支*12支
             * productName2 :
             * maxQuantity : 10
             * replenishmentValue : 10
             * image : ab6dacc2285449c4890b82b77caa4912
             * productLogoImage : 3878a5dbb5024e3981c876dfa50bce55
             * rank : 1
             * expiryDay : null
             * spec : null
             * manufacturer : null
             * barCode : null
             * remarks : null
             * delFlag : 0
             * currentQuan : null
             * labelList : null
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
            private Object expiryDay;
            private Object spec;
            private Object manufacturer;
            private Object barCode;
            private Object remarks;
            private String delFlag;
            private Object currentQuan;
            private Object labelList;

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

            public Object getExpiryDay() {
                return expiryDay;
            }

            public void setExpiryDay(Object expiryDay) {
                this.expiryDay = expiryDay;
            }

            public Object getSpec() {
                return spec;
            }

            public void setSpec(Object spec) {
                this.spec = spec;
            }

            public Object getManufacturer() {
                return manufacturer;
            }

            public void setManufacturer(Object manufacturer) {
                this.manufacturer = manufacturer;
            }

            public Object getBarCode() {
                return barCode;
            }

            public void setBarCode(Object barCode) {
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

            public Object getCurrentQuan() {
                return currentQuan;
            }

            public void setCurrentQuan(Object currentQuan) {
                this.currentQuan = currentQuan;
            }

            public Object getLabelList() {
                return labelList;
            }

            public void setLabelList(Object labelList) {
                this.labelList = labelList;
            }
        }

        public static class MachineProductImgListBean {
            /**
             * id : 175
             * machineProductId : 120
             * imgId : 9f24b18024e64727860694615465c6b6
             * remarks : null
             * delFlag : 0
             */

            private int id;
            private int machineProductId;
            private String imgId;
            private Object remarks;
            private String delFlag;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getMachineProductId() {
                return machineProductId;
            }

            public void setMachineProductId(int machineProductId) {
                this.machineProductId = machineProductId;
            }

            public String getImgId() {
                return imgId;
            }

            public void setImgId(String imgId) {
                this.imgId = imgId;
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
    }
}
