package com.dailian.user.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Package_Name: com.dailian.gameinfo.pojo
 * @NAME: User
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:03
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */

@ApiModel(description = "User",value = "User")
@Table(name = "tb_user")
public class User implements Serializable{

    @ApiModelProperty(value = "用户Id",required = false)    // 自动生成swagger文档
    @Id     // 标识主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // 主键自增策略
    @Column(name="id")      // 与表字段映射
    private Integer id;

    @ApiModelProperty(value = "用户名称",required = false)
    @Column(name = "username")
    private String username;

    @ApiModelProperty(value = "用户密码",required = false)
    @Column(name = "password")
    private String password;

    @ApiModelProperty(value = "用户昵称",required = false)
    @Column(name = "nickname")
    private String nickname;

    @ApiModelProperty(value = "账户余额",required = false)
    @Column(name = "money")
    private Double money;

    @ApiModelProperty(value = "收货地址",required = false)
    @Column(name = "address")
    private String address;

    public User() {
    }

    public User(String username, String password, String nickname, Double money, String address) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.money = money;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", money=" + money +
                ", address='" + address + '\'' +
                '}';
    }
}
