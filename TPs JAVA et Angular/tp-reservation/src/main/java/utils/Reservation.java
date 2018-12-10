package utils;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Reservation
{

	@Id
	@GeneratedValue
	private Long id;
	
//	@NotBlank
	private String nom;
	
//	@NotBlank
	private String prenom;
	
	private Integer age;

	/*
	 * CONSTRUCTEURS
	 */
	
	public Reservation()
	{
		
	}	
	
	public Reservation(String nom, String prenom, int age)
	{

		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}


	/*
	 * GETTER / SETTER
	 */
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getPrenom()
	{
		return prenom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	/*
	 * METHODES DIVERSES
	 */
	
	
}