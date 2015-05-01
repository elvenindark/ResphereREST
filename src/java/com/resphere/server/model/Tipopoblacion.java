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
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "tipopoblacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipopoblacion.findAll", query = "SELECT t FROM Tipopoblacion t"),
    @NamedQuery(name = "Tipopoblacion.findByIdtipopoblacion", query = "SELECT t FROM Tipopoblacion t WHERE t.idtipopoblacion = :idtipopoblacion"),
    @NamedQuery(name = "Tipopoblacion.findByTipopoblacion", query = "SELECT t FROM Tipopoblacion t WHERE t.tipopoblacion = :tipopoblacion")})
public class Tipopoblacion implements Serializable {
    @OneToMany(mappedBy = "idtipopoblacion")
    private List<Equipo> equipoList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipopoblacion")
//    private List<Mediovida> mediovidaList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtipopoblacion")
    private String idtipopoblacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "tipopoblacion")
    private String tipopoblacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipopoblacion")
    private List<Poblacion> poblacionList;

    public Tipopoblacion() {
    }

    public Tipopoblacion(String idtipopoblacion) {
        this.idtipopoblacion = idtipopoblacion;
    }

    public Tipopoblacion(String idtipopoblacion, String tipopoblacion) {
        this.idtipopoblacion = idtipopoblacion;
        this.tipopoblacion = tipopoblacion;
    }

    public String getIdtipopoblacion() {
        return idtipopoblacion;
    }

    public void setIdtipopoblacion(String idtipopoblacion) {
        this.idtipopoblacion = idtipopoblacion;
    }

    public String getTipopoblacion() {
        return tipopoblacion;
    }

    public void setTipopoblacion(String tipopoblacion) {
        this.tipopoblacion = tipopoblacion;
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
        hash += (idtipopoblacion != null ? idtipopoblacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopoblacion)) {
            return false;
        }
        Tipopoblacion other = (Tipopoblacion) object;
        if ((this.idtipopoblacion == null && other.idtipopoblacion != null) || (this.idtipopoblacion != null && !this.idtipopoblacion.equals(other.idtipopoblacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tipopoblacion[ idtipopoblacion=" + idtipopoblacion + " ]";
    }

//    @XmlTransient
//    public List<Mediovida> getMediovidaList() {
//        return mediovidaList;
//    }
//
//    public void setMediovidaList(List<Mediovida> mediovidaList) {
//        this.mediovidaList = mediovidaList;
//    }

    @XmlTransient
    @JsonIgnore
    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }
    
}
