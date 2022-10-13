package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
	public static void main(String[] args) {
		
	//Writer w=new FileWriter("D:\\qafiles\\upasana.txt");
	try {
	Writer w = new FileWriter("D:\\upasana.txt");//open
	String content="Welcome to the world of java, I will take y";
	w.write(content);
	w.close();
	System.out.println("file written successfully");
	}catch(IOException e) {
		e.printStackTrace();
	}
	


}
}
