package enumerations.basicFeatrue;

import java.util.Random;

enum Choice{
	BIG,SMALL
}
public class SwithEnum {
	public static void main(String[] args) {
		Choice choice=Choice.values()[new Random().nextInt()%2];
		switch (choice){
			case SMALL:
				System.out.println("Nothing but I don't cover the BIG one but compiler never complain.");
		}
		switch (choice){
			case BIG:
				return ;
			case SMALL:
				return ;
			default:			//if I comment default segment,the compiler will complain.
				return ;
		}


	}
}
