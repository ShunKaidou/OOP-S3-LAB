import java.util.Scanner;
import java.util.StringTokenizer;
 
 
class StrTokenizerDemo {

    
	public static void main(String args[]) {
    
		Scanner scan = new Scanner(System.in);
    
    
	        int n , sum = 0;
        
    
	        System.out.println("Enter Integers:");
	        String str = scan.nextLine();
        
    
	        StringTokenizer st = new StringTokenizer(str, " ");
    

	    	System.out.println("Entered Digits:");
		
	        while (st.hasMoreTokens()){
    
			String temp = st.nextToken();
    
			n = Integer.parseInt(temp);
    
			System.out.println(n);
    
			sum = sum + n;
		}
	
    
		System.out.println("Sum of the Integers is: " + sum);
    
		scan.close();
 
	}
}
