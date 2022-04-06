
public class Animal {
	private float height;
	private float weight;

	public void walk() {
		System.out.println("Animal walks");
	}
	
	public void eat() {
		System.out.println("animal eating..");
	}
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
