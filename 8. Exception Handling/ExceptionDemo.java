import java.util.Scanner;
import java.io.IOException;


public class ExceptionDemo {

	public static void main(String args[]) throws IOException {


	        System.out.println("Enter The Value Of A and B : ");
	        Scanner scan = new Scanner(System.in);

	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        
	        

	        try {

	            int c = a / b;
	            System.out.println("Division Result: " + c);

	        } catch (ArithmeticException e) {

			System.out.println("Exception Found : " + e);
			
	        } finally {
	    
		        System.out.println("\nInside Finally block so this will be Executed\n");
        	}
        	
        	
        	
        	
        	System.out.print("Enter a Char: ");   
    	
 	   	char d = (char) System.in.read();	//To Demonstrate throws
    	
 	   	System.out.println("Entered Character: "+ d);
 	   	
 	   	
 	   	

		scan.close();		
		
    	}
   
}
