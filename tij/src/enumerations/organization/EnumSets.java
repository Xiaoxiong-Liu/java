package enumerations.organization;

import java.util.EnumSet;

import static enumerations.organization.Point.*;
//even the Point is in the file,you MUST static import or use Point.ONE

enum Point{
	ONE,TWO,THREE,FOUR,FIVE
}
public class EnumSets {
	public static void main(String[] args) {
		EnumSet<Point> all=EnumSet.noneOf(Point.class);	//EnumSet is abstract so you can not new an instance
		all.add(ONE);
		System.out.println(all);
		all.addAll(EnumSet.of(TWO,TWO));		//ummm.it is set
		System.out.println(all);
		all.removeAll(EnumSet.of(ONE,FIVE));	//What if I remove the one does not exist？
		System.out.println(all);				//Nothing  happened.
	}



}
