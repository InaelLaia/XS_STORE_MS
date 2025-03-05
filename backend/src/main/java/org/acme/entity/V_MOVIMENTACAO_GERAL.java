package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@ApplicationScoped
@Entity
@Table(name = "MOVIMENTACAO_GERAL")

public class V_MOVIMENTACAO_GERAL extends PanacheEntityBase {

    @Id
    @Column(name = "ID_PRODUTO")
    public int IdProduto;

    @Column(name = "NOME_PRODUTO")
    public String nomeProduto;

    @Column(name = "NOME_DEPOSITO")
    public String NomeDepositos;

    @Column(name = "PRECO_PRODUTO")
    public double precoProduto;

    @Column(name = "QTD_MOVIMENTACAO")
    public int qtdMovimentacao;

    @Column(name = "TIPO_MOVIMENTACAO")
    public String tipoMovimentacao;

}

