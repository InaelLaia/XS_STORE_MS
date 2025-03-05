package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@ApplicationScoped
@Entity
@Table(name = "REPOSICAO_DEPOSITO")

public class V_REPOSICAO_DEPOSITO extends PanacheEntityBase {

    @Id
    @Column(name = "NOME_DEPOSITO")
    public String nomeDeposito;

    @Column(name = "NOME_PRODUTO")
    public String nomeProduto;

    @Column(name = "QTD_ATUAL")
    public int TotalDepositos;
}

