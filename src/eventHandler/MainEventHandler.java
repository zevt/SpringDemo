package eventHandler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.HelloSpring;

public class MainEventHandler {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(ApplicationConfig.class);
		appContext.refresh();
		HelloSpring spring = appContext.getBean(HelloSpring.class);
		
		appContext.start();
		spring.showMessage();
//		appContext.registerShutdownHook();
		appContext.stop();
		System.out.println("-------------------------New Section -----------------------");
		System.out.println();
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("eventHandler/BeansEvent.xml");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("eventHandler/BeansEvent.xml");
		HelloSpring spring2 = (HelloSpring) ctx.getBean("helloSpring");
		ctx.start();
		spring2.showMessage();
		ctx.stop();
	}
}
