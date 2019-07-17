package com.blj.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 测试实体类
 */
public class Demo {
    private int id;
    private String name;
    /**
     *  @JSONField(serialize = false)是否序列化
     */
   @JSONField(serialize = false)
    private String remarks;//备注信息

    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date creatTime;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

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

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
