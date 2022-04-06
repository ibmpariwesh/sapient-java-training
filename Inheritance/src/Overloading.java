class A {
	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {//overloaded methods
		return a + b + c;
	}
}

public class Overloading {
	public static void main(String[] args) {
		A a = new A();
		a.sum(1, 2);
		a.sum(1, 2,3);
	}
}
