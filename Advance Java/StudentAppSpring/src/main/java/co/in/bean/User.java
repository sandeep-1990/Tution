package co.in.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name = "name")
	private  String name;
	@Column(name = "phone")
	private String phone;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Address address;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(UserVo userVo){
		
		this.name = userVo.getName();
		this.address = userVo.getAddress();
		this.phone = userVo.getPhone();
	}
	
	public User(String name,String phone,Address address) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public int getId() {
		return userId;
	}
	
	public void setId(int id) {
		this.userId = id;
	}
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
