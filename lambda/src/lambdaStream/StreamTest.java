package lambdaStream;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		List<Integer> iniList= Arrays.asList(1,2,3,4,5,6);
		OptionalDouble maxDistance=iniList.parallelStream()
				.map(i->new Point(i%3,i/3))
				.mapToDouble(p->p.distance(0,0))
				.max();
		System.out.println(maxDistance);

		iniList.forEach(p-> System.out.println(p.toString()));
	}
}
