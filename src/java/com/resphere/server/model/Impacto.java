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
@Table(name = "impacto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Impacto.findAll", query = "SELECT i FROM Impacto i"),
    @NamedQuery(name = "Impacto.findByIdevento", query = "SELECT i FROM Impacto i WHERE i.idevento = :idevento"),
    @NamedQuery(name = "Impacto.findByIdtipoimpacto", query = "SELECT i FROM Impacto i WHERE i.idtipoimpacto = :idtipoimpacto")})
public class Impacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtipoimpacto")
    private String idtipoimpacto;

    public Impacto() {
    }

    public Impacto(String idevento) {
        this.idevento = idevento;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdtipoimpacto() {
        return idtipoimpacto;
    }

    public void setIdtipoimpacto(String idtipoimpacto) {
        this.idtipoimpacto = idtipoimpacto;
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
        if (!(object instanceof Impacto)) {
            return false;
        }
        Impacto other = (Impacto) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Impacto[ idevento=" + idevento + " ]";
    }
    
}
