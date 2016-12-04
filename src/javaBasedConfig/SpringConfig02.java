package javaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import classes.HelloSpring;

@Configuration
public class SpringConfig02 {
	@Bean
	HelloSpring getHelloSpring() {
		HelloSpring p = new HelloSpring();
		p.setMessage("Inside SpringConfig 02");
		return p;
	}
}
