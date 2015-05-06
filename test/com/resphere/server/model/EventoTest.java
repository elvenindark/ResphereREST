/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author hp
 */
public class EventoTest extends TestCase {
    
    public EventoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getIdevento method, of class Evento.
     */
    public void testGetIdevento() {
        System.out.println("getIdevento");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getIdevento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdevento method, of class Evento.
     */
    public void testSetIdevento() {
        System.out.println("setIdevento");
        String idevento = "";
        Evento instance = new Evento();
        instance.setIdevento(idevento);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Evento.
     */
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Evento.
     */
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Evento instance = new Evento();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEfectos method, of class Evento.
     */
    public void testGetEfectos() {
        System.out.println("getEfectos");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getEfectos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEfectos method, of class Evento.
     */
    public void testSetEfectos() {
        System.out.println("setEfectos");
        String efectos = "";
        Evento instance = new Evento();
        instance.setEfectos(efectos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAmenazas method, of class Evento.
     */
    public void testGetAmenazas() {
        System.out.println("getAmenazas");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getAmenazas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmenazas method, of class Evento.
     */
    public void testSetAmenazas() {
        System.out.println("setAmenazas");
        String amenazas = "";
        Evento instance = new Evento();
        instance.setAmenazas(amenazas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUbicacionList method, of class Evento.
     */
    public void testGetUbicacionList() {
        System.out.println("getUbicacionList");
        Evento instance = new Evento();
        List<Ubicacion> expResult = null;
        //List<Ubicacion> result = instance.getUbicacionList();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUbicacionList method, of class Evento.
     */
    public void testSetUbicacionList() {
        System.out.println("setUbicacionList");
        List<Ubicacion> ubicacionList = null;
        Evento instance = new Evento();
        //instance.setUbicacionList(ubicacionList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Evento.
     */
    public void testHashCode() {
        System.out.println("hashCode");
        Evento instance = new Evento();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Evento.
     */
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Evento instance = new Evento();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Evento.
     */
    public void testToString() {
        System.out.println("toString");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Evento.
     */
    public void testGetFecha() {
        System.out.println("getFecha");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Evento.
     */
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Evento instance = new Evento();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class Evento.
     */
    public void testGetHora() {
        System.out.println("getHora");
        Evento instance = new Evento();
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class Evento.
     */
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        Evento instance = new Evento();
        instance.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoblacion method, of class Evento.
     */
   
    /**
     * Test of setPoblacion method, of class Evento.
     */
  

    /**
     * Test of getMediovida method, of class Evento.
     */
    public void testGetMediovida() {
        System.out.println("getMediovida");
        Evento instance = new Evento();
        Mediovida expResult = null;
        Mediovida result = instance.getMediovida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMediovida method, of class Evento.
     */
    public void testSetMediovida() {
        System.out.println("setMediovida");
        Mediovida mediovida = null;
        Evento instance = new Evento();
        instance.setMediovida(mediovida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVivienda method, of class Evento.
     */
    public void testGetVivienda() {
        System.out.println("getVivienda");
        Evento instance = new Evento();
        Vivienda expResult = null;
        Vivienda result = instance.getVivienda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVivienda method, of class Evento.
     */
    public void testSetVivienda() {
        System.out.println("setVivienda");
        Vivienda vivienda = null;
        Evento instance = new Evento();
        instance.setVivienda(vivienda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServicio method, of class Evento.
     */
    public void testGetServicio() {
        System.out.println("getServicio");
        Evento instance = new Evento();
        Servicio expResult = null;
        Servicio result = instance.getServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServicio method, of class Evento.
     */
    public void testSetServicio() {
        System.out.println("setServicio");
        Servicio servicio = null;
        Evento instance = new Evento();
        instance.setServicio(servicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAcceso method, of class Evento.
     */
    public void testGetAcceso() {
        System.out.println("getAcceso");
        Evento instance = new Evento();
        Acceso expResult = null;
        Acceso result = instance.getAcceso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAcceso method, of class Evento.
     */
    public void testSetAcceso() {
        System.out.println("setAcceso");
        Acceso acceso = null;
        Evento instance = new Evento();
        instance.setAcceso(acceso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalud method, of class Evento.
     */
    public void testGetSalud() {
        System.out.println("getSalud");
        Evento instance = new Evento();
        Salud expResult = null;
        Salud result = instance.getSalud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalud method, of class Evento.
     */
    public void testSetSalud() {
        System.out.println("setSalud");
        Salud salud = null;
        Evento instance = new Evento();
        instance.setSalud(salud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrganizacionList method, of class Evento.
     */
    public void testGetOrganizacionList() {
        System.out.println("getOrganizacionList");
        Evento instance = new Evento();
        List<Organizacion> expResult = null;
        List<Organizacion> result = instance.getOrganizacionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrganizacionList method, of class Evento.
     */
    public void testSetOrganizacionList() {
        System.out.println("setOrganizacionList");
        List<Organizacion> organizacionList = null;
        Evento instance = new Evento();
        instance.setOrganizacionList(organizacionList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccion method, of class Evento.
     */
    public void testGetAccion() {
        System.out.println("getAccion");
        Evento instance = new Evento();
        Accion expResult = null;
        Accion result = instance.getAccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccion method, of class Evento.
     */
    public void testSetAccion() {
        System.out.println("setAccion");
        Accion accion = null;
        Evento instance = new Evento();
        instance.setAccion(accion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImpacto method, of class Evento.
     */
    public void testGetImpacto() {
        System.out.println("getImpacto");
        Evento instance = new Evento();
        Impacto expResult = null;
        Impacto result = instance.getImpacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImpacto method, of class Evento.
     */
    public void testSetImpacto() {
        System.out.println("setImpacto");
        Impacto impacto = null;
        Evento instance = new Evento();
        instance.setImpacto(impacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNurgente method, of class Evento.
     */
    public void testGetNurgente() {
        System.out.println("getNurgente");
        Evento instance = new Evento();
        Nurgente expResult = null;
        Nurgente result = instance.getNurgente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNurgente method, of class Evento.
     */
    public void testSetNurgente() {
        System.out.println("setNurgente");
        Nurgente nurgente = null;
        Evento instance = new Evento();
        instance.setNurgente(nurgente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNrrhh method, of class Evento.
     */
    public void testGetNrrhh() {
        System.out.println("getNrrhh");
        Evento instance = new Evento();
        Nrrhh expResult = null;
        Nrrhh result = instance.getNrrhh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNrrhh method, of class Evento.
     */
    public void testSetNrrhh() {
        System.out.println("setNrrhh");
        Nrrhh nrrhh = null;
        Evento instance = new Evento();
        instance.setNrrhh(nrrhh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNrecuperacion method, of class Evento.
     */
    public void testGetNrecuperacion() {
        System.out.println("getNrecuperacion");
        Evento instance = new Evento();
        Nrecuperacion expResult = null;
        Nrecuperacion result = instance.getNrecuperacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNrecuperacion method, of class Evento.
     */
    public void testSetNrecuperacion() {
        System.out.println("setNrecuperacion");
        Nrecuperacion nrecuperacion = null;
        Evento instance = new Evento();
        instance.setNrecuperacion(nrecuperacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class Evento.
     */
    public void testGetComentario() {
        System.out.println("getComentario");
        Evento instance = new Evento();
        Comentario expResult = null;
        Comentario result = instance.getComentario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentario method, of class Evento.
     */
    public void testSetComentario() {
        System.out.println("setComentario");
        Comentario comentario = null;
        Evento instance = new Evento();
        instance.setComentario(comentario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipo method, of class Evento.
     */
   

    /**
     * Test of setEquipo method, of class Evento.
     */
  

    /**
     * Test of getEvaluacionList method, of class Evento.
     */
    public void testGetEvaluacionList() {
        System.out.println("getEvaluacionList");
        Evento instance = new Evento();
        List<Evaluacion> expResult = null;
        List<Evaluacion> result = instance.getEvaluacionList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvaluacionList method, of class Evento.
     */
    public void testSetEvaluacionList() {
        System.out.println("setEvaluacionList");
        List<Evaluacion> evaluacionList = null;
        Evento instance = new Evento();
        instance.setEvaluacionList(evaluacionList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
