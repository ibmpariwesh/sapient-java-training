class Worker extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t1 = new Worker();
		t1.start();
		System.out.println(Thread.currentThread());//main thread
	}
}
