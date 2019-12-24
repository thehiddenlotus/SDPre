import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.println("First name? ");
	firstName = input.next();
	
	System.out.println("Last name? ");
	lastName = input.next();
	
	System.out.println("Age? ");
	age = input.nextInt();
	
	System.out.println("First name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);

    input.close();
  }
}