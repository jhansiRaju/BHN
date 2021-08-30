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
public class ShippingAddressModel {
	@Id
	 private String attnTo;
	 private String firstName;
	 private String middleName;
	 private String lastName;
	 private String company;
	 private String addressOne;
	 private String addressTwo;
	 private String addressThree;
	 private String state;
	 private String zipCode;
	 private String city;
	 private String countryCode;
	 private String emailAddress;
	 private String phoneNumber;
	 private String districtOrCounty;
	 private boolean poBoxFlag;
	 private String shippingRecipientId;
	public String getAttnTo() {
		return attnTo;
	}
	public void setAttnTo(String attnTo) {
		this.attnTo = attnTo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddressOne() {
		return addressOne;
	}
	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}
	public String getAddressTwo() {
		return addressTwo;
	}
	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}
	public String getAddressThree() {
		return addressThree;
	}
	public void setAddressThree(String addressThree) {
		this.addressThree = addressThree;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDistrictOrCounty() {
		return districtOrCounty;
	}
	public void setDistrictOrCounty(String districtOrCounty) {
		this.districtOrCounty = districtOrCounty;
	}
	public boolean isPoBoxFlag() {
		return poBoxFlag;
	}
	public void setPoBoxFlag(boolean poBoxFlag) {
		this.poBoxFlag = poBoxFlag;
	}
	public String getShippingRecipientId() {
		return shippingRecipientId;
	}
	public void setShippingRecipientId(String shippingRecipientId) {
		this.shippingRecipientId = shippingRecipientId;
	}
}
