package tpjava.tp_spring_jdbc.DAO;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DAO
{	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource ds)
	{
		this.jdbcTemplate = new JdbcTemplate(ds);
	}
	
	private static final class BookMapper implements RowMapper<Book>
	{
		public Book mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			Book b = new Book();
			b.setId(rs.getInt("id_book"));
			b.setTitle(rs.getString("title"));
			b.setNbPages(rs.getInt("nb_pages"));
			b.setAuthor(rs.getString("author"));
			b.setPublicationDate(rs.getDate("publication_date"));
			return b;
		}
	}
	
	public void afficherRowBook()
	{
		List<Book> actors = this.jdbcTemplate.query( "select * from book", new BookMapper());
		
		for(Book b: actors)
		{
			System.out.println(b);
		}
	}
	
	public void afficherRowAuthor()
	{
		BookCBH monCBH = new BookCBH();
		jdbcTemplate.query("select * FROM book", monCBH);
		System.out.println(monCBH.getAuteurs());
	}
	
	public void compteLignes()
	{
		int nblignes = this.jdbcTemplate.queryForObject("select count(*) from book", Integer.class);
		System.out.println(nblignes);
	}
	
	public void afficheAuteursEtLivres()
	{
		
	}
	
	
	public Map<String, List<Book>> getBooksByAuthors()
	{
		return jdbcTemplate.execute("SELECT * FROM book", new BookListPS());
	}
	
	public void insertLigne(Book monBook)
	{
		this.jdbcTemplate.update("INSERT INTO book(title, nb_pages, author, publication_date) VALUES (?, ?, ?, ?)", monBook.getTitle(), monBook.getNbPages(), monBook.getAuthor(), monBook.getPublicationDate());
	}
	
	public void modifLigne(String monTitre, int id)
	{
		this.jdbcTemplate.update("UPDATE book SET title=? WHERE id_book=?", monTitre, id);
	}
	
	public void supprLigne(Book monBook)
	{
		this.jdbcTemplate.update("DELETE FROM book WHERE id_book=?", monBook.getId());
	}
	
	
	
}
