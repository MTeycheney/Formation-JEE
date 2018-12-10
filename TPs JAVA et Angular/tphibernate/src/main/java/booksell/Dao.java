package booksell;

import java.sql.*;
import java.util.*;

import javax.persistence.*;

import booksell.DatabaseHelper;

public class Dao
{
	public Dao()
	{
		
	}
	
	public void SelTable(String table)
	{
		String nomtable = table;
		
		EntityManager em = DatabaseHelper.createEntityManager();
		
		DatabaseHelper.beginTx(em);
		
		if(nomtable == "Book")
		{
			TypedQuery<Book> query = em.createQuery("from Book", Book.class);
			List<Book> livres = query.getResultList();
			
			for(int i = 0; i < livres.size(); i++)
			{
	            System.out.println(livres.get(i).getTitle()+", écrit par "+livres.get(i).getAuthor()); 
	        }
			
			DatabaseHelper.commitTxAndClose(em);
		}
		else if(nomtable == "Client")
		{
			TypedQuery<Client> query = em.createQuery("from Client", Client.class);
			List<Client> pers = query.getResultList();
			
			for(int i = 0; i < pers.size(); i++)
			{
	            System.out.println(pers.get(i).getLastname()+" "+pers.get(i).getFirstname()+" "+pers.get(i).getGender());
	        }
			
			DatabaseHelper.commitTxAndClose(em);
		}
		else
		{
			System.out.println("Erreur: vous n'avez pas sélectionné la bonne table!");
		}
			
	}
	
	public void SelAchat()
	{
		
		
		EntityManager em = DatabaseHelper.createEntityManager();
		
		DatabaseHelper.beginTx(em);
		
		TypedQuery<Client> query = em.createQuery("SELECT c"+"FROM Client c"+"INNER JOIN c.book"+"WHERE c.id=:id ", Client.class);
		query.setParameter("id", 1L);
		List<Client> pers = query.getResultList();
		
		
		for(int i = 0; i < pers.size(); i++)
		{
            System.out.println(pers.get(i).getLastname()+" "+pers.get(i).getFirstname()+" "+pers.get(i).getGender());
        }
		
		DatabaseHelper.commitTxAndClose(em);
			
	}
}
