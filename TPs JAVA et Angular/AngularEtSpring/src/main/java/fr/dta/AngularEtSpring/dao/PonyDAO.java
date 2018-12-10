package fr.dta.AngularEtSpring.dao;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.AngularEtSpring.model.Pony;

@Repository
@Transactional
public interface PonyDAO extends CrudRepository<Pony, Long>
{
	
}