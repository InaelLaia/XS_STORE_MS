package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "XS_MOVIMENTACAO")

public class XS_MOVIMENTACAO extends PanacheEntityBase{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "ID_DEPOSITO")
    public Integer idDeposito;

    @Column(name = "ID_PRODUTO")
    public Integer idProduto;

    @Column(name = "PRECO_PRODUTO")
    public Double precoProduto;

    @Column(name = "QTD_MOVIMENTACAO")
    public Integer qtdMovimentacao;

    @Column(name = "TIPO_MOVIMENTACAO")
    public Integer tipoMovimentacao;


}
