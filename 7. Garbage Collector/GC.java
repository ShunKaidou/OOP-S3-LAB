

class Employee{


	public String name;
	public static int count = 0;
	
	
	
	Employee(String name){
		
		this.name = name;
		count++;
		}


	public static void getCount(){
		System.out.println("Current employee objects: "+count);}
		
		
	public void finalize(){
		count--;}


}




public class GC{

	public static void main(String args[]){
	


		Employee e1 = new Employee("John");
		System.out.println("Employee name: "+ e1.name);
		
		
		Employee.getCount();
		
		
		Employee e2 = new Employee("Jack");
		System.out.println("Employee name: "+ e2.name);
		
		
		Employee.getCount();
		
		
		
		e1 = null;
		e2 = null;
		
		System.gc();
		System.runFinalization();
		
		
		
		System.out.println("After garbage collection");
		Employee.getCount();


	}

}
