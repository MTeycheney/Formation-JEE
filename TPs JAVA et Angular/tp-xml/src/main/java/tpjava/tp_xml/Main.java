package tpjava.tp_xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("./xmlFile/applicationContext.xml");
		System.out.println("Context Loaded!");
		
		MyObject A = (MyObject)context.getBean("myobjA");
		System.out.println("Object: "+A);
		
		
		
		MyObject B = (MyObject)context.getBean("myobjB");
		System.out.println("Object: "+B.getId());
		System.out.println("Object: "+B.getParent().getId());
		
		System.out.println("Object: "+A.getName()+"  "+A.getKeywords());
	}

}
