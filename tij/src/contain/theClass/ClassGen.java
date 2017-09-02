package contain.theClass;

/**
 * Created by yexu on 26/07/17.
 */
public class ClassGen {
	public static void main(String...args){
		Class<? extends Foo> kk=Son.class;
		Class<? extends Foo> foo=Foo.class;
		try{
			Foo ss=foo.newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(new Son("biu",5) instanceof Foo );

	}

}

class Foo {
	String name;
	int age;


	@Override
	public String toString() {
		return "Foo{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public Foo() {
//		this.name = name;
//		this.age = age;
		System.out.println("Foo---"+this);//这里的this其实是son...
	}
}

class Son extends Foo{
	@Override
	public String toString() {
		return "Son{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	//	String name;
//	int age;
	public Son(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Son---"+this);
	}
}