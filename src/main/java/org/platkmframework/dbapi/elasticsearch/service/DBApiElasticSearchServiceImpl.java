package org.platkmframework.dbapi.elasticsearch.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.platkmframework.annotation.AutoWired;
import org.platkmframework.annotation.Service;
import org.platkmframework.common.domain.filter.FilterResult;
import org.platkmframework.common.domain.filter.criteria.SearchCriteria;
import org.platkmframework.dbapi.elasticsearch.dao.DBApiElasticSearchDao;
import org.platkmframework.jpa.odm.elasticsearch.exception.OrmElasticSearchException;

@Service
public class DBApiElasticSearchServiceImpl implements DBApiElasticSearchService{

	
	@AutoWired
	private DBApiElasticSearchDao dbApiElasticSearchDao;

	@Override
	public FilterResult<Map> search(String table, SearchCriteria filter) {
		return null;
	}

	@Override
	public List<Map> list(String table, SearchCriteria filter) {
		return Collections.emptyList();
	}

	@Override
	public Object load(String table, String id) throws OrmElasticSearchException {
		return dbApiElasticSearchDao.getPlatkmEntityManager().find(table, id);
	}

	@Override
	public String create(String table, String json) throws OrmElasticSearchException {
		return dbApiElasticSearchDao.getPlatkmEntityManager().persist(json, table);
	}

	@Override
	public Object update(String table, String json, String id) throws OrmElasticSearchException{
		return dbApiElasticSearchDao.getPlatkmEntityManager().merge(json, table, id);
	}

	@Override
	public Object delete(String table, String id) throws OrmElasticSearchException{
		return dbApiElasticSearchDao.getPlatkmEntityManager().remove(table, id);
	}

}
