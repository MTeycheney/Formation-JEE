package fr.dta.spring.jv.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.spring.jv.model.Pony;

@Repository
@Transactional
public class PonyDAO extends GenericDAO<Pony>
{

	public PonyDAO()
	{
		super(Pony.class);
	}
	
	

}
