package IO.nio;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class CharSetCollection {
	public static void main(String a[]){
		SortedMap<String,Charset> charsets= Charset.availableCharsets();
		Iterator it=charsets.keySet().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
