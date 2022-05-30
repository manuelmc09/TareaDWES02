package com.manuelmc09.TareaDWES02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TareaDwes02Application {

	public static void main(String[] args) {
		SpringApplication.run(TareaDwes02Application.class, args);
	}

}
