package huake;

import java.util.Scanner;

/**
 * Created by liuxiaoxiong on 2017/9/26.
 */
public class StringConcate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String a=in.nextLine();
            System.out.println(a.split(" ")[0].concat(a.split(" ")[1]));
        }
    }
}
