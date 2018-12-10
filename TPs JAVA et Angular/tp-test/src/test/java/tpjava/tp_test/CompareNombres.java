package tpjava.tp_test;

import java.util.*;

public class CompareNombres
{
	public CompareNombres()
	{
		// TODO Auto-generated constructor stub
	}
	
	public static boolean estPlusGrandQue(int nb1, int nb2)
	{
		return (nb1 > nb2);
	}
	
	public static boolean userPlusGrandQue()
	{
		System.out.println("Veuillez entrer un premier nombre:");
		int nb1 = Integer.parseInt(saisieClavier());
		
		System.out.println("Veuillez entrer un deuxième nombre:");
		int nb2 = Integer.parseInt(saisieClavier());

		
		return estPlusGrandQue(nb1, nb2);
	}
	
	private static Integer saisieClavierInteger()
	{
		Scanner sc = new Scanner(System.in);
		if(Integer.parseInt(sc.nextLine() instanceof int)
		{
			return Integer.
		}
	}
}
