package ui;

import java.util.Scanner;

import model.Marathon;
import model.Programmer;

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
				test();
				mainMenu();
				break;
				
			case 4:
				charsAsIntegers();
				mainMenu();
				break;
			}
			
		} else {
			
			System.out.println("\n-----OPERATION ENDED-----\n");
		}
	}
	
	private void test() {
		
		marathon.setRoot(new Programmer("CB", null, null, null));
		
		Programmer p = new Programmer("GK", "3017542161", "Cra 1", "gajokremer@gmail.com");
		System.out.println("\n" + p);
		
		marathon.add(p, marathon.getRoot());
	}

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
	
	private void charsAsIntegers() {

		System.out.println("A " + (int) 'A');
		System.out.println("B " + (int) 'B');
		System.out.println("C " + (int) 'C');
		System.out.println("D " + (int) 'D');
		System.out.println("E " + (int) 'E');
		System.out.println("F " + (int) 'F');
		System.out.println("G " + (int) 'G');
		System.out.println("H " + (int) 'H');
		System.out.println("I " + (int) 'I');
		System.out.println("J " + (int) 'J');
		System.out.println("K " + (int) 'K');
		System.out.println("L " + (int) 'L');
		System.out.println("M " + (int) 'M');
		System.out.println("N " + (int) 'N');
		System.out.println("O " + (int) 'O');
		System.out.println("P " + (int) 'P');
		System.out.println("Q " + (int) 'Q');
		System.out.println("R " + (int) 'R');
		System.out.println("S " + (int) 'S');
		System.out.println("T " + (int) 'T');
		System.out.println("U " + (int) 'U');
		System.out.println("V " + (int) 'V');
		System.out.println("W " + (int) 'W');
		System.out.println("X " + (int) 'X');
		System.out.println("Y " + (int) 'Y');
		System.out.println("Z " + (int) 'Z');
		
		System.out.println();
		
		System.out.println("a " + (int) 'a');
		System.out.println("b " + (int) 'b');
		System.out.println("c " + (int) 'c');
		System.out.println("d " + (int) 'd');
		System.out.println("e " + (int) 'e');
		System.out.println("f " + (int) 'f');
		System.out.println("g " + (int) 'g');
		System.out.println("h " + (int) 'h');
		System.out.println("i " + (int) 'i');
		System.out.println("j " + (int) 'j');
		System.out.println("k " + (int) 'k');
		System.out.println("l " + (int) 'l');
		System.out.println("m " + (int) 'm');
		System.out.println("n " + (int) 'n');
		System.out.println("o " + (int) 'o');
		System.out.println("p " + (int) 'p');
		System.out.println("q " + (int) 'q');
		System.out.println("r " + (int) 'r');
		System.out.println("s " + (int) 's');
		System.out.println("t " + (int) 't');
		System.out.println("u " + (int) 'u');
		System.out.println("v " + (int) 'v');
		System.out.println("w " + (int) 'w');
		System.out.println("x " + (int) 'x');
		System.out.println("y " + (int) 'y');
		System.out.println("z " + (int) 'z');
	}
}
