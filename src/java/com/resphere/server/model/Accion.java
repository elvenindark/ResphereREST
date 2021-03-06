/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "accion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accion.findAll", query = "SELECT a FROM Accion a"),
    @NamedQuery(name = "Accion.findByFecha", query = "SELECT a FROM Accion a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "Accion.findByDescripcion", query = "SELECT a FROM Accion a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Accion.findByIdevento", query = "SELECT a FROM Accion a WHERE a.idevento = :idevento"),
    @NamedQuery(name = "Accion.findByOrganizacion", query = "SELECT a FROM Accion a WHERE a.organizacion = :organizacion"),
    @NamedQuery(name = "Accion.findByHogares", query = "SELECT a FROM Accion a WHERE a.hogares = :hogares"),
    @NamedQuery(name = "Accion.findByPersonas", query = "SELECT a FROM Accion a WHERE a.personas = :personas")})
public class Accion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "organizacion")
    private String organizacion;
    @Size(max = 2147483647)
    @Column(name = "hogares")
    private String hogares;
    @Size(max = 2147483647)
    @Column(name = "personas")
    private String personas;
   

    public Accion() {
    }

    public Accion(String idevento) {
        this.idevento = idevento;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getHogares() {
        return hogares;
    }

    public void setHogares(String hogares) {
        this.hogares = hogares;
    }

    public String getPersonas() {
        return personas;
    }

    public void setPersonas(String personas) {
        this.personas = personas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idevento != null ? idevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accion)) {
            return false;
        }
        Accion other = (Accion) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Accion[ idevento=" + idevento + " ]";
    }
    
}
