/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.modelos.repositorios;

import org.owl.pos.modelos.Identificable;

 
/**
 *
 * @author fcabral
 */
public final class RepositorioProveedor extends Repositorio {
    private long secuencia;
    private static RepositorioProveedor INSTANCE;
    
    private RepositorioProveedor() {
    
}

public static RepositorioProveedor getInstance () {
    if (INSTANCE == null) {
        INSTANCE = new RepositorioProveedor();
        
    }
    return INSTANCE;
}

@Override
protected void generarIdentificacion(Identificable entidad) {
    entidad.setId(++secuencia);
}

}

