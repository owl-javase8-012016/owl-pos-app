/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.modelos.repositorios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.owl.pos.modelos.Identificable;

/**
 *
 * @author raphapy
 */
public abstract class Repositorio {
    private final Map<Long,Identificable> repositorio = new HashMap<>();
        
    public void crear(Identificable entidad) {
        if(entidad==null) {
            throw new NullPointerException();
        }
        
        if(entidad.getId()==null) {
            generarIdentificacion(entidad);
            if(repositorio.containsKey(entidad.getId())) {
                throw new IllegalArgumentException("Restricción violada, registro duplicado.");
            } else {
                repositorio.put(entidad.getId(), entidad);
            }   
        } 
    }
    
    public void modificar(Identificable entidad) {
        if(entidad==null) {
            throw new NullPointerException();
        }
        
        if(entidad.getId()==null) {
            throw new IllegalArgumentException("Se requiere el identificador.");
        }
        
        if(repositorio.containsKey(entidad.getId())) {
            repositorio.replace(entidad.getId(), entidad);
        }
    }
    
    public void eliminar(Identificable entidad) {
        if(entidad==null) {
            throw new NullPointerException();
        }
        
        if(entidad.getId()==null) {
            throw new IllegalArgumentException("Se requiere el identificador.");
        }
        
        if(repositorio.containsKey(entidad.getId())) {
            repositorio.remove(entidad.getId());
        } 
    }
    
    public List<Identificable> buscar(String filtros) {
        if(filtros==null) {
            throw new NullPointerException();
        }
        
        return repositorio.values()
                          .stream()
                          .filter(e-> {
                                        String valor = e.toString()
                                                        .toLowerCase()
                                                        .replaceAll(" ", "")
                                                        .replace(",", "");
                                        return valor
                                                  .contains(filtros.replaceAll(" ", "")
                                                                   .toLowerCase()
                                                            );
                                      })
                           .collect(Collectors.toList());
    }

    public Identificable buscar(Long id) {
        if(id==null) {
            throw new NullPointerException();
        }
        
        return repositorio.get(id);
    }
    
    /**
     * Debe generar una identificación única
     * @param entidad 
     */
    protected abstract void generarIdentificacion(Identificable entidad);
}
