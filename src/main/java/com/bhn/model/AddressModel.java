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
public class AddressModel {
	@Id
	private String _id;
	private String _class;
	private String fullfillmentOrderId;
	private String printerId;
	private String printerName;
	private String bhnLineItemId;
	private String bundleId;
}
