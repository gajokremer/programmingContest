package model;

import java.util.Collection;

public class Programmer implements Comparable<Programmer> {
	
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
	
	@Override
	public int compareTo(Programmer p) {
		
		return 0;
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
	
	public boolean isLeaf() {

		if(right == null && left == null) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	public void inOrder(Collection<Programmer> c) {

		
	}
	
	public void insert(Programmer p) {

		
	}
	
	public Programmer search() {
		
		Programmer p = null;
		
		return p;
	}
	
	public Programmer remove() {
		
		Programmer p = null;
		
		return p;
	}
	
	@Override
	public String toString() {
		
		String result = "";
		
		if(left != null) {
			
			result += left.getName();
			
		} else {
			
			result += null;
		}
		
		result += " <-- " + name + " --> ";
		
		if(right != null) {
			
			result += right.getName();
			
		} else {
			
			result += null;
		}
		
		return result;
	}
}
