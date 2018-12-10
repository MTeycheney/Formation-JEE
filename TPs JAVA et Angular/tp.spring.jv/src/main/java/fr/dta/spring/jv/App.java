package fr.dta.spring.jv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.jv.controller.PonyController;

@Configuration
@ComponentScan("fr.dta.spring.jv")
public class App
{
	public static void main(String[] args) throws ParseException
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		
		PonyController myController = new PonyController();
		myController.afficherAllPoneys();
		


		/*
		 * 
		 * ("\n---------------GET Personnage id=1 ---------------");
		 * personnageDAO.findById(1));
		 * 
		 * 
		 * System.out.println("\n---------------GET Personnage updated ---------------"
		 * ); michelle.setClasse("voleuse"); personnageDAO.update(michelle);
		 * System.out.println(personnageDAO.findById(1));
		 */

		System.out.println("\n---------------GET Personnage deleted ---------------");
		//pDAO.delete(michelle);
		//persos = personnageDAO.findAll();
		/**/
		System.out.println("Execution terminée");
		context.close();
	}
}
