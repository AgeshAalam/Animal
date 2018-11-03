package voice.animal;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Cat c = (Cat)factory.getBean("cat");
		c.sound();
		
		Dog d=(Dog)factory.getBean("dog");
		d.sound();
		Cow cw=(Cow)factory.getBean("cow");
		cw.sound();
	}

}
