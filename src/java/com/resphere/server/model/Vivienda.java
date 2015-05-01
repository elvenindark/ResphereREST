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
import javax.persistence.JoinColumn;
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
@Table(name = "vivienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vivienda.findAll", query = "SELECT v FROM Vivienda v"),
    @NamedQuery(name = "Vivienda.findBySindano", query = "SELECT v FROM Vivienda v WHERE v.sindano = :sindano"),
    @NamedQuery(name = "Vivienda.findByTemporalnh", query = "SELECT v FROM Vivienda v WHERE v.temporalnh = :temporalnh"),
    @NamedQuery(name = "Vivienda.findByIdevento", query = "SELECT v FROM Vivienda v WHERE v.idevento = :idevento"),
    @NamedQuery(name = "Vivienda.findByDanoparcialh", query = "SELECT v FROM Vivienda v WHERE v.danoparcialh = :danoparcialh"),
    @NamedQuery(name = "Vivienda.findByDanototalnh", query = "SELECT v FROM Vivienda v WHERE v.danototalnh = :danototalnh"),
    @NamedQuery(name = "Vivienda.findByTotalv", query = "SELECT v FROM Vivienda v WHERE v.totalv = :totalv"),
    @NamedQuery(name = "Vivienda.findByObservacion", query = "SELECT v FROM Vivienda v WHERE v.observacion = :observacion")})
public class Vivienda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "sindano")
    private String sindano;
    @Size(max = 2147483647)
    @Column(name = "temporalnh")
    private String temporalnh;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "danoparcialh")
    private String danoparcialh;
    @Size(max = 2147483647)
    @Column(name = "danototalnh")
    private String danototalnh;
    @Size(max = 2147483647)
    @Column(name = "totalv")
    private String totalv;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @JoinColumn(name = "idevento", referencedColumnName = "idevento", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evento evento;

    public Vivienda() {
    }

    public Vivienda(String idevento) {
        this.idevento = idevento;
    }

    public String getSindano() {
        return sindano;
    }

    public void setSindano(String sindano) {
        this.sindano = sindano;
    }

    public String getTemporalnh() {
        return temporalnh;
    }

    public void setTemporalnh(String temporalnh) {
        this.temporalnh = temporalnh;
    }
    
    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getDanoparcialh() {
        return danoparcialh;
    }

    public void setDanoparcialh(String danoparcialh) {
        this.danoparcialh = danoparcialh;
    }

    public String getDanototalnh() {
        return danototalnh;
    }

    public void setDanototalnh(String danototalnh) {
        this.danototalnh = danototalnh;
    }

    public String getTotalv() {
        return totalv;
    }

    public void setTotalv(String totalv) {
        this.totalv = totalv;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
        if (!(object instanceof Vivienda)) {
            return false;
        }
        Vivienda other = (Vivienda) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Vivienda[ idevento=" + idevento + " ]";
    }
    
}
