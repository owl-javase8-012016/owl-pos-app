/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.pos.modelos.repositorios;

import java.util.List;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.iterableWithSize;
import static org.hamcrest.Matchers.not;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.owl.pos.modelos.Identificable;
import org.owl.pos.modelos.Persona;

/**
 *
 * @author raphapy
 */
public class RepositorioTest {
    
    public RepositorioTest() {
    }

    /**
     * Test of crear method, of class Repositorio.
     */
    @Test
    public void testCrear() {
        RepositorioImpl repo = new RepositorioImpl();
        Persona persona = new Persona();
        persona.setNombre("Rafael");
        persona.setApellido("Benegas");
        persona.setNumeroDocumento("2384667");
        repo.crear(persona);
        Persona p = (Persona) repo.buscar(persona.getId());
        assertEquals(p, persona);
    }

    /**
     * Test of modificar method, of class Repositorio.
     */
    @Test
    public void testModificar() {
        RepositorioImpl repo = new RepositorioImpl();
        Persona persona = new Persona();
        persona.setNombre("Rafael");
        persona.setApellido("Benegas");
        persona.setNumeroDocumento("2384667");
        repo.crear(persona);
        
        //modificación
        Persona p = (Persona) repo.buscar(persona.getId());
        persona.setNumeroDocumento("777777");
        repo.modificar(persona);
        
        //test
        Persona pmod = (Persona) repo.buscar(persona.getId());
        assertEquals(pmod.getId(), p.getId());
        assertEquals("777777", pmod.getNumeroDocumento());
    }

    /**
     * Test of eliminar method, of class Repositorio.
     */
    @Test
    public void testEliminar() {
        RepositorioImpl repo = new RepositorioImpl();
        Persona persona = new Persona();
        persona.setNombre("Rafael");
        persona.setApellido("Benegas");
        persona.setNumeroDocumento("2384667");
        repo.crear(persona);
        
        Persona pAEliminar = (Persona) repo.buscar(persona.getId());
        assertNotNull(pAEliminar);
        
        //eliminacion
        repo.eliminar(persona);
        Persona pEliminada = (Persona) repo.buscar(persona.getId());
        assertNull(pEliminada);
    }

    /**
     * Test of buscar method, of class Repositorio.
     */
    @Test
    public void testBuscar_String() {
        RepositorioImpl repo = new RepositorioImpl();
        Persona persona = new Persona();
        persona.setNombre("Rafael");
        persona.setApellido("Benegas");
        persona.setNumeroDocumento("2384667");
        repo.crear(persona);
        
        Persona persona2 = new Persona();
        persona2.setNombre("Miguel");
        persona2.setApellido("Benegas");
        persona2.setNumeroDocumento("7777777");
        repo.crear(persona2);
        
        Persona persona3 = new Persona();
        persona3.setNombre("Miguel");
        persona3.setApellido("Castillo");
        persona3.setNumeroDocumento("7777778");
        repo.crear(persona3);
        
        List<Identificable> lista = repo.buscar("bene");
        assertThat(lista, hasItems(persona, persona2));
        assertThat(lista, not(hasItem(persona3)));
        
        List<Identificable> lista2 = repo.buscar("7777778");
        assertThat(lista2, hasItem(persona3));
        assertThat(lista2, not(hasItems(persona, persona2)));
    }

    /**
     * Test of buscar method, of class Repositorio.
     */
    @Test
    public void testBuscar_Long() {
        RepositorioImpl repo = new RepositorioImpl();
        Persona persona = new Persona();
        persona.setNombre("Rafael");
        persona.setApellido("Benegas");
        persona.setNumeroDocumento("2384667");
        repo.crear(persona);
        
        Persona encontrado = (Persona) repo.buscar(persona.getId());
        assertEquals(persona, encontrado);
    }
    
    @Test
    public void testBuscarConListaPaginada() {
        
        RepositorioImpl repo = new RepositorioImpl();
        
        //creamos 10000 entidades que tengan en comun algún patron de busqueda
        for(int i=0;i<10000;i++) {
            Persona persona = new Persona();
            persona.setNombre("Rafael");
            persona.setApellido("Benegas");
            persona.setNumeroDocumento(String.valueOf(2300000+i));
            repo.crear(persona);
        }
        
        //otros 5000 que no tengan el patron comun de busqueda
        for(int i=0;i<5000;i++) {
            Persona persona = new Persona();
            persona.setNombre("Miguel");
            persona.setApellido("Castillo");
            persona.setNumeroDocumento(String.valueOf(2300000+i));
            repo.crear(persona);
        }
        
        String patronBusqueda = "bene";
        ListaPaginada resultado = repo.buscar(patronBusqueda, 5000, 30);
        assertThat(resultado.getTotalDatos(), is(10000));
        assertThat(resultado.getLista(), is(iterableWithSize(30)));
        assertThat(resultado.getLista().get(0).getId(), is(5001L));
        assertThat(resultado.getLista().get(29).getId(), is(5030L));
        
        String patronBusqueda2 = "miguel";
        ListaPaginada resultado2 = repo.buscar(patronBusqueda2, 0, 30);
        assertThat(resultado2.getTotalDatos(), is(5000));
        assertThat(resultado2.getLista(), is(iterableWithSize(30)));
        assertThat(resultado2.getLista().get(0).getId(), is(10001L));
        assertThat(resultado2.getLista().get(29).getId(), is(10030L));
    }

    /**
     * Test of generarIdentificacion method, of class Repositorio.
     */
    @Test
    public void testGenerarIdentificacion() {
    }

    public static class RepositorioImpl extends Repositorio {
        private long secuencia;
        
        @Override
        public void generarIdentificacion(Identificable entidad) {
            entidad.setId(++secuencia);
        }
    }
}
