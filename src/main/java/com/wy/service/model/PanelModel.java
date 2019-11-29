package com.wy.service.model;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * 描述：视图版块模型
 * @author wangyu
 * @date 2019/10/4
 */

public class PanelModel implements Serializable {

    private Integer id;

    private String name;

    /**
     * 视图版块类型
     * 0轮播图 1板块种类一 2板块种类二 3板块种类三
     */
    private Integer type;

    /**
     * 版块排序
     */
    private Integer sortOrder;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属位置
     * 0首页 1商品推荐
     */
    private Integer position;

    /**
     * 限制数量
     */
    private Integer limitNum;

    private Integer status;

    private DateTime createTime;

    private DateTime updateTime;





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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }

    public DateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(DateTime updateTime) {
        this.updateTime = updateTime;
    }
}
