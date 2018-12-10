
public class TpJava05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * TP5
		 */
		
		int chiffre = Integer.parseInt(args[0]);
		/*
		 * Le but de ce TP est d’utiliser les instructions : do ... while ou while ....
			L'exercice consiste à afficher la liste des n premiers nombres.
			Récupérer le chiffre passée en ligne de commande.
			Afficher les chiffres de 0 à ce chiffre.
		 */
		int compteur = 0;
		while(chiffre >= compteur)
		{
			System.out.println(compteur);
			compteur++;
		}

	}

}
