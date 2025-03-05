package org.acme.repository;

import org.acme.entity.XS_PRODUTO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProdutoRepository implements PanacheRepository<XS_PRODUTO> {
    // Métodos adicionais, se necessário
}