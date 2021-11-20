package model;

public class Programmer {

	private String name;
	private String phone;
	private String address;
	private String email;
	
	private Programmer left;
	private Programmer right;
	
	public Programmer(String name, String phone, String address, String email) {
		this.setName(name);
		this.setPhone(phone);
		this.setAddress(address);
		this.setEmail(email);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Programmer getLeft() {
		return left;
	}

	public void setLeft(Programmer left) {
		this.left = left;
	}

	public Programmer getRight() {
		return right;
	}

	public void setRight(Programmer right) {
		this.right = right;
	}
	
	
}
