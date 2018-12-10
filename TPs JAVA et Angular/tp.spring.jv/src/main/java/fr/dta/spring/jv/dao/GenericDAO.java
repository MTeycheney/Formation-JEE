package fr.dta.spring.jv.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.spring.jv.model.IdEntity;

@Repository
@Transactional
public abstract class GenericDAO<T extends IdEntity> {
	
	private Class<T> classType;

	@PersistenceContext
	private EntityManager em;
	
	public GenericDAO(Class<T> classType)
	{
		this.classType = classType;
	}

	public void insert(T o)
	{
		em.persist(o);
	}

	public List<T> findAll()
	{
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<T> criteria = builder.createQuery(classType);
		Root<T> root = criteria.from(classType);
		criteria.select(root);

//		String nomClass = c.getName().substring(classType.getName().lastIndexOf('.') + 1);
//		Query query = em.createQuery("from " + nomClass.toLowerCase(), T);

		return em.createQuery(criteria).getResultList();
	}

	public T findById(long id) {
		return em.find(classType, id);
	}

	public void update(T o)
	{
		em.merge(o);
	}
	
	public void delete(T t)
	{
		em.remove(findById(t.getIdEndity()));
	}
}