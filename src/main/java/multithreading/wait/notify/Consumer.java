package multithreading.wait.notify;

import java.util.Queue;

public class Consumer extends Thread{
	private Queue<Integer> integers;
	public Consumer(Queue<Integer> integers, int size) {
		this.integers = integers;
	}
	@Override
	public void run() {
		while (true) {
			synchronized (integers) {
				while (integers.isEmpty()) {
					System.out.println("stack is empty, need to wait to produce by producer thread : ");
					try {
						integers.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consuming value : " + integers.remove());
				integers.notifyAll();
			}
		}
	}
}
