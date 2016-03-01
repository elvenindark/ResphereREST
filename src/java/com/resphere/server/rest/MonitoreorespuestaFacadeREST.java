/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resphere.server.rest;

import com.resphere.server.model.Monitoreorespuesta;
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
@Path("com.resphere.server.model.monitoreorespuesta")
public class MonitoreorespuestaFacadeREST extends AbstractFacade<Monitoreorespuesta> {
    @PersistenceContext(unitName = "respherersPU")
    private EntityManager em;

    public MonitoreorespuestaFacadeREST() {
        super(Monitoreorespuesta.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Monitoreorespuesta entity) {
        if(find(entity.getIdrespuesta())==null)
            super.create(entity);
        else
            edit(entity.getIdrespuesta(), entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Monitoreorespuesta entity) {
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
    public Monitoreorespuesta find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Monitoreorespuesta> findAll() {
        return super.findAll();
    }
    
    @GET
    @Path("findAll/{id}")
    @Produces({"application/xml", "application/json"})
    public List<Monitoreorespuesta> findAllById(@PathParam("id") String idevento){
        //Integer.parseInt(id.trim());
        //javax.persistence.Query query = getEntityManager().createQuery("SELECT p FROM Monitoreorespuesta p WHERE p.idrespuesta = :idrespuesta").setParameter("idrespuesta", Integer.parseInt(id));
        javax.persistence.Query query = getEntityManager().createQuery("SELECT p FROM Monitoreorespuesta p WHERE p.idrespuesta in (SELECT q.idrespuesta FROM Respuestahumanitaria q WHERE q.idevento = :idrespuesta)").setParameter("idrespuesta", idevento);
        
        return query.getResultList();
        //return q.getResultList();
    }
    
    @GET
    @Path("query/{idevento}/{idsectorhumanitario}")
    @Produces({"application/xml", "application/json"})
    public List<Monitoreorespuesta> findByIds(@PathParam("idevento") String idevento, @PathParam("idsectorhumanitario") Integer idsector){
        //javax.persistence.Query query = getEntityManager().createQuery("SELECT p FROM Monitoreorespuesta p WHERE p.idrespuesta in (SELECT q.idrespuesta FROM Respuestahumanitaria q WHERE trim(q.idevento) = :idevento and q.idindicadorclave in (select i.idindicadorclave from Indicadorclave i where i.idsectorhumanitario.idsectorhumanitario = :idsectorhumanitario))").setParameter("idevento", idevento.trim()).setParameter("idsectorhumanitario", idsector);        
        //return query.getResultList();
        List<Monitoreorespuesta> monitoreos = getEntityManager().createNamedQuery("Monitoreorespuesta.findByIds").setParameter("idevento", idevento.trim()).setParameter("idsectorhumanitario", idsector).getResultList();
        if(monitoreos !=null){            
            return monitoreos;
        }
        else
            return null;
        /*
        javax.persistence.Query query = getEntityManager().createQuery("SELECT p FROM Monitoreorespuesta p WHERE p.idrespuesta in (SELECT q.idrespuesta FROM Respuestahumanitaria q WHERE q.idevento = :idevento and q.idindicadorclave in (select i.idindicadorclave from Indicadorclave i where i.idsectorhumanitario.idsectorhumanitario = :idsectorhumanitario))").setParameter("idevento", idevento).setParameter("idsectorhumanitario", idsector);
        System.out.println("testing + " + query.getResultList().size());
        return query.getResultList();*/
        
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Monitoreorespuesta> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
