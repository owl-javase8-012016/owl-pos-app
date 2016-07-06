/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas.componentes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raphapy
 */
public class MenuDeConsolaTest {
    
    public MenuDeConsolaTest() {
    }
    
    @Test(expected = IllegalStateException.class)
    public void testConstructorOpcionesNulo() {
        String[] opciones = null;
        new MenuDeConsola(opciones);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testConstructorOpcionesVacio() {
        String[] opciones = new String[] {};
        new MenuDeConsola(opciones);
    }

    /**
     * Test of toString method, of class MenuDeConsola.
     */
    @Test
    public void testToString() {
       String[] opciones = {"Opción A", "Opción B", "Opción C"};
       MenuDeConsola menu = new MenuDeConsola(opciones);
       String resultadoEsperado = "[0] Opción A\n[1] Opción B\n[2] Opción C";
       String menuStr = menu.toString();
       assertEquals(resultadoEsperado, menuStr);
    }
}
