package tpjava.tp_spring_jdbc.DAO;

import java.sql.*;
import java.util.*;

import org.springframework.jdbc.core.RowCallbackHandler;

public class BookCBH implements RowCallbackHandler
{
	private List<Book> livres;
	private List<String> auteurs;
	
	

	public BookCBH()
	{
		this.livres = new ArrayList<Book>();
		this.auteurs = new ArrayList<String>();
	}

	public List<Book> getLivres()
	{
		return livres;
	}

	public void setLivres(List<Book> livres)
	{
		this.livres = livres;
	}

	public List<String> getAuteurs()
	{
		return auteurs;
	}

	public void setAuteurs(List<String> auteurs)
	{
		this.auteurs = auteurs;
	}
	
	public void processRow(ResultSet rs) throws SQLException
	{
		// ===================== BOOKS ============================
		Book livreOccurrence = new Book();

		livreOccurrence.setId(rs.getInt("id_book"));
		livreOccurrence.setTitle(rs.getString("title"));
		livreOccurrence.setNbPages(rs.getInt("nb_pages"));
		livreOccurrence.setAuthor(rs.getString("author"));
		livreOccurrence.setPublicationDate(rs.getDate("publication_date"));
		
		livres.add(livreOccurrence);
		
		// ===================== AUTHORS ============================
		
		if(!(auteurs.contains(livreOccurrence.getAuthor())))
		{
			auteurs.add(livreOccurrence.getAuthor());
		}
		
	}

}
