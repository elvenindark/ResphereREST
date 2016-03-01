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
@Table(name = "tipoacceso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoacceso.findAll", query = "SELECT t FROM Tipoacceso t"),
    @NamedQuery(name = "Tipoacceso.findByTipoacceso", query = "SELECT t FROM Tipoacceso t WHERE t.tipoacceso = :tipoacceso"),
    @NamedQuery(name = "Tipoacceso.findByIdtipoacceso", query = "SELECT t FROM Tipoacceso t WHERE t.idtipoacceso = :idtipoacceso"),
    @NamedQuery(name = "Tipoacceso.findByIdevento", query = "SELECT t FROM Tipoacceso t WHERE t.idevento = :idevento")})
public class Tipoacceso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "tipoacceso")
    private String tipoacceso;
    @Size(max = 2147483647)
    @Column(name = "idtipoacceso")
    private String idtipoacceso;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    

    public Tipoacceso() {
    }

    public Tipoacceso(String idevento) {
        this.idevento = idevento;
    }

    public String getTipoacceso() {
        return tipoacceso;
    }

    public void setTipoacceso(String tipoacceso) {
        this.tipoacceso = tipoacceso;
    }

    public String getIdtipoacceso() {
        return idtipoacceso;
    }

    public void setIdtipoacceso(String idtipoacceso) {
        this.idtipoacceso = idtipoacceso;
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
        hash += (idevento != null ? idevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoacceso)) {
            return false;
        }
        Tipoacceso other = (Tipoacceso) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tipoacceso[ idevento=" + idevento + " ]";
    }
    
}
