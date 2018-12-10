package tpjava.tp_java50;

import java.util.*;

public class MyUtils
{
	
	public MyUtils()
	{
		// TODO Auto-generated constructor stub
	}
	
	public static int sum(List<Integer> maListe)
	{
		int somme = 0;
		
		for (Integer var : maListe)
		{
			somme += var;
		}
		
		return somme;
	}
	
	public static String emptyToNull(String maChaine)
	{
		if(maChaine.isEmpty())
		{
			return null;
		}
		else
		{
			return maChaine;
		}
	}
	
	public static List<Integer> filterEvenNumbers(List<Integer> listeArg)
	{
		List<Integer> maListe= new ArrayList<Integer>();
		
		for (Integer i : listeArg)
		{
			if(i%2 == 0 )
			{
				maListe.add(i);
			}
		}
		
		return maListe;
	}
	
	public static List<Float> transformSquarePlusPointFive(List<Integer> listeArg)
	{
		List<Float> maListe= new ArrayList<Float>();
		
		for (Integer value : listeArg)
		{
			// Calcul
			float calcul = (float)((value*value)+0.5);
			
			maListe.add(calcul);
		}
		
		return maListe;
	}
}
