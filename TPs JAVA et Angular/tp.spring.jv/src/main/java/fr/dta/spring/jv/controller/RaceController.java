package fr.dta.spring.jv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dta.spring.jv.model.Race;

@RestController
public class RaceController
{
	
	@GetMapping("/race")
	public List<Race> afficherRace()
	{
		List<Race> races = new ArrayList<Race>();
		
		return races;
	}
	
}
