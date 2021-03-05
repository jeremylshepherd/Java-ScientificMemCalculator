
/*
 * CIS 2122
 * 03/29/2020
 * Jeremy L. Shepherd
 * ScientificCalcDriver (utilizes Calculator_M and ScientificMemCalculator)
 */

public class ScientificCalcDriver {

	public static void main(String[] args) {
		ScientificMemCalculator sCalc = new ScientificMemCalculator();
		
		double num = 0;
		int menuChoice;
		
		System.out.println("The current value is: " + sCalc.getCurrentValue());
		menuChoice = ScientificMemCalculator.displayMenu();
		
		while(menuChoice != 8) {
			String message = "What is the second number? ";
			
			//Only get input if needed
			if(menuChoice >= 1 && menuChoice <= 5) {
				num = ScientificMemCalculator.getOperand(message);
			}
			
			switch(menuChoice) {
			case 1:
				sCalc.add(num);
				break;
			case 2:
				sCalc.subtract(num);
				break;
			case 3:
				sCalc.multiply(num);
				break;
			case 4:
				sCalc.divide(num);
				break;
			case 5:
				sCalc.power(num);
				break;
			case 6:
				sCalc.logarithmic();
				break;
			case 7:
				sCalc.clear();					
		}
		
		//refactored answer output to single line
		System.out.println("The current value is : " + sCalc.getCurrentValue());
		System.out.println("");
		
		//Give users a hint if they attempted to divide by zero
		if(Double.isNaN(sCalc.getCurrentValue())) {
			System.out.println("Current value is NaN and must be cleared (option 5) before any more\ncalculations can be performed.\n");
		}
		menuChoice = ScientificMemCalculator.displayMenu();
		}
		
		System.out.println("Thank you for using Shepherd's SCIENTIFIC Memory Calculator!");
		System.out.println("Goodbye!");

	}

}
