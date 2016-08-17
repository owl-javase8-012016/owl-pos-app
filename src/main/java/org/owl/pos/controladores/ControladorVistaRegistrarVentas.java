/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.controladores;

import org.owl.pos.vistas.VistaPrincipal;

/**
 *
 * @author hugo
 */
public class ControladorVistaRegistrarVentas implements Controlador {
    
    public static enum Accion{
        REGISTRAR_VENTAS("Registrar Ventas"),
        LISTAR_FACTURAS("Listar Facturas"),
        VOLVER("Volver a la pantalla anterior");
        
        public final String nombre;
        
        Accion(String nombre){
            this.nombre = nombre;
        }        
        
        public String getNombre(){
            return nombre;
        }
    }
    
    @Override
    public void procesarAccion(int indiceAccion) {
        Accion accion = Accion.values()[indiceAccion];
        VistaPrincipal vista = null;
        Controlador controlador = null;
        
        switch(accion){
            case VOLVER:
                controlador = new ControladorVistaPrincipal();
                vista = new VistaPrincipal((ControladorVistaPrincipal)controlador);
                break;
        }
        if (vista == null){
            vista.visualizar();
        }
        
    }
    
    public String[] obtenerNombresAccion(){
        String[] nombres = new String[Accion.values().length];
        for(int i=0; i < nombres.length; i++){
            nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
    }
}
