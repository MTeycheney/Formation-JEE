package booksell;

import java.util.*;

import javax.persistence.*;

@Entity
public class Book
{
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	private String author;
	
	
	@ManyToMany(mappedBy = "books")
	private List<Client> clients;
	
	public Book()
	{
		
	}

	public Book(String titre, String auteur)
	{
		this.title = titre;
		this.author = auteur;
	}
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}
	
	
	public void setTitle(String arg_titre)
	{
		this.title = arg_titre;
	}
	
	public void setAuthor(String arg_auteur)
	{
		this.author = arg_auteur;
	}

	
	
	public void insBook()
	{
		EntityManager em = DatabaseHelper.createEntityManager();
		
		DatabaseHelper.beginTx(em);
		
		
		em.persist(this);
		
		DatabaseHelper.commitTxAndClose(em);
	}
	/*
	 * public void listeAchatClient(int client)
		{
			String reqnewbook = "SELECT * FROM acheter WHERE id_client = "+client+";"; // On récupère les arguments qui serviront de valeurs
			this.ExeQue(reqnewbook); // On appelle la méthode exeUpd et on lui donne la requête complétée en argument.
		}
	 * 
	 */
}
