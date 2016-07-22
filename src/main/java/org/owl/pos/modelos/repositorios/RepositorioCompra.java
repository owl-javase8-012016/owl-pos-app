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

public final class RepositorioCompra extends Repositorio {
    private long secuencia;
    private static RepositorioCompra INSTANCE;
    
    private RepositorioCompra() {
    
    }
            
    public static RepositorioCompra getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new RepositorioCompra();
        }
        
        return INSTANCE;
    }
    
    @Override
    protected void generarIdentificacion(Identificable entidad) {
        entidad.setId(++secuencia);
    } 
}
