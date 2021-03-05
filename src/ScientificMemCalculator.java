/*
 * CIS 2122
 * 03/29/2020
 * Jeremy L. Shepherd
 * ScientificMemCalculator (extends Calculator_M from Assignment #6)
 * A calculator subclass that takes in user input to calculate additional math functions 
 * of 2 numbers (currentValue and userInput) and stores result in currentValue.
 */

public class ScientificMemCalculator extends Calculator_M {
	
	//Display menu
	public static void showMenu() {
		System.out.println("Calculator Menu");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Power");
		System.out.println("6. Logarithm");
		System.out.println("7. Clear");
		System.out.println("8. Quit");
		System.out.print("What would you like to do? ");
	}		
	
	//Get menu method
	public static int displayMenu() {
		int choice;
		
		showMenu();
		choice = input.nextInt();
		while(choice < 1 || choice > 8)
		{
			System.out.println("I'm sorry, " + choice + " wasn't one of the options");
			System.out.print("Please select a valid option: ");
			choice = input.nextInt();
		}
		
		return choice;
	}
	
	//Power method
	public void power(double operand2) {
		 currentValue = Math.pow(currentValue,  operand2);
	}
	
	public void logarithmic() {
		 currentValue = Math.log(currentValue);
	}
}
