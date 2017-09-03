package enumerations.basicFeatrue;

public enum OzWitch {
	WEST("WWWWW"),
	EAST("EEEEE"),
	NORTH("NNNNN"),
	SOUTH("SSSSSS");
	String dsc;
	//thr enum is private even you add no modify
	OzWitch(String dsc){
		this.dsc=dsc;
	}
	public  String getDsc(){
		return this.dsc;
	}

	public static void main(String[] args) {
		OzWitch o1=OzWitch.EAST;
		OzWitch o2=WEST;
		OzWitch o3=OzWitch.WEST;
		System.out.println(o2==o3);
		System.out.println(o1.getDsc());
	}
}
