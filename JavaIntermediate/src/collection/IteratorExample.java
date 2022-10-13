package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList(4);
		list.add("Upasana");
		list.add("Upasana");
		list.add("Hyejin");
		list.add("Yunseo");
		System.out.println(list);
		Iterator<String>  itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		List<Product> prodList=new ArrayList();
		Product prod1=new Product("Bluetooth",50,10,"Samsung");		
		Product prod2=new Product("Macbook Pro",3899,700,"Apple");		
		Product prod3=new Product("Camera",700,450,"Sony");		
		Product prod4=new Product("Tripod",60,25,"LG");
		Product prod5=new Product("Camera",700,450,"Sony");		
		Product prod6=new Product("Tripod",60,25,"LG");
		prodList.add(prod1);
		prodList.add(prod2);
		prodList.add(prod3);
		prodList.add(prod4);
		prodList.add(prod5);
		prodList.add(prod6);
		Iterator<Product> prodItr=prodList.iterator();
		while(prodItr.hasNext())
		{
			System.out.println(prodItr.next());
			
			System.out.println(prodItr.next().name+"--"+prodItr.next().price+"--"+prodItr.next().brand+"--"+prodItr.next().quantity);			
		}
	}
}
