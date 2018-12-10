package utils;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Vol
{

	
	@Id
	@GeneratedValue
	private Long id;
	
//	@NotNull
	private Long numero;
	
//	@NotBlank
	private String typeAvion;

//	@NotNull
	private Integer nbPlaces;
	
//	@NotBlank
	private String villeDepart;
	
//	@NotBlank
	private String villeArrivee;
	
//	@NotNull
	private Date dateDepart;
	
	
	public Vol()
	{
		
	}	
	

	public Vol(Long numero, String typeAvion, Integer nbPlaces,	String villeDepart, String villeArrivee, Date dateDepart)
	{
		this.numero = numero;
		this.typeAvion = typeAvion;
		this.nbPlaces = nbPlaces;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.dateDepart = dateDepart;
	}

	
	/*
	 * GETTERS ET SETTERS 
	 */

	public Long getId()
	{
		return id;
	}


	public void setId(Long id)
	{
		this.id = id;
	}


	public Long getNumero()
	{
		return numero;
	}


	public void setNumero(Long numero)
	{
		this.numero = numero;
	}


	public Integer getNbPlaces()
	{
		return nbPlaces;
	}


	public void setNbPlaces(Integer nbPlaces)
	{
		this.nbPlaces = nbPlaces;
	}


	public String getVilleDepart()
	{
		return villeDepart;
	}


	public void setVilleDepart(String villeDepart)
	{
		this.villeDepart = villeDepart;
	}


	public String getVilleArrivee()
	{
		return villeArrivee;
	}


	public void setVilleArrivee(String villeArrivee)
	{
		this.villeArrivee = villeArrivee;
	}


	public Date getDateDepart()
	{
		return dateDepart;
	}


	public void setDateDepart(Date dateDepart)
	{
		this.dateDepart = dateDepart;
	}
	
	public String getTypeAvion()
	{
		return typeAvion;
	}

	public void setTypeAvion(String typeAvion)
	{
		this.typeAvion = typeAvion;
	}
	
	/*
	 * 
	 */
	
	
}