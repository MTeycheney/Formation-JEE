package tpjava.tp_test;

public class testjunit
{

	private int tab1[];
	private int tab2[];
	
	
	/*
	 * CONSTRUCTOR
	 */
	
	public testjunit(int tableau1[], int tableau2[])
	{
		this.tab1 = tableau1;
		this.tab2 = tableau2;
	}
	
	/*
	 * GETTER SETTER
	 */
	
	public int[] getTab1()
	{
		return tab1;
	}
	
	public void setTab1(int[] tab1)
	{
		this.tab1 = tab1;
	}
	
	public int[] getTab2()
	{
		return tab2;
	}
	
	public void setTab2(int[] tab2)
	{
		this.tab2 = tab2;
	}
	
	
	public boolean veriftab1()
	{

		boolean verifcurrent = false;
		
		for (int i = 0; i < tab1.length; i++) // On boucle sur le premier tableau
		{
			verifcurrent = false;
			for (int j = 0; j < tab1.length; j++) // On boucle sur le deuxième tableau
			{
				if(tab1[i] == tab2[j] & verifcurrent == false) // Si les valeurs du t1 et du t2 correspondent ET qu'il s'agit de la première fois, 
				{
					verifcurrent = true; // on met la vérification à true et on break la boucle.
					break;
				}
			}
			
			if(verifcurrent == false)
			{
				return false;
			}
			
		}
		
		return true;

	}
	
	public boolean veriftab2()
	{
		
		boolean verifcurrent = false;
		
		for (int i = 0; i < tab2.length; i++) // On boucle sur le premier tableau
		{
			verifcurrent = false;
			for (int j = 0; j < tab1.length; j++) // On boucle sur le deuxième tableau
			{
				if(tab2[i] == tab1[j] & verifcurrent == false) // Si les valeurs du t1 et du t2 correspondent ET qu'il s'agit de la première fois, 
				{
					verifcurrent = true; // on met la vérification à true et on break la boucle.
					break;
				}
			}
			
			if(verifcurrent == false)
			{
				return false;
			}
			
		}
		
		return true;
		
	}
	
}
