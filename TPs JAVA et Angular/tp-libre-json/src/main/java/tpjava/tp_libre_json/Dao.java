package tpjava.tp_libre_json;

import java.sql.*;

import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



@Repository
public class Dao
{	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource ds)
	{
		this.jdbcTemplate = new JdbcTemplate(ds);
	}
	
	private static final class BookMapper implements RowMapper<Jeux>
	{
		public Jeux mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			Jeux j = new Jeux();
			j.setId(rs.getInt("id"));
			j.setTitre(rs.getString("titre"));
			j.setConsole(rs.getString("console"));
			j.setEditeur(rs.getString("editeur"));
			j.setDateParution(rs.getDate("date_parution"));
			return j;
		}
	}
	
	// PARTIE JDBC
	public void afficheJeux()
	{
		List<Jeux> lesJeux = this.jdbcTemplate.query( "select * from jeux", new BookMapper());
		
		for(Jeux j: lesJeux)
		{
			System.out.println(j);
		}
	}
	
	public void insertJeux(Jeux monJeu)
	{
		this.jdbcTemplate.update("INSERT INTO jeux(titre, console, editeur, date_parution) VALUES (?, ?, ?, ?)", monJeu.getTitre(), monJeu.getConsole(), monJeu.getEditeur(), monJeu.getDateParution());
	}
	
	/*public void modifLigne(String monTitre, int id)
	{
		this.jdbcTemplate.update("UPDATE jeux SET title=? WHERE id_book=?", monTitre, id);
	}*/
	
	public void supprLigne(int idJeu)
	{
		this.jdbcTemplate.update("DELETE FROM jeux WHERE id=?", idJeu);
	}
	
	
	
}