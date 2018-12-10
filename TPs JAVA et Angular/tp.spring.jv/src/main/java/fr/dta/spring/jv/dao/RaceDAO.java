package fr.dta.spring.jv.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.spring.jv.model.Race;

@Repository
@Transactional
public class RaceDAO extends GenericDAO<Race>
{

	public RaceDAO()
	{
		super(Race.class);
	}

}
