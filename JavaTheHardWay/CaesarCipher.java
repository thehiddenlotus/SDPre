import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CaesarCipher{
	public static char shiftLetter(char c, int n){
		int u = c;
		
		if (!Character.isLetter(c))
			return c;
		
		u += n;
		if (Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z'){
			u -= 26;
		}
		if (Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a'){
			u += 26;
		}
		
		return (char)u;
	}
	
	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		String plaintext, cipher = "";
		int shift;
		
		Scanner fileName =  new Scanner(new File("cipher.txt"));
		plaintext = fileName.nextLine();
		
		System.out.print("Shift (0-26): ");
		shift = keyboard.nextInt();
		
		for (int i = 0; i < plaintext.length(); i++){
			cipher += shiftLetter(plaintext.charAt(i), shift);
		}
		
		PrintWriter out = new PrintWriter("ciphered.txt");
			out.println(cipher);
		out.close();
		
		System.out.println(cipher);
		System.out.println("saved to ciphered.txt");
	}
}
		
		
		