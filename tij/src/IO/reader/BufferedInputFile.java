package IO.reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedInputFile {
	public static String read(String filename) throws Exception{
		BufferedReader bf=new BufferedReader(new FileReader(filename));
		String s;
		StringBuffer sb=new StringBuffer();
		while((s=bf.readLine())!=null){
			sb.append(s+"\n");
		}
		bf.close();
		return sb.toString();
	}

	public static void main(String[] a) throws Exception{
		System.out.println(read("tij/src/IO/reader/BufferedInputFile.java"));
	}
}
