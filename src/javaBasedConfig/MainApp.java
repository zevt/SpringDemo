package javaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import classes.HelloSpring;

public class MainApp {

	public static void main(String[] args) {
		// ApplicationContext apxContext = new
		// ClassPathXmlApplicationContext("Path XML file");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(HelloSpringConfig.class);

		HelloSpring helloSpring = appContext.getBean(HelloSpring.class);
		helloSpring.setMessage("Freshing new Spring");
		helloSpring.showMessage();
		HelloSpring hello2 = appContext.getBean(HelloSpring.class);

		hello2.showMessage();

		System.out.println(
				" Both helloSpring Object and hello2 Object output the same message indicate that the default setting for Java Based configration is also Singleton");
		
		AnnotationConfigApplicationContext appContext2 = new AnnotationConfigApplicationContext();
		appContext2.register(HelloSpringConfig.class);
// Loading 2 configuration class which return more than one match will create unqualified class error
//		appContext2.register(SpringConfig02.class);
		appContext2.refresh();
		HelloSpring heSpring02 = appContext2.getBean(HelloSpring.class);
		heSpring02.showMessage();
		
	}

}
