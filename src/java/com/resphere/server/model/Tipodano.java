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
@Table(name = "tipodano")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipodano.findAll", query = "SELECT t FROM Tipodano t"),
    @NamedQuery(name = "Tipodano.findByIdtipodano", query = "SELECT t FROM Tipodano t WHERE t.idtipodano = :idtipodano"),
    @NamedQuery(name = "Tipodano.findByTipodano", query = "SELECT t FROM Tipodano t WHERE t.tipodano = :tipodano")})
public class Tipodano implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtipodano")
    private String idtipodano;
    @Size(max = 2147483647)
    @Column(name = "tipodano")
    private String tipodano;

    public Tipodano() {
    }

    public Tipodano(String idtipodano) {
        this.idtipodano = idtipodano;
    }

    public String getIdtipodano() {
        return idtipodano;
    }

    public void setIdtipodano(String idtipodano) {
        this.idtipodano = idtipodano;
    }

    public String getTipodano() {
        return tipodano;
    }

    public void setTipodano(String tipodano) {
        this.tipodano = tipodano;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipodano != null ? idtipodano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipodano)) {
            return false;
        }
        Tipodano other = (Tipodano) object;
        if ((this.idtipodano == null && other.idtipodano != null) || (this.idtipodano != null && !this.idtipodano.equals(other.idtipodano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tipodano[ idtipodano=" + idtipodano + " ]";
    }
    
}
