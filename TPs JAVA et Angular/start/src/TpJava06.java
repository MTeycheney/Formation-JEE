
public class TpJava06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * TP6
		 */
		
		int n = Integer.parseInt(args[0]);
		
		int factorielle = 1;
		
		if(n <1)
		{
			System.out.println("Il n'existe pas de factorielle pour ce nombre!");

		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				
				factorielle *= i;
				System.out.println(factorielle);
			}
		}
		
	}

}
