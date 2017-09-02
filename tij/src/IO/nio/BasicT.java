package IO.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

class BasicT {
 	ByteBuffer byteBuffer;
 	public static void main(String a[]) throws Exception{
		FileChannel fileChannel=new FileOutputStream("/home/yexu/testdir/nio").getChannel();
		//国人the default encode is GBK.
		ByteBuffer bf=ByteBuffer.wrap("It is the best girl for me.\n".getBytes("UTF-16BE"));
		fileChannel.write(bf);

		bf.flip();
//		bf.rewind();
		//it doesn't work
		System.out.println("在到测算法直接输出的asCharBuffer():"+bf.asCharBuffer());
		String encoding=System.getProperty("file.encoding");
		System.out.println("file encoding:"+encoding);
		System.out.println("Using "+encoding+" to decoding:"+Charset.forName(encoding).decode(bf));

	}
}
