package tpjava.tp_spring_jdbc.DAO;

import java.util.*;

public class Book
{
	private int id;
	private String title;
	private int nbPages;
	private String author;
	private Date publicationDate;
	
	public Book()
	{
		
	}
	
	public Book(String titre, int nbpages, String auteur, Date datepub)
	{
		this.title = titre;
		this.nbPages = nbpages;
		this.author = auteur;
		this.publicationDate = datepub;
	}
	
	public String toString()
	{
		return "(" + id + ", " + title + ", " + nbPages + ", " + author + ", " + publicationDate + ")";
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public int getNbPages()
	{
		return nbPages;
	}
	
	public void setNbPages(int nbpages)
	{
		this.nbPages = nbpages;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public Date getPublicationDate()
	{
		return publicationDate;
	}
	
	public void setPublicationDate(Date publicationDate)
	{
		this.publicationDate = publicationDate;
	}
	
	
}
