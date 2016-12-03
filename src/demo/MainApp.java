package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.HelloSpring;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo/Beans.xml");

		HelloSpring obj = (HelloSpring) context.getBean("HelloSpring");

		
		obj.setMessage(" I'm a new message");
		obj.showMessage();
		
		HelloSpring obj2 = (HelloSpring) context.getBean("HelloSpring");
		obj2.showMessage();
	}
}