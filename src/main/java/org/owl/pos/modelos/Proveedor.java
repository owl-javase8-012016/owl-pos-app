/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.modelos;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author OvidioX
 */
public class Proveedor extends Persona {

    private Date fechaAlta;
    private Date fechaBaja;
    private char estado;

    public Proveedor() {

    }

    public Date getFechaAlta() {
        return this.fechaAlta;
    }

    public Date getFechaBaja() {
        return this.fechaBaja;
    }

    public char getEstado() {
        return this.estado;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFmtAlta = fmt.format(fechaAlta);
        String fechaFmtBaja = fmt.format(fechaBaja);
        return super.getId() + "\t" + fechaFmtAlta + "\t" + fechaFmtBaja;
        
    }
}
