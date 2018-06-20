package threadPoolImplementation;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyThread extends Thread {
	
	private LinkedBlockingQueue<Runnable> q;
	
	MyThread(LinkedBlockingQueue queue){
		super();
		this.q = queue;
	}
	
	public void start(){
		while(true){
			try{
				Thread t = new Thread(q.poll());
				//System.out.println("Thead Starting to run ");
				t.start();
				//System.out.println("Thread started");
			}catch(Exception ex){
				// no op
			}
		}
	}
}
