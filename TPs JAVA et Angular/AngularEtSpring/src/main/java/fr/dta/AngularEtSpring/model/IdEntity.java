package fr.dta.AngularEtSpring.model;

import javax.persistence.GeneratedValue;

public abstract class IdEntity {
	
	@GeneratedValue
	protected long idEntity;

	public long getIdEntity() {
		return idEntity;
	}

	public void setIdEntity(long id) {
		this.idEntity = id;
	}
}
