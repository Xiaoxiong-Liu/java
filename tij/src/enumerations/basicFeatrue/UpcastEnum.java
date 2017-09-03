package enumerations.basicFeatrue;

import java.util.Arrays;

enum Search{
	HIGH,LOW
}
public class UpcastEnum {
	public static void main(String[] args) {
		Enum<Search> a=Search.HIGH;							//upcast
		Enum<Search>[] es=a.getClass().getEnumConstants();
		System.out.println(Arrays.deepToString(es));

	}
}
