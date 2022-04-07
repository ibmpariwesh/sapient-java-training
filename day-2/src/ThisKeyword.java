class Test{
	int a=1;//instance variable
	static int b = 2; //class/static  variable
	public Test(int b) {//custom
		this.a=b;
	}
	public Test() {
	}
	private void method2() {
		System.out.println(this);
	}
	static void method1() {
//		System.out.println(a);
		System.out.println(b);
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.b=3;
		Test t2 = new Test();
		t2.b=5;
		Test.b=6;
		System.out.println(Test.b);
		System.out.println(Test.b);
		
	}
}
