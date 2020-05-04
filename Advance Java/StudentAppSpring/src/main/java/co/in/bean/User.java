package co.in.bean;

public class User {

	private static final long serialVersionUID = 1L;
	private  String name;
	private String address;
	private String phone;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name,String address,String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
