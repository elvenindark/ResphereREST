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
@Table(name = "poblacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poblacion.findAll", query = "SELECT p FROM Poblacion p"),
    @NamedQuery(name = "Poblacion.findByIdevento", query = "SELECT p FROM Poblacion p WHERE p.idevento = :idevento"),
    @NamedQuery(name = "Poblacion.findByNumero", query = "SELECT p FROM Poblacion p WHERE p.numero = :numero"),
    @NamedQuery(name = "Poblacion.findByIdtipopoblacion", query = "SELECT p FROM Poblacion p WHERE p.idtipopoblacion = :idtipopoblacion"),
    @NamedQuery(name = "Poblacion.findByIdtipoafectacion", query = "SELECT p FROM Poblacion p WHERE p.idtipoafectacion = :idtipoafectacion")})
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtipopoblacion")
    private String idtipopoblacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtipoafectacion")
    private String idtipoafectacion;

    public Poblacion() {
    }

    public Poblacion(String idevento) {
        this.idevento = idevento;
    }

    public Poblacion(String idevento, String idtipopoblacion, String idtipoafectacion) {
        this.idevento = idevento;
        this.idtipopoblacion = idtipopoblacion;
        this.idtipoafectacion = idtipoafectacion;
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

    public String getIdtipopoblacion() {
        return idtipopoblacion;
    }

    public void setIdtipopoblacion(String idtipopoblacion) {
        this.idtipopoblacion = idtipopoblacion;
    }

    public String getIdtipoafectacion() {
        return idtipoafectacion;
    }

    public void setIdtipoafectacion(String idtipoafectacion) {
        this.idtipoafectacion = idtipoafectacion;
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
