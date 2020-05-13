package co.in.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserVo{

	/**
	 * 
	 */
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value="phone")
	private String phone;
	@JsonProperty(value="address")
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
