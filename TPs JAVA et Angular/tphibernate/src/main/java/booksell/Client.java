package booksell;

import java.util.*;

import javax.persistence.*;

@Entity
public class Client
{
	@Id
	@GeneratedValue
	private Long id;
	
	private String lastname;
	private String firstname;
	private String gender;
	private int book_prefere;
	
	@ManyToMany
	private List<Book> books;
	
	public Client()
	{
		
	}
	
	public Client(String nom, String prenom, String genre)
	{
		this.lastname = nom;
		this.firstname = prenom;
		this.gender = genre;
	}
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public int getBook_prefere()
	{
		return book_prefere;
	}

	public void setBook_prefere(int book_prefere)
	{
		this.book_prefere = book_prefere;
	}

	public String getGender()
	{
		return gender;
	}
	
	public void setLastName(String arg_lastname)
	{
		this.lastname = arg_lastname;
	}
	
	public void setFirstName(String arg_firstname)
	{
		this.firstname = arg_firstname;
	}
	
	public void setGender(String arg_gender)
	{
		this.gender = arg_gender;
	}
	
	public void insClient()
	{
		EntityManager em = DatabaseHelper.createEntityManager();
		
		DatabaseHelper.beginTx(em);
		
		em.persist(this);
		
		DatabaseHelper.commitTxAndClose(em);
	}
	
}
