package contain.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public class References {


	private static class Verybig{
		private final int SIZE=1000;
		private long la[]=new long[SIZE];
		String id;
		public Verybig(String id){
			this.id=id;
		}
		@Override
		protected void finalize(){
			System.out.println(id+"is being collected.");
		}
	}

	private static ReferenceQueue<Verybig> rq=new ReferenceQueue<Verybig>();
	public static void checkQueue(){
		Reference<? extends Verybig> inq=rq.poll();

		if(inq!=null){
			System.out.println("In queue:"+inq.get());
		}
	}

	public static void main(String a[]){
		LinkedList<SoftReference<Verybig>> sa=new LinkedList<>();
		LinkedList<WeakReference<Verybig>> wa=new LinkedList<>();
		for(int i=0;i<10;i++){
			sa.add(new SoftReference<Verybig>(new Verybig("Soft~"+i),rq));
			System.out.println("Just create :"+sa.getLast());
			checkQueue();
		}

		for(int i=0;i<10;i++){
			wa.add(new WeakReference<Verybig>(new Verybig("Soft~"+i),rq));
			System.out.println("Just create :"+wa.getLast());
			checkQueue();
		}
	}
}
