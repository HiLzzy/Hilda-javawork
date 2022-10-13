package personExc;

public class Person {
	
		String name;
		int age;
		int IdNumber;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getIdNumber() {
			return IdNumber;
		}
		public void setIdNumber(int idNumber) {
			IdNumber = idNumber;
		}
		
		@Override 
		public String toString() {
			return "Person \n [name=" + name + "\n" 
					+ age + "\n IdNumber" ]
		}
	}

//return "Product \n [name=" + name + "\n price=" 
//+ price + "\n quantity=" + quantity + "\n brand=" + brand + "]\n"

 
