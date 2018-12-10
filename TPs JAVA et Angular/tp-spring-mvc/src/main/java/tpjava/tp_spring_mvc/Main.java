package tpjava.tp_spring_mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Permet d'ajouter @Configuration, @EnableAutoConfiguration, @EnableWebMvc et @ComponentScan
public class Main
{

	public static void main(String[] args)
	{
		
		SpringApplication.run(Main.class, args);

	}

}