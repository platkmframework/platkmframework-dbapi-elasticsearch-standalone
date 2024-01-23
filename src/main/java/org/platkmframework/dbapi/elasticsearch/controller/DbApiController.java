/*******************************************************************************
 * Copyright(c) 2023 the original author Eduardo Iglesias Taylor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	 https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * 	Eduardo Iglesias Taylor - initial API and implementation
 *******************************************************************************/
package org.platkmframework.dbapi.elasticsearch.controller;

import java.util.List;
import java.util.Map;

import org.platkmframework.annotation.Api;
import org.platkmframework.annotation.AutoWired;
import org.platkmframework.annotation.ClassMethod;
import org.platkmframework.annotation.HttpRequestMethod;
import org.platkmframework.annotation.OpenApi;
import org.platkmframework.annotation.RequestBody;
import org.platkmframework.annotation.RequestParam;
import org.platkmframework.common.domain.filter.FilterResult;
import org.platkmframework.common.domain.filter.criteria.SearchCriteria;
import org.platkmframework.dbapi.elasticsearch.service.DBApiElasticSearchService;
import org.platkmframework.jpa.odm.elasticsearch.exception.OrmElasticSearchException;

@OpenApi
@Api(path = "/dbapi", description = "DbAPI")
public class DbApiController{
 
	@AutoWired
	private DBApiElasticSearchService dbapiElasticSearchService;
 
	@ClassMethod(name = "/search", method=HttpRequestMethod.POST, description = "Búsqueda de regístros por nombre de tabla y criterios de búsqueda")
	public  FilterResult<Map>  search(@RequestParam(required = true, name = "tablename", description = "Nombre de tabla") String table,
									  @RequestBody(required = true, description = "Criterios de búsqueda", converter= {}) 
									  SearchCriteria filter) throws OrmElasticSearchException {

		return dbapiElasticSearchService.search(table, filter);
	}
	
	@ClassMethod(name = "/list", method=HttpRequestMethod.POST, description = "Búsqueda de regístros por nombre de tabla y criterios de búsqueda")
	public List<Map> list(@RequestParam(required = true, name = "tablename", description = "Nombre de tabla") String table,
						  @RequestBody(required = true, description = "Criterios de búsqueda", converter= {}) 
											SearchCriteria filter) throws OrmElasticSearchException {

		return dbapiElasticSearchService.list(table, filter);
	}
 
	@ClassMethod(name = "/load", method=HttpRequestMethod.GET, description = "Cargar información de un registro por nombre de tabla, columna y valor")
	public Object sload(@RequestParam(required = true, name = "index", description = "Nombre de tabla")  String table, 
						@RequestParam(required = true, name = "value", description = "Valor")  String value) throws OrmElasticSearchException  {
		return dbapiElasticSearchService.load(table, value);
	}
 
	@ClassMethod(name = "/create", method=HttpRequestMethod.POST, description = "Crear registro de una tabla")
	public String create(@RequestParam(required = true, name = "index", description = "Nombre de tabla") String table, 
					   @RequestBody(required = true, description = "Información a registro") String json) throws OrmElasticSearchException {
		return dbapiElasticSearchService.create(table, json); 
	}
 
	@ClassMethod(name = "/update", method=HttpRequestMethod.PUT, description = "Actualizar registro de una tabla")
	public Object update(@RequestParam(required = true, name = "index", description = "Nombre de tabla") String table,
						 @RequestParam(required = true, name = "value", description = "Nombre de tabla") String value, 
						 @RequestBody(required = true, description = "Información a registro") String json) throws OrmElasticSearchException {
		return dbapiElasticSearchService.update(table, json, value);
	}
 
	@ClassMethod(name = "/remove", method=HttpRequestMethod.DELETE, description = "Eliminar registro de una tabla")
	public Object remove(@RequestParam(required = true, name = "index", description = "Nombre de tabla")  String table, 
						@RequestParam(required = true, name = "value", description = "Valor")  String value) throws OrmElasticSearchException  {
		return dbapiElasticSearchService.delete(table, value);
	} 
	

}
