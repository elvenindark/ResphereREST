/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "roltecnico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roltecnico.findAll", query = "SELECT r FROM Roltecnico r"),
    @NamedQuery(name = "Roltecnico.findByIdroltecnico", query = "SELECT r FROM Roltecnico r WHERE r.idroltecnico = :idroltecnico"),
    @NamedQuery(name = "Roltecnico.findByRoltecnico", query = "SELECT r FROM Roltecnico r WHERE r.roltecnico = :roltecnico")})
public class Roltecnico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idroltecnico")
    private String idroltecnico;
    @Size(max = 2147483647)
    @Column(name = "roltecnico")
    private String roltecnico;
    @OneToMany(mappedBy = "idroltecnico")
    private List<Equipo> equipoList;

    public Roltecnico() {
    }

    public Roltecnico(String idroltecnico) {
        this.idroltecnico = idroltecnico;
    }

    public String getIdroltecnico() {
        return idroltecnico;
    }

    public void setIdroltecnico(String idroltecnico) {
        this.idroltecnico = idroltecnico;
    }

    public String getRoltecnico() {
        return roltecnico;
    }

    public void setRoltecnico(String roltecnico) {
        this.roltecnico = roltecnico;
    }

    @XmlTransient
    @JsonIgnore
    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idroltecnico != null ? idroltecnico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roltecnico)) {
            return false;
        }
        Roltecnico other = (Roltecnico) object;
        if ((this.idroltecnico == null && other.idroltecnico != null) || (this.idroltecnico != null && !this.idroltecnico.equals(other.idroltecnico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Roltecnico[ idroltecnico=" + idroltecnico + " ]";
    }
    
}
