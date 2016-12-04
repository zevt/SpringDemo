package customEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void publish() {

		CustomEvent event = new CustomEvent(this);
		// Below code also works
//		CustomEvent ce = new CustomEvent(new Integer(1));
		System.out.println(" ApplicationEventPublisher publisher.publishEvent() function inside CustomEventPublisher executed, lead to the execution of ");
		publisher.publishEvent(event);
	}
}