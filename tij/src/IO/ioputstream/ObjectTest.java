package IO.ioputstream;

import java.io.*;

public class ObjectTest {
	static MyObject o=new MyObject(1,2);
	public static void main(String[] a) throws IOException, ClassNotFoundException {
		File objectf=new File("/home/yexu/testdir/object");
		if(!objectf.exists())objectf.createNewFile();
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(objectf));
		os.writeObject(o);
		os.flush();
		os.close();

		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(objectf));
		MyObject obin= (MyObject) ois.readObject();
		System.out.print(obin.getI()+""+obin.getJ());


	}
}

class MyObject implements Serializable{
	//transient关键字
	private transient int i;
	private int j;
	public MyObject() {

	}
	public MyObject(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
}
