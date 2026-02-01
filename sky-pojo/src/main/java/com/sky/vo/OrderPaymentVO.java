package com.sky.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderPaymentVO implements Serializable {

    private String nonceStr; //随机字符串
    private String paySign; //签名
    private String timeStamp; //时间戳
    private String signType; //签名算法
    private String packageStr; //统一下单接口返回的 prepay_id 参数值

    // 新增属性 为了搭配微信点击即支付
    private String orderId;      // 订单ID
    private String tradeState;   // 交易状态
    private String transactionId; // 交易流水号
    private String outTradeNo;   // 商户订单号
    private Integer totalFee;    // 总金额

}
