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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "tipoafectacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoafectacion.findAll", query = "SELECT t FROM Tipoafectacion t"),
    @NamedQuery(name = "Tipoafectacion.findByIdtipoafectacion", query = "SELECT t FROM Tipoafectacion t WHERE t.idtipoafectacion = :idtipoafectacion"),
    @NamedQuery(name = "Tipoafectacion.findByTipoafectacion", query = "SELECT t FROM Tipoafectacion t WHERE t.tipoafectacion = :tipoafectacion")})
public class Tipoafectacion implements Serializable {
    @Size(max = 2147483647)
    @Column(name = "tipoafectacion")
    private String tipoafectacion;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtipoafectacion")
    private String idtipoafectacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoafectacion")
    private List<Poblacion> poblacionList;

    public Tipoafectacion() {
    }

    public Tipoafectacion(String idtipoafectacion) {
        this.idtipoafectacion = idtipoafectacion;
    }

    public String getIdtipoafectacion() {
        return idtipoafectacion;
    }

    public void setIdtipoafectacion(String idtipoafectacion) {
        this.idtipoafectacion = idtipoafectacion;
    }

    @XmlTransient
    public List<Poblacion> getPoblacionList() {
        return poblacionList;
    }

    public void setPoblacionList(List<Poblacion> poblacionList) {
        this.poblacionList = poblacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoafectacion != null ? idtipoafectacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoafectacion)) {
            return false;
        }
        Tipoafectacion other = (Tipoafectacion) object;
        if ((this.idtipoafectacion == null && other.idtipoafectacion != null) || (this.idtipoafectacion != null && !this.idtipoafectacion.equals(other.idtipoafectacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tipoafectacion[ idtipoafectacion=" + idtipoafectacion + " ]";
    }

    public String getTipoafectacion() {
        return tipoafectacion;
    }

    public void setTipoafectacion(String tipoafectacion) {
        this.tipoafectacion = tipoafectacion;
    }
    
}
