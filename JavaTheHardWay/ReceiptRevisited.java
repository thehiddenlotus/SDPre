import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
	public static void main(String[] args) throws Exception{
		
		PrintWriter fileout = new PrintWriter("receipt.txt");
		Scanner keyboard = new Scanner(System.in);
		
		double ppg = 3.459;
		double gallons = 0;
		double total = 0;
		
		System.out.println("Price per gallon: "+ppg);
		System.out.println("How many gallons? ");
		gallons = keyboard.nextDouble();
		
		total = ppg*gallons;
		System.out.println("Total: "+total);
		
		fileout.println( "+------------------------+" );
		fileout.println( "|                        |" );
		fileout.println( "|      CORNER STORE      |" );
		fileout.println( "|                        |" );
		fileout.println( "|   2014-06-25 04:38PM   |" );
		fileout.println( "|                        |" );
		fileout.println( "|    Gallons: "+gallons+"     |" );
		fileout.println( "| Price/gallon: $ "+ppg+"  |" );
		fileout.println( "|                        |" );
		fileout.println( "|  Fuel total: $ 43.11   |" );
		fileout.println( "|                        |" );
		fileout.println( "+------------------------+" );
		fileout.close();
	}
}