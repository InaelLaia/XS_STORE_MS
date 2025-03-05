package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;

@ApplicationScoped
@Entity
@Table(name = "MOVIMENTACAO_GERAL")
@NamedStoredProcedureQueries({
  @NamedStoredProcedureQuery(
    name = "MOVIMENTACAO_PRODUTOS", 
    procedureName = "MOVIMENTACAO_PRODUTOS", 
    resultClasses = { P_MOVIMENTACAO_PRODUTOS.class }, 
    parameters = { 
        @StoredProcedureParameter(
          name = "ID_ESCOLHIDO", 
          type = Integer.class, 
          mode = ParameterMode.IN) }) 
})

public class P_MOVIMENTACAO_PRODUTOS extends PanacheEntityBase{

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