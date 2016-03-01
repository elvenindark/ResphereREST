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
@Table(name = "tiposector")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposector.findAll", query = "SELECT t FROM Tiposector t"),
    @NamedQuery(name = "Tiposector.findByIdtiposector", query = "SELECT t FROM Tiposector t WHERE t.idtiposector = :idtiposector"),
    @NamedQuery(name = "Tiposector.findByTiposector", query = "SELECT t FROM Tiposector t WHERE t.tiposector = :tiposector")})
public class Tiposector implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtiposector")
    private String idtiposector;
    @Size(max = 2147483647)
    @Column(name = "tiposector")
    private String tiposector;

    public Tiposector() {
    }

    public Tiposector(String idtiposector) {
        this.idtiposector = idtiposector;
    }

    public String getIdtiposector() {
        return idtiposector;
    }

    public void setIdtiposector(String idtiposector) {
        this.idtiposector = idtiposector;
    }

    public String getTiposector() {
        return tiposector;
    }

    public void setTiposector(String tiposector) {
        this.tiposector = tiposector;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposector != null ? idtiposector.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposector)) {
            return false;
        }
        Tiposector other = (Tiposector) object;
        if ((this.idtiposector == null && other.idtiposector != null) || (this.idtiposector != null && !this.idtiposector.equals(other.idtiposector))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tiposector[ idtiposector=" + idtiposector + " ]";
    }
    
}
