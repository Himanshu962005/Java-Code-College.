class person {
	public String name = "Himanshu Legendary Coder";
	private int age = 20;
	protected String city = "Raipur";
	String country = "India";

	public void displayAge() {
		System.out.println("Age(Private) : " + age);
	}
}

public class Main62 { // AccessSpecifier.
	public static void main(String[] args) {
		person p = new person();
		System.out.println("Name(Public) : " + p.name);
		p.displayAge();
		System.out.println("City(Protected) : " + p.city);
		System.out.println("Country(Default) : " + p.country);
	}
}