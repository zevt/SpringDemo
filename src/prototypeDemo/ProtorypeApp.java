package prototypeDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.HelloSpring;

public class ProtorypeApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("prototypeDemo/Beans.xml");
		HelloSpring objA = (HelloSpring) applicationContext.getBean("HelloSpring");
		objA.setMessage("This is Object A");
		objA.showMessage();
		
		HelloSpring objB = (HelloSpring) applicationContext.getBean("HelloSpring");
		objB.showMessage();
		
		objA.setMessage("Object A changes its message");
		
		objB.showMessage();
	}

}
