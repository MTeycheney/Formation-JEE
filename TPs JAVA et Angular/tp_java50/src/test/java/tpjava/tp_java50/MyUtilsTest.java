package tpjava.tp_java50;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;


import static org.hamcrest.collection.IsIterableContainingInOrder.contains;


public class MyUtilsTest
{
	@Test
	public void verifSom()
	{

		List<Integer> maListe = new ArrayList<Integer>();
		maListe.add(5);
		maListe.add(10);
		maListe.add(35);
		int res = MyUtils.sum(maListe);
		Assert.assertEquals(50, res);
	}
	
	@Test
	public void verifSomNeg()
	{
		
		List<Integer> maListe = new ArrayList<Integer>();
		maListe.add(-5);
		maListe.add(10);
		maListe.add(35);
		int res = MyUtils.sum(maListe);
		Assert.assertEquals(40, res);
	}
	
	
	@Test
	public void verifStringCorrect()
	{
		String s = "Hello!";
		String res = MyUtils.emptyToNull(s);
		Assert.assertEquals("Hello!", res);
	}
	
	@Test
	public void verifStringNull()
	{
		String s = "";
		String res = MyUtils.emptyToNull(s);
		Assert.assertEquals(null, res);
	}
	
	@Test
	public void verifPair()
	{
		
		List<Integer> maListe = new ArrayList<Integer>();
		maListe.add(1);
		maListe.add(2);
		maListe.add(3);
		maListe.add(4);
		maListe.add(5);
		maListe.add(6);
		maListe.add(7);
		maListe.add(8);
		maListe.add(9);
				
		List<Integer> res = MyUtils.filterEvenNumbers(maListe);
		//  Ensure Correct order
        Assert.assertThat(res, contains(2,4,6,8));
	}
	
	@Test
	public void verifFloat()
	{
		
		List<Integer> maListe = new ArrayList<Integer>();
		maListe.add(1);
		maListe.add(2);
		maListe.add(3);
		maListe.add(4);
		maListe.add(5);
		maListe.add(6);
		maListe.add(7);
		maListe.add(8);
		maListe.add(9);
		
		List<Float> res = MyUtils.transformSquarePlusPointFive(maListe);
		//  Ensure Correct order
		Assert.assertThat(res, contains(1.5f, 4.5f, 9.5f, 16.5f, 25.5f, 36.5f, 49.5f, 64.5f, 81.5f));
	}
	
}
