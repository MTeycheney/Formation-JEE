package utils;

import java.text.*;
import java.util.*;

public class Main
{

	public static void main(String[] args) throws ParseException
	{

		System.out.println("1) Gestion des vols");
		System.out.println("2) Gestion des réservations");
		System.out.println("3) Quitter");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez choisir une option :");
		int choice = Integer.parseInt(sc.nextLine());
		System.out.println(choice);
		
		Dao monDao = new Dao();
		
		
		
		
		
		if(choice == 1)
		{
			System.out.println("1) Création d'un vol");
			System.out.println("2) Visualisation des vols");
			int choiceCreatVol = Integer.parseInt(sc.nextLine());
			System.out.println(choiceCreatVol);

			if(choiceCreatVol == 1)
			{
				System.out.println("Veuillez rensigner les informations suivantes:");
				
				System.out.println("Le numéro du vol");
				String recupVol = sc.nextLine();
				Long numVol = Long.parseLong(recupVol);

				
				System.out.println("Le type d'avion");
				String typeAvion = sc.nextLine();
				
				
				System.out.println("Le nombre de places");
				String recupPlaces = sc.nextLine();
				Integer nbPlaces = Integer.parseInt(recupPlaces);
				
				System.out.println("La ville de départ");
				String villeDepart = sc.nextLine();
				
				System.out.println("La ville d'arrivée");
				String villeArrivee = sc.nextLine();
				
				System.out.println("la date du départ");
				String recupDate = sc.nextLine();
				SimpleDateFormat monFormat = new SimpleDateFormat("dd/MM/yy");
				Date dateDepart = monFormat.parse(recupDate);

				System.out.println("Merci, enregistrement en cours...");
				
				Vol monVol = new Vol(numVol, typeAvion, nbPlaces, villeDepart, villeArrivee, dateDepart);
				
				monDao.insVol(monVol);
				
			}
			else if(choiceCreatVol == 2)
			{
				System.out.println("Voici la liste de tous les vols actuellement enregistrés:");
				monDao.SelTable("Vol");
			}
			else
			{
				System.out.println("Entrée incorrecte!");
			}
			
		}
		else if(choice == 2)
		{
			System.out.println("WIP");
		}
		else if (choice == 3)
		{
			System.out.println("Au revoir...");
		}
		else
		{
			System.out.println("Entrée incorrecte!");
		}
		
	}

}
