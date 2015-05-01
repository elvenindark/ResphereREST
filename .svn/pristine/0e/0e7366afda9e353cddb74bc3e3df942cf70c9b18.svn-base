/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.rest;

import com.resphere.server.model.Normaminima;
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
@Path("com.resphere.server.model.normaminima")
public class NormaminimaFacadeREST extends AbstractFacade<Normaminima> {
    @PersistenceContext(unitName = "respherersPU")
    private EntityManager em;

    public NormaminimaFacadeREST() {
        super(Normaminima.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Normaminima entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Normaminima entity) {
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
    public Normaminima find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @GET
    @Path("shumanitario/{shumanitario}")
    @Produces({"application/xml", "application/json"})
    public List<Normaminima> findBySHumanitario(@PathParam("shumanitario") Integer id){
        return (List<Normaminima>)getEntityManager().createNamedQuery("Normaminima.findByIdsectorhumanitario").setParameter("idsectorhumanitario", id).getResultList();
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Normaminima> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Normaminima> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
