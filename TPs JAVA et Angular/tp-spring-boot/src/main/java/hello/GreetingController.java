package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController
{

    @GetMapping("/greeting") // Permet de s'assurrer que les requêtes HTTP GET vers /greeting soient mappées avec la méthode greeting()
    
    
    // Si name n'est pas renseigné en paramètre GET, la valeur par défaut déclarée est alors utilisée.
    // De plus, la valeur de name est ajouté à l'Objet "Model", le rendant accessible dans la "Vue"
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model)
    {
        model.addAttribute("name", name);
        return "greeting";
    }

}