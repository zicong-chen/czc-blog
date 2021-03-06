package cn.dblearn.blog.entity.mall;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@ApiModel(value="cn-dblearn-blog-entity-mall-MallOrder")
@Data
public class MallOrder implements Serializable {
    /**
    * 订单表主键id
    */
    @ApiModelProperty(value="订单表主键id")
    private Long orderId;

    /**
    * 订单号
    */
    @ApiModelProperty(value="订单号")
    private String orderNo;

    /**
    * 用户主键id
    */
    @ApiModelProperty(value="用户主键id")
    private Long userId;

    /**
    * 订单总价
    */
    @ApiModelProperty(value="订单总价")
    private BigDecimal totalPrice;

    /**
    * 支付状态:0.未支付,1.支付成功,-1:支付失败
    */
    @ApiModelProperty(value="支付状态:0.未支付,1.支付成功,-1:支付失败")
    private Byte payStatus;

    /**
    * 0.无 1.支付宝支付 2.微信支付
    */
    @ApiModelProperty(value="0.无 1.支付宝支付 2.微信支付")
    private Byte payType;

    /**
    * 支付时间
    */
    @ApiModelProperty(value="支付时间")
    private LocalDateTime payTime;

    /**
    * 订单状态:0.待支付 1.已支付 2.配货完成 3:出库成功 4.交易成功 -1.手动关闭 -2.超时关闭 -3.商家关闭
    */
    @ApiModelProperty(value="订单状态:0.待支付 1.已支付 2.配货完成 3:出库成功 4.交易成功 -1.手动关闭 -2.超时关闭 -3.商家关闭")
    private Byte orderStatus;

    /**
    * 订单body
    */
    @ApiModelProperty(value="订单body")
    private String extraInfo;

    /**
    * 收货人姓名
    */
    @ApiModelProperty(value="收货人姓名")
    private String userName;

    /**
    * 收货人手机号
    */
    @ApiModelProperty(value="收货人手机号")
    private String userPhone;

    /**
    * 收货人收货地址
    */
    @ApiModelProperty(value="收货人收货地址")
    private String userAddress;

    /**
    * 删除标识字段(0-未删除 1-已删除)
    */
    @ApiModelProperty(value="删除标识字段(0-未删除 1-已删除)")
    private Byte isDeleted;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    /**
    * 最新修改时间
    */
    @ApiModelProperty(value="最新修改时间")
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;
}