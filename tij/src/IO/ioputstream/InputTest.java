package IO.ioputstream;

import java.io.*;
import java.util.Arrays;

public class InputTest {

	public static void main(String [] a) throws Exception{
		File f=new File("/home/yexu/testdir/test");
		if(!f.exists()) f.createNewFile();
		OutputStream op=new BufferedOutputStream(new FileOutputStream(f,true));
		op.write(new byte[]{1,2,3,4,5,6,7});
//		op.write(99999);
		op.flush();
		op.close();

		byte[] b=new byte[30];
		InputStream in=new FileInputStream(f);
		in.read(b);
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]);
		}

		in.close();
	}
}
