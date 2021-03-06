package io.github.oliviercailloux.y2018.opendata.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;

import io.github.oliviercailloux.y2018.opendata.entity.Planning;

/**
 * @author elhadj diallo
 *
 */

public class PlanningDao extends AbstractDao<Planning>  {
	
	/**
	 * This contructor expects both managed entity manager
	 * 
	 * @param entityManager a managed entity manager
	 */

	public PlanningDao (final EntityManager entityManager) {
		super(entityManager, Planning.class, "Planning");
	}

	/**
	 * The method allows to find the schedules recorded in the database
	 */

	@Override
	public List<Planning> findAll() {
		return entityManager.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
	}

	/**
	 * Allows to find for a record with iD
	 */

	@Override
	public Optional<Planning> findOne(Long id) {
		return Optional.of(entityManager.find(entityClass, id));

	}

	/**
	 * Allows to save an record of schedule
	 */

	@Override
	public Planning persist(Planning entity) throws EntityAlreadyExistsDaoException {
		entityManager.persist(entity);	
		return entity;
	}

	/**
	 * Allows to merge planning objects
	 */

	@Override
	public Planning merge(Planning entity){
		return entityManager.merge(entity);
	}

	/**
	 * Allows to remove a schedule record using the id
	 */

	@Override
	public void remove(Long id) throws EntityDoesNotExistDaoException {
		Planning planning = entityManager.find(entityClass, id);
		if(planning != null) 
			entityManager.remove(planning);	
	}

}
