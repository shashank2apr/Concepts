package threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestExecutorService {

	public static void main(String[] args) {
		ExecutorService  executorService = Executors.newFixedThreadPool(10);
		
		
		Future future = null;
		future = (Future) executorService.submit(new Callable<Object>() {
			
			@Override
			public Object call(){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("In Thread!");
				return 2;
			}
		});
		
		future =  executorService.submit(()->{
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("In Thread!");
				return 2;
			});
		
		
		try {
			System.out.println(future.getClass());
			System.out.println(future.get());
			//System.out.println(future.get(500, TimeUnit.MILLISECONDS));
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("Main Thread!");
		
	}

}
