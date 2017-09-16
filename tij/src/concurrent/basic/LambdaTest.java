package concurrent.basic;

/**
 * Created by liuxiaoxiong on 2017/9/16.
 */
public class LambdaTest {
    public static void main(String[] args) {
        new Thread(()-> {System.out.println("hello");}).start();
    }
}
