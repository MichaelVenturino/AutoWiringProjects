package SpringBeanGroup.SpringAutoWiringBasic;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class Test {
	 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    A a = context.getBean("a",A.class);  
	    a.display;  
}
