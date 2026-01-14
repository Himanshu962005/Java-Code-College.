class Outer {
	int outerNumber = 10;

	class Inner {
		void display() {
			System.out.println("This is Inner Class.");
			System.out.println("Value of OuterNumber = " + outerNumber);
		}
	}
}

public class Main60 { // Inner Class.
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}
}