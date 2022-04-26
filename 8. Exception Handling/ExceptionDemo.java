import java.util.Scanner;



public class ExceptionDemo {


    
	static void div(int num, int den) throws ArithmeticException{
        
	        if(den == 0){
	            throw new ArithmeticException();}
	        
	        System.out.println("The result is : "+ num/den);
	
	}
   


	public static void main(String[] args) {
  
  		Scanner scan = new Scanner(System.in);
  
  
		try {
		
		        System.out.print("Enter the numerator : ");
            		int num = scan.nextInt();
            		System.out.print("Enter the denominator : ");
	 	        int den = scan.nextInt();
	 	        
            		div(num, den);
            
            
        	}catch (Exception e) {
        	
			System.out.println("An Exception has been occured");
		
		}finally{
		
	        	scan.close();
		        System.out.println("\nFinally block has been executed");
		 
		}

            
    	}    	
}
