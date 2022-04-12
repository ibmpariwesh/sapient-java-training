import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(3);
		queue.add(1);
		queue.add(-1);
		System.out.println(queue);
	}
}
