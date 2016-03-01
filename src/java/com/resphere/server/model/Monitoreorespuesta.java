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
@Table(name = "monitoreorespuesta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Monitoreorespuesta.findAll", query = "SELECT m FROM Monitoreorespuesta m"),
    @NamedQuery(name = "Monitoreorespuesta.findByObservacion", query = "SELECT m FROM Monitoreorespuesta m WHERE m.observacion = :observacion"),
    @NamedQuery(name = "Monitoreorespuesta.findByIds", query = "SELECT p FROM Monitoreorespuesta p WHERE p.idrespuesta in (SELECT q.idrespuesta FROM Respuestahumanitaria q WHERE q.idevento = :idevento and q.idindicadorclave in (select i.idindicadorclave from Indicadorclave i where i.idsectorhumanitario.idsectorhumanitario = :idsectorhumanitario))"),
    @NamedQuery(name = "Monitoreorespuesta.findByCumple", query = "SELECT m FROM Monitoreorespuesta m WHERE m.cumple = :cumple"),
    @NamedQuery(name = "Monitoreorespuesta.findByIdrespuesta", query = "SELECT m FROM Monitoreorespuesta m WHERE m.idrespuesta = :idrespuesta")})
public class Monitoreorespuesta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 2147483647)
    @Column(name = "cumple")
    private String cumple;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrespuesta")
    private Integer idrespuesta;

    public Monitoreorespuesta() {
    }

    public Monitoreorespuesta(Integer idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public Integer getIdrespuesta() {
        return idrespuesta;
    }

    public void setIdrespuesta(Integer idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrespuesta != null ? idrespuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Monitoreorespuesta)) {
            return false;
        }
        Monitoreorespuesta other = (Monitoreorespuesta) object;
        if ((this.idrespuesta == null && other.idrespuesta != null) || (this.idrespuesta != null && !this.idrespuesta.equals(other.idrespuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Monitoreorespuesta[ idrespuesta=" + idrespuesta + " ]";
    }
    
}
