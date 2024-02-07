package executor.callableinterface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
    public static void main(String[] args) {
        MyCallable[] myCallables = {new MyCallable(5),
                new MyCallable(10),
                new MyCallable(15),
                new MyCallable(20),
                new MyCallable(25),};

        //executor service
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (MyCallable mycallable : myCallables) {
            // assigns thread and invokes the call() method, the output will be assigned back to future object
            Future<Integer> future = executorService.submit(mycallable);

            try {
                //get the output from future.
                System.out.println(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        executorService.shutdown();
    }
}
