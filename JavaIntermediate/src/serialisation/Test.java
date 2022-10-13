package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {
		Product prod=new Product(1001, "TV",1000,"Apple");
		try {
		//-----Write Operation-------------
		//to create a file
		FileOutputStream fileOut=new FileOutputStream("object.txt");
		//to convert obj into stream of bytes
		ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
		oOut.writeObject(prod);
			
		
		
		//-----Read Operation-------------

		FileInputStream fileIn=new FileInputStream("object.txt");
		//to convert bytes to object
		ObjectInputStream oIn=new ObjectInputStream(fileIn);
		Product prodCopy=(Product)oIn.readObject();
		System.out.println(prodCopy.prodId);
		System.out.println(prodCopy.name);
		System.out.println(prodCopy.brand);
		System.out.println(prodCopy.price);

		
		
	}catch (Exception e) {
	 e.printStackTrace();
	}
		
		
		


	}

}
