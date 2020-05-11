package co.in.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserVo{

	/**
	 * 
	 */
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "address")
	private String address;
	@JsonProperty(value="phone")
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
