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
public class ItemCompra implements Identificable{
    private Articulo articulo;
    private int cantidad;
    private double costoItem;

    @Override
    public Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double CalcularCostoUnitarioArticulo(Articulo articulo){
        double i = 0;
        return i;
    }
    
    public void setArticulo(Articulo articulo){
        this.articulo = articulo;
    }
    public Articulo getArticulo(){
        return this.articulo;
    }
       
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    
    public void setCostoItem(double costoItem){
        this.costoItem = costoItem;
    }
    public double getCostoItem(){
        return this.costoItem;
    }
    
    
    
}
