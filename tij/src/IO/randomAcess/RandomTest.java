package IO.randomAcess;

import java.io.File;
import java.io.RandomAccessFile;

class RandomTest {
	public static void main(String[] a) throws Exception{
		File f=new File("/home/yexu/testdir/object");
		RandomAccessFile raf=new RandomAccessFile(f,"r");

		System.out.println(raf.readLine());
		System.out.println(raf.getFilePointer());
		raf.seek(0);
		System.out.println(raf.readLine());

//
		raf.seek(1);
		System.out.println(raf.readLine());
		raf.seek(0);
		System.out.println(raf.readChar());
//		System.out.println(raf.readChar());
//		System.out.println(raf.readChar());
//
		raf.close();
	}
}
