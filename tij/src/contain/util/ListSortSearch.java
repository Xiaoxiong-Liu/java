package contain.util;


import java.util.*;

public class ListSortSearch {
	public static void main(String args[]){
		List<String> list=new ArrayList<String>(Arrays.asList("1","2","3","Five","Six"));
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		ListIterator listIterator=list.listIterator();
		while (listIterator.hasNext()){
//			listIterator.next();
			String next = (String)listIterator.next();
			System.out.println(next);
			if(next == "2") listIterator.remove();
		}
		System.out.println(list);

		Collections.sort(list);
		System.out.println("After sort:"+list);
		int index=Collections.binarySearch(list,"3");
		System.out.print("index of '3':"+index);
		List unmodified=Collections.unmodifiableList(list);
		unmodified.add(1,"8888");
	}
}
