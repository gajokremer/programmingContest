package ui;

import java.util.Scanner;

import model.Marathon;

public class Menu {
	
	private Marathon marathon;
	private Scanner sc;
	
	public Menu() {
		
		marathon = new Marathon();
		sc = new Scanner(System.in);
	}

	public void mainMenu() {

		int option = 0;
		
		System.out.println("\n\n--------MAIN MENU--------\n");
		
		System.out.println("--Total programmers: " + marathon.getTotalProgrammers());

		System.out.println(
				"\nSelect an option:\n" + 
						"(1) to Add a Programmer" + 
						"\n(2) to Print all Programmers" +
						"\n(3) to print Programmers Alphabetically" +

				"\n(0) to exit");

		option = sc.nextInt();
		sc.nextLine();
		
		if(option != 0) {
			
			switch(option) {
			
			default:
				System.out.println("\n---Invalid Option");
				mainMenu();;
				break;
				
			case 1:
				register();
				mainMenu();
				break;
				
			case 2:
				System.out.println("\n" + marathon.print(marathon.getRoot()));
				mainMenu();
				break;
				
			case 3:
				System.out.println(marathon.printOrdered(marathon.orderedProgrammersList()));
				mainMenu();
				break;
				
//			case 4:
//				test();
//				mainMenu();
//				break;
			}
			
		} else {
			
			System.out.println("\n-----OPERATION ENDED-----\n");
		}
	}
	
//	private void test() {
//		
//		marathon.setRoot(new Programmer("CB", null, null, null));
//		
//		Programmer p = new Programmer("GK", "3017542161", "Cra 1", "gajokremer@gmail.com");
//		System.out.println("\n" + p);
//		
//		marathon.add(p, marathon.getRoot());
//		
//		System.out.print("\nInput Programmer to be found: ");
//		String n = sc.nextLine();
//		
//		System.out.println("\n" + marathon.searchProgrammer(marathon.getRoot(), n));
//	}

	private void register() {

		String name, phone, address, email;
		
		System.out.println("\nInput Programmer data: ");
		
		System.out.print("\n- Name: ");
		name = sc.nextLine();
		name = name.toUpperCase();
		
		System.out.print("- Phone: ");
		phone = sc.nextLine();
		
		System.out.print("- Address: ");
		address = sc.nextLine();
		
		System.out.print("- Email: ");
		email = sc.nextLine();
		
//		String input = sc.nextLine();
//		
//		String[] i = input.split(";");
//		
//		name = i[0];
//		phone = i[1];
//		address = i[2];
//		email = i[3];
		
//		char character = name.charAt(0);
//		System.out.println("\n" + character + " " + (int) character);
//		System.out.println("\n" + character + " " + (int) character);
		
		marathon.addProgrammer(name, phone, address, email);
	}
}
