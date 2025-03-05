package org.acme.controller;
import java.util.List;

import org.acme.entity.V_REPOSICAO_DEPOSITO;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/V_REPOSICAO_DEPOSITO")
public class C_V_REPOSICAO_DEPOSITO {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<V_REPOSICAO_DEPOSITO> listar() {
        return V_REPOSICAO_DEPOSITO.listAll();
    }
}