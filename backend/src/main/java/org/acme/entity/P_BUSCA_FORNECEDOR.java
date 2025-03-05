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
@Table(name = "XS_FORNECEDOR")
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
      name = "BUSCA_FORNECEDOR", 
      procedureName = "BUSCA_FORNECEDOR", 
      resultClasses = { P_BUSCA_FORNECEDOR.class }, 
      parameters = { 
          @StoredProcedureParameter(
            name = "ID_ESCOLHIDO", 
            type = Integer.class, 
            mode = ParameterMode.IN) }) 
  })

public class P_BUSCA_FORNECEDOR extends PanacheEntityBase{
    
    @Id
    @Column(name = "NOME_FORNECEDOR")
    public String nomeFornecedor;

    @Column(name = "ID_PRODUTO")
    public String idProduto;

}
