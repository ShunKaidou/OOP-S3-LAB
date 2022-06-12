import java.io.*;


public class FileCopy {
	
	public static void main(String[] args) {
		
		
		try {
			
			FileWriter fw = new FileWriter("CopiedFile.txt");
			FileReader fr = new FileReader("InputFile.txt");
			
			int i=0;
			
			while((i=fr.read())!=-1) {
				char j=(char)i;
				fw.write(j);
			}
			
			fr.close();
			fw.close();
			
			
		}catch(FileNotFoundException e ) {
			System.out.println("Error: File NOT Found (add a file with name \"InputFile.txt\") ");
		}
		
		catch(IOException e){
			System.out.println("IOException Found");
		}
		
	}
}


