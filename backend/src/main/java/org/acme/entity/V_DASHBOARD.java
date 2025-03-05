package org.acme.entity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@ApplicationScoped
@Entity
@Table(name = "DASHBOARD")

public class V_DASHBOARD extends PanacheEntityBase {

    @Id
    @Column(name = "TOTALPRODUTOS")
    public Long NumProdutos;

    @Column(name = "TOTALFORNECEDOR")
    public String NumFornecedores;

    @Column(name = "TOTALDEPOSITO")
    public String TotalDepositos;

    @Column(name = "QTD_PRODUTO_REPOSICAO")
    public String QuantidadeProdutoreposicao;

}

