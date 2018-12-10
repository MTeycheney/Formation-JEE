package fr.dta.maxime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.maxime.tpaop.DummyService;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		DummyService monBean = context.getBean(DummyService.class);

		System.out.println(monBean.getDummies());
		
		context.close();
	}
}
