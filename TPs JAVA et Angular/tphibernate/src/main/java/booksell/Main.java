package booksell;

public class Main
{

	public static void main(String[] args)
	{
		/*Book b = new Book("");
		b.insBook();*/
		
		/*Client pers = new Client("LAGARDE","Jacqueline","F");
		pers.insClient();*/
		
		Dao x = new Dao();
		
		x.SelTable("Client");
		
		
	}

}