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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "mediovida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mediovida.findAll", query = "SELECT m FROM Mediovida m"),
    @NamedQuery(name = "Mediovida.findBySiaplica", query = "SELECT m FROM Mediovida m WHERE m.siaplica = :siaplica"),
    @NamedQuery(name = "Mediovida.findByObservacion", query = "SELECT m FROM Mediovida m WHERE m.observacion = :observacion"),
    @NamedQuery(name = "Mediovida.findByIdevento", query = "SELECT m FROM Mediovida m WHERE m.idevento = :idevento")})
public class Mediovida implements Serializable {
    @Size(max = 2147483647)
    @Column(name = "hombres")
    private String hombres;
    @Size(max = 2147483647)
    @Column(name = "mujeres")
    private String mujeres;
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "siaplica")
    private String siaplica;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @JoinColumn(name = "idtipomediovida", referencedColumnName = "idtipomediovida")
    @ManyToOne(optional = false)
    private Tipomediovida idtipomediovida;
    @JoinColumn(name = "idtipodano", referencedColumnName = "idtipodano")
    @ManyToOne(optional = false)
    private Tipodano idtipodano;
    @JoinColumn(name = "idevento", referencedColumnName = "idevento", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evento evento;

    public Mediovida() {
    }

    public Mediovida(String idevento) {
        this.idevento = idevento;
    }

    public String getSiaplica() {
        return siaplica;
    }

    public void setSiaplica(String siaplica) {
        this.siaplica = siaplica;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

//    public Tipopoblacion getIdtipopoblacion() {
//        return idtipopoblacion;
//    }
//
//    public void setIdtipopoblacion(Tipopoblacion idtipopoblacion) {
//        this.idtipopoblacion = idtipopoblacion;
//    }

    public Tipomediovida getIdtipomediovida() {
        return idtipomediovida;
    }

    public void setIdtipomediovida(Tipomediovida idtipomediovida) {
        this.idtipomediovida = idtipomediovida;
    }

    public Tipodano getIdtipodano() {
        return idtipodano;
    }

    public void setIdtipodano(Tipodano idtipodano) {
        this.idtipodano = idtipodano;
    }

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
        if (!(object instanceof Mediovida)) {
            return false;
        }
        Mediovida other = (Mediovida) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Mediovida[ idevento=" + idevento + " ]";
    }

    public String getHombres() {
        return hombres;
    }

    public void setHombres(String hombres) {
        this.hombres = hombres;
    }

    public String getMujeres() {
        return mujeres;
    }

    public void setMujeres(String mujeres) {
        this.mujeres = mujeres;
    }
    
}
