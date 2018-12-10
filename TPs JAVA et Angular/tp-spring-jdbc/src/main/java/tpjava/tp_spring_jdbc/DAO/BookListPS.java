package tpjava.tp_spring_jdbc.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.PreparedStatementCallback;

public class BookListPS implements PreparedStatementCallback<Map<String, List<Book>>>
{
	public Map<String, List<Book>> doInPreparedStatement(PreparedStatement ps) throws SQLException
	{
		Map<String, List<Book>> maMap = new HashMap<String, List<Book>>();
		
		ResultSet monRes = ps.executeQuery(); // On exécute la requête  et stocke son résultat dans le ResultSet monRe
		
		
		
		while(monRes.next()) // Pour chaque lignes du résultat, on crée un objet Book dont les attributs sont paramètrés.
		{
			Book livreOccurrence = new Book();
			List<Book> books = new ArrayList<Book>();
			
			livreOccurrence.setId(monRes.getInt("id_book"));
			livreOccurrence.setTitle(monRes.getString("title"));
			livreOccurrence.setNbPages(monRes.getInt("nb_pages"));
			livreOccurrence.setAuthor(monRes.getString("author"));
			livreOccurrence.setPublicationDate(monRes.getDate("publication_date"));
			
			if(maMap.containsKey(livreOccurrence.getAuthor())) // Si le livre existe déjà:
			{
				maMap.get(livreOccurrence.getAuthor()).add(livreOccurrence); // On ajoute ce livre à la clé "auteur"
			}
			else // Sinon
			{
				books.add(livreOccurrence); // On rajoute un livre dans la liste de livres
				maMap.put(livreOccurrence.getAuthor(), books); // On rajoute dans la map, une nouvelle clé "auteur" et une nouvelle liste de books lui correspondant
			}
		}
		return maMap;

	}
}
