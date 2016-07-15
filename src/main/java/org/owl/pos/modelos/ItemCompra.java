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

    @Override
    public Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Double calcularCostoUnitarioArticulo(){
        return (cantidad/costoItem);
    }
    public int getCantidad(){
        return cantidad;
    }
}
