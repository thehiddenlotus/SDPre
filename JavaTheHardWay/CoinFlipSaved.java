import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CoinFlipSaved {
	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		String coin, again, bestName, saveFileName = "coin-flip-score.txt";
		int streak = 0, best;
		boolean gotHeads;
		
		File f = new File(saveFileName);
		if (f.exists() && f.length() > 0){
			Scanner input = new Scanner(f);
				bestName = input.next();
				best = input.nextInt();
			input.close();
			System.out.print("High score is " + best);
			System.out.println(" flips in a row by " + bestName);
		}
		else{
			System.out.println("Save game file doesn't exist or is empty.");
			best = -1;
			bestName = "";
		}
		
		do {
			gotHeads = Math.random() < 0.5;
			
			if (gotHeads) 
				coin = "HEADS";
			else 
				coin = "TAILS";
			
			System.out.println("You flip a coin and it is... " + coin);
			
			if (gotHeads){
				streak++;
				System.out.println("\tThat's " + streak + " in a row...");
				System.out.print("\tWould uou like to flip again (y/n)?");
				again = keyboard.next();
			}
			else{
				System.out.println("\tYou lose everything!");
				System.out.println("\tShould've quit while you were aHEAD...");
				streak = 0;
				again = "n";
			}
		}while(again.equals("y"));
		
		System.out.println("Final score: " + streak);
		
		if (streak > best){
			System.out.println("That's a new high score!");
			System.out.print("Your name: ");
			bestName = keyboard.next();
			best = streak;
			PrintWriter out = new PrintWriter(f);
				out.println(bestName);
				out.println(best);
			out.close();
		}
		else if(streak == best){
			System.out.println("That ties the high score. Cool.");
		}
		else{
			System.out.print("You'll have to do better than ");
			System.out.println(best + " if you want the high score");
		}
		
	}
}


























