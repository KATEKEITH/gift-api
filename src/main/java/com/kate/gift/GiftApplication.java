package com.kate.gift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/secret.properties")
public class GiftApplication {
	public static void main(String[] args) {
		SpringApplication.run(GiftApplication.class, args);
	}

}
