package beanPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.HelloSpring;


public class BeanPostProcessorDemo {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanPostProcessor/BeanPostProcessor.xml");

	      HelloSpring obj = (HelloSpring) context.getBean("HelloSpring");
	      obj.showMessage();
	      context.registerShutdownHook();
		
	}
}

