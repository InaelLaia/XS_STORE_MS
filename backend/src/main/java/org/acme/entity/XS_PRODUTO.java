package org.acme.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Getter
@Setter
@Entity
@Table(name = "XS_PRODUTO")
public class XS_PRODUTO extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "NOME_PRODUTO")
    public String nomeProduto;

    @Column(name = "PONTO_REP_PRODUTO")
    public int pontoRepProduto;

    // Getters and Setters can be added if needed
}
