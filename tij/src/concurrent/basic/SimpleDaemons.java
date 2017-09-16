package concurrent.basic;

import java.util.concurrent.TimeUnit;

/**
 * Created by liuxiaoxiong on 2017/9/16.
 */
public class SimpleDaemons implements Runnable{
    final int id=count++;
    public static int count=0;
    String name="normal";

    @Override
    public void run() {
        int a=10;
        while(a-->0){
            System.out.println(id+" run..."+"    name is "+name);
        }

    }

    public SimpleDaemons(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Thread deamon=new Thread(new SimpleDaemons("Deamon"));
        deamon.setName("Deamon...");
        deamon.setDaemon(true);
        deamon.start();
        try {
            TimeUnit.MICROSECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        for(int i=0;i<10;i++){
//            new Thread(new SimpleDaemons()).start();
//        }

    }
}
