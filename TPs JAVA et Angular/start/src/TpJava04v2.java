
public class TpJava04v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte taille = Byte.parseByte(args[0]);	
		
		/*
		 * TP 4.2.2
		 */
		if(taille < 1)
		{
			System.out.println("Taille invalide.");
		}
		else
		{
			/*
			 * TP 4.2.1
			 */
			switch(taille)
			{
				case 1:
					System.out.println("petit");
					break;
				case 2:
					System.out.println("moyen");
					break;
				default:
					System.out.println("grand");
					break;
			}
		}
		
	}

}
