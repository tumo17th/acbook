package com.acbook.apiserver;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.acbook.apiserver.common.CharsetResponseFilter;
import com.acbook.apiserver.common.GsonMessageProvider;

public class ACBookApplication extends ResourceConfig {

    /** Rest target resources package */
    private static final String[] RESOURCE_PACKAGES = { "com.acbook.apiserver.resources" };

    /**
     * Constructor >> Initialize process
     * 
     * 1.Set LoggingFilter
     * 2.Set response charset to UTF-8
     * 3.Set Gson serializer to response entity
     */
    public ACBookApplication() {
        packages(RESOURCE_PACKAGES);
        register(LoggingFilter.class);
        register(CharsetResponseFilter.class);
        register(GsonMessageProvider.class);
        property(ServerProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
    }

}
