package classes;

import org.springframework.beans.factory.InitializingBean;

public class HelloSpring implements InitializingBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void showMessage() {
		System.out.println(message);
	}

	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialize Bean by afterPropertiesSet Method");
	}
}
