package booksell;

import java.sql.*;

public class MyConnexion
{
	
	public Connection conn;
	public static String url = "jdbc:postgresql://localhost:5432/tp_jdbc";

	public MyConnexion()
	{
		this.JeMeConnecte();
	}
	
	public void JeMeConnecte()
	{
		try
		{
			conn = DriverManager.getConnection(url,"jdbc_user" ,"route"); // On fournit l'url de la BDD en 1er param, l'utilisateur en 2ème et le mdp en 3ème.
			if(conn != null) // permet de vérifier si la connexion a été bien validée.
			{
			  		System.out.println("Connexion réussie!");
			}
		}
		catch(Exception bddexc)
		{
			System.out.println("Erreur: "+bddexc.getMessage()); // En cas d'échec de connexion, on affiche un message d'erreur.
		}
		
	}
	
	public void ExeUpd(String requete)
	{
		try
		{
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate(requete);
			
			System.out.println("La requête a bien été effectuée!");
			
			stmt.close(); // On ferme le Statement
		}
		catch
		(SQLException errexecu)
		{
			System.out.println("Erreur sur l'exécution de 1 ou plusieurs requêtes depuis MyConnexion.ExeUpd : "+errexecu.getMessage());
		}
		
	}
	
	public void ExeQue(String requete)
	{
		try
		{
			Statement stmt = conn.createStatement();
			
			ResultSet res = stmt.executeQuery(requete);
			
			while (res.next())
			{
				long idc = res.getLong("id_client");				
				long idb = res.getLong("id_book");				
				Date da = res.getDate("date_achat");
				System.out.println(idc+" "+idb+" "+da);
			}
			
			System.out.println("La requête a bien été effectuée!");
			
			stmt.close(); // On ferme le Statement
		}
		catch
		(SQLException errexecu)
		{
			System.out.println("Erreur sur l'exécution de 1 ou plusieurs requêtes depuis MyConnexion.ExeUpd : "+errexecu.getMessage());
		}
		
	}
	
	// ==============================================================================================================
	// == CREATE ====================================================================================================
	// ==============================================================================================================
	
	public void createClient(String nom, String prenom, String genre)
	{
		String reqnewclient = "INSERT INTO Client (lastname, firstname, genre) VALUES ('"+ nom +"','"+ prenom +"','"+ genre +"');"; // On récupère les arguments qui serviront de valeurs
		this.ExeUpd(reqnewclient); // On appelle la méthode exeUpd et on lui donne la requête complétée en argument.
	}
	
	public void createBook(String titre, String author)
	{
		String reqnewbook = "INSERT INTO Book (titre, author) VALUES ('"+ titre +"','" + author +"');"; // On récupère les arguments qui serviront de valeurs
		this.ExeUpd(reqnewbook); // On appelle la méthode exeUpd et on lui donne la requête complétée en argument.
	}
	
	// ==============================================================================================================
	// == SELECT ====================================================================================================
	// ==============================================================================================================
	
	public void listeAchatClient(int client)
	{
		String reqnewbook = "SELECT * FROM acheter WHERE id_client = "+client+";"; // On récupère les arguments qui serviront de valeurs
		this.ExeQue(reqnewbook); // On appelle la méthode exeUpd et on lui donne la requête complétée en argument.
	}
	
	/* TODO
	 * 	SELECT *
		FROM acheter
		WHERE id_book = 1; */
	
	
	
	protected void finalize() throws Throwable
	{
		super.finalize(); // fait appel à la méthode finalize de OBJECT
		
		if(conn != null) // S'il existe une connexion,
		{
			conn.close(); // on la supprime.
		}
			
	}
	
}