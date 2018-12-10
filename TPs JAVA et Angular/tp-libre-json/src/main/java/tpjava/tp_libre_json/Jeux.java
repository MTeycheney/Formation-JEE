package tpjava.tp_libre_json;

import java.util.*;

import javax.persistence.*;

@Entity
public class Jeux
{

	@Id
	@GeneratedValue
	private int id;
	private String titre;
	private String console;
	private String editeur;
	private Date dateParution;
	
	public Jeux()
	{
		
	}

	public Jeux(String title, String consoleArg, String edithor, Date publishing)
	{
		titre = title;
		console = consoleArg;
		editeur = edithor;
		dateParution = publishing;
	}

	public String toString()
	{
		return "["+ this.id + ", " + this.titre + ", " + this.console + ", " + this.editeur + ", " + this.dateParution + "]";
	}
	
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getTitre()
	{
		return titre;
	}

	public void setTitre(String titre)
	{
		this.titre = titre;
	}

	public String getConsole()
	{
		return console;
	}

	public void setConsole(String console)
	{
		this.console = console;
	}

	public String getEditeur()
	{
		return editeur;
	}

	public void setEditeur(String editeur)
	{
		this.editeur = editeur;
	}

	public Date getDateParution()
	{
		return dateParution;
	}

	public void setDateParution(Date dateParution)
	{
		this.dateParution = dateParution;
	}
	
	
	
}
