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

		System.out.println(
				"\nSelect an option:\n" + 
						"(1) to Add a Programmer" + 

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
				mainMenu();
				break;
			}
			
		} else {
			
			System.out.println("\n-----OPERATION ENDED-----\n");
		}
	}
}
