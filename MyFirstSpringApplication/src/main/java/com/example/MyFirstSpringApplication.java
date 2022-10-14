package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.mybeans.Book;
import com.example.mybeans.Person;

	@SpringBootApplication
public class MyFirstSpringApplication {
		public static void main(String[] args) {
			ApplicationContext context = SpringApplication.run(MyFirstSpringApplication.class, args);
			
			
//			Object byName = context.getBean("Show");
//			LocalTime byType = context.getBean(LocalTime.class);
//			LocalTime byBoth = context.getBean("Show", LocalTime.class);
//			
//			Object byName1 = context.getBean("showPerson");
//			Person byType1 = context.getBean(Person.class);
//			Person byBoth1 = context.getBean("showPerson", Person.class);
//			
//			Object byName2 = context.getBean("showProduct");
//			Product byType2 = context.getBean(Product.class);
//			Product byBoth2 = context.getBean("showProduct", Product.class);
			
			Object byName3 = context.getBean("showBook");
			Book byType3 = context.getBean(Book.class);
			Book byBoth3 = context.getBean("showBook", Book.class);
			
			//System.out.println(byName); 
			//System.out.println(byType);
			//System.out.println(byBoth);
			
			System.out.println(byName3); 
			System.out.println(byType3);
			System.out.println(byBoth3);
	}
}
