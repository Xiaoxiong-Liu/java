package enumerations.organization;

/**
 * achieve categorization by grouping the elements in an interface
 */
interface Food{

	enum MainCourse implements Food{
		RICE,CHICKEN,FISH,CUCAMBER
	}
	enum Dessert{
		ICECREAM,FRUIT,SALAD
	}
}

public class TypeOfFood {
	public static void main(String[] args) {
		Food food= Food.MainCourse.RICE;
		//Food food=MainCourse.RICE; //is not allowed here
	}
}
