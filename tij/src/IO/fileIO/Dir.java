package IO.fileIO;

import java.io.File;

public class Dir {
	public static void main(String [] a){
		File file =new File("/home/yexu/testdir");
		System.out.println("isdir? "+file.isDirectory()
				+"\ncanexe?"+file.canExecute()
				+"\nabname"+file.getAbsolutePath());
//		File old=new File("/home/yexu/testdir/Book"),rname=new File("/home/yexu/testdir/Booknew");
//		System.out.print("rename:"+old.renameTo(rname)+"\ndelete"+old.delete()+"\n");;
		File newdir=new File("/home/yexu/testdir/madebyJava");
		if(!newdir.exists()){
			newdir.mkdir();
		}else{
			newdir.delete();
		}
		whereAmI();

	}

	public static void whereAmI(){
		File f=new File(".");
		System.out.println("pwd:"+f.getAbsoluteFile());
	}
}
