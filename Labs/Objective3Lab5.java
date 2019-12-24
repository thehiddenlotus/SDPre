import java.util.Scanner;

public class Objective3Lab5 {
	public static void main(String[] args){
		
		double one, two;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		one =  input.nextDouble();
		
		System.out.println("Please enter another number: ");
		two =  input.nextDouble();
		
		System.out.println("The sum of " + one + " + "  + two + " = " + (one + two));
	}
}