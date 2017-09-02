package contain.string.pandm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	public static void main(String args[]){
		new TestRegularExpression().test();

	}

	private void  test(){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入句子：");
		while(in.hasNext()){

			String str=in.nextLine();
			System.out.println("请输入模式：");
			String pstr=in.nextLine();
			/*******************************************/
			/***/Pattern p=Pattern.compile(pstr);	/***/
			/***/Matcher m=p.matcher(str);			/***/
			/*******************************************/
			while(m.find()){
				System.out.println("Match: "+m.group()+",at "+m.start()+"--"+m.end());
			}
			System.out.println("请输入句子：");
		}

	}

}
