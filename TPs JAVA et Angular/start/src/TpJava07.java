
public class TpJava07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Le but de ce TP est de produire un algorithme basé sur les instructions de bases.
			L'exercice consiste à calculer n nombres premiers.
			Récupérer le chiffre passée en ligne de commande.
			Afficher la liste des n nombres premiers (n étant la valeur récupérée).
		 */
		
		/* 
		 * Tester chaque nombre et si le modulo de ce nombre ne vaut pas 0, il n'est pas premier
		 * */
		
		int n = Integer.parseInt(args[0]);
		int diviseur = 0;
		int compteur = 0;
		/*
		 * pour 4:
		 * 1 -> 1 mod 1 = 0 donc oui p
		 * 2 -> 1 mod 2 != 0 donc non / 2 mod 2 == 0 donc oui p
		 * 3 -> 1 mod 3 != 0 donc non / 2 mod 3 != 0 donc non / 3 mod 3 == 0 donc oui P
		 * 4 -> 1 mod 4 != 0 donc non / 2 mod 4 == 0 donc non P
		 * 
		 */

		
		if(n < 2)
		{
			System.out.println("Il n'existe pas de factorielle pour ce nombre!");
		}
		else
		{
			repet : for(int i=2; compteur<n; i++) // On teste les n premier nombres.
			{
				diviseur = 2;
				
				 while(diviseur < i) // On parse tous les nombres inférieurs à i pour trouver un diviseur
				{
					if((i % diviseur) == 0) 
					{

						continue repet;
					}
					
					diviseur ++;
				}
				compteur++;
				System.out.println(i);
				//System.out.println(compteur);
			}
			
		}
	}

}
