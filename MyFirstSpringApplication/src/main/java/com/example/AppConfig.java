package com.example;


import java.time.LocalTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.mybeans.Book;
import com.example.mybeans.Person;
import com.example.mybeans.Product;

@Configuration

public class AppConfig {
	@Bean
	@Scope("prototype")
	public String greeting() {
		return "Hello buddies";
	}

	@Bean
	@Scope("prototype")
	public LocalTime show() {
		return LocalTime.now();
	}

	@Bean
	@Scope("prototype")
	public Person showPerson() {
		return new Person("Yunseo", 12);
	}

	@Bean
	@Scope("prototype")
	public Product showProduct() {
		return new Product("Macbook Air");
	}


	@Bean
	@Scope("prototype")
    public Book showBook() {
        return new Book(1897,"Rabbit-proof Fence",635,"Doris Pilkington Garimara",673508);
    }

}