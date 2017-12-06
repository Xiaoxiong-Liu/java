package concurrent.countDownLatch;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchDemo2 {

    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Part(i,latch).start();
        }

        try {
            latch.await();
            System.out.println("everything is over at "+new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}

class Part extends Thread{
    int id;
    CountDownLatch latch;
    Part(int id,CountDownLatch latch){
        this.id=id;
        this.latch=latch;
    }
    @Override
    public void run() {
//        super.run();
        System.out.println(id+"  Working Here....");
        try {
            TimeUnit.SECONDS.sleep((int)(Math.random()*5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(id+"   is Working Over at   "+new Date());
        latch.countDown();
    }
}