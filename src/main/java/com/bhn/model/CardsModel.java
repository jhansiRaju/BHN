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
public class CardsModel {
	@Id
	private String id;
	private String seqnumber;
	private String cardrefnumber;
	private String cardtype;
	private String printtype;
	private String cardissuetype;
	private String activationcode;
	private String partnertrackingkey;
	private String activateonshipment;
	private String product;
	private String supplementals;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSeqnumber() {
		return seqnumber;
	}
	public void setSeqnumber(String seqnumber) {
		this.seqnumber = seqnumber;
	}
	public String getCardrefnumber() {
		return cardrefnumber;
	}
	public void setCardrefnumber(String cardrefnumber) {
		this.cardrefnumber = cardrefnumber;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getPrinttype() {
		return printtype;
	}
	public void setPrinttype(String printtype) {
		this.printtype = printtype;
	}
	public String getCardissuetype() {
		return cardissuetype;
	}
	public void setCardissuetype(String cardissuetype) {
		this.cardissuetype = cardissuetype;
	}
	public String getActivationcode() {
		return activationcode;
	}
	public void setActivationcode(String activationcode) {
		this.activationcode = activationcode;
	}
	public String getPartnertrackingkey() {
		return partnertrackingkey;
	}
	public void setPartnertrackingkey(String partnertrackingkey) {
		this.partnertrackingkey = partnertrackingkey;
	}
	public String getActivateonshipment() {
		return activateonshipment;
	}
	public void setActivateonshipment(String activateonshipment) {
		this.activateonshipment = activateonshipment;
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
	

}
