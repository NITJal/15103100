package demo;

public class Operate {
	public static void main(String args[]){
		Trapezoid tr=new Trapezoid();
		Triangle tl=new Triangle();
		Hexagon hx=new Hexagon();
		tr.numberOfSides();
		tl.numberOfSides();
		hx.numberOfSides();
	}

}
abstract class Shapes{
	  void numberOfSides(){};
}
class Trapezoid extends Shapes{
	void numberOfSides(){
		System.out.println("Trapezoid has 4 sides");
	}
}
class Triangle extends Shapes{
	void numberOfSides(){
		System.out.println("Triangle has 3 sides");
	}
}
class Hexagon extends Shapes{
	void numberOfSides(){
		System.out.println("Hexagon has 6 sides");
	}
}