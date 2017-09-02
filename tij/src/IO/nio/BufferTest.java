package IO.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class BufferTest {
	public static void main(String[] a) throws Exception{
		File f=new File("/home/yexu/testdir/buffer");
		System.out.print(f.exists());
		System.out.println(f.isFile());
		FileChannel channel=new FileInputStream(f).getChannel();
		ByteBuffer bb=ByteBuffer.wrap(new byte[200]);
		System.out.println(bb.capacity()+""+bb.clear()+""+bb.limit());
		bb.flip();


		CharBuffer cb=CharBuffer.wrap(new char[100]);

	}
}
