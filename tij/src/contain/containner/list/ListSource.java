package contain.containner.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSource {
	public static void main(String a[]){
		ArrayList al=new ArrayList(5);
		al.ensureCapacity(50);
		System.out.print(al.size());
	}
}
