/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas.ventas;

import org.owl.pos.controladores.ControladorVistaRegistrarVentas;
import org.owl.pos.vistas.Visualizable;
import org.owl.pos.vistas.componentes.MenuDeConsola;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.imprimirTituloPantalla;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.limpiarPantalla;

/**
 *
 * @author hugo
 */
public class VistaRegistrarVentas implements Visualizable{
    private ControladorVistaRegistrarVentas controlador;
    
    public VistaRegistrarVentas(ControladorVistaRegistrarVentas controlador){
        this.controlador = controlador;
    }
    
    @Override
    public void visualizar() {
        limpiarPantalla();
        imprimirTituloPantalla("Registrar Ventas");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAccion());
        menu.mostrarMenu();
        int accion = menu.solicitarOpcion();
        controlador.procesarAccion(accion);
        
    }
    
}
