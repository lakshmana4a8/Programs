package multithreading.wait.notify;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern {
	public static void main(String args[]) {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();// Creating shared object
		Thread prodThread = new Thread(new ProducerClass(sharedQueue));// Creating Producer and Consumer Thread
		Thread consThread = new Thread(new ConsumerClass(sharedQueue));
		prodThread.start(); consThread.start();// Starting producer and Consumer thread
	}
}
class ProducerClass implements Runnable {
	private final BlockingQueue<Integer> sharedQueue;
	public ProducerClass(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	public void run() {
		for (int i = 0; i < 10; i++)
			try {
				System.out.println("Produced: " + i);
				sharedQueue.put(i);//Thread.currentThread().sleep(2000L);
			} catch (InterruptedException ex) { }
	}
}
class ConsumerClass implements Runnable {
	private final BlockingQueue<Integer> sharedQueue;
	public ConsumerClass(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	public void run() {
		while (true)
			try {
				int count = sharedQueue.take();
				System.out.println(count+ " :Consumed   : " + sharedQueue);
				if(count >= 9){ System.exit(0); }
			} catch (Exception ex) { }
	}
}