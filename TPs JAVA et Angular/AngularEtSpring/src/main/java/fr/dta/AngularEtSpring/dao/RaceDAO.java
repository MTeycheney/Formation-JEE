package fr.dta.AngularEtSpring.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.AngularEtSpring.model.Pony;
import fr.dta.AngularEtSpring.model.Race;

import org.springframework.data.repository.CrudRepository;

@Repository
@Transactional
public interface RaceDAO extends CrudRepository<Race, Long>
{
	
}
