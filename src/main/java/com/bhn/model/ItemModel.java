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
public class ItemModel {
	private String id;
	private String lineitemid;
	private int packagingsequencenumber;
	private String bundleid;
	private String partnersku;
	private String product;
	private String supplementals;
	private String cardimageurlfront;
	private String cards;
	private String fulfillmentinstructions;
	private String clientprogramid;
	private String imageurls;
	private String additionalinfos;
	private String expeditefulfillment;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLineitemid() {
		return lineitemid;
	}
	public void setLineitemid(String lineitemid) {
		this.lineitemid = lineitemid;
	}
	public int getPackagingsequencenumber() {
		return packagingsequencenumber;
	}
	public void setPackagingsequencenumber(int packagingsequencenumber) {
		this.packagingsequencenumber = packagingsequencenumber;
	}
	public String getBundleid() {
		return bundleid;
	}
	public void setBundleid(String bundleid) {
		this.bundleid = bundleid;
	}
	public String getPartnersku() {
		return partnersku;
	}
	public void setPartnersku(String partnersku) {
		this.partnersku = partnersku;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSupplementals() {
		return supplementals;
	}
	public void setSupplementals(String supplementals) {
		this.supplementals = supplementals;
	}
	public String getCardimageurlfront() {
		return cardimageurlfront;
	}
	public void setCardimageurlfront(String cardimageurlfront) {
		this.cardimageurlfront = cardimageurlfront;
	}
	public String getCards() {
		return cards;
	}
	public void setCards(String cards) {
		this.cards = cards;
	}
	public String getFulfillmentinstructions() {
		return fulfillmentinstructions;
	}
	public void setFulfillmentinstructions(String fulfillmentinstructions) {
		this.fulfillmentinstructions = fulfillmentinstructions;
	}
	public String getClientprogramid() {
		return clientprogramid;
	}
	public void setClientprogramid(String clientprogramid) {
		this.clientprogramid = clientprogramid;
	}
	public String getImageurls() {
		return imageurls;
	}
	public void setImageurls(String imageurls) {
		this.imageurls = imageurls;
	}
	public String getAdditionalinfos() {
		return additionalinfos;
	}
	public void setAdditionalinfos(String additionalinfos) {
		this.additionalinfos = additionalinfos;
	}
	public String getExpeditefulfillment() {
		return expeditefulfillment;
	}
	public void setExpeditefulfillment(String expeditefulfillment) {
		this.expeditefulfillment = expeditefulfillment;
	}
	
}
