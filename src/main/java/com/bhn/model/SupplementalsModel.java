package com.bhn.model;

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
public class SupplementalsModel {
	private String pinmailer;
	private String actmailer;
	private String packaging;
	private String shipping;
	private String returns;
	private String register;
	private String otherinfo;
	private String bominfo;
	public String getPinmailer() {
		return pinmailer;
	}
	public void setPinmailer(String pinmailer) {
		this.pinmailer = pinmailer;
	}
	public String getActmailer() {
		return actmailer;
	}
	public void setActmailer(String actmailer) {
		this.actmailer = actmailer;
	}
	public String getPackaging() {
		return packaging;
	}
	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	public String getReturns() {
		return returns;
	}
	public void setReturns(String returns) {
		this.returns = returns;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}
	public String getBominfo() {
		return bominfo;
	}
	public void setBominfo(String bominfo) {
		this.bominfo = bominfo;
	}
	
}
