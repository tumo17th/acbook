package com.acbook;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.acbook.server.CharsetResponseFilter;
import com.acbook.server.GsonMessageProvider;

public class Application extends ResourceConfig {

    private static final String[] packages = { "com.acbook.resource" };

    public Application() {
        packages(packages);
        register(LoggingFilter.class);
        register(CharsetResponseFilter.class);
        register(GsonMessageProvider.class);
        property(ServerProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
    }

}
