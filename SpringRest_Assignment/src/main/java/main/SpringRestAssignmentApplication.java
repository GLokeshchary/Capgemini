package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"main"})
public class SpringRestAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAssignmentApplication.class, args);
	}

}
