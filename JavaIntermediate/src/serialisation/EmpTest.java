package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpTest {

	public static void main(String[] args) {
		Employee emp=new Employee(56298, "Yunseo",68000,"Pen Tester","Yunseo@kor.com");
		try {
		//-----Write Operation-------------
		//to create a file
		FileOutputStream fileOut=new FileOutputStream("object.txt");
		//to convert obj into stream of bytes
		ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
		oOut.writeObject(emp);
			
		
		
		//-----Read Operation-------------

		FileInputStream fileIn=new FileInputStream("object.txt");
		//to convert bytes to object
		ObjectInputStream oIn=new ObjectInputStream(fileIn);
		Employee empCopy=(Employee)oIn.readObject();
		System.out.println(empCopy.empId);
		System.out.println(empCopy.name);
		System.out.println(empCopy.salary);
		System.out.println(empCopy.designation);

		
		
	}catch (Exception e) {
	 e.printStackTrace();
	}
		
		
		

	}

}
