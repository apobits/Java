/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author aposo
 *
 */
public class Q47 {

	static class R implements Runnable {

		@Override
		public void run() {
			System.out.println("Run...");

		}

	}

	static class C implements Callable<String> {

		@Override
		public String call() throws Exception {
			return "Call...";
		}

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new R());
		Future<String> f1 = es.submit(new C());
		System.out.println(f1.get());
		es.shutdown();

	}

}
