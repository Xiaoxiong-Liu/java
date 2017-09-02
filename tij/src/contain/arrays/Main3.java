package contain.arrays;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {//注意while处理多个case
			//长度
			int len=in.nextInt();
			//极值
			int max=in.nextInt();
			//计数
			int count=0;

			int[][] table=new int[len][max];
			for(int i=0;i<len;i++)table[i][0]=1;
			for(int i=0;i<max;i++)table[0][i]=1;

			//动态规划


			System.out.println(table[len-1][max-1]);

		}
	}
}
