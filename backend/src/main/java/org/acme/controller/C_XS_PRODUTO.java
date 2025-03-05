package org.acme.controller;

import java.util.List;

import org.acme.entity.XS_PRODUTO;
import org.acme.repository.ProdutoRepository;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/XS_PRODUTO")
public class C_XS_PRODUTO {

    @Inject
    ProdutoRepository produtorepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<XS_PRODUTO> listar() {
        return produtorepository.listAll(); // referencia a classe repository que implementa o panache
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public XS_PRODUTO findById(@PathParam("id") Long id) {
        return produtorepository.findById(id);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(XS_PRODUTO produto) {
        // Cria um novo objeto produtosEn sem o id do JSON
        XS_PRODUTO novoProduto = new XS_PRODUTO();
        novoProduto.setNomeProduto(produto.getNomeProduto());
        novoProduto.setPontoRepProduto(produto.getPontoRepProduto());
    
        // Persiste o novo produto
        produtorepository.persist(novoProduto);
    
        // Retorna a resposta com o status e o produto criado
        return Response.status(Response.Status.CREATED).entity(novoProduto).build();
    }


   /*  public Response create(produtosEn produto) {
        produtorepository.persist(produto);
        return Response.status(Response.Status.CREATED).entity(produto).build();
    }*/

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(@PathParam("id") Long id, XS_PRODUTO produto) {
        XS_PRODUTO existingProduto = produtorepository.findById(id);
        if (existingProduto == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        existingProduto.nomeProduto = produto.nomeProduto;
        existingProduto.pontoRepProduto = produto.pontoRepProduto;
        produtorepository.persist(existingProduto);
        return Response.ok(existingProduto).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        boolean deleted = produtorepository.deleteById(id);
        if (deleted) {
            return Response.noContent().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}