package org.acme.controller;
import java.util.List;

import org.acme.entity.V_DEPOSITO_PONTO_REP ;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/V_DEPOSITO_PONTO_REP")
public class C_V_DEPOSITO_PONTO_REP {
    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<V_DEPOSITO_PONTO_REP> listar() {
        return entityManager.createNativeQuery("SELECT * FROM DEPOSITO_PONTO_REP").getResultList();
    }
}
