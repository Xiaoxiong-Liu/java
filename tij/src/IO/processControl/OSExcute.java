package IO.processControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OSExcute {
	public static void main(String a[]){
//		command("cd ..");
		command("touch nio");
	}

	public static void command(String command){
		boolean err=false;
		try {
			Process process=new ProcessBuilder(command.split(" ")).start();
			BufferedReader br=new BufferedReader(new InputStreamReader(process.getInputStream()));
			String s;
			while((s=br.readLine())!=null)
				System.out.println(s);
		} catch (IOException e) {
			//simple
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
