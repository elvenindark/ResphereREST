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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "respuestahumanitaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Respuestahumanitaria.findAll", query = "SELECT r FROM Respuestahumanitaria r"),
    @NamedQuery(name = "Respuestahumanitaria.findEventos", query = "SELECT distinct r.idevento, t.evento FROM Respuestahumanitaria r, Tipoevento t WHERE t.idevento = r.idevento"),
    @NamedQuery(name = "Respuestahumanitaria.findByIds", query = "SELECT r FROM Respuestahumanitaria r WHERE r.idevento = :idevento and r.idindicadorclave = :idindicadorclave"),
    @NamedQuery(name = "Respuestahumanitaria.findByObservacion", query = "SELECT r FROM Respuestahumanitaria r WHERE r.observacion = :observacion"),
    @NamedQuery(name = "Respuestahumanitaria.findByAplica", query = "SELECT r FROM Respuestahumanitaria r WHERE r.aplica = :aplica"),
    @NamedQuery(name = "Respuestahumanitaria.findByIdrespuesta", query = "SELECT r FROM Respuestahumanitaria r WHERE r.idrespuesta = :idrespuesta")})
public class Respuestahumanitaria implements Serializable {
    @Size(max = 20)
    @Column(name = "idindicadorclave")
    private String idindicadorclave;
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 20)
    @Column(name = "aplica")
    private String aplica;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrespuesta")
    private Integer idrespuesta;

    public Respuestahumanitaria() {
    }

    public Respuestahumanitaria(Integer idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
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
        if (!(object instanceof Respuestahumanitaria)) {
            return false;
        }
        Respuestahumanitaria other = (Respuestahumanitaria) object;
        if ((this.idrespuesta == null && other.idrespuesta != null) || (this.idrespuesta != null && !this.idrespuesta.equals(other.idrespuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Respuestahumanitaria[ idrespuesta=" + idrespuesta + " ]";
    }

    public String getIdindicadorclave() {
        return idindicadorclave;
    }

    public void setIdindicadorclave(String idindicadorclave) {
        this.idindicadorclave = idindicadorclave;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }
    
}
