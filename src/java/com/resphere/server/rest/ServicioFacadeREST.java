/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.rest;

import com.resphere.server.model.Servicio;
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
@Path("com.resphere.server.model.servicio")
public class ServicioFacadeREST extends AbstractFacade<Servicio> {
    @PersistenceContext(unitName = "respherersPU")
    private EntityManager em;

    public ServicioFacadeREST() {
        super(Servicio.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Servicio entity) {
        super.create(entity);
    }
    
    @POST
    @Path("list")
    @Consumes({"application/xml", "application/json"})
    public void createlist(List<Servicio> lista){
        super.createList(lista);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") String id, Servicio entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Servicio find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Servicio> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Servicio> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }
    
    @GET
    @Path("findAll/{id}")
    @Produces({"application/xml", "application/json"})
    public List<Servicio> findAllById(@PathParam("id") String id){
        javax.persistence.Query query = getEntityManager().createQuery("SELECT p FROM Servicio p WHERE p.idevento like :idevento").setParameter("idevento", "%" + id + "%");
        List<Servicio> servicios = query.getResultList();
        return servicios;
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
