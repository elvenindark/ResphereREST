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
@Table(name = "tiponurgente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiponurgente.findAll", query = "SELECT t FROM Tiponurgente t"),
    @NamedQuery(name = "Tiponurgente.findByIdtipourgente", query = "SELECT t FROM Tiponurgente t WHERE t.idtipourgente = :idtipourgente"),
    @NamedQuery(name = "Tiponurgente.findByTiponurgente", query = "SELECT t FROM Tiponurgente t WHERE t.tiponurgente = :tiponurgente")})
public class Tiponurgente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtipourgente")
    private String idtipourgente;
    @Size(max = 2147483647)
    @Column(name = "tiponurgente")
    private String tiponurgente;

    public Tiponurgente() {
    }

    public Tiponurgente(String idtipourgente) {
        this.idtipourgente = idtipourgente;
    }

    public String getIdtipourgente() {
        return idtipourgente;
    }

    public void setIdtipourgente(String idtipourgente) {
        this.idtipourgente = idtipourgente;
    }

    public String getTiponurgente() {
        return tiponurgente;
    }

    public void setTiponurgente(String tiponurgente) {
        this.tiponurgente = tiponurgente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipourgente != null ? idtipourgente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiponurgente)) {
            return false;
        }
        Tiponurgente other = (Tiponurgente) object;
        if ((this.idtipourgente == null && other.idtipourgente != null) || (this.idtipourgente != null && !this.idtipourgente.equals(other.idtipourgente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tiponurgente[ idtipourgente=" + idtipourgente + " ]";
    }
    
}
