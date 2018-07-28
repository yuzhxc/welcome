package com.welcome.springmvcannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@ComponentScan("noscan")*/
public class SpringmvcAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcAnnotationApplication.class, args);
	}
}
