package com.demoFunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class DemoFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFunctionApplication.class, args);
	}


	// case 1
	@Bean
	public Function<String,String> reverseString(){
		return value -> new StringBuilder(value).reverse().toString();
	}



}
