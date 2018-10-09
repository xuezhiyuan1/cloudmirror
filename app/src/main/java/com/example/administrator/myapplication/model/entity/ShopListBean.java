package com.example.administrator.myapplication.model.entity;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/24.
 */

public class ShopListBean implements Serializable{


    /**
     * meta : {"success":true,"message":"ok"}
     * data : {"result":{"cate_product":{"2003":[{"id":119,"machineId":22200020,"productSkuId":"33330241","machineSkuPriceOriginal":1550,"machineSkuPriceCurrent":1550,"productName1":"百灵鸟 小儿柴桂退热颗粒 4g*16袋/盒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"9df8bc51370f4899a18ff3a114d0f281","productLogoImage":"","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":120,"machineId":22200020,"productSkuId":"33330240","machineSkuPriceOriginal":2900,"machineSkuPriceCurrent":2900,"productName1":"哈药六牌钙加锌口服液 10ml/支*12支","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"ab6dacc2285449c4890b82b77caa4912","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":121,"machineId":22200020,"productSkuId":"33330239","machineSkuPriceOriginal":2400,"machineSkuPriceCurrent":2400,"productName1":"葵花牌葵花小儿肺热咳喘口服液8支","productName2":"清热解毒 宣肺化痰 咳嗽痰黄","maxQuantity":10,"replenishmentValue":10,"image":"874724c852be4286ab80d12d84e50c6d","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":7,"labelList":null},{"id":122,"machineId":22200020,"productSkuId":"33330238","machineSkuPriceOriginal":1800,"machineSkuPriceCurrent":1800,"productName1":"童俏俏小儿七星茶颗粒7g*10袋/盒","productName2":"消化不良不思饮食","maxQuantity":10,"replenishmentValue":10,"image":"50acdea384d34434bad80cf08591a73d","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":7,"labelList":null},{"id":123,"machineId":22200020,"productSkuId":"33330237","machineSkuPriceOriginal":850,"machineSkuPriceCurrent":850,"productName1":"住邦护蕾 小儿止咳糖浆100ml 婴幼儿童感冒镇咳嗽","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"f37627799d624cce9aa604eee939943b","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":3898,"machineId":22200020,"productSkuId":"hsl-0001","machineSkuPriceOriginal":100,"machineSkuPriceCurrent":1,"productName1":"锐澳RIO 微醺蓝玫瑰味3.8度瓶装275ml鸡尾酒","productName2":"11","maxQuantity":100,"replenishmentValue":22,"image":"304dfd7e42c24c7eaefaed9db8aa1a6c","productLogoImage":"","rank":0,"expiryDay":260,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":0,"labelList":null},{"id":5509,"machineId":22200020,"productSkuId":"33330439","machineSkuPriceOriginal":1,"machineSkuPriceCurrent":1,"productName1":"变形金刚5三阶镜面魔方能量块-金","productName2":"","maxQuantity":100,"replenishmentValue":2,"image":"9e4687b8ee3f4536bf22ea03b73b9245","productLogoImage":"","rank":0,"expiryDay":360,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":65,"labelList":null}],"2004":[{"id":106,"machineId":22200020,"productSkuId":"33330230","machineSkuPriceOriginal":1990,"machineSkuPriceCurrent":1990,"productName1":"太极急支糖浆200ml","productName2":"清热化痰风热感冒 急慢性支气管炎 咳嗽咽痛","maxQuantity":10,"replenishmentValue":10,"image":"50eaefbc8cce4bc6aa13b43bb8229b81","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":6,"labelList":null},{"id":107,"machineId":22200020,"productSkuId":"33330236","machineSkuPriceOriginal":1580,"machineSkuPriceCurrent":1580,"productName1":"三九999感冒灵颗粒9袋","productName2":"头痛流涕鼻塞咳嗽感冒灵冲剂","maxQuantity":10,"replenishmentValue":10,"image":"ecc6a85040a74a8298c78878ca002a30","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":108,"machineId":22200020,"productSkuId":"33330235","machineSkuPriceOriginal":1300,"machineSkuPriceCurrent":1300,"productName1":"白云山小柴胡颗粒10袋","productName2":"解表散热疏肝和胃心烦喜吐 肠胃药品","maxQuantity":10,"replenishmentValue":10,"image":"e2c828ac2603456da77754ca0297d039","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":109,"machineId":22200020,"productSkuId":"33330234","machineSkuPriceOriginal":800,"machineSkuPriceCurrent":800,"productName1":"快克复方氨酚烷胺胶囊10粒","productName2":"头痛鼻塞流涕发热咳嗽感冒药","maxQuantity":10,"replenishmentValue":10,"image":"48e07d15d19d4f7d8e3755023ba5c0d2","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":112,"machineId":22200020,"productSkuId":"33330233","machineSkuPriceOriginal":1450,"machineSkuPriceCurrent":1450,"productName1":"感康复方氨酚烷胺片12片","productName2":"感冒药缓解发热头痛咽喉肿痛流涕鼻塞","maxQuantity":10,"replenishmentValue":10,"image":"626b5f2004d7462a907252ea342a86eb","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":115,"machineId":22200020,"productSkuId":"33330232","machineSkuPriceOriginal":2580,"machineSkuPriceCurrent":1,"productName1":"芬必得布洛芬缓释胶囊24粒","productName2":"牙头痛经感冒发热止疼止痛退烧药","maxQuantity":100,"replenishmentValue":10,"image":"4f45371cd714416bb8e59ce7384ea46a","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":17,"labelList":null},{"id":118,"machineId":22200020,"productSkuId":"33330231","machineSkuPriceOriginal":1780,"machineSkuPriceCurrent":1780,"productName1":"白加黑阿司匹林维生素C泡腾片10片","productName2":"感冒发热牙疼痛经","maxQuantity":10,"replenishmentValue":10,"image":"1d9b99126a204040ad7ca77c7063851b","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":231,"machineId":22200020,"productSkuId":"33330267","machineSkuPriceOriginal":800,"machineSkuPriceCurrent":800,"productName1":"明仁 四季感冒胶囊 0.41*24片/盒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"0ea3ffd0d64141819ea0ebe6440b354d","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":232,"machineId":22200020,"productSkuId":"33330268","machineSkuPriceOriginal":1290,"machineSkuPriceCurrent":1290,"productName1":"普利恩 藿香正气水 12支","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"df160408eb0b4f06912d7f2ac2d7a0ea","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":234,"machineId":22200020,"productSkuId":"33330266","machineSkuPriceOriginal":1990,"machineSkuPriceCurrent":1990,"productName1":"维威 维C银翘片 20片风热感冒所致的发热 头痛 咽痛","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"df8f618460a94bdeb79466ee340431ba","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":246,"machineId":22200020,"productSkuId":"33330276","machineSkuPriceOriginal":2100,"machineSkuPriceCurrent":2100,"productName1":"同仁堂 川贝枇杷糖浆 150ml","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"6005718cb4554739af29a91896529d11","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":10,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":2,"labelList":null},{"id":207,"machineId":22200020,"productSkuId":"33330249","machineSkuPriceOriginal":3800,"machineSkuPriceCurrent":2800,"productName1":"福森 双黄连口服液 20ml*10支","productName2":"治疗感冒发热发烧咳嗽咽喉痛","maxQuantity":10,"replenishmentValue":5,"image":"45ccc96688504a48b83b255eb87024b6","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":5624,"machineId":22200020,"productSkuId":"hq-sjz-149","machineSkuPriceOriginal":1,"machineSkuPriceCurrent":1,"productName1":"金嗓子喉宝-test","productName2":"","maxQuantity":100,"replenishmentValue":10,"image":"2c4addef68024c109dbe87db2f176da0","productLogoImage":"c9f031de74474c4a9c74720d41f6ee4e","rank":0,"expiryDay":100,"spec":"40片一盒","manufacturer":"新疆乌鲁木齐","barCode":"124234352345235","remarks":null,"delFlag":"0","currentQuan":45,"labelList":[{"id":96,"labelName":"特价","labelImage":"51ca2414cdce416fa8c5f60912129832","labelType":"1","remarks":null,"delFlag":"0"},{"id":97,"labelName":"销售冠军","labelImage":"e7ad37c05fc54659b8de4e72c6e755d6","labelType":"2","remarks":null,"delFlag":"0"},{"id":101,"labelName":"freecard_label","labelImage":"e2a379dee29742e7872fddb5a58f0015","labelType":"3","remarks":null,"delFlag":"0"}]}],"2005":[{"id":124,"machineId":22200020,"productSkuId":"33330008","machineSkuPriceOriginal":9,"machineSkuPriceCurrent":1,"productName1":"超级英雄系列 坚如钢铁超薄型避孕套 3片装","productName2":"","maxQuantity":100,"replenishmentValue":10,"image":"d5a461c7ed8e44cda1f3c1d11f1a378c","productLogoImage":"1602b1f173734346a1960bfd573d3174","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":81,"labelList":[{"id":101,"labelName":"freecard_label","labelImage":"e2a379dee29742e7872fddb5a58f0015","labelType":"3","remarks":null,"delFlag":"0"}]},{"id":125,"machineId":22200020,"productSkuId":"33330149","machineSkuPriceOriginal":990,"machineSkuPriceCurrent":990,"productName1":"超级英雄系列 大发神威颗粒型避孕套 3片装","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"6867104c15d241d0a20b2f2803c01bc9","productLogoImage":"1cf004284b66482ba4be63c7b0f5a623","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":126,"machineId":22200020,"productSkuId":"33330151","machineSkuPriceOriginal":9,"machineSkuPriceCurrent":9,"productName1":"超级英雄系列 光芒闪耀组合型避孕套 3片装","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"1d6b01f57c7a493ab4bb8a1b15ca1921","productLogoImage":"1602b1f173734346a1960bfd573d3174","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":127,"machineId":22200020,"productSkuId":"33330007","machineSkuPriceOriginal":990,"machineSkuPriceCurrent":990,"productName1":"超级英雄系列 严防死守螺纹型避孕套 3片装","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"efcbe38dc42f4cd59a50014de66025e7","productLogoImage":"1cf004284b66482ba4be63c7b0f5a623","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null}],"2006":[{"id":147,"machineId":22200020,"productSkuId":"33330224","machineSkuPriceOriginal":750,"machineSkuPriceCurrent":750,"productName1":"江中复方草珊瑚含片48片","productName2":"疏风清热 消肿止痛 清利咽喉 咽喉炎","maxQuantity":10,"replenishmentValue":10,"image":"daf1a7f2c11944b4a8a6db8f21bd0100","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":148,"machineId":22200020,"productSkuId":"33330225","machineSkuPriceOriginal":1890,"machineSkuPriceCurrent":1890,"productName1":"邦迪苯扎氯铵贴20片","productName2":"创伤擦伤创可贴 防水透气止血贴","maxQuantity":10,"replenishmentValue":10,"image":"8e99ebe9da90403482d3f019163c9752","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":149,"machineId":22200020,"productSkuId":"33330228","machineSkuPriceOriginal":600,"machineSkuPriceCurrent":600,"productName1":"桂林三金西瓜霜润喉片0.6g*24片/盒","productName2":"急慢性咽喉炎扁桃体炎口腔溃疡","maxQuantity":10,"replenishmentValue":10,"image":"9d381352bd6846afb1be45b9d630dd93","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":150,"machineId":22200020,"productSkuId":"33330229","machineSkuPriceOriginal":1300,"machineSkuPriceCurrent":1300,"productName1":"毓婷左炔诺孕酮片2片/盒","productName2":"女性紧急避孕药事后72小时紧急避孕短期","maxQuantity":10,"replenishmentValue":10,"image":"2a9a31e6f6bf4c4394c405ec4ce0a81c","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":151,"machineId":22200020,"productSkuId":"33330227","machineSkuPriceOriginal":1900,"machineSkuPriceCurrent":1900,"productName1":"开瑞坦氯雷他定片6片","productName2":"过敏性鼻炎鼻塞流涕 荨麻疹皮肤过敏 药品","maxQuantity":10,"replenishmentValue":10,"image":"f87c846bf0374bddad9e47baab3ab71e","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":201,"machineId":22200020,"productSkuId":"33330242","machineSkuPriceOriginal":3100,"machineSkuPriceCurrent":2100,"productName1":"京都念慈菴蜜炼川贝枇杷膏150ml","productName2":"润肺止咳糖浆感冒咳嗽药","maxQuantity":10,"replenishmentValue":5,"image":"7bba1e5d9f8d49f1b3b81ffa2918afc4","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":203,"machineId":22200020,"productSkuId":"33330244","machineSkuPriceOriginal":2500,"machineSkuPriceCurrent":1500,"productName1":"三精 一清颗粒 9袋","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"f4c13a9eb966473c894e72f25d1aab77","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":205,"machineId":22200020,"productSkuId":"33330246","machineSkuPriceOriginal":2200,"machineSkuPriceCurrent":1250,"productName1":"江中健胃消食片0.8gX32片健胃消食标准装","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"a81d10c71acd4bb88e9a527fc6d1ccd1","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":208,"machineId":22200020,"productSkuId":"33330250","machineSkuPriceOriginal":950,"machineSkuPriceCurrent":750,"productName1":"稳健医疗 绷带 纱布绷带 6cm*5cm","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"febac41870b5493f828d1e47100ae228","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":218,"machineId":22200020,"productSkuId":"33330248","machineSkuPriceOriginal":980,"machineSkuPriceCurrent":980,"productName1":"环渤淼牌碘伏消毒液100ml皮肤粘膜伤口消毒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"d63395cc2d6245a0bc7d9cf2ac150734","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":225,"machineId":22200020,"productSkuId":"33330243","machineSkuPriceOriginal":3750,"machineSkuPriceCurrent":3750,"productName1":"云南白药 云南白药酊 120ml","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"753c8a2e00324c5b8c6054d728ea2c8b","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":2,"labelList":null},{"id":227,"machineId":22200020,"productSkuId":"33330269","machineSkuPriceOriginal":1250,"machineSkuPriceCurrent":1250,"productName1":"白云山中一 加味藿香正气丸6袋装 解表化湿外感风寒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"0e65a7e44e3a4d57b8bd842c0b2e4c7d","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":228,"machineId":22200020,"productSkuId":"33330271","machineSkuPriceOriginal":1500,"machineSkuPriceCurrent":1500,"productName1":"百消膏 广州百草堂广益百消膏皮肤剂","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"68eeeb5cb0f8495a8dcae2efdd7b665f","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":230,"machineId":22200020,"productSkuId":"33330272","machineSkuPriceOriginal":3200,"machineSkuPriceCurrent":3200,"productName1":"九芝堂 六味地黄丸（浓缩丸）360丸 滋阴补肾虚","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"81b4109bf1e943e9a14ceb93170ce8bd","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":235,"machineId":22200020,"productSkuId":"33330273","machineSkuPriceOriginal":990,"machineSkuPriceCurrent":1,"productName1":"孕婕早孕试纸2人份/盒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"02c8612135c141a297fc2a2a686b0cea","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":10,"labelList":null},{"id":229,"machineId":22200020,"productSkuId":"33330265","machineSkuPriceOriginal":890,"machineSkuPriceCurrent":890,"productName1":"金嗓子喉片 广西金嗓子 2g*6片*2板","productName2":"","maxQuantity":100,"replenishmentValue":10,"image":"92278d84fb5d48358ee14f52828900ea","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":100,"labelList":null}]},"machineCategoryList":[{"id":2003,"name":"儿童用药","image":"4e0b8d2d913848189305ee2a7af8cc20","machineId":22200020,"rank":1,"remarks":null,"delFlag":"0","machineProductList":null},{"id":2004,"name":"感冒用药","image":"7db163e8c41e4356851a6aa5176e0f49","machineId":22200020,"rank":2,"remarks":null,"delFlag":"0","machineProductList":null},{"id":2005,"name":"安全套","image":"ba77f0629ef846709f21904117b7d1b7","machineId":22200020,"rank":3,"remarks":null,"delFlag":"0","machineProductList":null},{"id":2006,"name":"紧急常备","image":"c2cdd561c20642ca835169e66dc4ecf5","machineId":22200020,"rank":4,"remarks":null,"delFlag":"0","machineProductList":null}],"machineId":22200020},"leftImg":[{"id":64,"name":"左边-logo","type":"1","value":"4eb0916945b34847bab3a85b9e0597b3","remarks":null,"delFlag":"0"}],"rightImg":[{"id":65,"name":"右边-进入商城","type":"1","value":"fef4c60a29a14d4fb40daafeb6808fbc","remarks":null,"delFlag":"0"}],"machineId":22200020,"machineAdvertisementList_welcome":[{"id":62,"name":"海报","type":"1","value":"0b0b43ccca4545f9b72028ce0f7cb6ab","remarks":null,"delFlag":"0"},{"id":112,"name":"便利购绿","type":"1","value":"870d5b8c39fe41bb88c9c63577d1d599","remarks":null,"delFlag":"0"}],"machineAdvertisementList_list":[{"id":23,"name":"嘉事堂banner广告","type":"1","value":"597bf6fd23774348bb096f7b8b1953c9","remarks":null,"delFlag":"0"}],"showad":null}
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
         * result : {"cate_product":{"2003":[{"id":119,"machineId":22200020,"productSkuId":"33330241","machineSkuPriceOriginal":1550,"machineSkuPriceCurrent":1550,"productName1":"百灵鸟 小儿柴桂退热颗粒 4g*16袋/盒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"9df8bc51370f4899a18ff3a114d0f281","productLogoImage":"","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":120,"machineId":22200020,"productSkuId":"33330240","machineSkuPriceOriginal":2900,"machineSkuPriceCurrent":2900,"productName1":"哈药六牌钙加锌口服液 10ml/支*12支","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"ab6dacc2285449c4890b82b77caa4912","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":121,"machineId":22200020,"productSkuId":"33330239","machineSkuPriceOriginal":2400,"machineSkuPriceCurrent":2400,"productName1":"葵花牌葵花小儿肺热咳喘口服液8支","productName2":"清热解毒 宣肺化痰 咳嗽痰黄","maxQuantity":10,"replenishmentValue":10,"image":"874724c852be4286ab80d12d84e50c6d","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":7,"labelList":null},{"id":122,"machineId":22200020,"productSkuId":"33330238","machineSkuPriceOriginal":1800,"machineSkuPriceCurrent":1800,"productName1":"童俏俏小儿七星茶颗粒7g*10袋/盒","productName2":"消化不良不思饮食","maxQuantity":10,"replenishmentValue":10,"image":"50acdea384d34434bad80cf08591a73d","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":7,"labelList":null},{"id":123,"machineId":22200020,"productSkuId":"33330237","machineSkuPriceOriginal":850,"machineSkuPriceCurrent":850,"productName1":"住邦护蕾 小儿止咳糖浆100ml 婴幼儿童感冒镇咳嗽","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"f37627799d624cce9aa604eee939943b","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":3898,"machineId":22200020,"productSkuId":"hsl-0001","machineSkuPriceOriginal":100,"machineSkuPriceCurrent":1,"productName1":"锐澳RIO 微醺蓝玫瑰味3.8度瓶装275ml鸡尾酒","productName2":"11","maxQuantity":100,"replenishmentValue":22,"image":"304dfd7e42c24c7eaefaed9db8aa1a6c","productLogoImage":"","rank":0,"expiryDay":260,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":0,"labelList":null},{"id":5509,"machineId":22200020,"productSkuId":"33330439","machineSkuPriceOriginal":1,"machineSkuPriceCurrent":1,"productName1":"变形金刚5三阶镜面魔方能量块-金","productName2":"","maxQuantity":100,"replenishmentValue":2,"image":"9e4687b8ee3f4536bf22ea03b73b9245","productLogoImage":"","rank":0,"expiryDay":360,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":65,"labelList":null}],"2004":[{"id":106,"machineId":22200020,"productSkuId":"33330230","machineSkuPriceOriginal":1990,"machineSkuPriceCurrent":1990,"productName1":"太极急支糖浆200ml","productName2":"清热化痰风热感冒 急慢性支气管炎 咳嗽咽痛","maxQuantity":10,"replenishmentValue":10,"image":"50eaefbc8cce4bc6aa13b43bb8229b81","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":6,"labelList":null},{"id":107,"machineId":22200020,"productSkuId":"33330236","machineSkuPriceOriginal":1580,"machineSkuPriceCurrent":1580,"productName1":"三九999感冒灵颗粒9袋","productName2":"头痛流涕鼻塞咳嗽感冒灵冲剂","maxQuantity":10,"replenishmentValue":10,"image":"ecc6a85040a74a8298c78878ca002a30","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":108,"machineId":22200020,"productSkuId":"33330235","machineSkuPriceOriginal":1300,"machineSkuPriceCurrent":1300,"productName1":"白云山小柴胡颗粒10袋","productName2":"解表散热疏肝和胃心烦喜吐 肠胃药品","maxQuantity":10,"replenishmentValue":10,"image":"e2c828ac2603456da77754ca0297d039","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":109,"machineId":22200020,"productSkuId":"33330234","machineSkuPriceOriginal":800,"machineSkuPriceCurrent":800,"productName1":"快克复方氨酚烷胺胶囊10粒","productName2":"头痛鼻塞流涕发热咳嗽感冒药","maxQuantity":10,"replenishmentValue":10,"image":"48e07d15d19d4f7d8e3755023ba5c0d2","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":112,"machineId":22200020,"productSkuId":"33330233","machineSkuPriceOriginal":1450,"machineSkuPriceCurrent":1450,"productName1":"感康复方氨酚烷胺片12片","productName2":"感冒药缓解发热头痛咽喉肿痛流涕鼻塞","maxQuantity":10,"replenishmentValue":10,"image":"626b5f2004d7462a907252ea342a86eb","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":115,"machineId":22200020,"productSkuId":"33330232","machineSkuPriceOriginal":2580,"machineSkuPriceCurrent":1,"productName1":"芬必得布洛芬缓释胶囊24粒","productName2":"牙头痛经感冒发热止疼止痛退烧药","maxQuantity":100,"replenishmentValue":10,"image":"4f45371cd714416bb8e59ce7384ea46a","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":17,"labelList":null},{"id":118,"machineId":22200020,"productSkuId":"33330231","machineSkuPriceOriginal":1780,"machineSkuPriceCurrent":1780,"productName1":"白加黑阿司匹林维生素C泡腾片10片","productName2":"感冒发热牙疼痛经","maxQuantity":10,"replenishmentValue":10,"image":"1d9b99126a204040ad7ca77c7063851b","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":231,"machineId":22200020,"productSkuId":"33330267","machineSkuPriceOriginal":800,"machineSkuPriceCurrent":800,"productName1":"明仁 四季感冒胶囊 0.41*24片/盒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"0ea3ffd0d64141819ea0ebe6440b354d","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":232,"machineId":22200020,"productSkuId":"33330268","machineSkuPriceOriginal":1290,"machineSkuPriceCurrent":1290,"productName1":"普利恩 藿香正气水 12支","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"df160408eb0b4f06912d7f2ac2d7a0ea","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":234,"machineId":22200020,"productSkuId":"33330266","machineSkuPriceOriginal":1990,"machineSkuPriceCurrent":1990,"productName1":"维威 维C银翘片 20片风热感冒所致的发热 头痛 咽痛","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"df8f618460a94bdeb79466ee340431ba","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":246,"machineId":22200020,"productSkuId":"33330276","machineSkuPriceOriginal":2100,"machineSkuPriceCurrent":2100,"productName1":"同仁堂 川贝枇杷糖浆 150ml","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"6005718cb4554739af29a91896529d11","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":10,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":2,"labelList":null},{"id":207,"machineId":22200020,"productSkuId":"33330249","machineSkuPriceOriginal":3800,"machineSkuPriceCurrent":2800,"productName1":"福森 双黄连口服液 20ml*10支","productName2":"治疗感冒发热发烧咳嗽咽喉痛","maxQuantity":10,"replenishmentValue":5,"image":"45ccc96688504a48b83b255eb87024b6","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":5624,"machineId":22200020,"productSkuId":"hq-sjz-149","machineSkuPriceOriginal":1,"machineSkuPriceCurrent":1,"productName1":"金嗓子喉宝-test","productName2":"","maxQuantity":100,"replenishmentValue":10,"image":"2c4addef68024c109dbe87db2f176da0","productLogoImage":"c9f031de74474c4a9c74720d41f6ee4e","rank":0,"expiryDay":100,"spec":"40片一盒","manufacturer":"新疆乌鲁木齐","barCode":"124234352345235","remarks":null,"delFlag":"0","currentQuan":45,"labelList":[{"id":96,"labelName":"特价","labelImage":"51ca2414cdce416fa8c5f60912129832","labelType":"1","remarks":null,"delFlag":"0"},{"id":97,"labelName":"销售冠军","labelImage":"e7ad37c05fc54659b8de4e72c6e755d6","labelType":"2","remarks":null,"delFlag":"0"},{"id":101,"labelName":"freecard_label","labelImage":"e2a379dee29742e7872fddb5a58f0015","labelType":"3","remarks":null,"delFlag":"0"}]}],"2005":[{"id":124,"machineId":22200020,"productSkuId":"33330008","machineSkuPriceOriginal":9,"machineSkuPriceCurrent":1,"productName1":"超级英雄系列 坚如钢铁超薄型避孕套 3片装","productName2":"","maxQuantity":100,"replenishmentValue":10,"image":"d5a461c7ed8e44cda1f3c1d11f1a378c","productLogoImage":"1602b1f173734346a1960bfd573d3174","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":81,"labelList":[{"id":101,"labelName":"freecard_label","labelImage":"e2a379dee29742e7872fddb5a58f0015","labelType":"3","remarks":null,"delFlag":"0"}]},{"id":125,"machineId":22200020,"productSkuId":"33330149","machineSkuPriceOriginal":990,"machineSkuPriceCurrent":990,"productName1":"超级英雄系列 大发神威颗粒型避孕套 3片装","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"6867104c15d241d0a20b2f2803c01bc9","productLogoImage":"1cf004284b66482ba4be63c7b0f5a623","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":126,"machineId":22200020,"productSkuId":"33330151","machineSkuPriceOriginal":9,"machineSkuPriceCurrent":9,"productName1":"超级英雄系列 光芒闪耀组合型避孕套 3片装","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"1d6b01f57c7a493ab4bb8a1b15ca1921","productLogoImage":"1602b1f173734346a1960bfd573d3174","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":127,"machineId":22200020,"productSkuId":"33330007","machineSkuPriceOriginal":990,"machineSkuPriceCurrent":990,"productName1":"超级英雄系列 严防死守螺纹型避孕套 3片装","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"efcbe38dc42f4cd59a50014de66025e7","productLogoImage":"1cf004284b66482ba4be63c7b0f5a623","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null}],"2006":[{"id":147,"machineId":22200020,"productSkuId":"33330224","machineSkuPriceOriginal":750,"machineSkuPriceCurrent":750,"productName1":"江中复方草珊瑚含片48片","productName2":"疏风清热 消肿止痛 清利咽喉 咽喉炎","maxQuantity":10,"replenishmentValue":10,"image":"daf1a7f2c11944b4a8a6db8f21bd0100","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":148,"machineId":22200020,"productSkuId":"33330225","machineSkuPriceOriginal":1890,"machineSkuPriceCurrent":1890,"productName1":"邦迪苯扎氯铵贴20片","productName2":"创伤擦伤创可贴 防水透气止血贴","maxQuantity":10,"replenishmentValue":10,"image":"8e99ebe9da90403482d3f019163c9752","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":149,"machineId":22200020,"productSkuId":"33330228","machineSkuPriceOriginal":600,"machineSkuPriceCurrent":600,"productName1":"桂林三金西瓜霜润喉片0.6g*24片/盒","productName2":"急慢性咽喉炎扁桃体炎口腔溃疡","maxQuantity":10,"replenishmentValue":10,"image":"9d381352bd6846afb1be45b9d630dd93","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":150,"machineId":22200020,"productSkuId":"33330229","machineSkuPriceOriginal":1300,"machineSkuPriceCurrent":1300,"productName1":"毓婷左炔诺孕酮片2片/盒","productName2":"女性紧急避孕药事后72小时紧急避孕短期","maxQuantity":10,"replenishmentValue":10,"image":"2a9a31e6f6bf4c4394c405ec4ce0a81c","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":151,"machineId":22200020,"productSkuId":"33330227","machineSkuPriceOriginal":1900,"machineSkuPriceCurrent":1900,"productName1":"开瑞坦氯雷他定片6片","productName2":"过敏性鼻炎鼻塞流涕 荨麻疹皮肤过敏 药品","maxQuantity":10,"replenishmentValue":10,"image":"f87c846bf0374bddad9e47baab3ab71e","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":201,"machineId":22200020,"productSkuId":"33330242","machineSkuPriceOriginal":3100,"machineSkuPriceCurrent":2100,"productName1":"京都念慈菴蜜炼川贝枇杷膏150ml","productName2":"润肺止咳糖浆感冒咳嗽药","maxQuantity":10,"replenishmentValue":5,"image":"7bba1e5d9f8d49f1b3b81ffa2918afc4","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":203,"machineId":22200020,"productSkuId":"33330244","machineSkuPriceOriginal":2500,"machineSkuPriceCurrent":1500,"productName1":"三精 一清颗粒 9袋","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"f4c13a9eb966473c894e72f25d1aab77","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":205,"machineId":22200020,"productSkuId":"33330246","machineSkuPriceOriginal":2200,"machineSkuPriceCurrent":1250,"productName1":"江中健胃消食片0.8gX32片健胃消食标准装","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"a81d10c71acd4bb88e9a527fc6d1ccd1","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":208,"machineId":22200020,"productSkuId":"33330250","machineSkuPriceOriginal":950,"machineSkuPriceCurrent":750,"productName1":"稳健医疗 绷带 纱布绷带 6cm*5cm","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"febac41870b5493f828d1e47100ae228","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":218,"machineId":22200020,"productSkuId":"33330248","machineSkuPriceOriginal":980,"machineSkuPriceCurrent":980,"productName1":"环渤淼牌碘伏消毒液100ml皮肤粘膜伤口消毒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"d63395cc2d6245a0bc7d9cf2ac150734","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":225,"machineId":22200020,"productSkuId":"33330243","machineSkuPriceOriginal":3750,"machineSkuPriceCurrent":3750,"productName1":"云南白药 云南白药酊 120ml","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"753c8a2e00324c5b8c6054d728ea2c8b","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":2,"labelList":null},{"id":227,"machineId":22200020,"productSkuId":"33330269","machineSkuPriceOriginal":1250,"machineSkuPriceCurrent":1250,"productName1":"白云山中一 加味藿香正气丸6袋装 解表化湿外感风寒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"0e65a7e44e3a4d57b8bd842c0b2e4c7d","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":228,"machineId":22200020,"productSkuId":"33330271","machineSkuPriceOriginal":1500,"machineSkuPriceCurrent":1500,"productName1":"百消膏 广州百草堂广益百消膏皮肤剂","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"68eeeb5cb0f8495a8dcae2efdd7b665f","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":230,"machineId":22200020,"productSkuId":"33330272","machineSkuPriceOriginal":3200,"machineSkuPriceCurrent":3200,"productName1":"九芝堂 六味地黄丸（浓缩丸）360丸 滋阴补肾虚","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"81b4109bf1e943e9a14ceb93170ce8bd","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":235,"machineId":22200020,"productSkuId":"33330273","machineSkuPriceOriginal":990,"machineSkuPriceCurrent":1,"productName1":"孕婕早孕试纸2人份/盒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"02c8612135c141a297fc2a2a686b0cea","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":10,"labelList":null},{"id":229,"machineId":22200020,"productSkuId":"33330265","machineSkuPriceOriginal":890,"machineSkuPriceCurrent":890,"productName1":"金嗓子喉片 广西金嗓子 2g*6片*2板","productName2":"","maxQuantity":100,"replenishmentValue":10,"image":"92278d84fb5d48358ee14f52828900ea","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":100,"labelList":null}]},"machineCategoryList":[{"id":2003,"name":"儿童用药","image":"4e0b8d2d913848189305ee2a7af8cc20","machineId":22200020,"rank":1,"remarks":null,"delFlag":"0","machineProductList":null},{"id":2004,"name":"感冒用药","image":"7db163e8c41e4356851a6aa5176e0f49","machineId":22200020,"rank":2,"remarks":null,"delFlag":"0","machineProductList":null},{"id":2005,"name":"安全套","image":"ba77f0629ef846709f21904117b7d1b7","machineId":22200020,"rank":3,"remarks":null,"delFlag":"0","machineProductList":null},{"id":2006,"name":"紧急常备","image":"c2cdd561c20642ca835169e66dc4ecf5","machineId":22200020,"rank":4,"remarks":null,"delFlag":"0","machineProductList":null}],"machineId":22200020}
         * leftImg : [{"id":64,"name":"左边-logo","type":"1","value":"4eb0916945b34847bab3a85b9e0597b3","remarks":null,"delFlag":"0"}]
         * rightImg : [{"id":65,"name":"右边-进入商城","type":"1","value":"fef4c60a29a14d4fb40daafeb6808fbc","remarks":null,"delFlag":"0"}]
         * machineId : 22200020
         * machineAdvertisementList_welcome : [{"id":62,"name":"海报","type":"1","value":"0b0b43ccca4545f9b72028ce0f7cb6ab","remarks":null,"delFlag":"0"},{"id":112,"name":"便利购绿","type":"1","value":"870d5b8c39fe41bb88c9c63577d1d599","remarks":null,"delFlag":"0"}]
         * machineAdvertisementList_list : [{"id":23,"name":"嘉事堂banner广告","type":"1","value":"597bf6fd23774348bb096f7b8b1953c9","remarks":null,"delFlag":"0"}]
         * showad : null
         */

        private ResultBean result;
        private int machineId;
        private Object showad;
        private List<LeftImgBean> leftImg;
        private List<RightImgBean> rightImg;
        private List<MachineAdvertisementListWelcomeBean> machineAdvertisementList_welcome;
        private List<MachineAdvertisementListListBean> machineAdvertisementList_list;

        public ResultBean getResult() {
            return result;
        }

        public void setResult(ResultBean result) {
            this.result = result;
        }

        public int getMachineId() {
            return machineId;
        }

        public void setMachineId(int machineId) {
            this.machineId = machineId;
        }

        public Object getShowad() {
            return showad;
        }

        public void setShowad(Object showad) {
            this.showad = showad;
        }

        public List<LeftImgBean> getLeftImg() {
            return leftImg;
        }

        public void setLeftImg(List<LeftImgBean> leftImg) {
            this.leftImg = leftImg;
        }

        public List<RightImgBean> getRightImg() {
            return rightImg;
        }

        public void setRightImg(List<RightImgBean> rightImg) {
            this.rightImg = rightImg;
        }

        public List<MachineAdvertisementListWelcomeBean> getMachineAdvertisementList_welcome() {
            return machineAdvertisementList_welcome;
        }

        public void setMachineAdvertisementList_welcome(List<MachineAdvertisementListWelcomeBean> machineAdvertisementList_welcome) {
            this.machineAdvertisementList_welcome = machineAdvertisementList_welcome;
        }

        public List<MachineAdvertisementListListBean> getMachineAdvertisementList_list() {
            return machineAdvertisementList_list;
        }

        public void setMachineAdvertisementList_list(List<MachineAdvertisementListListBean> machineAdvertisementList_list) {
            this.machineAdvertisementList_list = machineAdvertisementList_list;
        }

        public static class ResultBean {
            /**
             * cate_product : {"2003":[{"id":119,"machineId":22200020,"productSkuId":"33330241","machineSkuPriceOriginal":1550,"machineSkuPriceCurrent":1550,"productName1":"百灵鸟 小儿柴桂退热颗粒 4g*16袋/盒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"9df8bc51370f4899a18ff3a114d0f281","productLogoImage":"","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":120,"machineId":22200020,"productSkuId":"33330240","machineSkuPriceOriginal":2900,"machineSkuPriceCurrent":2900,"productName1":"哈药六牌钙加锌口服液 10ml/支*12支","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"ab6dacc2285449c4890b82b77caa4912","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":121,"machineId":22200020,"productSkuId":"33330239","machineSkuPriceOriginal":2400,"machineSkuPriceCurrent":2400,"productName1":"葵花牌葵花小儿肺热咳喘口服液8支","productName2":"清热解毒 宣肺化痰 咳嗽痰黄","maxQuantity":10,"replenishmentValue":10,"image":"874724c852be4286ab80d12d84e50c6d","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":7,"labelList":null},{"id":122,"machineId":22200020,"productSkuId":"33330238","machineSkuPriceOriginal":1800,"machineSkuPriceCurrent":1800,"productName1":"童俏俏小儿七星茶颗粒7g*10袋/盒","productName2":"消化不良不思饮食","maxQuantity":10,"replenishmentValue":10,"image":"50acdea384d34434bad80cf08591a73d","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":7,"labelList":null},{"id":123,"machineId":22200020,"productSkuId":"33330237","machineSkuPriceOriginal":850,"machineSkuPriceCurrent":850,"productName1":"住邦护蕾 小儿止咳糖浆100ml 婴幼儿童感冒镇咳嗽","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"f37627799d624cce9aa604eee939943b","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":3898,"machineId":22200020,"productSkuId":"hsl-0001","machineSkuPriceOriginal":100,"machineSkuPriceCurrent":1,"productName1":"锐澳RIO 微醺蓝玫瑰味3.8度瓶装275ml鸡尾酒","productName2":"11","maxQuantity":100,"replenishmentValue":22,"image":"304dfd7e42c24c7eaefaed9db8aa1a6c","productLogoImage":"","rank":0,"expiryDay":260,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":0,"labelList":null},{"id":5509,"machineId":22200020,"productSkuId":"33330439","machineSkuPriceOriginal":1,"machineSkuPriceCurrent":1,"productName1":"变形金刚5三阶镜面魔方能量块-金","productName2":"","maxQuantity":100,"replenishmentValue":2,"image":"9e4687b8ee3f4536bf22ea03b73b9245","productLogoImage":"","rank":0,"expiryDay":360,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":65,"labelList":null}],"2004":[{"id":106,"machineId":22200020,"productSkuId":"33330230","machineSkuPriceOriginal":1990,"machineSkuPriceCurrent":1990,"productName1":"太极急支糖浆200ml","productName2":"清热化痰风热感冒 急慢性支气管炎 咳嗽咽痛","maxQuantity":10,"replenishmentValue":10,"image":"50eaefbc8cce4bc6aa13b43bb8229b81","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":6,"labelList":null},{"id":107,"machineId":22200020,"productSkuId":"33330236","machineSkuPriceOriginal":1580,"machineSkuPriceCurrent":1580,"productName1":"三九999感冒灵颗粒9袋","productName2":"头痛流涕鼻塞咳嗽感冒灵冲剂","maxQuantity":10,"replenishmentValue":10,"image":"ecc6a85040a74a8298c78878ca002a30","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":108,"machineId":22200020,"productSkuId":"33330235","machineSkuPriceOriginal":1300,"machineSkuPriceCurrent":1300,"productName1":"白云山小柴胡颗粒10袋","productName2":"解表散热疏肝和胃心烦喜吐 肠胃药品","maxQuantity":10,"replenishmentValue":10,"image":"e2c828ac2603456da77754ca0297d039","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":109,"machineId":22200020,"productSkuId":"33330234","machineSkuPriceOriginal":800,"machineSkuPriceCurrent":800,"productName1":"快克复方氨酚烷胺胶囊10粒","productName2":"头痛鼻塞流涕发热咳嗽感冒药","maxQuantity":10,"replenishmentValue":10,"image":"48e07d15d19d4f7d8e3755023ba5c0d2","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":112,"machineId":22200020,"productSkuId":"33330233","machineSkuPriceOriginal":1450,"machineSkuPriceCurrent":1450,"productName1":"感康复方氨酚烷胺片12片","productName2":"感冒药缓解发热头痛咽喉肿痛流涕鼻塞","maxQuantity":10,"replenishmentValue":10,"image":"626b5f2004d7462a907252ea342a86eb","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":115,"machineId":22200020,"productSkuId":"33330232","machineSkuPriceOriginal":2580,"machineSkuPriceCurrent":1,"productName1":"芬必得布洛芬缓释胶囊24粒","productName2":"牙头痛经感冒发热止疼止痛退烧药","maxQuantity":100,"replenishmentValue":10,"image":"4f45371cd714416bb8e59ce7384ea46a","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":17,"labelList":null},{"id":118,"machineId":22200020,"productSkuId":"33330231","machineSkuPriceOriginal":1780,"machineSkuPriceCurrent":1780,"productName1":"白加黑阿司匹林维生素C泡腾片10片","productName2":"感冒发热牙疼痛经","maxQuantity":10,"replenishmentValue":10,"image":"1d9b99126a204040ad7ca77c7063851b","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":231,"machineId":22200020,"productSkuId":"33330267","machineSkuPriceOriginal":800,"machineSkuPriceCurrent":800,"productName1":"明仁 四季感冒胶囊 0.41*24片/盒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"0ea3ffd0d64141819ea0ebe6440b354d","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":232,"machineId":22200020,"productSkuId":"33330268","machineSkuPriceOriginal":1290,"machineSkuPriceCurrent":1290,"productName1":"普利恩 藿香正气水 12支","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"df160408eb0b4f06912d7f2ac2d7a0ea","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":234,"machineId":22200020,"productSkuId":"33330266","machineSkuPriceOriginal":1990,"machineSkuPriceCurrent":1990,"productName1":"维威 维C银翘片 20片风热感冒所致的发热 头痛 咽痛","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"df8f618460a94bdeb79466ee340431ba","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":246,"machineId":22200020,"productSkuId":"33330276","machineSkuPriceOriginal":2100,"machineSkuPriceCurrent":2100,"productName1":"同仁堂 川贝枇杷糖浆 150ml","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"6005718cb4554739af29a91896529d11","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":10,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":2,"labelList":null},{"id":207,"machineId":22200020,"productSkuId":"33330249","machineSkuPriceOriginal":3800,"machineSkuPriceCurrent":2800,"productName1":"福森 双黄连口服液 20ml*10支","productName2":"治疗感冒发热发烧咳嗽咽喉痛","maxQuantity":10,"replenishmentValue":5,"image":"45ccc96688504a48b83b255eb87024b6","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":5624,"machineId":22200020,"productSkuId":"hq-sjz-149","machineSkuPriceOriginal":1,"machineSkuPriceCurrent":1,"productName1":"金嗓子喉宝-test","productName2":"","maxQuantity":100,"replenishmentValue":10,"image":"2c4addef68024c109dbe87db2f176da0","productLogoImage":"c9f031de74474c4a9c74720d41f6ee4e","rank":0,"expiryDay":100,"spec":"40片一盒","manufacturer":"新疆乌鲁木齐","barCode":"124234352345235","remarks":null,"delFlag":"0","currentQuan":45,"labelList":[{"id":96,"labelName":"特价","labelImage":"51ca2414cdce416fa8c5f60912129832","labelType":"1","remarks":null,"delFlag":"0"},{"id":97,"labelName":"销售冠军","labelImage":"e7ad37c05fc54659b8de4e72c6e755d6","labelType":"2","remarks":null,"delFlag":"0"},{"id":101,"labelName":"freecard_label","labelImage":"e2a379dee29742e7872fddb5a58f0015","labelType":"3","remarks":null,"delFlag":"0"}]}],"2005":[{"id":124,"machineId":22200020,"productSkuId":"33330008","machineSkuPriceOriginal":9,"machineSkuPriceCurrent":1,"productName1":"超级英雄系列 坚如钢铁超薄型避孕套 3片装","productName2":"","maxQuantity":100,"replenishmentValue":10,"image":"d5a461c7ed8e44cda1f3c1d11f1a378c","productLogoImage":"1602b1f173734346a1960bfd573d3174","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":81,"labelList":[{"id":101,"labelName":"freecard_label","labelImage":"e2a379dee29742e7872fddb5a58f0015","labelType":"3","remarks":null,"delFlag":"0"}]},{"id":125,"machineId":22200020,"productSkuId":"33330149","machineSkuPriceOriginal":990,"machineSkuPriceCurrent":990,"productName1":"超级英雄系列 大发神威颗粒型避孕套 3片装","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"6867104c15d241d0a20b2f2803c01bc9","productLogoImage":"1cf004284b66482ba4be63c7b0f5a623","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":126,"machineId":22200020,"productSkuId":"33330151","machineSkuPriceOriginal":9,"machineSkuPriceCurrent":9,"productName1":"超级英雄系列 光芒闪耀组合型避孕套 3片装","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"1d6b01f57c7a493ab4bb8a1b15ca1921","productLogoImage":"1602b1f173734346a1960bfd573d3174","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":127,"machineId":22200020,"productSkuId":"33330007","machineSkuPriceOriginal":990,"machineSkuPriceCurrent":990,"productName1":"超级英雄系列 严防死守螺纹型避孕套 3片装","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"efcbe38dc42f4cd59a50014de66025e7","productLogoImage":"1cf004284b66482ba4be63c7b0f5a623","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null}],"2006":[{"id":147,"machineId":22200020,"productSkuId":"33330224","machineSkuPriceOriginal":750,"machineSkuPriceCurrent":750,"productName1":"江中复方草珊瑚含片48片","productName2":"疏风清热 消肿止痛 清利咽喉 咽喉炎","maxQuantity":10,"replenishmentValue":10,"image":"daf1a7f2c11944b4a8a6db8f21bd0100","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":148,"machineId":22200020,"productSkuId":"33330225","machineSkuPriceOriginal":1890,"machineSkuPriceCurrent":1890,"productName1":"邦迪苯扎氯铵贴20片","productName2":"创伤擦伤创可贴 防水透气止血贴","maxQuantity":10,"replenishmentValue":10,"image":"8e99ebe9da90403482d3f019163c9752","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":149,"machineId":22200020,"productSkuId":"33330228","machineSkuPriceOriginal":600,"machineSkuPriceCurrent":600,"productName1":"桂林三金西瓜霜润喉片0.6g*24片/盒","productName2":"急慢性咽喉炎扁桃体炎口腔溃疡","maxQuantity":10,"replenishmentValue":10,"image":"9d381352bd6846afb1be45b9d630dd93","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":150,"machineId":22200020,"productSkuId":"33330229","machineSkuPriceOriginal":1300,"machineSkuPriceCurrent":1300,"productName1":"毓婷左炔诺孕酮片2片/盒","productName2":"女性紧急避孕药事后72小时紧急避孕短期","maxQuantity":10,"replenishmentValue":10,"image":"2a9a31e6f6bf4c4394c405ec4ce0a81c","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":151,"machineId":22200020,"productSkuId":"33330227","machineSkuPriceOriginal":1900,"machineSkuPriceCurrent":1900,"productName1":"开瑞坦氯雷他定片6片","productName2":"过敏性鼻炎鼻塞流涕 荨麻疹皮肤过敏 药品","maxQuantity":10,"replenishmentValue":10,"image":"f87c846bf0374bddad9e47baab3ab71e","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":201,"machineId":22200020,"productSkuId":"33330242","machineSkuPriceOriginal":3100,"machineSkuPriceCurrent":2100,"productName1":"京都念慈菴蜜炼川贝枇杷膏150ml","productName2":"润肺止咳糖浆感冒咳嗽药","maxQuantity":10,"replenishmentValue":5,"image":"7bba1e5d9f8d49f1b3b81ffa2918afc4","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":203,"machineId":22200020,"productSkuId":"33330244","machineSkuPriceOriginal":2500,"machineSkuPriceCurrent":1500,"productName1":"三精 一清颗粒 9袋","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"f4c13a9eb966473c894e72f25d1aab77","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":4,"labelList":null},{"id":205,"machineId":22200020,"productSkuId":"33330246","machineSkuPriceOriginal":2200,"machineSkuPriceCurrent":1250,"productName1":"江中健胃消食片0.8gX32片健胃消食标准装","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"a81d10c71acd4bb88e9a527fc6d1ccd1","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":208,"machineId":22200020,"productSkuId":"33330250","machineSkuPriceOriginal":950,"machineSkuPriceCurrent":750,"productName1":"稳健医疗 绷带 纱布绷带 6cm*5cm","productName2":"","maxQuantity":10,"replenishmentValue":5,"image":"febac41870b5493f828d1e47100ae228","productLogoImage":"3878a5dbb5024e3981c876dfa50bce55","rank":0,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":218,"machineId":22200020,"productSkuId":"33330248","machineSkuPriceOriginal":980,"machineSkuPriceCurrent":980,"productName1":"环渤淼牌碘伏消毒液100ml皮肤粘膜伤口消毒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"d63395cc2d6245a0bc7d9cf2ac150734","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":225,"machineId":22200020,"productSkuId":"33330243","machineSkuPriceOriginal":3750,"machineSkuPriceCurrent":3750,"productName1":"云南白药 云南白药酊 120ml","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"753c8a2e00324c5b8c6054d728ea2c8b","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":2,"labelList":null},{"id":227,"machineId":22200020,"productSkuId":"33330269","machineSkuPriceOriginal":1250,"machineSkuPriceCurrent":1250,"productName1":"白云山中一 加味藿香正气丸6袋装 解表化湿外感风寒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"0e65a7e44e3a4d57b8bd842c0b2e4c7d","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":1,"labelList":null},{"id":228,"machineId":22200020,"productSkuId":"33330271","machineSkuPriceOriginal":1500,"machineSkuPriceCurrent":1500,"productName1":"百消膏 广州百草堂广益百消膏皮肤剂","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"68eeeb5cb0f8495a8dcae2efdd7b665f","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":230,"machineId":22200020,"productSkuId":"33330272","machineSkuPriceOriginal":3200,"machineSkuPriceCurrent":3200,"productName1":"九芝堂 六味地黄丸（浓缩丸）360丸 滋阴补肾虚","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"81b4109bf1e943e9a14ceb93170ce8bd","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":5,"labelList":null},{"id":235,"machineId":22200020,"productSkuId":"33330273","machineSkuPriceOriginal":990,"machineSkuPriceCurrent":1,"productName1":"孕婕早孕试纸2人份/盒","productName2":"","maxQuantity":10,"replenishmentValue":10,"image":"02c8612135c141a297fc2a2a686b0cea","productLogoImage":"c2cdd561c20642ca835169e66dc4ecf5","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":10,"labelList":null},{"id":229,"machineId":22200020,"productSkuId":"33330265","machineSkuPriceOriginal":890,"machineSkuPriceCurrent":890,"productName1":"金嗓子喉片 广西金嗓子 2g*6片*2板","productName2":"","maxQuantity":100,"replenishmentValue":10,"image":"92278d84fb5d48358ee14f52828900ea","productLogoImage":"7db163e8c41e4356851a6aa5176e0f49","rank":1,"expiryDay":null,"spec":null,"manufacturer":null,"barCode":null,"remarks":null,"delFlag":"0","currentQuan":100,"labelList":null}]}
             * machineCategoryList : [{"id":2003,"name":"儿童用药","image":"4e0b8d2d913848189305ee2a7af8cc20","machineId":22200020,"rank":1,"remarks":null,"delFlag":"0","machineProductList":null},{"id":2004,"name":"感冒用药","image":"7db163e8c41e4356851a6aa5176e0f49","machineId":22200020,"rank":2,"remarks":null,"delFlag":"0","machineProductList":null},{"id":2005,"name":"安全套","image":"ba77f0629ef846709f21904117b7d1b7","machineId":22200020,"rank":3,"remarks":null,"delFlag":"0","machineProductList":null},{"id":2006,"name":"紧急常备","image":"c2cdd561c20642ca835169e66dc4ecf5","machineId":22200020,"rank":4,"remarks":null,"delFlag":"0","machineProductList":null}]
             * machineId : 22200020
             */

            private Map<String,List<MachineProduct>> cate_product;
            private int machineId;
            private List<MachineCategoryListBean> machineCategoryList;

            public Map getCate_product() {
                return cate_product;
            }

            public void setCate_product(Map cate_product) {
                this.cate_product = cate_product;
            }

            public int getMachineId() {
                return machineId;
            }

            public void setMachineId(int machineId) {
                this.machineId = machineId;
            }

            public List<MachineCategoryListBean> getMachineCategoryList() {
                return machineCategoryList;
            }

            public void setMachineCategoryList(List<MachineCategoryListBean> machineCategoryList) {
                this.machineCategoryList = machineCategoryList;
            }



            public static class MachineCategoryListBean {
                /**
                 * id : 2003
                 * name : 儿童用药
                 * image : 4e0b8d2d913848189305ee2a7af8cc20
                 * machineId : 22200020
                 * rank : 1
                 * remarks : null
                 * delFlag : 0
                 * machineProductList : null
                 */

                private int id;
                private String name;
                private String image;
                private int machineId;
                private int rank;
                private Object remarks;
                private String delFlag;
                private Object machineProductList;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public int getMachineId() {
                    return machineId;
                }

                public void setMachineId(int machineId) {
                    this.machineId = machineId;
                }

                public int getRank() {
                    return rank;
                }

                public void setRank(int rank) {
                    this.rank = rank;
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

                public Object getMachineProductList() {
                    return machineProductList;
                }

                public void setMachineProductList(Object machineProductList) {
                    this.machineProductList = machineProductList;
                }
            }
        }

        public static class LeftImgBean {
            /**
             * id : 64
             * name : 左边-logo
             * type : 1
             * value : 4eb0916945b34847bab3a85b9e0597b3
             * remarks : null
             * delFlag : 0
             */

            private int id;
            private String name;
            private String type;
            private String value;
            private Object remarks;
            private String delFlag;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
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

        public static class RightImgBean {
            /**
             * id : 65
             * name : 右边-进入商城
             * type : 1
             * value : fef4c60a29a14d4fb40daafeb6808fbc
             * remarks : null
             * delFlag : 0
             */

            private int id;
            private String name;
            private String type;
            private String value;
            private Object remarks;
            private String delFlag;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
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

        public static class MachineAdvertisementListWelcomeBean {
            /**
             * id : 62
             * name : 海报
             * type : 1
             * value : 0b0b43ccca4545f9b72028ce0f7cb6ab
             * remarks : null
             * delFlag : 0
             */

            private int id;
            private String name;
            private String type;
            private String value;
            private Object remarks;
            private String delFlag;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
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

        public static class MachineAdvertisementListListBean {
            /**
             * id : 23
             * name : 嘉事堂banner广告
             * type : 1
             * value : 597bf6fd23774348bb096f7b8b1953c9
             * remarks : null
             * delFlag : 0
             */

            private int id;
            private String name;
            private String type;
            private String value;
            private Object remarks;
            private String delFlag;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
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
