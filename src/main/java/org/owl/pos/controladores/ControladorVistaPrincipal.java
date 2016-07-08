/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.controladores;

/**
 *
 * @author raphapy
 */
public class ControladorVistaPrincipal implements Controlador {
    
    public static enum Accion {
        ADMINISTRAR_ARTICULOS("Administrar Artículos"),
        ADMINISTRAR_CLIENTES("Administrar Clientes"),
        ADMINISTRAR_PROVEEDORES("Administrar Proveedores"),
        REGISTRAR_COMPRA("Registrar Compra"),
        REGISTRAR_VENTA("Registrar Venta"),
        CONSULTAR_COMPRAS("Consultar Compras"),
        CONSULTAR_VENTAS("Consultar Ventas"),
        SALIR("Salir");
        
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
