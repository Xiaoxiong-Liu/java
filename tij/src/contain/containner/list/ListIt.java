package contain.containner.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIt {
	public static void main(String a[]){
		List<Integer> l=new ArrayList<>(5);
		l.addAll(Arrays.asList(2,3,4,5));
		l.remove(3);
		System.out.println(l);
		ListIterator lt=l.listIterator();
		while(lt.hasNext()){
			System.out.print(lt.next());
			lt.add(9);
		}
		System.out.println(l);
	}
}
