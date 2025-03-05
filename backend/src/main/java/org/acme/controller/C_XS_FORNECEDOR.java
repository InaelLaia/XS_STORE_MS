package org.acme.controller;

import java.util.List;
import org.acme.entity.XS_FORNECEDOR;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/XS_FORNECEDOR")
public class C_XS_FORNECEDOR {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<XS_FORNECEDOR> listar() {
        return XS_FORNECEDOR.listAll();
    }
}
