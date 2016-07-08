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
public class ControladorVistaAdministrarArticulos implements Controlador{
    public static enum Accion{
        CREAR_ARTICULO("Crear Articulos"),
        EDITAR_ARTICULO("Editar Articulos"),
        ELIMINAR_ARTICULO("Eliminar Articulos"),
        VOLVER("Volver a la pantalla Principal.");
    
        private final String nombre;

        Accion(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre(){
                return nombre;
        }
    }
    
    @Override
    public void procesarAccion(int indiceAccion) {
        System.out.println("Se escogio la acción: "+Accion.values()[indiceAccion].getNombre());
    }
 
    public String[] obtenerNombresAcciones(){
        String[] nombres = new String[Accion.values().length];
        for (int i=0; i<nombres.length;i++) {
            nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
        
    }
}