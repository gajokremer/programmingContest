package model;

import java.util.Collection;

public class Marathon {
	
	private Programmer root;
	private int totalProgrammers;
	
	public Marathon() {
		
	}

	public Programmer getRoot() {
		return root;
	}
	
	public void setRoot(Programmer root) {
		this.root = root;
	}
	
	public int getTotalProgrammers() {
		return totalProgrammers;
	}

	public void setTotalProgrammers(int totalProgrammers) {
		this.totalProgrammers = totalProgrammers;
	}
	
	public void addProgrammer(String name, String phone, String address, String email) {

		Programmer p = new Programmer(name, phone, address, email);
		add(p, root);
		System.out.println("\nTrue Root: " + root);
	}
	
	public void add(Programmer p, Programmer r) {
		
		if(root == null) {
			
			root = p;
			setTotalProgrammers(getTotalProgrammers() + 1);
			
			char pChar = p.getName().charAt(0);
			System.out.println("\nNode value: " + (int) pChar + " " + pChar);
			
		} else {

			char rChar = r.getName().charAt(0);
			char pChar = p.getName().charAt(0);
			
			System.out.println();
			System.out.println("Root value: " + (int) rChar + " " + rChar);
			System.out.println("Node value: " + (int) pChar+ " " + pChar);
			
			if(pChar > rChar) {
				
				if(r.getRight() == null) {
					
					r.setRight(p);
					setTotalProgrammers(getTotalProgrammers() + 1);
					
					System.out.println("\nCurrent Root: " + r);
					System.out.println("Node: " + p);
					
				} else {
					
					add(p, r.getRight());
				}
				
			} else if(pChar < rChar) {
				
				if(r.getLeft() == null) {
					
					r.setLeft(p);
					setTotalProgrammers(getTotalProgrammers() + 1);
					
					System.out.println("\nCurrent Root: " + r);
					System.out.println("Node: " + p);
					
				} else {
					
					add(p, r.getLeft());
				}
			} 
		}
	}
	
	public void removeProgrammer(String name) {
		
		
	}
	
	public Programmer searchProgrammer(String name) {

		Programmer p = null;
		
		return p;
	}
	
	public Collection<Programmer> programmersList() {
		
		return null;
	}
	
	public String print(Programmer r) {
		
		String result = "";
		
//		System.out.println("=" + root);
		
		if(r != null) {
			
			result += r;
			
			if(r.getLeft() != null) {
				
				result += "\n" + print(r.getLeft());
			}
			
			if(r.getRight() != null) {
				
				result += "\n" + print(r.getRight());
			}
			 
		} else {
			
			result = "\n--There are no Programmers registered"; 
		}
		
		return result;
	}
}
