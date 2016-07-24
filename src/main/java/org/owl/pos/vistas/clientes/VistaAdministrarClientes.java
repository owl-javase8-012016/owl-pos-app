/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas.clientes;

import org.owl.pos.controladores.ControladorVistaAdministrarClientes;
import org.owl.pos.vistas.Visualizable;
import org.owl.pos.vistas.componentes.MenuDeConsola;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.imprimirTituloPantalla;
import static org.owl.pos.vistas.componentes.utilitarios.UtilitarioConsola.limpiarLinea;

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
        limpiarLinea();
        imprimirTituloPantalla("Administrar Clientes");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.mostrarMenu();
        int accion = menu.solicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
}
