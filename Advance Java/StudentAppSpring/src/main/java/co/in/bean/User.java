package co.in.bean;

import com.google.gson.annotations.SerializedName;

public class User {

	@SerializedName(value = "name")
	private String name;
	@SerializedName(value = "address")
	private String address;
	
	
	
	public User(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
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
	
	
}
