package contain.containner.other;

public class Overflow {
	int a;
	public static void main(String arg[]){
		int a=Integer.MAX_VALUE;
		int b=Integer.MAX_VALUE+1;
		System.out.print(a>b);
		System.out.print(a-b);
		System.out.print(b-a);
	}
}
