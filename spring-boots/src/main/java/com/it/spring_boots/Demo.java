package com.it.spring_boots;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Demo {
	
	int id;
	String name;
	@JSONField(format="yyyy-MM-dd HH:mm")
	Date createTime;
	@JSONField(deserialize=false)
	String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
}
