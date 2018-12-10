package tpjava.tp_spring_jdbc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import tpjava.tp_spring_jdbc.DAO.DAO;
import tpjava.tp_spring_jdbc.DAO.Book;
import tpjava.tp_spring_jdbc.DAO.BookCBH;

@Configuration
@ComponentScan
public class Main
{

	public static void main(String[] args) throws ParseException
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

		DAO mondao = context.getBean(DAO.class);
		
		
		//mondao.compteLignes();
		
		/*
		 * 
		 * 	SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
			Date date = dateFormatter.parse("2018/05/03");
		
		
		
		
		
			Book livreTest = new Book();
			livreTest.setId(5);
		*/
		
		//mondao.insertLigne(livreTest);
		//mondao.modifLigne(Titre, id);
		//mondao.supprLigne(livreTest);
		
		mondao.afficherRowBook();
		
		mondao.afficherRowAuthor();
		
		System.out.println(mondao.getBooksByAuthors());
		
		context.close();
	}

}
