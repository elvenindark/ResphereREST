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
@Table(name = "organizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Organizacion.findAll", query = "SELECT o FROM Organizacion o"),
    @NamedQuery(name = "Organizacion.findByNombre", query = "SELECT o FROM Organizacion o WHERE o.nombre = :nombre"),
    @NamedQuery(name = "Organizacion.findBySector", query = "SELECT o FROM Organizacion o WHERE o.sector = :sector"),
    @NamedQuery(name = "Organizacion.findByContacto", query = "SELECT o FROM Organizacion o WHERE o.contacto = :contacto"),
    @NamedQuery(name = "Organizacion.findByIdorganizacion", query = "SELECT o FROM Organizacion o WHERE o.idorganizacion = :idorganizacion"),
    @NamedQuery(name = "Organizacion.findByIdevento", query = "SELECT o FROM Organizacion o WHERE o.idevento = :idevento")})
public class Organizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "sector")
    private String sector;
    @Size(max = 2147483647)
    @Column(name = "contacto")
    private String contacto;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idorganizacion")
    private String idorganizacion;
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;

    public Organizacion() {
    }

    public Organizacion(String idorganizacion) {
        this.idorganizacion = idorganizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getIdorganizacion() {
        return idorganizacion;
    }

    public void setIdorganizacion(String idorganizacion) {
        this.idorganizacion = idorganizacion;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorganizacion != null ? idorganizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organizacion)) {
            return false;
        }
        Organizacion other = (Organizacion) object;
        if ((this.idorganizacion == null && other.idorganizacion != null) || (this.idorganizacion != null && !this.idorganizacion.equals(other.idorganizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Organizacion[ idorganizacion=" + idorganizacion + " ]";
    }
    
}
