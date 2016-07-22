/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.modelos.repositorios;

import org.owl.pos.modelos.Identificable;

/**
 *
 * @author raphapy
 */
public class RepositorioVenta extends Repositorio {
    private long secuencia;
    private static RepositorioVenta INSTANCE;
    
    private RepositorioVenta() {
    
    }
    
    public static RepositorioVenta getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new RepositorioVenta();
        }
        
        return INSTANCE;
    }

    @Override
    protected void generarIdentificacion(Identificable entidad) {
       entidad.setId(++secuencia);
    }   
}
