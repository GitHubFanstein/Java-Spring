package com.example.demo3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo3.model.User;


@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);

		
        List<User> list = new ArrayList<>();

        // Adding two User instances to the list
		
        // Printing the list
        System.out.println(list);
		
	}
    

}
