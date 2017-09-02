package contain.containner.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
	public static void main(String args[]){
		Collection<String> collection=new ArrayList<>();
		collection.add("1");
		collection.add("2");
		System.out.print(collection.contains("1"));
		System.out.print(collection.contains(new String("3")));
	}
}
