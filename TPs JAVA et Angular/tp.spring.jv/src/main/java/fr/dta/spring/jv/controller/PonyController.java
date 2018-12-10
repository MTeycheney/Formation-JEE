package fr.dta.spring.jv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dta.spring.jv.dao.PonyDAO;
import fr.dta.spring.jv.model.Pony;

@RestController
public class PonyController
{
	@Autowired
	PonyDAO pDAO;
	
	@GetMapping("/pony")
	public List<Pony> afficherPony()
	{
		List<Pony> poneys = new ArrayList<Pony>();
		
		return poneys;
	}
	
	//@GetMapping("/pony/selectAll")
	public void afficherAllPoneys()
	{
		
		System.out.println("\n-------------- GET all Poneys---------------");
		List<Pony> poneys = pDAO.findAll();

		for (Pony p : poneys)
		{
			System.out.println(p);
		}
	}
}
