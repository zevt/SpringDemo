package customEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCustomEvent {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("customEvent/BeansCustomEvent.xml");
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		
		cvp.publish();
	}

}
