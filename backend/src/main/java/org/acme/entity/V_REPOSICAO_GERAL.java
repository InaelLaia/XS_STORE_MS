package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@ApplicationScoped
@Entity
@Table(name = "REPOSICAO_GERAL")

public class V_REPOSICAO_GERAL extends PanacheEntityBase {

    @Id
    @Column(name = "NOME_PRODUTO")
    public String nomeProduto;

    @Column(name = "ID")
    public String idProduto;

    @Column(name = "QTD_ATUAL")
    public int qtd_Atual;

}

