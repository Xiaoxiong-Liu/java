package enumerations.basicFeatrue;

enum helo{
	HELLO,
	HAPPY,
	HADOP

}

class EnumClass {
	public static void main(String[] args) {
		for(helo h:helo.values()){
			System.out.println("it is "+h);
			System.out.println("ordinal: "+h.ordinal());
			System.out.println(h.getDeclaringClass());
			System.out.println(h.name());
			System.out.println("------------------");
		}
	}
}
