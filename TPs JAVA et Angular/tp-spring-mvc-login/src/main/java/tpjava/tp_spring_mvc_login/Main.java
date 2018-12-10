package tpjava.tp_spring_mvc_login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication //Permet d'ajouter @Configuration, @EnableAutoConfiguration, @EnableWebMvc et @ComponentScan
@EntityScan
public class Main
{

	public static void main(String[] args)
	{
		/*AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		ClientDao clientDao = context.getBean(ClientDao.class);
		
		
		Client monClient = clientDao.getClientById(1);
		System.out.println(monClient.toString());*/
		
		SpringApplication.run(Main.class, args);
		//context.close();
	}

}