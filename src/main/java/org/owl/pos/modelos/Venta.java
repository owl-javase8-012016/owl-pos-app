/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.modelos;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fcabral
 */
public class Venta implements Identificable {
    
    private Date fechaVenta;
    private String timbradoFactura;
    private String numeroFactura;
    private Cliente clientes;
    private List<ItemVenta> items;
    private Long id;
    
    
    public Venta (){
        
    }
    
    
    public Double calcularTotalVenta() {
        Double total;
        total=0.0;
        for(ItemVenta i:items ){
            total = total+i.getCostoItem();
            
            
        }
        
        return total; 
    }
    
    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
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

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id=id;
    }
  
    
    
    
    
    
    
    
}
