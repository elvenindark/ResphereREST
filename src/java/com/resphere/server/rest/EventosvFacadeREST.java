/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.rest;

import com.resphere.server.model.Eventosv;
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
@Path("com.resphere.server.model.eventosv")
public class EventosvFacadeREST extends AbstractFacade<Eventosv> {
    @PersistenceContext(unitName = "respherersPU")
    private EntityManager em;

    public EventosvFacadeREST() {
        super(Eventosv.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Eventosv entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") String id, Eventosv entity) {
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
    public Eventosv find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Eventosv> findAll() {
        return super.findAll();
    }
    
    @GET
    @Path("findAll/{id}")
    @Produces({"application/xml", "application/json"})
    public List<Eventosv> findAllById(@PathParam("id") String id){
    
        if(id.toLowerCase().equals("monitoreo")){
            javax.persistence.Query q = getEntityManager().createNamedQuery("Eventosv.findAllMonitoreo");     
            return q.getResultList();
        }else{
            javax.persistence.Query q = getEntityManager().createNamedQuery("Eventosv.findByIdevento").setParameter("idevento", "%" + id + "%");
            return q.getResultList();
        }
    }
    
    @GET
    @Path("findAllMonitoreo")
    @Produces({"application/xml", "application/json"})
    public List<Eventosv> findAllMonitoreo(){
//        javax.persistence.criteria.CriteriaQuery<Poblacion> cq = getEntityManager().getCriteriaBuilder().createQuery(Poblacion.class);
//        javax.persistence.criteria.CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
//        javax.persistence.criteria.Root<Poblacion> r = cq.from(Poblacion.class);
//        //cq.select(cq.from(Poblacion.class));
//       cq.select(cb)        
        //System.out.println("testing");
        javax.persistence.Query q = getEntityManager().createNamedQuery("Eventosv.findAllMonitoreo");
        
        //javax.persistence.Query q = getEntityManager().createQuery("SELECT e FROM Eventosv e WHERE e.idevento in ( "
        //    + "SELECT r.idevento FROM Respuestahumanitaria r WHERE r.idrespuesta in ("
        //    + "SELECT m.idrespuesta from Monitoreorespuesta m))");
        //List<Eventosv> personas = query.getResultList();
        
        //return query.getResultList();
        return q.getResultList();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Eventosv> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
