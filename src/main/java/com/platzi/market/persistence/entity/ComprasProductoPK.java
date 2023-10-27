package com.platzi.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ComprasProductoPK implements Serializable {
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
