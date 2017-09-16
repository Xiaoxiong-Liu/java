package concurrent.basic;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liuxiaoxiong on 2017/9/16.
 */
public class CacheThreadPool {
    public static void main(String[] args) {

        ExecutorService es= Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            es.execute(new EasyThread());
        }
    }
}
