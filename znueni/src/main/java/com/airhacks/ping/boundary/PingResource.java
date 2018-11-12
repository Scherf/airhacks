package com.airhacks.ping.boundary;

import com.airhacks.ping.entity.Znueni;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @Inject
    ZnueniService service;

    @GET
    public Znueni ping() {
        return new Znueni("wurst und brezel " + service.message(), 15);
    }

}
