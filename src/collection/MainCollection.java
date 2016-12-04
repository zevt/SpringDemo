package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollection {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collection/CollectionBeans.xml");

		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();
		System.out.println(" --------------------------------------------------");
		
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("collection/BeansReference.xml");
		JavaCollection jc2 = (JavaCollection)ctx2.getBean("referenceBeanCollection");
		
		jc2.getAddressList();
		jc2.getAddressSet();
		jc2.getAddressMap();
		jc2.getAddressProp();
	}
}
