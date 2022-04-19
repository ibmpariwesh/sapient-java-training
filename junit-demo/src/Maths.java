
public class Maths {
	public int add(int a, int b) {
		return a+b;
	}
	
	public boolean compare(int a, int b) {
		if(a<0) {
			throw new IllegalArgumentException();
		}
		return a == b;
	}
	
	
}
