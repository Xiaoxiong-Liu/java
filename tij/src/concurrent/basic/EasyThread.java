package concurrent.basic;

/**
 * Created by liuxiaoxiong on 2017/9/16.
 */
public class EasyThread implements Runnable{
    protected int countDown = 10;
    private static  int taskCount=0;
    private final int id=taskCount++;
    public EasyThread(){}
    public EasyThread(int countDown){
        this.countDown=countDown;
    }
    public String status(){
        return "#"+id+"#"+(countDown>0?countDown:"EMMM");
    }

    @Override
    public void run() {
        while(countDown-->0){
            System.out.println(status());

        }
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(new EasyThread()).start();
            //optional
            Thread.yield();
        }
    }

}
