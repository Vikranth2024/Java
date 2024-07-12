package pkg;

public class Circle {
	double r ;
	public Circle(double r){
		this.r = r ;
	}
	public double area() {
		return Math.PI*Math.pow(r, 2);	
	}
	public double perimeter() {
		return 2*Math.PI*r;
	}
}
