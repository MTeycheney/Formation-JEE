package fr.dta.AngularEtSpring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pony extends IdEntity{
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String nom;
	
	@Column
	public int weight;
	
	@Column
	public int age;
	
	@Column
	private String color;
	
	public Pony()
	{
		this("nom", 0, 0, "couleur");
	}
	
	public Pony(String nom, int age, int weight, String color)
	{
		this.nom = (nom == null) ? "nom" : nom;
        this.age = age;
        this.weight = weight;
        this.color = (color == null) ? "couleur" :  color;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pony [id=" + id + ", nom=" + nom + ", weight=" + weight + ", age=" + age + ", color=" + color + "]";
	}	
	
	
	
}
