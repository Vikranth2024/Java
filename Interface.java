package pkg;

interface Interface1 {
	public void method();
}

public class Interface implements Interface1{
	public void method() {
		System.out.println("Interface testing");
	}
	public static void main(String[] args) {
		Interface obj = new Interface();
		obj.method();
	}
}

