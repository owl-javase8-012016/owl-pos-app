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
public final class RepositorioPersona extends Repositorio {
    private long secuencia;
    private static RepositorioPersona INSTANCE;
    
    private RepositorioPersona() {
    
    }
            
    public static RepositorioPersona getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new RepositorioPersona();
        }
        
        return INSTANCE;
    }
    
    @Override
    protected void generarIdentificacion(Identificable entidad) {
        entidad.setId(++secuencia);
    } 
}
