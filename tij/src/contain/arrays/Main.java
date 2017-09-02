package contain.arrays;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {//注意while处理多个case

			String input=in.nextLine();
			String arg[]=input.split(" ");
			//房租
			int x=Integer.parseInt(arg[0]);
			//已有水果
			int fruit=Integer.parseInt(arg[1]);
			//已有钱
			int money=Integer.parseInt(arg[2]);
			//水果价格
			int price=Integer.parseInt(arg[3]);
			//存活天数
			int day=0;
			//是否能活了
			boolean canlive=true;

			//还有水果的时候
			for(int i=0;i<fruit;i++){
				if(money<x){
					canlive=false;
					break;
				}
				money-=x;
				day++;
			}

			if(canlive){
				day=day+(money/(price+x));
			}
			System.out.println(day);

		}
	}
}