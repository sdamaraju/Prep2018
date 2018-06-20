package threadPoolImplementation;

public class ThreadPoolImplMain {

	public static void main(String[] args) throws InterruptedException {
		ThreadPool pool = ThreadPool.getThreadPool(10);
		pool.startExecution();
		
		for(int i=0;i<20;i++){
			pool.addWork(new Runnable() {
			@Override
			public void run() {
				System.out.println("I'm Thread");
			}});
		}		
	}

}
