/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.rest;

import com.resphere.server.model.Ubicacion;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import junit.framework.TestCase;

/**
 *
 * @author hp
 */
public class UbicacionFacadeRESTTest extends TestCase {
    
    protected EJBContainer container;
    protected UbicacionFacadeREST instance;
    
    public UbicacionFacadeRESTTest(String testName) {
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
     * Test of count method, of class UbicacionFacadeREST.
     */
    public void testCount() throws Exception {
        System.out.println("count");
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        instance = (UbicacionFacadeREST)container.getContext().lookup("java:global/classes/UbicacionFacadeREST");
        int expResult = 7;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

 
    /**
     * Test of find method, of class UbicacionFacadeREST.
     */
    public void testFind_String() throws Exception {
        System.out.println("create");
        String id = "1395410552";
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        instance = (UbicacionFacadeREST)container.getContext().lookup("java:global/classes/UbicacionFacadeREST");
        Ubicacion expResult = new Ubicacion();
        expResult.setIdubicacion("1395410552");
        Ubicacion result = instance.find(id);
        assertEquals(expResult.getIdubicacion(), result.getIdubicacion());
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

  

    /**
     * Test of countREST method, of class UbicacionFacadeREST.
     */
    public void testCountREST() throws Exception {
        System.out.println("createList");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UbicacionFacadeREST instance = (UbicacionFacadeREST)container.getContext().lookup("java:global/classes/UbicacionFacadeREST");
        String expResult = "7";
        String result = instance.countREST();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
