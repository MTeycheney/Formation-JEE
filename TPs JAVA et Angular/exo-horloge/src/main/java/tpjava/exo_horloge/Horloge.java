package tpjava.exo_horloge;

import java.sql.*;
import java.text.*;

public class Horloge implements Runnable
{
	private int sec;
	private int min;
	private int hrs;
	
	private static final SimpleDateFormat madate = new SimpleDateFormat("HH.mm.ss");
	
	
	
	public Horloge()
	{
		this.sec = 0;
		this.min = 0;
		this.hrs = 0;
		
	}
	
	public void run()
	{
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	}
	
	
}
