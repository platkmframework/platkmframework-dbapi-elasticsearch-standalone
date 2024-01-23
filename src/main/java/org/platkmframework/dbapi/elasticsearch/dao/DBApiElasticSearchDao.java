package org.platkmframework.dbapi.elasticsearch.dao;

import org.platkmframework.annotation.Repository;
import org.platkmframework.jpa.odm.elasticsearch.entitymanager.PlatkmORMEntityManager;

import jakarta.persistence.PersistenceContext;

@Repository
public class DBApiElasticSearchDao {

	@PersistenceContext()
	private PlatkmORMEntityManager platkmEntityManager;	
	
	public DBApiElasticSearchDao() {
		super();
	}

	public PlatkmORMEntityManager getPlatkmEntityManager() {
		return platkmEntityManager;
	}
	
}
