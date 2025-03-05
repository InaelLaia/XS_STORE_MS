package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.Table;

@ApplicationScoped
@Entity
@Table(name = "XS_FORNECEDOR")
@NamedStoredProcedureQueries({
  @NamedStoredProcedureQuery(
    name = "QTD_PM_ATUAL", 
    procedureName = "QTD_PM_ATUAL", 
    resultClasses = { P_QTD_PM_ATUAL.class } 
    ) 
})

public class P_QTD_PM_ATUAL extends PanacheEntityBase {

    @Id
    @Column(name = "ID_PRODUTO")
    public int IdProduto;

    @Column(name = "NOME_PRODUTO")
    public String nomeProduto;

    @Column(name = "QTD")
    public Integer QTD;

    @Column(name = "PRECOMEDIO")
    public Double precoMedio;

}