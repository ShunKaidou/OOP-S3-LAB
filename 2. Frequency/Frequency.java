import java.util.Scanner;
import java.io.IOException;


public class Frequency{

	public static void main(String[] args) throws IOException{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		System.out.print("\nEnter character: ");
		char c = (char)System.in.read();
		
		
		int count = 0;
				
		for (int i = 0 ; i < str.length() ; i++){
			
			if (c == str.charAt(i)) count++;}
	
	
		System.out.println("\nFrequency: "+ count);
	
		scan.close();
	
	}	
	
}
