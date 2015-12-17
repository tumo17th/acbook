package com.acbook;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

public class Application extends ResourceConfig {

	private static final String[] packages = { "com.acbook.resource" };

	public Application() {
		packages(packages);
		property(ServerProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
	}

}
