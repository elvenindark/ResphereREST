/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.rest;

import com.resphere.server.model.Indicadorclave;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author hp
 */
@Stateless
@Path("com.resphere.server.model.indicadorclave")
public class IndicadorclaveFacadeREST extends AbstractFacade<Indicadorclave> {
    @PersistenceContext(unitName = "respherersPU")
    private EntityManager em;

    public IndicadorclaveFacadeREST() {
        super(Indicadorclave.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Indicadorclave entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Indicadorclave entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Indicadorclave find(@PathParam("id") String id) {
        return super.find(id);
    }
    
    @GET
    @Path("nminima/{nminima}")
    @Produces({"application/xml", "application/json"})
    public List<Indicadorclave> findByIdNMinima(@PathParam("nminima") Integer id){
        return (List<Indicadorclave>)getEntityManager().createNamedQuery("Indicadorclave.findByIdnormaminima").setParameter("idnormaminima", id).getResultList();
    }
    
    @GET
    @Path("nesencial/{nesencial}")
    @Produces({"application/xml", "application/json"})
    public List<Indicadorclave> findByIdNEsencial(@PathParam("nesencial") Integer id){
        return (List<Indicadorclave>)getEntityManager().createNamedQuery("Indicadorclave.findByIdnormaesencial").setParameter("idnormaesencial", id).getResultList();              
    }
    
    @GET
    @Path("shumanitario/{shumanitario}")
    @Produces({"application/xml", "application/json"})
    public List<Indicadorclave> findByIdSHumanitario(@PathParam("shumanitario") Integer id){
        return (List<Indicadorclave>)getEntityManager().createNamedQuery("Indicadorclave.findByIdsectorhumanitario").setParameter("idsectorhumanitario", id).getResultList();
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Indicadorclave> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Indicadorclave> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}