package threadPoolImplementation;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {

	private LinkedBlockingQueue<Runnable> queue;
	private int maxThreads;
	private static ThreadPool pool = null;
	
	private ThreadPool(int maxThreads){
		this.queue = new LinkedBlockingQueue<Runnable>();
		this.maxThreads = maxThreads;
	}
	
	public void startExecution(){
		for(int i=0;i<maxThreads;i++){
			Thread t = new MyThread(queue);
			t.start();
		}
	}
	
	public void addWork(Runnable r) throws InterruptedException{
		queue.put(r);
	}
	
	public static ThreadPool getThreadPool(int maxThreads){
		if(pool == null){
			pool = new ThreadPool(maxThreads);
			return pool;
		}
		return pool;
	}
	
	
	
}
