/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas;

import org.owl.pos.controladores.ControladorVistaPrincipal;
import org.owl.pos.vistas.componentes.MenuDeConsola;

/**
 *
 * @author raphapy
 */
public class VistaPrincipal implements Visualizable {

    private final ControladorVistaPrincipal controlador;
    
    public VistaPrincipal(ControladorVistaPrincipal controlador) {
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
