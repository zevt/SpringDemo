package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloSpring obj = (HelloSpring) context.getBean("helloWorldx");

		
		obj.setMessage(" I'm a new message");
		obj.getMessage();
		
		HelloSpring obj2 = (HelloSpring) context.getBean("helloWorldx");
		obj2.getMessage();
	}
}