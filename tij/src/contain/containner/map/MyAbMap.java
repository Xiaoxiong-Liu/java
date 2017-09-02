package contain.containner.map;

import java.util.*;

public class MyAbMap extends AbstractMap{
	public static void main(String args[]){
		HashMap hashMap=new HashMap();
		hashMap.put(1,"hello");
		hashMap.put(2,"world");
		System.out.print(hashMap.toString());
		ArrayList list=new ArrayList();
		List c=Collections.unmodifiableList(Arrays.asList(1,2,3,4));
//		c.set(1,2);
		System.out.println(new String("hell0").hashCode()==new String("hell0").hashCode());


	}

	static class EntrySet extends AbstractSet{

		@Override
		//返回一个迭代器
		public Iterator iterator() {
			return new Iterator() {
				@Override
				public boolean hasNext() {
					return false;
				}

				@Override
				public Object next() {
					return null;
				}
			};
		}

		@Override
		public int size() {
			return 0;
		}
	}

	@Override
	public Set<Entry> entrySet() {
		return null;
	}
}
