/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class Compra implements Identificable {
    private Date fechaCompra;
    private String timbradoFactura;
    private String numeroFactura;
    private Proveedor proveedor;
    private List<ItemCompra> itemsCompra;
    private Long id;
    
    
    public Compra(){
        itemsCompra = new ArrayList<>();
    }
    
    @Override
    public Long getId() {
        return id;
    }
    
    

    
    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getTimbradoFactura() {
        return timbradoFactura;
    }

    public void setTimbradoFactura(String timbradoFactura) {
        this.timbradoFactura = timbradoFactura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<ItemCompra> getItemsCompra() {
        return itemsCompra;
    }

    public void setItemsCompra(List<ItemCompra> itemsCompra) {
        this.itemsCompra = itemsCompra;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
