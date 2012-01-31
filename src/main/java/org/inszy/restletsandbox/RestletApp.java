package org.inszy.restletsandbox;

import org.restlet.Context;
import org.restlet.ext.jaxrs.JaxRsApplication;

/**
 * @author Maciej Bilas
 * @since 31/1/12 22:53
 */
public class RestletApp extends JaxRsApplication {

    public RestletApp() {
        super(Context.getCurrent());
        add(new JaxRsApp());
    }
}
