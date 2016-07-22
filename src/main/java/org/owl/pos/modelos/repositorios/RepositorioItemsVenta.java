/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.modelos.repositorios;

import org.owl.pos.modelos.Identificable;

/**
 *
 * @author user
 */
public final class RepositorioItemsVenta extends Repositorio {
    private long secuencia;
    private static RepositorioItemsVenta INSTANCE;
    
    private RepositorioItemsVenta(){
        
    }
    public static RepositorioItemsVenta getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RepositorioItemsVenta();
        }
        return INSTANCE;
    }
    @Override
    protected void generarIdentificacion(Identificable entidad){
        entidad.setId(++secuencia);
    }
}
