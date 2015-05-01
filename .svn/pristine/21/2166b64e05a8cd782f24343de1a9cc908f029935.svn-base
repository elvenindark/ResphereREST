/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.rest;

import com.resphere.server.model.Evento;
import javax.ejb.embeddable.EJBContainer;
import junit.framework.TestCase;

/**
 *
 * @author hp
 */
public class EventoFacadeRESTTest extends TestCase {
    
//    public EventoFacadeRESTTest(String testName) {
//        super(testName);
//    }
    protected EventoFacadeREST instance;
    EJBContainer container;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        instance = (EventoFacadeREST)container.getContext().lookup("java:global/classes/EventoFacadeREST");
        
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    } 
  
    /**
     * Test of count method, of class EventoFacadeREST.
     */
    public void testCount() throws Exception {
        System.out.println("create");
        //EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        //EventoFacadeREST instance = (EventoFacadeREST)container.getContext().lookup("java:global/classes/EventoFacadeREST");
        //EventoFacadeREST instance = new EventoFacadeREST();
        int expResult = 54;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class EventoFacadeREST.
     */
    public void testFind_String() throws Exception {
        System.out.println("find");
        String id = "1392189849";
        
        Evento expResult = new Evento();
        expResult.setIdevento("1392189849");
        Evento result = instance.find(id);
        assertEquals(expResult.getIdevento(), result.getIdevento());
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of countREST method, of class EventoFacadeREST.
     */
    public void testCountREST() throws Exception {
        System.out.println("createList");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EventoFacadeREST instance = (EventoFacadeREST)container.getContext().lookup("java:global/classes/EventoFacadeREST");
        String expResult = "54";
        String result = instance.countREST();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
