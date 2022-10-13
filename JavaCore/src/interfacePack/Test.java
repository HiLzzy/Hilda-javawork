package interfacePack;

import java.util.ArrayList;

import inheritance.Student;


public class Test {

	public static void main(String[] args) {
		Person p=new Employee();
		p.doSomething();
		Artist a=new Employee();
		a.doArt();
		Player p1=new Employee();
		p1.doPlay();
		Doable d=new Employee();
		d.do1();
		
		Employee ee=new Employee();
		Student ss=new Student();
		
		
		ArrayList<Player> list=new ArrayList();
		list.add(ee);
		list.add(ss);

	}

}
