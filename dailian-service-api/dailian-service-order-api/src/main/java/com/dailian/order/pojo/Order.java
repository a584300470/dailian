package com.dailian.order.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Package_Name: com.dailian.gameinfo.pojo
 * @NAME: Order
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:08
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */
@ApiModel(description = "Order",value = "Order")
@Table(name = "tb_order")
public class Order implements Serializable {

    @ApiModelProperty(value = "订单Id",required = false)    // 自动生成swagger文档
    @Id     // 标识主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // 主键自增策略
    @Column(name="id")      // 与表字段映射
    private Integer id;

    @ApiModelProperty(value = "购买用户名",required = false)
    @Column(name = "payUserName")
    private String payUserName;

    @ApiModelProperty(value = "订单金额",required = false)
    @Column(name = "money")
    private Double money;

    @ApiModelProperty(value = "商品数量",required = false)
    @Column(name = "pay_count")
    private Integer pay_count;

    @ApiModelProperty(value = "付款状态",required = false)
    @Column(name = "pay_status")
    private Integer pay_status;

    @ApiModelProperty(value = "发货状态",required = false)
    @Column(name = "send_status")
    private Integer send_status;

    public Order() {
    }

    public Order(String payUserName, Double money, Integer pay_count, Integer pay_status, Integer send_status) {
        this.payUserName = payUserName;
        this.money = money;
        this.pay_count = pay_count;
        this.pay_status = pay_status;
        this.send_status = send_status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayUserName() {
        return payUserName;
    }

    public void setPayUserName(String payUserName) {
        this.payUserName = payUserName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getPay_count() {
        return pay_count;
    }

    public void setPay_count(Integer pay_count) {
        this.pay_count = pay_count;
    }

    public Integer getPay_status() {
        return pay_status;
    }

    public void setPay_status(Integer pay_status) {
        this.pay_status = pay_status;
    }

    public Integer getSend_status() {
        return send_status;
    }

    public void setSend_status(Integer send_status) {
        this.send_status = send_status;
    }
}
