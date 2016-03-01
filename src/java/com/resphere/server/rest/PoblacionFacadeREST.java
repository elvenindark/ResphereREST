/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.rest;

import com.resphere.server.model.Poblacion;
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
@Path("com.resphere.server.model.poblacion")
public class PoblacionFacadeREST extends AbstractFacade<Poblacion> {
    @PersistenceContext(unitName = "respherersPU")
    private EntityManager em;

    public PoblacionFacadeREST() {
        super(Poblacion.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Poblacion entity) {
        super.create(entity);
    }

    @POST
    @Path("list")
    @Consumes({"application/xml", "application/json"})
    public void createlist(List<Poblacion> lista) {        
        super.createList(lista);
    }
    
    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") String id, Poblacion entity) {
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
    public Poblacion find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Poblacion> findAll() {
        return super.findAll();
    }
    
    @GET
    @Path("findAll/{id}")
    @Produces({"application/xml", "application/json"})
    public List<Poblacion> findAllById(@PathParam("id") String id){
//        javax.persistence.criteria.CriteriaQuery<Poblacion> cq = getEntityManager().getCriteriaBuilder().createQuery(Poblacion.class);
//        javax.persistence.criteria.CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
//        javax.persistence.criteria.Root<Poblacion> r = cq.from(Poblacion.class);
//        //cq.select(cq.from(Poblacion.class));
//       cq.select(cb)        
        javax.persistence.Query q = getEntityManager().createNamedQuery("Poblacion.findByIdevento").setParameter("idevento", "%" + id + "%");
        System.out.println(q.getResultList().size());
        javax.persistence.Query query = getEntityManager().createQuery("SELECT p FROM Poblacion p WHERE p.idevento like :idevento").setParameter("idevento", "%" + id + "%");
        List<Poblacion> personas = query.getResultList();
        for(int i = 0; i < personas.size(); i++)
            System.out.println(personas.get(i).getNumero());
        return query.getResultList();
        //return q.getResultList();
    }
    
    @GET
    @Path("findAllById/{id}")
    @Produces({"application/xml", "application/json"})
    public List<Poblacion> findAll(@PathParam("id") String id){
        return null;
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Poblacion> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
