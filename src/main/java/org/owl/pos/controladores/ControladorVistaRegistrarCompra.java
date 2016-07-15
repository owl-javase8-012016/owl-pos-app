/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.controladores;

/**
 *
 * @author user
 */
public class ControladorVistaRegistrarCompra implements Controlador{
    
    public static enum Accion {
        REGISTRAR_COMPRA("Registrar Compra"),
        LISTAR_FACTUAR("Listar Factura"),
        VOLVER("Volver");
        
        private final String nombre;
        
        Accion(String nombre) {
            this.nombre = nombre;
        }
        
        public String getNombre() {
            return nombre;
        }
    }
    @Override
    public void procesarAccion(int indiceAccion) {
        System.out.println("Se escogio la acción: "+Accion.values()[indiceAccion].getNombre());
    }
    
    public String[] obtenerNombresAcciones() {
        String[] nombres = new String[Accion.values().length];
        for(int i=0; i<nombres.length; i++) {
            nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
    }
    
    
}
