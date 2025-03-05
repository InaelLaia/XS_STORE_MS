package org.acme.controller;
import java.util.List;

import org.acme.entity.P_QTD_PM_ATUAL;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@Path("/P_QTD_PM_ATUAL")
public class C_P_QTD_PM_ATUAL {

    @Inject
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<P_QTD_PM_ATUAL> listar() {
        
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery(" QTD_PM_ATUAL");
        
        query.execute();
        
        return query.getResultList();
    }
}