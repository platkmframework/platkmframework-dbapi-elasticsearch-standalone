package org.platkmframework.dbapi.elasticsearch;

import org.platkmframework.boot.odm.elasticsearch.server.runner.PlatkmFrameworkApplication;
import org.platkmframework.content.project.ProjectContent;

public class RunApplication { 

	public static void main(String[] args) {
		
		ProjectContent.instance().projectName("DBApiNosqlElasticSearch").
								  server(System.getenv("PLATKM_ELASTICSEARCH_SERVER_NAME")).// example localhost
								  servletPath("/platkmframework").
		                          port(System.getenv("PLATKM_ELASTICSEARCH_SERVER_PORT")).//example 8080
		                          //corsOrigin("<urls>").// example http://localhost
		                          corsMethod("GET,POST,PUT,DELETE,OPTIONS").
		                          corsHeader("Origin,Authorization,Content-Type,X-Auth-Token").
		                          //stopKey("<token>"). optional token sent to stop server
		                          dateFormat("dd-MM-yyyy").
		                          datetimeFormat("dd-MM-yyyy:HH:mm:ss").
		                          timeFormat("HH:mm").
		                          //elasticsearch connection
		                          addProperty("elasticsearch.server.name", System.getenv("PLATKM_ELASTICSEARCH_DB_SERVER_NAME")).
		                          addProperty("elasticsearch.server.port", System.getenv("PLATKM_ELASTICSEARCH_DB_SERVER_PORT")).
		                          addProperty("elasticsearch.server.user", System.getenv("PLATKM_ELASTICSEARCH_DB_SERVER_USER")).
		                          addProperty("elasticsearch.server.password", System.getenv("PLATKM_ELASTICSEARCH_DB_SERVER_PASSWORD"));
		
		PlatkmFrameworkApplication.start(args);
	}

}
