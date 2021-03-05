
/*
 * CIS 2122
 * 03/29/2020
 * Jeremy L. Shepherd
 * Calculator_M (from Assignment #6)
 * A calculator class that takes in user input to calculate basic math functions 
 * of 2 numbers (currentValue and userInput) and stores result in currentValue.
 * Using methods to present cleaner code.
 */

import java.util.Scanner;

public class Calculator_M {
	static Scanner input = new Scanner(System.in);
	protected double currentValue;
	
	public Calculator_M() {
		this.currentValue = 0.0;
	}
	
	//Overridden Constructor
	public Calculator_M(double currentValue) {
		this.currentValue = currentValue;
	}
	
	//Display menu
	public static void showMenu() {
		System.out.println("Calculator Menu");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Clear");
		System.out.println("6. Quit");
		System.out.print("What would you like to do? ");
	}
	
	//Get menu method
	public static int displayMenu() {
		int choice;
		
		showMenu();
		choice = input.nextInt();
		while(choice < 1 || choice > 6)
		{
			System.out.println("I'm sorry, " + choice + " wasn't one of the options");
			System.out.print("Please select a valid option: ");
			choice = input.nextInt();
		}
		
		return choice;
	}
	
	//GET method for current 
	public double getCurrentValue() {
		return currentValue;
	}
	
	//Get Operand method
	public static double getOperand(String message) {		
		double num;
		
		System.out.print(message);
		num = input.nextDouble();
		return num;
	}
	
	//Addition method
	public void add(double operand2) {
		currentValue += operand2;
	}
	
	//Subtraction method
	public void subtract(double operand2) {
		currentValue  -= operand2;
	}
	
	//Multiplication method
	public void multiply(double operand2) {
		 currentValue *= operand2;
	}
	
	//Division method
	public void divide(double operand2) {
		if(operand2 == 0) {
			System.out.println("I'm sorry, but dividing by zero will break the universe.\nFor everyone's sake the value has defaulted to NaN.");
			currentValue = Double.NaN;
		}else {	
			currentValue /= operand2;
		}
	}
	
	//Reset currentValue to Zero
	public void clear() {		
		currentValue = 0.0;
	}	
}
