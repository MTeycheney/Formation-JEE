package fr.dta.AngularEtSpring.service;

import java.util.ArrayList;
import java.util.List;

import fr.dta.AngularEtSpring.model.Pony;

public class PonyService {
	private List<Pony> ponies;

	public PonyService() { 
		this.ponies = new ArrayList<Pony>();
	}

	public List<Pony> getAllPonies()
	{
		return this.ponies;
	}

	public void addPony(Pony p)
	{
		this.ponies.add(p);
	}
}
