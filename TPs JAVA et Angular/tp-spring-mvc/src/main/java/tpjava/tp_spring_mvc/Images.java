package tpjava.tp_spring_mvc;

import java.util.zip.DataFormatException;
import java.text.DateFormatSymbols;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Images
{

	    @GetMapping("/tp/images/search/{year}/{month}/{day}")
	    @ResponseBody
	    public String blaImages(@PathVariable int  year, @PathVariable int month, @PathVariable int day)
	    {
	    	String mois = new DateFormatSymbols().getMonths()[month-1];
	    	return "Liste des images du "+day+" "+mois+" "+year+".";
	    }

	
	
	
}
