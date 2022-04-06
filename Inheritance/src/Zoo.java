
public class Zoo {
	public static void main(String[] args) {
		Dog d1 = new Dog(50.5f);
//		d1.setHeight(50.5f);
		System.out.println(d1.getHeight());
		d1.walk();//child
		d1.eat();//super
	}
}
