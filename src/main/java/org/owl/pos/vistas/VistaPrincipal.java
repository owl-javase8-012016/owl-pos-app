/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas;

import org.owl.pos.controladores.ControladorVistaPrincipal;
import org.owl.pos.vistas.componentes.MenuDeConsola;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.imprimirTituloPantalla;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.limpiarPantalla;

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
        limpiarPantalla();
        imprimirTituloPantalla("Aplicación POS");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.mostrarMenu();
        int accion = menu.solicitarOpcion();
        controlador.procesarAccion(accion);
    }
}
