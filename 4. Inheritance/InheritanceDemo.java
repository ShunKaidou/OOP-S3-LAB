

class Employee {
	
	String name;
	int age;
	String phone;
	String address;
	int salary;


	Employee(String name,int age,String phone,String address,int salary){

		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}


	void printSalary(){
	
		System.out.println(salary);
	}
	
}




class Officer extends Employee{

	String specialization;


	Officer(String name,int age,String phone,String address,int salary,String specialization){
		
		super(name, age, phone, address, salary);
		this.specialization = specialization;
	}
}




class Manager extends Employee{

	String department;
	
	
	Manager(String name, int age, String phone, String address, int salary, String department){
	
		super(name, age, phone, address, salary);
		this.department = department;
	}
}




public class InheritanceDemo{


	public static void main(String[] args){
	
	
	Officer john = new Officer("John Doe", 22, "99########", "Some Street", 72000, "Clothing");

	System.out.println(john.name);
	
	System.out.println("Specialization: "+ john.specialization);


	System.out.print("Salary: ");
	john.printSalary();
	
	
		

	
	Manager jack = new Manager("Jack Doe", 20, "99########", "Some Street", 75000, "Sales");

	System.out.println("\n\n" + jack.name);
	
	System.out.println("Department: "+ jack.department);


	System.out.print("Salary: ");
	jack.printSalary();
	
	
	}

}
