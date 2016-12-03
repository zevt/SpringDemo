package beanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.HelloOcean;
import classes.HelloWorld;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beanInheritance/BeansInheritance.xml");

	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

	      objA.showMessage1();
	      objA.showMessage2();

	      HelloOcean objB = (HelloOcean) context.getBean("helloOcean");
	      objB.showMessage1();
	      objB.showMessage2();
	      objB.showMessage3();
	      
	}
}
