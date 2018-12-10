package fr.dta.spring.jv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.dta.spring.jv.dao.id;

@Entity
@Table(name="pony")
public class Pony extends IdEntity
{
		@Id
		@GeneratedValue
		private long id;
		
		@Column
		private String nom;
		
		@Column
		private int age;
		
		@Column
		private String color;

		@Column
		private int weight;

		public Pony(String nom, int age, String color, int weight)
		{
			this.nom = nom;
			this.age = age;
			this.color = color;
			this.weight = weight;
		}
		
		public Pony()
		{
			this("",1,"",1);
		}

		// GETTERS / SETTERS ///////////////////////////////////////////////////////////////////////////////////

		public String getNom()
		{
			return nom;
		}

		public void setNom(String nom)
		{
			this.nom = nom;
		}

		public int getAge()
		{
			return age;
		}

		public void setAge(int age)
		{
			this.age = age;
		}

		public String getColor()
		{
			return color;
		}

		public void setColor(String color)
		{
			this.color = color;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public int getWeight()
		{
			return weight;
		}

		public void setWeight(int weight)
		{
			this.weight = weight;
		}

		// METHODS ///////////////////////////////////////////////////////////////////////////////
		public String toString()
		{
			return "Pony: [nom=" + nom + ", age=" + age + ", color=" + color + ", weight=" + weight + "]";
		}
		
		
		
}
