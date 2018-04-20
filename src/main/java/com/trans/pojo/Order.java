package com.trans.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String order_id ;//-- 预约编号
	private String car_type ;// not null, -- 车型
	private String car_num ;// -- 车牌
	private String car_pro ;//varchar2(256) not null, -- 车况
	private Timestamp order_time ;//timestamp not null,-- 预约时间
	private int order_status ;//number(1) default 0, -- 状态  0 待处理  1 处理中  2  已处理 3 已取消
	private String phoneno ;//varchar2(60) -- 所属客户
	public Order() {
		super();
	}
	public Order(String order_id, String car_type, String car_num, String car_pro, Timestamp order_time,
			int order_status, String phoneno) {
		super();
		this.order_id = order_id;
		this.car_type = car_type;
		this.car_num = car_num;
		this.car_pro = car_pro;
		this.order_time = order_time;
		this.order_status = order_status;
		this.phoneno = phoneno;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getCar_num() {
		return car_num;
	}
	public void setCar_num(String car_num) {
		this.car_num = car_num;
	}
	public String getCar_pro() {
		return car_pro;
	}
	public void setCar_pro(String car_pro) {
		this.car_pro = car_pro;
	}
	public Timestamp getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Timestamp order_time) {
		this.order_time = order_time;
	}
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", car_type=" + car_type + ", car_num=" + car_num + ", car_pro="
				+ car_pro + ", order_time=" + order_time + ", order_status=" + order_status + ", phoneno=" + phoneno
				+ "]";
	}
	
	
}
