package fr.dta.AngularEtSpring.service;

import java.util.ArrayList;
import java.util.List;

import fr.dta.AngularEtSpring.model.Race;

public class RaceService
{

	private List<Race> races;

	public RaceService()
	{
		this.races = new ArrayList<Race>();
	}

	public List<Race> getAllRaces()
	{
		return this.races;
	}

	public void addRace(Race r)
	{
		this.races.add(r);
	}
}
