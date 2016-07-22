/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas;

import org.owl.pos.controladores.ControladorVistaRegistrarCompra;
import org.owl.pos.vistas.componentes.MenuDeConsola;

/**
 *
 * @author user
 */
public class VistaRegistrarCompra implements Visualizable{
    
    private ControladorVistaRegistrarCompra controlador;
    
    public VistaRegistrarCompra(ControladorVistaRegistrarCompra controlador){
        this.controlador = controlador;
    }

    @Override
    public void visualizar() {
        
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.mostrarMenu();
        int accion = menu.solicitarOpcion();
        controlador.procesarAccion(accion);
        
    }
    
    
}
