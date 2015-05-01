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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tipoevento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoevento.findAll", query = "SELECT t FROM Tipoevento t"),
    @NamedQuery(name = "Tipoevento.findByIdtipoevento", query = "SELECT t FROM Tipoevento t WHERE t.idtipoevento = :idtipoevento"),
    @NamedQuery(name = "Tipoevento.findByEvento", query = "SELECT t FROM Tipoevento t WHERE t.evento = :evento"),
    @NamedQuery(name = "Tipoevento.findByIdevento", query = "SELECT t FROM Tipoevento t WHERE t.idevento = :idevento")})
public class Tipoevento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoevento")
    private Integer idtipoevento;
    @Size(max = 2147483647)
    @Column(name = "evento")
    private String evento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;

    public Tipoevento() {
    }

    public Tipoevento(Integer idtipoevento) {
        this.idtipoevento = idtipoevento;
    }

    public Tipoevento(Integer idtipoevento, String idevento) {
        this.idtipoevento = idtipoevento;
        this.idevento = idevento;
    }

    public Integer getIdtipoevento() {
        return idtipoevento;
    }

    public void setIdtipoevento(Integer idtipoevento) {
        this.idtipoevento = idtipoevento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
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
        hash += (idtipoevento != null ? idtipoevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoevento)) {
            return false;
        }
        Tipoevento other = (Tipoevento) object;
        if ((this.idtipoevento == null && other.idtipoevento != null) || (this.idtipoevento != null && !this.idtipoevento.equals(other.idtipoevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tipoevento[ idtipoevento=" + idtipoevento + " ]";
    }
    
}
