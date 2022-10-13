package fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;



public class ReaderExample {

	public static void main(String[] args) {
		try {
			Reader r=new FileReader("JavatxtEdt.txt");
			int data=r.read();
			while(data != -1)
			{
				System.out.println((char)data);
				data=r.read();//read next character		
			}
		}catch (IOException e) {
			e.printStackTrace();
			
		}
			
			
			
		}

	}


