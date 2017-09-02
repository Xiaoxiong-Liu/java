package IO.standard;

import java.io.*;

public class Redirect {
	public static void main(String args[]) throws Exception{
		PrintStream out=new PrintStream(new BufferedOutputStream(new FileOutputStream("/home/yexu/testdir/out")));
		BufferedInputStream in=new BufferedInputStream(new FileInputStream("/home/yexu/TLCL-16.07.txt"));
		System.setOut(out);
		System.setIn(in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null)
			System.out.println(s);
		br.close();
		in.close();
		out.close();
	}
}
