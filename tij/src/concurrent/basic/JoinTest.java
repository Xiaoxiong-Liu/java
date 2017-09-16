package concurrent.basic;

/**
 * Created by liuxiaoxiong on 2017/9/16.
 */
public class JoinTest {
    public static void main(String[] args) {
        Thread sleeper=new Thread(()->{
            try {
                System.out.println("SSSSSSS!!!!!!!!!!");
                Thread.currentThread().sleep(1000);
                System.out.println("SSSSSSSSSSSSSS");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread joiner=new Thread(()->{
//            try {
//                sleeper.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("JJJJJJJJJJ");
        });
        sleeper.start();
        joiner.start();

    }
}
