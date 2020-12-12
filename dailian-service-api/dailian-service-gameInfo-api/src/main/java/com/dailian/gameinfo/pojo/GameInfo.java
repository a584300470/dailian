package com.dailian.gameinfo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Package_Name: com.dailian.gameinfo.pojo
 * @NAME: GameInfo
 * @Autohor：吴铭
 * @Date： 2020/12/12 20:02
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */

@ApiModel(description = "GameInfo",value = "GameInfo")
@Table(name = "tb_game_name")
public class GameInfo implements Serializable{

    @ApiModelProperty(value = "游戏名称Id",required = false)    // 自动生成swagger文档
    @Id     // 标识主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // 主键自增策略
    @Column(name="id")      // 与表字段映射
    private Integer id;

    @ApiModelProperty(value = "游戏名称",required = false)
    @Column(name = "name")
    private String name;

    @ApiModelProperty(value = "游戏介绍图片-图标",required = false)
    @Column(name = "image")
    private String image;

    @ApiModelProperty(value = "游戏名称首字母大写-搜索用",required = false)
    @Column(name = "letter")
    private String letter;

    @ApiModelProperty(value = "根据seq搜索排序-排序分值",required = false)
    @Column(name = "seq")
    private Integer seq;

    // TODO 满参 空参 构造方法
    // TODO GET SET 方法 , toString方法


    public GameInfo() {
    }

    @Override
    public String toString() {
        return "GameInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", letter='" + letter + '\'' +
                ", seq=" + seq +
                '}';
    }

    public GameInfo(String name, String image, String letter, Integer seq) {
        this.name = name;
        this.image = image;
        this.letter = letter;
        this.seq = seq;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}
