package org.platkmframework.dbapi.elasticsearch;

import org.platkmframework.boot.odm.elasticsearch.server.runner.PlatkmFrameworkApplication;
import org.platkmframework.content.project.ProjectContent;

public class RunApplication { 

	public static void main(String[] args) {
		
		ProjectContent.instance().projectName("DBApiNosqlElasticSearch").
								  server("<server>").// example localhhost
								  servletPath("/platkmframework").
		                          port("<port>").//example 8080
		                          corsOrigin("<urls>").// example http://localhost
		                          corsMethod("GET,POST,PUT,DELETE,OPTIONS").
		                          corsHeader("Origin,Authorization,Content-Type,X-Auth-Token").
		                          //stopKey("<token>"). Optinal token sent to stop server
		                          dateFormat("dd-MM-yyyy").
		                          datetimeFormat("dd-MM-yyyy:HH:mm:ss").
		                          timeFormat("HH:mm").
		                          //elasticsearch connection
		                          addProperty("elasticsearch.server.name", "<servername>"). // example localhost
		                          addProperty("elasticsearch.server.port", "<port>"). // example 9200
		                          addProperty("elasticsearch.server.user", "<username").// elasticsearch elastic name
		                          addProperty("elasticsearch.server.password", "<passowrd>"); //elasticsearch user password
		
		PlatkmFrameworkApplication.start(args);
	}

}
