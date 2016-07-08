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
public class ControladorVistaAdministrarClientes implements Controlador{
    
    public static enum Accion {
        CREAR_CLIENTE("Crear cliente"),
        EDITAR_CLIENTE("Editar cliente"),
        ELIMINAR_CLIENTE("Eliminar cliente"),
        VOLVER("Volver");
        
        private final String nombre;
        
        Accion(String nombre){
          this.nombre = nombre;
        }
        
        public String getNombre(){
            return nombre;
        }
                       
    }
    
    @Override
    public void procesarAccion(int indiceAccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String[] obtenerNombresAcciones() {
        String[] nombres = new String[Accion.values().length];
        for (int i=0; i<nombres.length; i++) {
            nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
    }
            
    
}
