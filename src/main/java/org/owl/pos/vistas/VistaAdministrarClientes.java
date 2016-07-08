/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas;

import org.owl.pos.controladores.ControladorVistaAdministrarClientes;
import org.owl.pos.vistas.componentes.MenuDeConsola;

/**
 *
 * @author user
 */
public class VistaAdministrarClientes implements Visualizable{
    
    private final ControladorVistaAdministrarClientes controlador;
    
    public VistaAdministrarClientes(ControladorVistaAdministrarClientes controlador){
        this.controlador = controlador;
    }
    
    @Override
    public void visualizar(){
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.mostrarMenu();
        int accion = menu.solicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
}
