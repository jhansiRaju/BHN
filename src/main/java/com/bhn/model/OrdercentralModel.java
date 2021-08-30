package com.bhn.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "fragment")
@Data
public class OrdercentralModel {
	@Id
	private String ofrid;
	private String ofrspecversion;
	private long batchnumber;
	private String ordercount;
	private String date;
	public String getOfrid() {
		return ofrid;
	}
	public void setOfrid(String ofrid) {
		this.ofrid = ofrid;
	}
	public String getOfrspecversion() {
		return ofrspecversion;
	}
	public void setOfrspecversion(String ofrspecversion) {
		this.ofrspecversion = ofrspecversion;
	}
	public long getBatchnumber() {
		return batchnumber;
	}
	public void setBatchnumber(long batchnumber) {
		this.batchnumber = batchnumber;
	}
	public String getOrdercount() {
		return ordercount;
	}
	public void setOrdercount(String ordercount) {
		this.ordercount = ordercount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
