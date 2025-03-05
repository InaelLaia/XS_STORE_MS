package org.acme.controller;
import java.util.List;

import org.acme.entity.P_BUSCA_FORNECEDOR;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/P_BUSCA_FORNECEDOR")
public class C_P_BUSCA_FORNECEDOR {

    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<P_BUSCA_FORNECEDOR> listarFornecedor(
            @QueryParam("idEscolhido") Integer idEscolhido 
    ) {
        return entityManager.createNamedStoredProcedureQuery("BUSCA_FORNECEDOR").setParameter("ID_ESCOLHIDO", idEscolhido).getResultList();
    }
}
