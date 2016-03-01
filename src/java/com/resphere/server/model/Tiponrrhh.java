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
@Table(name = "tiponrrhh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiponrrhh.findAll", query = "SELECT t FROM Tiponrrhh t"),
    @NamedQuery(name = "Tiponrrhh.findByIdtiponrrhh", query = "SELECT t FROM Tiponrrhh t WHERE t.idtiponrrhh = :idtiponrrhh"),
    @NamedQuery(name = "Tiponrrhh.findByTiponrrhh", query = "SELECT t FROM Tiponrrhh t WHERE t.tiponrrhh = :tiponrrhh")})
public class Tiponrrhh implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtiponrrhh")
    private String idtiponrrhh;
    @Size(max = 2147483647)
    @Column(name = "tiponrrhh")
    private String tiponrrhh;

    public Tiponrrhh() {
    }

    public Tiponrrhh(String idtiponrrhh) {
        this.idtiponrrhh = idtiponrrhh;
    }

    public String getIdtiponrrhh() {
        return idtiponrrhh;
    }

    public void setIdtiponrrhh(String idtiponrrhh) {
        this.idtiponrrhh = idtiponrrhh;
    }

    public String getTiponrrhh() {
        return tiponrrhh;
    }

    public void setTiponrrhh(String tiponrrhh) {
        this.tiponrrhh = tiponrrhh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiponrrhh != null ? idtiponrrhh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiponrrhh)) {
            return false;
        }
        Tiponrrhh other = (Tiponrrhh) object;
        if ((this.idtiponrrhh == null && other.idtiponrrhh != null) || (this.idtiponrrhh != null && !this.idtiponrrhh.equals(other.idtiponrrhh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tiponrrhh[ idtiponrrhh=" + idtiponrrhh + " ]";
    }
    
}
