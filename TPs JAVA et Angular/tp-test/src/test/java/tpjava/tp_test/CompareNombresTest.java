package tpjava.tp_test;

import static org.junit.Assert.*;

import java.sql.Savepoint;

import org.junit.Test;

import junit.framework.Assert;

public class CompareNombresTest
{

	@Test
	public void plusGrandFaux()
	{
		boolean res = CompareNombres.estPlusGrandQue(1, 2);
		Assert.assertEquals(false, res);
	}
	
	@Test
	public void plusGrandVrai()
	{
		boolean res = CompareNombres.estPlusGrandQue(2, 1);
		Assert.assertEquals(true, res);
	}
	
	@Test
	public void plusGrandEgalite()
	{
		boolean res = CompareNombres.estPlusGrandQue(2, 2);
		Assert.assertEquals(false, res);
	}
	
	/*
	 * =======================================================
	 */
	
	@Test
	public void verifInsertUserInf()
	{
		String a = "45";
		String b = "53";
		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);
		boolean res = CompareNombres.estPlusGrandQue(bi, ai);
		Assert.assertEquals(true, res);
	}
	
	@Test
	public void verifInsertUserSup()
	{
		String a = "53";
		String b = "45";
		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);
		boolean res = CompareNombres.estPlusGrandQue(bi, ai);
		Assert.assertEquals(false, res);
	}
	
	@Test
	public void verifInsertUserEgal()
	{
		String a = "53";
		String b = "53";
		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);
		boolean res = CompareNombres.estPlusGrandQue(bi, ai);
		Assert.assertEquals(false, res);
	}
	
	@Test
	public void verifInsertUserStr()
	{
		String a = "Hello World!";
		String b = "53";
		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);
		boolean res = CompareNombres.estPlusGrandQue(bi, ai);
		Assert.assertEquals(false, res);
	}
	
	@Test
	public void verifInsertUserNbStrNb()
	{
		String a = "42";
		String b = "53c45";
		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);
		boolean res = CompareNombres.estPlusGrandQue(bi, ai);
		System.out.println(res);
		Assert.assertEquals(false, res);
	}
	


}
