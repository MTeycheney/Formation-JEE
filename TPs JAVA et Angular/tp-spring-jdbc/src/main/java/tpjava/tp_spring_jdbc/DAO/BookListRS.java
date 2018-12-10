package tpjava.tp_spring_jdbc.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class BookListRS implements ResultSetExtractor<Book>
{

	public Book extractData(ResultSet rs) throws SQLException, DataAccessException
	{
		
		
		return null;
	}

}
