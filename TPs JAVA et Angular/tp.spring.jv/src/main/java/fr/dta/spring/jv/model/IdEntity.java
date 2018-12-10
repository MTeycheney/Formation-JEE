package fr.dta.spring.jv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class IdEntity
{
	@GeneratedValue
	protected long idEndity;

	public long getIdEndity()
	{
		return idEndity;
	}

	public void setIdEndity(long id) {
		this.idEndity = id;
	}
}
