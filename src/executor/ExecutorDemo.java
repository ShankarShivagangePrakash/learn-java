package executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {

        CheckProcessorTask[] checkProcessorList = {new CheckProcessorTask("ATM"),
                new CheckProcessorTask("Mobile"),
                new CheckProcessorTask("Bank"),
                new CheckProcessorTask("Web")};

        //Create Executor service, internally it creates a thread pool with two threads in it.
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < checkProcessorList.length; i++) {
            //internally assigns this object to a thread from thread pool and invokes the run() of that checkProcessTask class.
            executorService.submit(checkProcessorList[i]);
        }
        //once your operation is done, stop the executor service to free the threads.
        executorService.shutdown();
    }
}
