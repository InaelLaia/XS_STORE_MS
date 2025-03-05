package org.acme.controller;
import java.util.List;
import org.acme.entity.V_REPOSICAO_GERAL;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/V_REPOSICAO_GERAL")
public class C_V_REPOSICAO_GERAL {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<V_REPOSICAO_GERAL> listar() {
        return V_REPOSICAO_GERAL.listAll();
    }
}
