
public class Dog extends Animal {

	public Dog(float height) {
		this.setHeight(height);
	}

	@Override
	public void walk() {
		System.out.println("Dog walks");
	}
}
