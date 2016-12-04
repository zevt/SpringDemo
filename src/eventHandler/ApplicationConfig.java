package eventHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import classes.HelloSpring;

@Configuration
public class ApplicationConfig {
	@Bean
	public HelloSpring createHelloSpring() {
		HelloSpring p = new HelloSpring();
		p.setMessage("New born Spring inside ApplicationConfig inside evenHandler");
		return p;
	}
	@Bean 
	public CStartEventHandler createStartEvenHandler() {
		return new CStartEventHandler();
	}
	@Bean
	public CStopEventHandler createStopEventHandler() {
		return new CStopEventHandler();
	}
	

}
