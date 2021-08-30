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
public class OrderModel {
@Id
	private String _id;
	private String fulfillmentorderid;
	private String bhnordertype;
	private String date;
	private String mid;
	private String partnerordernumber;
	private String partnerorderdate;
	private String partnerponumber;
	private String partnercustomernumber;
	private String billing;
	private String supplementals;
	private String partnerPersonIdentifyingNumber;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getFulfillmentorderid() {
		return fulfillmentorderid;
	}
	public void setFulfillmentorderid(String fulfillmentorderid) {
		this.fulfillmentorderid = fulfillmentorderid;
	}
	public String getBhnordertype() {
		return bhnordertype;
	}
	public void setBhnordertype(String bhnordertype) {
		this.bhnordertype = bhnordertype;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPartnerordernumber() {
		return partnerordernumber;
	}
	public void setPartnerordernumber(String partnerordernumber) {
		this.partnerordernumber = partnerordernumber;
	}
	public String getPartnerorderdate() {
		return partnerorderdate;
	}
	public void setPartnerorderdate(String partnerorderdate) {
		this.partnerorderdate = partnerorderdate;
	}
	public String getPartnerponumber() {
		return partnerponumber;
	}
	public void setPartnerponumber(String partnerponumber) {
		this.partnerponumber = partnerponumber;
	}
	public String getPartnercustomernumber() {
		return partnercustomernumber;
	}
	public void setPartnercustomernumber(String partnercustomernumber) {
		this.partnercustomernumber = partnercustomernumber;
	}
	public String getBilling() {
		return billing;
	}
	public void setBilling(String billing) {
		this.billing = billing;
	}
	public String getSupplementals() {
		return supplementals;
	}
	public void setSupplementals(String supplementals) {
		this.supplementals = supplementals;
	}
	public String getPartnerPersonIdentifyingNumber() {
		return partnerPersonIdentifyingNumber;
	}
	public void setPartnerPersonIdentifyingNumber(String partnerPersonIdentifyingNumber) {
		this.partnerPersonIdentifyingNumber = partnerPersonIdentifyingNumber;
	}
	
	
}
