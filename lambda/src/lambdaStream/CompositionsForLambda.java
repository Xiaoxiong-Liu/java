package lambdaStream;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompositionsForLambda {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(7,8,9,6,43,1,6,8,2,1,56);
//		List listy= Arrays.asList(3,6,8,96,45,5,6,5,5,6,3,8);		//Now I do not know how to use two stream

		//if I want to sort it,the normal way
		List <Point>o_iniList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			o_iniList.add(new Point(list.get(i)%3,list.get(i)/3));
		}
		o_iniList.sort(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return Double.compare(o1.getX(),o2.getX());
			}
		});
		System.out.println(o_iniList);

		//the better way
		list.stream()
				.map(integer -> new Point(integer%3,integer/3))
				.sorted(Comparator.comparing(point -> point.getX()))		//if you need sort it by Y then just change here
				.forEach(point -> System.out.println(point.getX()+"  "+point.getY()));

	}
}
