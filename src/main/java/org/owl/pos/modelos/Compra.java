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
    private List<ItemCompra> items;
    
    public Compra(){
        items = new ArrayList<>();
        
    }
    
    
    @Override
    public Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void setFechaCompra(Date fechaCompra){
        this.fechaCompra = fechaCompra;
    }
    public Date getFechaCompra(){
        return this.fechaCompra;
    }
    
    public void setTimbradoFactura (String timbradoFactura){
        this.timbradoFactura = timbradoFactura;
    }
    public String getTimbradoFactura (){
        return this.timbradoFactura;
    }
    
    public void setNumeroFactura(String numeroFactura){
        this.numeroFactura = numeroFactura;
    }
    public String getNumeroFactura(){
        return this.numeroFactura;
    }
    
    public void setProveedor(Proveedor proveedor){
        this.proveedor = proveedor;
    }
    public Proveedor getProveedor(){
        return this.proveedor;
    }
    
    public CalcularTotalCompra(){
        
    }
    
    
    
}
