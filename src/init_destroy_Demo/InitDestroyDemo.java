package init_destroy_Demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.HelloSpring;

public class InitDestroyDemo {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("init_destroy_Demo/Beans.xml");
		HelloSpring obj = (HelloSpring) appContext.getBean("HelloSpring");
		obj.showMessage();
		appContext.registerShutdownHook();
	}
}
