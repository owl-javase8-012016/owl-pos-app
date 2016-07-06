/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.vistas.componentes;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Representa un menú de opciones para su utilización en aplicaciones de
 * consola.
 *
 * @author raphapy
 */
public final class MenuDeConsola {

    private String[] opciones;

    public MenuDeConsola(String[] opciones) {
        if (opciones != null && opciones.length > 0) {
            this.opciones = opciones;
        } else {
            throw new IllegalStateException("Se requiere al menos una opción para el menú.");
        }
    }

    /**
     * Renderiza en la terminal la lista de opciones disponibles para ser
     * seleccionadas por el usuario.
     *
     */
    public void mostrarMenu() {
        System.out.print(this.toString());
    }

    /**
     * Solicita en el prompt una opción válida del menú.
     *
     * @return el índice de la opción elegida. El índice es en base 0
     */
    public int solicitarOpcion() {
        String mensaje = "\nElija una opción: ";
        String opcionStr;
        Integer opcion = -1;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print(mensaje);
            opcionStr = scanner.nextLine();
            try {
                opcion = new Integer(opcionStr);
                if(!esOpcionValida(opcion)) {
                    mensaje = MENSAJE_OPCION_NO_VALIDA;
                }
            } catch (NumberFormatException e) {
                mensaje = MENSAJE_OPCION_NO_VALIDA;
            }
        } while(!esOpcionValida(opcion));
        
        return opcion;
    }
    private static final String MENSAJE_OPCION_NO_VALIDA = "\nOpción no válida. Elija una opción: ";

    /**
     * Retorna una representación formateada de las opciones del menú.
     *
     * Ej: 
     * [0] Opción Cero 
     * [1] Opción Uno 
     * [2] Opción Dos Etc..
     *
     * @return Una cadena que puede ser renderizada.
     */
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for(int i=0; i<opciones.length;i++) {
            joiner.add("["+i+"] "+opciones[i]);
        }
        return joiner.toString();
    }

    /**
     * Indica si la opción escogida es válida o no.
     *
     * @param opcion {@code int} que representa el índice de la opción elegida.
     * @return false si la opción está fuera de las opciones del menú y true en caso
     * contrario.
     */
    private boolean esOpcionValida(int opcion) {
        return opcion>=0 && opcion<opciones.length;
    }
}
