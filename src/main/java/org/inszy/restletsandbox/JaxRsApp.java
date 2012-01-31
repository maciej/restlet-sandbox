package org.inszy.restletsandbox;

import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

/**
 * @author Maciej Bilas
 * @since 31/1/12 22:34
 */
public class JaxRsApp extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Collections.<Class<?>>singleton(SampleResource.class);
    }
}
