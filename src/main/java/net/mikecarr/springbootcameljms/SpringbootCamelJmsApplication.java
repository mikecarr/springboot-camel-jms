package net.mikecarr.springbootcameljms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:camel-routes.xml")
public class SpringbootCamelJmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCamelJmsApplication.class, args);
	}
}
