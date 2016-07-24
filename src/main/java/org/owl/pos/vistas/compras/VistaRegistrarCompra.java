/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas.compras;

import org.owl.pos.controladores.ControladorVistaRegistrarCompra;
import org.owl.pos.vistas.Visualizable;
import org.owl.pos.vistas.componentes.MenuDeConsola;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.imprimirTituloPantalla;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.limpiarPantalla;

/**
 *
 * @author user
 */
public class VistaRegistrarCompra implements Visualizable{
    
    private final ControladorVistaRegistrarCompra controlador;
    
    public VistaRegistrarCompra(ControladorVistaRegistrarCompra controlador){
        this.controlador = controlador;
    }

    @Override
    public void visualizar() {
        limpiarPantalla();
        imprimirTituloPantalla("Registrar Compra");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.mostrarMenu();
        int accion = menu.solicitarOpcion();
        controlador.procesarAccion(accion);
    }
}
