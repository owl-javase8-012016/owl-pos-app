/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas.articulos;

import org.owl.pos.controladores.ControladorVistaAdministrarArticulos;
import org.owl.pos.vistas.Visualizable;
import org.owl.pos.vistas.componentes.MenuDeConsola;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.imprimirTituloPantalla;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.limpiarLinea;

/**
 *
 * @author user
 */
public class VistaAdministrarArticulos implements Visualizable{
    
    private ControladorVistaAdministrarArticulos controlador;
    
    public VistaAdministrarArticulos(ControladorVistaAdministrarArticulos controlador){
        this.controlador = controlador;
    }

    @Override
    public void visualizar() {
        limpiarLinea();
        imprimirTituloPantalla("Administrar Artículos");
        MenuDeConsola menu = new MenuDeConsola((controlador.obtenerNombresAcciones()));
        menu.mostrarMenu();
        int accion = menu.solicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
}
