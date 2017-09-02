package contain.arrays;

import java.util.Arrays;

public class T16_6 {
	public static void main(String ars[]) throws Exception{
		int[] a=new int[5];
		Arrays.fill(a,100);
		System.out.println(Arrays.toString(a));
		test(AB.class);
	}

	public static  void test(Class<?> souround) throws Exception{
		for(Class<?> type:souround.getClasses()){
			System.out.println(type.getSimpleName()+"************");
			//这里会抛出异常，因为这里的是非静态内部类
			Ican aba=(Ican)type.newInstance();
			aba.say();
		}
	}

}


class AB{
	class A implements Ican{
		@Override
		public void say() {
			System.out.println("A:"+A.class.getSimpleName());
		}
	}
	public class B implements Ican{
		public B(){}

		@Override
		public void say() {
			System.out.println("B:"+B.class.getSimpleName());
		}
	}
	public class C implements Ican{
		public C(){}

		@Override
		public void say() {
			System.out.println("C:"+C.class.getSimpleName());
		}
	}
}

interface Ican{
	void say();
}
