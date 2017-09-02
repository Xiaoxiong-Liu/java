package contain.arrays;

import java.util.Arrays;

public class T16_2 {
	public static void main(String args[]){

		B[] a;
		B[] b=new B[5];
		System.out.println("b:"+ Arrays.toString(b));
		B[] c=new B[4];
		for(int i=0;i<4;i++){
			if(c[i]==null)
				c[i]=new B();
		}
		//##############################
		/**/B[] d={new B(),new B(),new B()};	//这样初始化
		/**/a=new B[]{new B(),new B()};			//由于a在前面声明，这里必须这样
		//##############################
		char[] cc=new char[10];
		for(int i=0;i<10;i++){
			System.out.println(cc[i]);
		}
		argarr(new B[]{new B()});
	}
	private static void argarr(B[] holly){
		System.out.print("holly!");
	}

	static class B{

	}
}
