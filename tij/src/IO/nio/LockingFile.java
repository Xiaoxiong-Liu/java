package IO.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class LockingFile {
	/*
	can not effect the operation
	 */
	public static void main(String a[]) throws Exception{
		File f=new File("/home/yexu/testdir/lock");
		if(!f.exists()) f.createNewFile();
		FileChannel fc=new FileOutputStream(f).getChannel();
		FileLock fileLock=fc.tryLock();
		TimeUnit.SECONDS.sleep(100);
		System.out.println("****************");
		fileLock.release();

	}

}
