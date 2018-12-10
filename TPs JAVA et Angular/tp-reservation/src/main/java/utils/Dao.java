package utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class Dao
{
	
	public Dao()
	{
		
	}
	
	public void insVol(Vol volArg)
	{
		EntityManager em = DatabaseHelper.createEntityManager();
		
		DatabaseHelper.beginTx(em);
		
		em.persist(volArg);
		
		DatabaseHelper.commitTxAndClose(em);
	}
	
	public void insPassager(Reservation pasArg)
	{
		EntityManager em = DatabaseHelper.createEntityManager();
		
		DatabaseHelper.beginTx(em);
		
		em.persist(pasArg);
		
		DatabaseHelper.commitTxAndClose(em);
	}
	
	public void SelTable(String table)
	{
		String nomtable = table;
		
		EntityManager em = DatabaseHelper.createEntityManager();
		
		DatabaseHelper.beginTx(em);
		
		if(nomtable == "Vol")
		{
			TypedQuery<Vol> query = em.createQuery("from Vol", Vol.class);
			List<Vol> vol = query.getResultList();
			
			for(int i = 0; i < vol.size(); i++)
			{
	            System.out.println(vol.get(i).getNumero()+" | "+vol.get(i).getTypeAvion()+" | "+vol.get(i).getNbPlaces()+" | "+vol.get(i).getVilleDepart()+" | "+vol.get(i).getVilleArrivee()+" | "+vol.get(i).getDateDepart());
	        }
			
			DatabaseHelper.commitTxAndClose(em);
		}
		else if(nomtable == "Reservation")
		{
			TypedQuery<Reservation> query = em.createQuery("from Reservation", Reservation.class);
			List<Reservation> pers = query.getResultList();
			
			for(int i = 0; i < pers.size(); i++)
			{
	            System.out.println(pers.get(i).getNom()+" "+pers.get(i).getPrenom()+" "+pers.get(i).getAge());
	        }
			
			DatabaseHelper.commitTxAndClose(em);
		}
		else
		{
			System.out.println("Erreur: vous n'avez pas sélectionné la bonne table!");
		}
			
	}
	
}
