package contain.arrays;

import java.util.ArrayList;
import java.util.List;

public class T16_5 {
	public static void main(String args[]){
		//非法
		//List<A>[] a=new ArrayList<A>[10];
	}

}

class A{

}

class ClassPara<T>{
	public T[] f(){
		return null;
	}
}

class MethodPara{
	public static <T> T[] f(T[] arg){
		return arg;
	}

}

class ArrayOfGenerics{
	public static void main(String args[]){
	List<String>[] ls=(List<String>[])(new List[10]);
//	ls[0]=new ArrayList<Integer>();
	}
}
