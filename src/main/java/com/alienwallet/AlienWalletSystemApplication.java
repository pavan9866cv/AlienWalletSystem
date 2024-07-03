package com.alienwallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlienWalletSystemApplication {

	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("third commit");
		System.out.println("from github commit");
		System.out.println("fourth commit from local to github");
		SpringApplication.run(AlienWalletSystemApplication.class, args);
	}

}
