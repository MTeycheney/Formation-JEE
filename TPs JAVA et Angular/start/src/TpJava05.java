
public class TpJava05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * TP5
		 */
		
		int chiffre = Integer.parseInt(args[0]);
		/*
		 * Le but de ce TP est d�utiliser les instructions : do ... while ou while ....
			L'exercice consiste � afficher la liste des n premiers nombres.
			R�cup�rer le chiffre pass�e en ligne de commande.
			Afficher les chiffres de 0 � ce chiffre.
		 */
		int compteur = 0;
		while(chiffre >= compteur)
		{
			System.out.println(compteur);
			compteur++;
		}

	}

}
