
public class TpJava04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4
		 */
		double montant = Double.parseDouble(args[0]);
		
		
		if(montant < 1000)
		{
			System.out.println("Vous n'avez pas de remise."); // 0% remise
		}
		else if (montant < 2000)
		{
			System.out.println("Votre remise s'élève à 1%, soit: "+ montant*0.01+" euros."); // 1% remise
		}
		else if (montant < 5000)
		{
			System.out.println("Votre remise s'élève à 3%, soit: "+ montant*0.03+" euros."); // 1% remise
		}
		else if (montant >= 5000)
		{
			System.out.println("Votre remise s'élève à 5%, soit: "+ montant*0.05+" euros."); // 1% remise
		}
		else
		{
			System.out.println("Montant incorrect!");

		}
		
	}

}
