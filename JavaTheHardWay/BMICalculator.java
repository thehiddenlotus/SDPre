import java.util.Scanner;

public class BMICalculator {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		double m, kg, in, lbs, bmi;
		
		System.out.print("Your height (feet only): ");
		in =  keyboard.nextDouble() * 12;
		
		System.out.print("Your height (inches only): ");
		in +=  keyboard.nextDouble();
		
		System.out.print("Your weight in pounds: ");
		lbs =  keyboard.nextDouble();
		
		m = in * .0254;
		kg = lbs * .453592;
		bmi = kg / (m*m);
		
		System.out.print("Your BMI is: " + bmi);
	}
}
		