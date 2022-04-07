
public class InnerClasses {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.method1();

	}
}

class Outer {
	int a = 1;

	class Inner {
		int a = 2;

		void method1() {
			System.out.println(a);
			System.out.println(new Outer().a);
		}
	}
}

class Engine {
	class Piston {

	}
}