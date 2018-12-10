package tpjava.tp_spring_mvc_login.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tpjava.tp_spring_mvc_login.model.Client;

@Repository
@Transactional
public class ClientDao
{
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public Client getClientById(int idc)
	{
		Client unClient = em.find(Client.class, idc);
		
		return unClient;
	}
	
	@Transactional
	public Client getClientByPseudo(String user)
	{
		String hql = "from Client where pseudo = :pseudo"; 
		TypedQuery<Client> clientQuery = em.createQuery(hql, Client.class);
		clientQuery.setParameter("pseudo", user);
		System.out.println("====" + clientQuery.toString());
		
		// Utilisation de getResultList serait préférée?

		Client client;
		
		try
		{
			client = clientQuery.getSingleResult();
		}
		catch(NoResultException e)
		{
			System.out.println("==== Erreur: "+e);
			client = null;
		}
		
		return client;
	}
}
