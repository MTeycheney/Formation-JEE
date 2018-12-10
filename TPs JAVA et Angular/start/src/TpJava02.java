public class TpJava02
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ===============================================
		 * 1
		 * =============================================== */
		
		int monEntier = 1234;
		float monFloat = 1234;
		
		System.out.println(monEntier); // Affiche 1234
		System.out.println(monFloat); // Affiche 1234.0
		
		
		/* ===============================================
		 * 2
		 * =============================================== */
		monEntier = 123456798;
		monFloat = 123456789;
		
		System.out.println(monEntier); // Affiche 123456789
		System.out.println(monFloat); // Affiche 1.23456792E8
		
		/* ===============================================
		 * 3
		 * =============================================== */
		
		float x = 15;
		float z = 0;
		float y = -123;
		float a = x / z;
		float b = y / z;
		float c = a / b;
		
		System.out.println(x); // Affiche 15.0
		System.out.println(z); // Affiche 0.0
		System.out.println(y); // Affiche -123.0
		System.out.println(a); // Affiche Infinity
		System.out.println(b); // Affiche - Infinity
		System.out.println(c); // Affiche NaN (Not a Number)
	}

}
