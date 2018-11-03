package spring.beans.refs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author home
 *
 */
public class DemoWithSpring {
	
	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("applicationConfig.xml");
		BeanFactory fact = new XmlBeanFactory(res);
		
		Student s1 = (Student)fact.getBean("std");
		
		Address a1 = (Address)fact.getBean("addr");
		
		Account account=(Account)fact.getBean("accnt");
		
		System.out.println(s1);
		System.out.println(a1);
		System.out.println(account);
		
	}

}
