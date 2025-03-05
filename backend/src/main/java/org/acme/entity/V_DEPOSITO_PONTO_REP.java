package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@ApplicationScoped
@Entity
@Table(name = "DEPOSITO_PONTO_REP")

public class V_DEPOSITO_PONTO_REP extends PanacheEntityBase {

    @Id
    @Column(name = "NOME_DEPOSITO")
    public String NomeDepositos;

    @Column(name = "PONTO_REP_DEPOSITO")
    public int PontoRep;

    @Column(name = "NOME_PRODUTO")
    public String NomeProduto;

}
