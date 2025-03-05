package org.acme.controller;

import java.util.List;
import org.acme.entity.XS_DEPOSITO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/XS_DEPOSITO")
public class C_XS_DEPOSITO {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<XS_DEPOSITO> listar() {
        return XS_DEPOSITO.listAll();
    }
}
