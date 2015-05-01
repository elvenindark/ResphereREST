/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "poblacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poblacion.findAll", query = "SELECT p FROM Poblacion p"),
    @NamedQuery(name = "Poblacion.findByIdevento", query = "SELECT p FROM Poblacion p WHERE p.idevento like :idevento"),
    @NamedQuery(name = "Poblacion.findByNumero", query = "SELECT p FROM Poblacion p WHERE p.numero = :numero")})
public class Poblacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Column(name = "numero")
    private BigInteger numero;
    @JoinColumn(name = "idtipopoblacion", referencedColumnName = "idtipopoblacion")
    @ManyToOne(optional = false)
    private Tipopoblacion idtipopoblacion;
    @JoinColumn(name = "idtipoafectacion", referencedColumnName = "idtipoafectacion")
    @ManyToOne(optional = false)
    private Tipoafectacion idtipoafectacion;
    @JoinColumn(name = "idevento", referencedColumnName = "idevento", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evento evento;

    public Poblacion() {
    }

    public Poblacion(String idevento) {
        this.idevento = idevento;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public BigInteger getNumero() {
        return numero;
    }

    public void setNumero(BigInteger numero) {
        this.numero = numero;
    }

    @XmlTransient
    @JsonIgnore 
    public Tipopoblacion getIdtipopoblacion() {
        return idtipopoblacion;
    }

    public void setIdtipopoblacion(Tipopoblacion idtipopoblacion) {
        this.idtipopoblacion = idtipopoblacion;
    }

    @XmlTransient
    @JsonIgnore
    public Tipoafectacion getIdtipoafectacion() {
        return idtipoafectacion;
    }

    public void setIdtipoafectacion(Tipoafectacion idtipoafectacion) {
        this.idtipoafectacion = idtipoafectacion;
    }

    @XmlTransient
    @JsonIgnore
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
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
        if (!(object instanceof Poblacion)) {
            return false;
        }
        Poblacion other = (Poblacion) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Poblacion[ idevento=" + idevento + " ]";
    }
    
}
