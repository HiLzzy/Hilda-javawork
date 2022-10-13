package array;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//Declare
				//instantiate
				//initialize
				
				String[] student;//Declare
				student=new String[5];//instantiate
				student[0]="Yunseo";//initialise
				student[1]="Sono";
				student[2]="Fahad";
				student[3]="Ruzgar";
				student[4]="Hyejin";
				
				String[] City=new String[5];
				
				String[] fruits= {"Banana","apple","Grapes","Guava","pineapple","Avacado"};
				System.out.println("Students-------");
				for(int i=0;i<student.length;i++)
				{
					System.out.println(student[i]);
				}
				System.out.println("Fruits-----------");
				for(int i=0;i<fruits.length;i++)
				{
					System.out.println(fruits[i]);
				}
				System.out.println("zipcode-----------");
				int[] zipcode= {2345,3456,3456,3456,789,467,456,3456,34567,45678,3456};
				for(int i=0;i<zipcode.length;i++)
				{
					System.out.println(zipcode[i]);
				}
				
				
				

			}

		}