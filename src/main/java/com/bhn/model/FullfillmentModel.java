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
public class FullfillmentModel {
@Id
private String _id;
private String _class;
private String fullfillmentOrderId;
private String printerId;
private String printerName;
private String bhnLineItemId;
private String bundleId;
public String get_id() {
	return _id;
}
public void set_id(String _id) {
	this._id = _id;
}
public String get_class() {
	return _class;
}
public void set_class(String _class) {
	this._class = _class;
}
public String getFullfillmentOrderId() {
	return fullfillmentOrderId;
}
public void setFullfillmentOrderId(String fullfillmentOrderId) {
	this.fullfillmentOrderId = fullfillmentOrderId;
}
public String getPrinterId() {
	return printerId;
}
public void setPrinterId(String printerId) {
	this.printerId = printerId;
}
public String getPrinterName() {
	return printerName;
}
public void setPrinterName(String printerName) {
	this.printerName = printerName;
}
public String getBhnLineItemId() {
	return bhnLineItemId;
}
public void setBhnLineItemId(String bhnLineItemId) {
	this.bhnLineItemId = bhnLineItemId;
}
public String getBundleId() {
	return bundleId;
}
public void setBundleId(String bundleId) {
	this.bundleId = bundleId;
}

}
