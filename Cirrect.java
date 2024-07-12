package pkg;

public class Cirrect {

	public static void main(String[] args) {
		Circle circle1 = new Circle(10.0);
		double circlearea = circle1.area();
		double circleperimeter = circle1.perimeter();
		
		Rectangle rectangle1 = new Rectangle(5.0,6.0);
		double rectanglearea = rectangle1.area();
		double rectangleperimeter = rectangle1.perimeter();
		
		System.out.println(circlearea);
		System.out.println(rectanglearea);
		System.out.println(circleperimeter);
		System.out.println(rectangleperimeter);

	}

}
