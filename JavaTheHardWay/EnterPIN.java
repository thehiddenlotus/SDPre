import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String pass, word;
		
		pass = "password";
		pin = 12345;
		
		System.out.println("WELCOME TO THE BANL OF JAVA.");
		System.out.println("ENTER YOUR PASSWORD: ");
		word = keyboard.next();
		
		while (! word.equals(pass)){
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.print("ENTER YOUR PASSWORD: ");
			word = keyboard.next();
		}
		
		System.out.println("PASSWORD ACCEPTED. ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		
		while (entry != pin){
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS 420.00");
	}
}