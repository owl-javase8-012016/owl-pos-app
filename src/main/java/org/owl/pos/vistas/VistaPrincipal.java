/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas;

import org.owl.pos.vistas.componentes.MenuDeConsola;

/**
 *
 * @author raphapy
 */
public class VistaPrincipal {
    
    public static void main(String[] args) {
        String[] opciones = {"Opción A", "Opción B", "Opción C"};
        MenuDeConsola menu = new MenuDeConsola(opciones);
        menu.mostrarMenu();
        int opcion = menu.solicitarOpcion();
        System.out.println("Ha elegido la opción "+ opcion);
    }
    
}
