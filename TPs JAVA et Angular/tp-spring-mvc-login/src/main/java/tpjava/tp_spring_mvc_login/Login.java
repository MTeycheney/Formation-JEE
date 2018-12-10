package tpjava.tp_spring_mvc_login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tpjava.tp_spring_mvc_login.dao.ClientDao;
import tpjava.tp_spring_mvc_login.model.Client;

@Controller
public class Login {

	@Autowired
	private ClientDao dao;
	
	@ResponseBody
	@GetMapping("/login")
	public String connexion(@RequestParam(name = "user") String user,@RequestParam(name = "password") String password)
	{
		Client client = dao.getClientByPseudo(user);// Appler le DAO ici
		String resultat = "";
		if(client != null)
		{
			if(client.getMdp().equals(password))
			{
				resultat += "Connecté!";
			}
		}
		else
		{
			resultat += "Nom d'utilisateur ou mot de passe incorrect";
		}
		return resultat;
	}
}
