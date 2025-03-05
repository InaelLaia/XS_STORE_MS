



package org.acme.controller;
import java.util.List;

import org.acme.entity.V_DASHBOARD;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/V_DASHBOARD")
public class C_V_DASHBOARD {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<V_DASHBOARD> listar() {
        return V_DASHBOARD.listAll();
    }
}
// view que retorna todas telas informações da tela dashboard
