package IO.fileIO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
//	private static class DirFilter implements FilenameFilter{
//		private Pattern pattern;
//		public DirFilter(String regex){
//			pattern=Pattern.compile(regex);
//		}
//		@Override
//		public boolean accept(File dir, String name) {
//			return pattern.matcher(name).matches();
//		}
//	}


	public static FilenameFilter filter(final String reg){
		return new FilenameFilter() {
			private Pattern pattern=Pattern.compile(reg);
			@Override
			public boolean accept(File dir, String name) {
				//match要求严格匹配
				//还是用find好些
				return pattern.matcher(name).find();
			}
		};
	}
	public   static void main(String a[]){
		File path=new File("/home/yexu");
		String[] list;
		list=path.list(filter(".txt"));

		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.deepToString(list));

//		Pattern pat=Pattern.compile("biu*");
//		System.out.println(pat.matcher("biubiu").find());
	}
}
