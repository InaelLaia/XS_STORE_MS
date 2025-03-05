package org.acme.controller;

import org.acme.entity.XS_MOVIMENTACAO;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.transaction.Transactional;

@Path("/XS_MOVIMENTACAO")
public class C_XS_MOVIMENTACAO {

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response adicionarMovimentacao(XS_MOVIMENTACAO movimentacao) {

       

        try{
            XS_MOVIMENTACAO.persist(movimentacao);
            return Response.status(Response.Status.CREATED).entity(movimentacao).build();
        }
        catch(Exception e)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        } 
    }
}
