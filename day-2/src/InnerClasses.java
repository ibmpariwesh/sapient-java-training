
public class InnerClasses {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.method1();

	}
}

class Outer {
	int a = 1;
	void method2(){
//		System.out.println(c);
	}
	class Inner {
		int a = 2;
		int c=30;
		int method1() {
			int k =90;//local scope
			System.out.println(a);
			System.out.println(new Outer().a);
			return k;
		}
//		int method(){
////			System.out.println(k);
//			return k;
//		}
	}
}
