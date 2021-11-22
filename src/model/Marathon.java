package model;

import java.util.ArrayList;
import java.util.List;

public class Marathon {
	
	private Programmer root;
	private int totalProgrammers;
	private List<Programmer> programmerList;
	
	public Marathon() {
		
		programmerList = new ArrayList<Programmer>();	
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
	
	public List<Programmer> getProgrammerList() {
		return programmerList;
	}

	public void setProgrammerList(List<Programmer> programmerList) {
		this.programmerList = programmerList;
	}

	public void addProgrammer(String name, String phone, String address, String email) {

		Programmer p = new Programmer(name, phone, address, email);
		
		add(p, root);
		
		System.out.println("\nTrue Root: " + root);
	}
	
	private void add(Programmer p, Programmer r) {
		
		if(root == null) {

			root = p;
			setTotalProgrammers(getTotalProgrammers() + 1);

//			char pChar = p.getName().charAt(0);
//			System.out.println("\nNode value: " + (int) pChar + " " + pChar);

		} else {
			
			char rChar = r.getName().charAt(0);
			char pChar = p.getName().charAt(0);

//			System.out.println();
//			System.out.println("Root value: " + (int) rChar + " " + rChar);
//			System.out.println("Node value: " + (int) pChar+ " " + pChar);

			if(pChar > rChar) {

				if(r.getRight() == null) {

					r.setRight(p);
					setTotalProgrammers(getTotalProgrammers() + 1);

//					System.out.println("\nCurrent Root: " + r);
//					System.out.println("Node: " + p);

				} else {

					add(p, r.getRight());
				}

			} else if(pChar < rChar) {

				if(r.getLeft() == null) {

					r.setLeft(p);
					setTotalProgrammers(getTotalProgrammers() + 1);

//					System.out.println("\nCurrent Root: " + r);
//					System.out.println("Node: " + p);

				} else {

					add(p, r.getLeft());
				}
			} 
		}
	}

	@SuppressWarnings("unused")
	private void removeProgrammer(String name) {


	}

	@SuppressWarnings("unused")
	private Programmer searchProgrammer(Programmer current, String name) {

		System.out.println("\nCurrent: " + current);
		
		if(current != null) {
			
			if(current.getName().equalsIgnoreCase(name)) {
				
				return current;
				
			} else {
				
				if(current.getRight() != null) {
					
					return searchProgrammer(current.getRight(), name);
				}
				
				if(current.getLeft() != null) {
					
					return searchProgrammer(current.getLeft(), name);
				}
			}
		}
		
		return current;
	}

	public List<Programmer> orderedProgrammersList() {

		inOrder(root);
		
		return programmerList;
	}
	
	private void inOrder(Programmer r) {
		
		if(r == null) {
			
			return;
		} 
		
		inOrder(r.getLeft());
		programmerList.add(r);
		inOrder(r.getRight());
	}
	
	public String printOrdered(List<Programmer> pL) {
		
		String list = "";
		
		for(int i = 0; i < pL.size(); i++) {
			
			list += "\n" + (i + 1) + ". " + pL.get(i);
		}
		
		return list;
	}

	public String print(Programmer r) {

		String result = "";

		//		System.out.println("=" + root);

		if(r != null) {

			result += r.nodeForm();

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
