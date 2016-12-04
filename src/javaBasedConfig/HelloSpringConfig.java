package javaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import classes.HelloSpring;

@Configuration
public class HelloSpringConfig {
	// Only one method return HelloSpring Bean. 
	@Bean
	public HelloSpring helloSpring() {
		return new HelloSpring();
	}
	
//	
//	@Bean
//	public HelloSpring helloSpring_() {
//		HelloSpring p = new HelloSpring();
//		p.setMessage("Inside HelloSpringConfig");
//		return p;
//	}
}
