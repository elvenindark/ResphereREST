/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author hp
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        // following code can be used to customize Jersey 1.x JSON provider:
        try {
            Class jacksonProvider = Class.forName("org.codehaus.jackson.jaxrs.JacksonJsonProvider");
            resources.add(jacksonProvider);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.resphere.server.rest.AccesoFacadeREST.class);       
        resources.add(com.resphere.server.rest.AccionFacadeREST.class);
        resources.add(com.resphere.server.rest.ComentarioFacadeREST.class);
        resources.add(com.resphere.server.rest.EquipoFacadeREST.class);
        resources.add(com.resphere.server.rest.EvaluacionFacadeREST.class);
        resources.add(com.resphere.server.rest.EventoFacadeREST.class);
        resources.add(com.resphere.server.rest.EventosvFacadeREST.class);
        resources.add(com.resphere.server.rest.ImpactoFacadeREST.class);
        resources.add(com.resphere.server.rest.IndicadorclaveFacadeREST.class);
        resources.add(com.resphere.server.rest.MediovidaFacadeREST.class);
        resources.add(com.resphere.server.rest.NormaesencialFacadeREST.class);
        resources.add(com.resphere.server.rest.NormaminimaFacadeREST.class);
        resources.add(com.resphere.server.rest.NrecuperacionFacadeREST.class);
        resources.add(com.resphere.server.rest.NrrhhFacadeREST.class);
        resources.add(com.resphere.server.rest.NurgenteFacadeREST.class);
        resources.add(com.resphere.server.rest.OrganizacionFacadeREST.class);
        resources.add(com.resphere.server.rest.PoblacionFacadeREST.class);
        resources.add(com.resphere.server.rest.RespuestabysectorvFacadeREST.class);
        resources.add(com.resphere.server.rest.RespuestahumanitariaFacadeREST.class);
        resources.add(com.resphere.server.rest.RespuestavFacadeREST.class);
        resources.add(com.resphere.server.rest.RoltecnicoFacadeREST.class);
        resources.add(com.resphere.server.rest.SaludFacadeREST.class);
        resources.add(com.resphere.server.rest.SectorhumanitarioFacadeREST.class);
        resources.add(com.resphere.server.rest.ServicioFacadeREST.class);
        resources.add(com.resphere.server.rest.TipoaccesoFacadeREST.class);
        resources.add(com.resphere.server.rest.TipoafectacionFacadeREST.class);
        resources.add(com.resphere.server.rest.TipodanoFacadeREST.class);
        resources.add(com.resphere.server.rest.TipoeventoFacadeREST.class);
        resources.add(com.resphere.server.rest.TiponurgenteFacadeREST.class);
        resources.add(com.resphere.server.rest.TipopoblacionFacadeREST.class);
        resources.add(com.resphere.server.rest.UbicacionFacadeREST.class);
        resources.add(com.resphere.server.rest.ViviendaFacadeREST.class);
    }
    
}
