package contain.arrays;

import java.util.Arrays;

public class T16_4 {
	public static void main(String args[]){
		int[][] a=new int[][]{{1},{2,3},{2},{2}};
		int[][] b={{1,2,3},{2}};
		a[1]=new int[]{1,2};
		System.out.println(Arrays.deepToString(a));
	}
}
