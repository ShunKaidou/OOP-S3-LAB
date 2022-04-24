import java.util.Scanner;	


public class MatrixM{
	
	
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	

	System.out.print("Enter the number of rows for first matrix: ");	
	int rows1 = scanner.nextInt();
	
	System.out.print("\nEnter the number of columns for first matrix: ");
	int columns1 = scanner.nextInt();
	


	int[][] a = new int [rows1][columns1];

	
		
	System.out.print("\nEnter the number of rows for second matrix: ");	
	int rows2 = scanner.nextInt();
	
	System.out.print("\nEnter the number of columns for second matrix: ");
	int columns2 = scanner.nextInt();
	

	
	int[][] b = new int [rows2][columns2];
	
	
	
	if(columns1!=rows2){
		System.out.println("\nThis matrix cannot be multiplied");
		System.exit(1);}
		
	
	
	System.out.println("\nEnter the Elements of first matrix: ");
	
		for (int i = 0; i < rows1 ; i++){	
			for (int j = 0; j < columns1 ; j++){
				a[i][j] = scanner.nextInt();
			}
		}
	
	
	
	System.out.println("Enter the Elements of second matrix: ");
	
		for (int i = 0; i < rows2 ; i++){
			for (int j = 0; j < columns2 ; j++){
				b[i][j] = scanner.nextInt();
			}
		}
	
	
	
	System.out.println("\nElements of first matrix: ");
	
		for (int i = 0; i < rows1 ; i++){	
			for (int j = 0; j < columns1 ; j++){
				System.out.print(a[i][j] + " ");}
			System.out.println();
		}
	
	

	System.out.println("\nElements of second matrix: ");
		for (int i = 0; i < rows2 ; i++){
			for (int j = 0; j < columns2 ; j++){
				System.out.print(b[i][j] + " ");}
			System.out.println();
		}



	int sum = 0;
	
	int[][] c = new int[rows1][columns2];
	
	
	
		for (int i = 0; i < rows1 ; i++){
			for (int j = 0; j < columns2 ; j++){
				for (int k  = 0; k < columns1 ; k++){
				
					c[i][j]+= a[i][k] * b[k][j];}
				
			}
		}



		System.out.println("\nElements of Resultant matrix: ");
	
		for (int i = 0; i < rows1 ; i++){
			for (int j = 0; j < columns2 ; j++){
			
				System.out.print(c[i][j] + " ");}
			
			System.out.println();
		}



	}
	
}
