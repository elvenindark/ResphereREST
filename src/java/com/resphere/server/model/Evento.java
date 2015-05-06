/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;
/**
 *
 * @author hp
 */
@Entity
@Table(name = "evento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e"),
    @NamedQuery(name = "Evento.findByIdevento", query = "SELECT e FROM Evento e WHERE e.idevento = :idevento"),
    @NamedQuery(name = "Evento.findByFecha", query = "SELECT e FROM Evento e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "Evento.findByHora", query = "SELECT e FROM Evento e WHERE e.hora = :hora"),
    @NamedQuery(name = "Evento.findByDescripcion", query = "SELECT e FROM Evento e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Evento.findByEfectos", query = "SELECT e FROM Evento e WHERE e.efectos = :efectos"),
    @NamedQuery(name = "Evento.findByAmenazas", query = "SELECT e FROM Evento e WHERE e.amenazas = :amenazas")})

public class Evento implements Serializable{
    
   @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Ubicacion ubicacion;
    /*@OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Equipo equipo;*/    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Comentario comentario;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Nrrhh nrrhh;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Nrecuperacion nrecuperacion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Nurgente nurgente;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Impacto impacto;    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Accion accion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Salud salud;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Acceso acceso;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Servicio servicio;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2147483647)
    @Column(name = "efectos")
    private String efectos;
    @Size(max = 2147483647)
    @Column(name = "amenazas")
    private String amenazas;
    @Size(max = 2147483647)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 2147483647)
    @Column(name = "hora")
    private String hora;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Vivienda vivienda;    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    private Mediovida mediovida;
    //@OneToOne(cascade = CascadeType.ALL, mappedBy = "evento")
    //private Poblacion poblacion;     
//    @OneToMany(mappedBy = "idevento")
//    private List<Ubicacion> ubicacionList;
    @OneToMany(mappedBy = "idevento")
    private List<Organizacion> organizacionList;
    @OneToMany(mappedBy = "idevento")
    private List<Evaluacion> evaluacionList;

    public Evento() {
    }

    public Evento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEfectos() {
        return efectos;
    }

    public void setEfectos(String efectos) {
        this.efectos = efectos;
    }

    public String getAmenazas() {
        return amenazas;
    }

    public void setAmenazas(String amenazas) {
        this.amenazas = amenazas;
    }

//    @XmlTransient
//    @JsonIgnore
//    public List<Ubicacion> getUbicacionList() {
//        return ubicacionList;
//    }
//
//    public void setUbicacionList(List<Ubicacion> ubicacionList) {
//        this.ubicacionList = ubicacionList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idevento != null ? idevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Evento[ idevento=" + idevento + " ]";
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    /*@XmlTransient
    @JsonIgnore
    public Poblacion getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Poblacion poblacion) {
        this.poblacion = poblacion;
    }*/

    @XmlTransient
    @JsonIgnore
    public Mediovida getMediovida() {
        return mediovida;
    }

    public void setMediovida(Mediovida mediovida) {
        this.mediovida = mediovida;
    }    
    
    @XmlTransient
    @JsonIgnore
    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    @XmlTransient
    @JsonIgnore
    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @XmlTransient
    @JsonIgnore
    public Acceso getAcceso() {
        return acceso;
    }

    public void setAcceso(Acceso acceso) {
        this.acceso = acceso;
    }

    @XmlTransient
    @JsonIgnore
    public Salud getSalud() {
        return salud;
    }

    public void setSalud(Salud salud) {
        this.salud = salud;
    }

    @XmlTransient
    @JsonIgnore
    public List<Organizacion> getOrganizacionList() {
        return organizacionList;
    }

    public void setOrganizacionList(List<Organizacion> organizacionList) {
        this.organizacionList = organizacionList;
    }

    @XmlTransient
    @JsonIgnore
    public Accion getAccion() {
        return accion;
    }

    public void setAccion(Accion accion) {
        this.accion = accion;
    }

    public Impacto getImpacto() {
        return impacto;
    }

    public void setImpacto(Impacto impacto) {
        this.impacto = impacto;
    }

    public Nurgente getNurgente() {
        return nurgente;
    }

    public void setNurgente(Nurgente nurgente) {
        this.nurgente = nurgente;
    }

    public Nrrhh getNrrhh() {
        return nrrhh;
    }

    public void setNrrhh(Nrrhh nrrhh) {
        this.nrrhh = nrrhh;
    }

    public Nrecuperacion getNrecuperacion() {
        return nrecuperacion;
    }

    public void setNrecuperacion(Nrecuperacion nrecuperacion) {
        this.nrecuperacion = nrecuperacion;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    /*public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }*/

    @XmlTransient
    @JsonIgnore
    public List<Evaluacion> getEvaluacionList() {
        return evaluacionList;
    }

    public void setEvaluacionList(List<Evaluacion> evaluacionList) {
        this.evaluacionList = evaluacionList;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    

    /*@XmlTransient
    @JsonIgnore
    public List<Respuestahumanitaria> getRespuestahumanitariaList() {
        return respuestahumanitariaList;
    }

    public void setRespuestahumanitariaList(List<Respuestahumanitaria> respuestahumanitariaList) {
        this.respuestahumanitariaList = respuestahumanitariaList;
    }*/

    /*@XmlTransient
    @JsonIgnore
    public List<Respuestahumanitaria> getRespuestahumanitariaList() {
        return respuestahumanitariaList;
    }

    public void setRespuestahumanitariaList(List<Respuestahumanitaria> respuestahumanitariaList) {
        this.respuestahumanitariaList = respuestahumanitariaList;
    }*/
}
