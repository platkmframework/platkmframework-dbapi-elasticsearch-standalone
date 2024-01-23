package org.platkmframework.dbapi.elasticsearch.service;

import java.util.List;
import java.util.Map;

import org.platkmframework.common.domain.filter.FilterResult;
import org.platkmframework.common.domain.filter.criteria.SearchCriteria;
import org.platkmframework.jpa.odm.elasticsearch.exception.OrmElasticSearchException;

public interface DBApiElasticSearchService {

	FilterResult<Map> search(String table, SearchCriteria filter) throws OrmElasticSearchException;

	List<Map> list(String table, SearchCriteria filter) throws OrmElasticSearchException;

	Object load(String table, String value) throws OrmElasticSearchException;

	public String create(String table, String json) throws OrmElasticSearchException;

	public Object update(String table, String json, String id) throws OrmElasticSearchException;

	Object delete(String table, String value) throws OrmElasticSearchException;


}
