package multithreading.wait.notify;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread{
	private Queue<Integer> integers;
	private int size;
	public Producer(Queue<Integer> integers, int size) {
		this.integers = integers;
		this.size = size;
	}
	@Override
	public void run() {
		while (true) {
			synchronized (integers) {
				while(size == integers.size()){
					System.out.println("full stack, need to wait to consume by consumer thread : "+integers.size());
					try {
						integers.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Random random = new Random();
                int i = random.nextInt(10)+1;
                System.out.println("Producing value : " + i);
                integers.add(i);
                integers.notifyAll();
			}
		}
	}
}
