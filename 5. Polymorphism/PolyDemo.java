


abstract class Shape {

	abstract int numberOfSides();
}




class Triangle extends Shape {

	int numberOfSides() {

		return 3;
    }
}




class Rectangle extends Shape {

	int numberOfSides() {

		return 4;
    }
}




class Hexagon extends Shape {

	int numberOfSides() {

		return 6;
    }
}




public class PolyDemo {

	public static void main(String args[]) {
 
 	Shape sh;
 

        sh = new Triangle();
        System.out.print("Triangle: " + sh.numberOfSides());
        
        
        
        sh = new Rectangle();
        System.out.print("\nRectangle: " + sh.numberOfSides());
       
        
        
        sh = new Hexagon();
        System.out.println("\nHexagon: " + sh.numberOfSides());
        
        
    }

}
