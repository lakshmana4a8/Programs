package multithreading.wait.notify;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> integers = new LinkedList<Integer>();
		Producer producer = new Producer(integers, 10);
		Consumer consumer = new Consumer(integers, 10);
		producer.start();
		consumer.start();
	}
}
