import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args){
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
		
		System.out.println("Your BMI is: " + bmi);
		
		System.out.print("BMI category: ");
		if (bmi < 15.0){
			System.out.print("very severely underweight");
		}else if (bmi < 16.0){
			System.out.print("severely underweight");
		}else if (bmi < 18.5){
			System.out.print("underweight");
		}else if (bmi < 25.0){
			System.out.print("normal weight");
		}else if (bmi < 30.0){
			System.out.print("overweight");
		}else if (bmi < 35.0){
			System.out.print("moderately obese");
		}else if (bmi < 45.0){
			System.out.print("severely obese");
		}else{
			System.out.print("very severely/\"morbidly\" obese");
		}
	}
}