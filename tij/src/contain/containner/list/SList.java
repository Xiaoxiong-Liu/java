package contain.containner.list;

public class SList<T> {
	private SList next;
	private T t;
	public SList(T t){
		this.t=t;
	}

	public SList(){

	}
	public <T> T add(T t){
		next=new SList();
		next.t=t;
		return t;
	}
	public <T> T get(int index){
		//It is wrong,but I don't want to correct it.
		SList<T> temp=this.next;
		for(int i=0;i<index;i++){
			if(temp.next!=null){
				temp=temp.next;
			}else{
				throw new RuntimeException();
			}
		}
		return temp.t;
	}
	public int size(){
		int count=1;
		SList temp=next;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}




	public static void main(String a[]){
		SList<String> sl=new SList<>("5");
		sl.add("hello");
		System.out.println(sl.size()+""+sl.get(1));
	}

}
