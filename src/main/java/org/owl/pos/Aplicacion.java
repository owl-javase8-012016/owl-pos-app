/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos;

import org.owl.pos.controladores.ControladorVistaPrincipal;
import org.owl.pos.vistas.VistaPrincipal;

/**
 *
 * @author raphapy
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        ControladorVistaPrincipal controladorPrincipal = new ControladorVistaPrincipal();
        VistaPrincipal vistaPrincipal = new VistaPrincipal(controladorPrincipal);
        vistaPrincipal.visualizar();
    }
}
