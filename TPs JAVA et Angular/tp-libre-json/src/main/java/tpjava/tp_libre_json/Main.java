package tpjava.tp_libre_json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

@ComponentScan("tpjava.tp_libre_json")
public class Main {

	public static void main(String[] args) throws ParseException
	{
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		Dao mondao = context.getBean(Dao.class);
		
		
		/*SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
		Date date = dateFormatter.parse("2007/07/26");
		Jeux monJeu = new Jeux("The World Ends With You", "Nintendo DS", "Square Enix", date);
		mondao.insertJeux(monJeu);*/ //FONCTIONNE
		
		//mondao.supprLigne(7); // FONCTIONNE

		mondao.afficheJeux();
		
		context.close();

	}

}
