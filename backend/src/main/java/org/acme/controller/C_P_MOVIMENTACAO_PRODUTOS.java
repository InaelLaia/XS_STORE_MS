package org.acme.controller;
import java.util.List;

import org.acme.entity.P_MOVIMENTACAO_PRODUTOS;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;


@Path("/P_MOVIMENTACAO_PRODUTOS")
public class C_P_MOVIMENTACAO_PRODUTOS {

    @Inject
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<P_MOVIMENTACAO_PRODUTOS> listarProdutos(
            @QueryParam("idEscolhido") Integer idEscolhido 
    ) {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("MOVIMENTACAO_PRODUTOS");
        
        query.registerStoredProcedureParameter("ID_ESCOLHIDO", Integer.class, ParameterMode.IN);
        query.setParameter("ID_ESCOLHIDO", idEscolhido);
        
        query.execute();
        
        List<P_MOVIMENTACAO_PRODUTOS> resultados = query.getResultList();
        
        return resultados;
        
    }
}
