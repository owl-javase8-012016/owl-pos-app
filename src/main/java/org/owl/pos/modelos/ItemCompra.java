/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.modelos;

/**
 *
 * @author user
 */
public class ItemCompra implements Identificable {
    private Articulo articulo;
    private int cantidad;
    private Double costoItem;
    private Long id;

    @Override
    public Long getId() {
        return id;
    }
    
    public Double calcularCostoUnitarioArticulo(){
        return (cantidad/costoItem);
    }
    public int getCantidad(){
        return cantidad;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
    public void setCostoItem(double costoItem){
        this.costoItem = costoItem;
    }
    public double getCostoItem(){
        return this.costoItem;
    }
}
