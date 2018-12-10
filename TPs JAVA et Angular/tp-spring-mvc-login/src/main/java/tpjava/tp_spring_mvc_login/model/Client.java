package tpjava.tp_spring_mvc_login.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String pseudo;
	private String mdp;
	
	// CONSTRUCTOR
	
	public Client()
	{
		
	}
	
	@Override
	public String toString()
	{
		return "Client [id=" + id + ", pseudo=" + pseudo + ", mdp=" + mdp + "]";
	}
	
	// GETTERS SETTERS

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getPseudo()
	{
		return pseudo;
	}
	
	public void setPseudo(String pseudo)
	{
		this.pseudo = pseudo;
	}
	
	public String getMdp()
	{
		return mdp;
	}
	
	public void setMdp(String mdp)
	{
		this.mdp = mdp;
	}
	
	
}
