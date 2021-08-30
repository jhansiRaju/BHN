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
public class BomInfoModel {
	@Id
	private String bomId;


	public String getBomId() {
		return bomId;
	}

	public void setBomId(String bomId) {
		this.bomId = bomId;
	}
	 
}
