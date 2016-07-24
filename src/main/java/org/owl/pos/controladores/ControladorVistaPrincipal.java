/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.controladores;

import org.owl.pos.vistas.articulos.VistaAdministrarArticulos;
import org.owl.pos.vistas.clientes.VistaAdministrarClientes;
import org.owl.pos.vistas.Visualizable;
import org.owl.pos.vistas.proveedores.VistaAdministrarProveedores;

/**
 *
 * @author raphapy
 */
public class ControladorVistaPrincipal implements Controlador {
    
    public static enum Accion {
        ADMINISTRAR_ARTICULOS("Administrar Artículos"),
        ADMINISTRAR_CLIENTES("Administrar Clientes"),
        ADMINISTRAR_PROVEEDORES("Administrar Proveedores"),
        REGISTRAR_COMPRA("Registrar Compra"),
        REGISTRAR_VENTA("Registrar Venta"),
        CONSULTAR_COMPRAS("Consultar Compras"),
        CONSULTAR_VENTAS("Consultar Ventas"),
        SALIR("Salir");
        
        private final String nombre;
        
        Accion(String nombre) {
            this.nombre = nombre;
        }
        
        public String getNombre() {
            return nombre;
        }
    }
    
    @Override
    public void procesarAccion(int indiceAccion) {
        Accion accion = Accion.values()[indiceAccion];
        Controlador controlador = null;
        Visualizable vista = null;
        
        switch(accion) {
            case ADMINISTRAR_ARTICULOS:
                controlador = 
                            new ControladorVistaAdministrarArticulos();
                vista = 
                        new VistaAdministrarArticulos((ControladorVistaAdministrarArticulos)controlador);
                break;
            case ADMINISTRAR_CLIENTES:
                controlador = new ControladorVistaAdministrarClientes();
                vista = new VistaAdministrarClientes((ControladorVistaAdministrarClientes)controlador);
                break;
            case ADMINISTRAR_PROVEEDORES:
                controlador = new ControladorVistaAdminstrarProveedores();
                vista = new VistaAdministrarProveedores((ControladorVistaAdminstrarProveedores)controlador);
                break;
        }
        
        vista.visualizar();
    }

    public String[] obtenerNombresAcciones() {
        String[] nombres = new String[Accion.values().length];
        for(int i=0; i<nombres.length; i++) {
            nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
    }
}
