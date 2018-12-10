package booksell;


public class Main
{

	public static void main(String[] args)
	{
		// CONNEXION A LA BDD
		
		MyConnexion connect = new MyConnexion(); // On instancie une nouvelle connexion

		/*String reqBook = "CREATE TABLE Book (id SERIAL PRIMARY KEY, titre VARCHAR(100) NOT NULL, author VARCHAR(100) NOT NULL);";
		
		String reqClient = "CREATE TABLE Client (id SERIAL PRIMARY KEY, lastname VARCHAR(100) NOT NULL, firstname VARCHAR(100) NOT NULL, "
				+ "genre VARCHAR(10) NOT NULL, bookprefere INT, FOREIGN KEY (bookprefere) REFERENCES Book(id));";
		
		String reqAchat = "CREATE TABLE Acheter (id_client INT, id_book INT, date_achat DATE,"
				+ "PRIMARY KEY(id_client,id_book),"
				+ "FOREIGN KEY(id_client) REFERENCES Client(id),"
				+ "FOREIGN KEY(id_book) REFERENCES Book(id));";*/
		
		// connect.createClient("MERLIN", "Jonathan", "M"); // Ajoute un client avec son nom, son prénom et son genre.
		
		// connect.createBook("Les 10 petits nègres", "Agatha Christie"); // Ajoute un livre avec son titre et son auteur.
		
		// connect.listeAchatClient(1); // Affiche les livres achetés par le client 1
		
		/*connect.ExeU(connect, reqBook);
		connect.ExeU(connect, reqClient);
		connect.ExeU(connect, reqAchat);*/
		
		
		
	}

}
