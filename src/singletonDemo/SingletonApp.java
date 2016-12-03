package singletonDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.HelloSpring;

public class SingletonApp {

	public static void main(String[] args) {
		ApplicationContext appContext =new ClassPathXmlApplicationContext("singletonDemo/SingletonBeans.xml");
		HelloSpring objA = (HelloSpring) appContext.getBean("HelloSpring");
		objA.setMessage("This is Object A");
		objA.showMessage();
		HelloSpring objB = (HelloSpring) appContext.getBean("HelloSpring");
		objB.showMessage();
		
		objA.setMessage("Object A changes its message");
		objB.showMessage();
		
	}
}
