package concurrent.basic;

import java.util.concurrent.*;

/**
 * Created by liuxiaoxiong on 2017/9/16.
 */
class TaskWithResult implements Callable<String>{
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result: "+id;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es= Executors.newCachedThreadPool();
        Future<String> feature=es.submit(new TaskWithResult(9));
        try {
            System.out.println(feature.get());;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
