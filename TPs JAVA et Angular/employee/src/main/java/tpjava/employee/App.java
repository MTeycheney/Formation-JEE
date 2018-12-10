package tpjava.employee;

import org.springframework.context.annotation.*;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan("tpjava.employee")
public class App
{
	public static void main(String[] args)
	{
		System.out.println("Start created");

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		System.out.println("Context Loaded!");
		
		AuthenticationService var = context.getBean(AuthenticationService.class);
	}
}