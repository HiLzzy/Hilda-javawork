package constructor;

public class TestpPerson {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Edibe Güneş";
		p1.age=28;
		p1.address="Ordu ";
		p1.phone=7980888;
		
		Person p2=new Person("Abdulrahman",67,"Medina",63826);
		Person p3=new Person("Eito",18,"Yokohama",222);
		Person p4=new Person("Hyejin", 23);
		p4.address="Incheon";
		p4.phone=9836454;	
				
			
	}
		
	}


