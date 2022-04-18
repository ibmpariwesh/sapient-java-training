class Worker1 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
}
public class RunnableDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Worker1());
		t1.start();
		System.out.println(Thread.currentThread());
	}
}
