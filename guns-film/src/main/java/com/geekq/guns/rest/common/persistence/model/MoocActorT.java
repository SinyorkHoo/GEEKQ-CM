package com.geekq.guns.rest.common.persistence.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 演员表
 * </p>
 *
 * @author jiangzh
 * @since 2018-08-26
 */
@TableName("mooc_actor_t")
public class MoocActorT extends Model<MoocActorT> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;
    /**
     * 演员名称
     */
    @TableField("actor_name")
    private String actorName;
    /**
     * 演员图片位置
     */
    @TableField("actor_img")
    private String actorImg;


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorImg() {
        return actorImg;
    }

    public void setActorImg(String actorImg) {
        this.actorImg = actorImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }

    @Override
    public String toString() {
        return "MoocActorT{" +
        "uuid=" + uuid +
        ", actorName=" + actorName +
        ", actorImg=" + actorImg +
        "}";
    }
}
