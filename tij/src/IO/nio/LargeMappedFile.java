package IO.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class LargeMappedFile {
	public static void main(String[] a) throws Exception{
		long len=0x8FFFFFF;
		MappedByteBuffer mappedByteBuffer=new RandomAccessFile("/home/yexu/testdir/dat","rw")
				.getChannel().map(FileChannel.MapMode.READ_WRITE,0,len);
//		mappedByteBuffer.position(20);
//		mappedByteBuffer.put((byte) '\n');
		double start=System.nanoTime();
		for(int i=0;i<100;i++){

			mappedByteBuffer.put((byte) 'y');
			mappedByteBuffer.force();
		}
		double duration=System.nanoTime()-start;
		System.out.printf("mappedFile:  %.2f\n",duration/1e9);
		mappedByteBuffer.clear();
	}
}
