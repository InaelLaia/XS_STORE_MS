package org.acme.controller;
import java.util.List;

import org.acme.entity.V_MOVIMENTACAO_GERAL;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/V_MOVIMENTACAO_GERAL")
public class C_V_MOVIMENTACAO_GERAL {

    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<V_MOVIMENTACAO_GERAL> listar() {
        return entityManager.createNativeQuery("SELECT * FROM MOVIMENTACAO_GERAL").getResultList();
    }
}
