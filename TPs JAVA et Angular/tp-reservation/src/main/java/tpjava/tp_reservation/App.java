package tpjava.tp_reservation;

import utils.DatabaseHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DatabaseHelper.createEntityManager();
        System.out.println( "Hello World!" );
    }
}
