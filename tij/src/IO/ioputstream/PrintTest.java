package IO.ioputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class PrintTest {
	public static void main(String [] a) throws Exception{

		PrintWriter pw=new PrintWriter(new FileOutputStream(new File("/home/yexu/testdir/object")));
		pw.append("hello\n");
		pw.flush();
		pw.close();
	}
}
