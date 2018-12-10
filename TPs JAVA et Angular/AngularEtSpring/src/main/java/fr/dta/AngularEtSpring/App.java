package fr.dta.AngularEtSpring;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import fr.dta.AngularEtSpring.dao.PonyDAO;
import fr.dta.AngularEtSpring.dao.RaceDAO;
import fr.dta.AngularEtSpring.model.Pony;
import fr.dta.AngularEtSpring.model.Race;

/**
 * Hello world!
 */
@SpringBootApplication(scanBasePackages = { "fr.dta" }) 
@EntityScan(basePackages="fr.dta") 
@EnableJpaRepositories(basePackages="fr.dta") 
@EnableJpaAuditing
public class App
{
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    	//AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
    	/*PonyDAO ponydao = context.getBean(PonyDAO.class);
        RaceDAO racedao = context.getBean(RaceDAO.class);
        
    	Pony p = new Pony("test", 21, 65, "couleur");
    	Race r = new Race("montpellier", new Date("01/11/1994"));
    	
		ponydao.insert(p);
		p.setColor("rouge");
		ponydao.update(p);
		racedao.insert(r);*/
	    System.out.println( "Hello World!" );
   	
        //context.close();
    }
}
