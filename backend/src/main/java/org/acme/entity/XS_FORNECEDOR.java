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
@Table(name = "XS_FORNECEDOR")
public class XS_FORNECEDOR extends PanacheEntityBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "NOME_FORNECEDOR")
    public String nomeFornecedor;
}
