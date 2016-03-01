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
@Table(name = "mediovida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mediovida.findAll", query = "SELECT m FROM Mediovida m"),
    @NamedQuery(name = "Mediovida.findBySiaplica", query = "SELECT m FROM Mediovida m WHERE m.siaplica = :siaplica"),
    @NamedQuery(name = "Mediovida.findByObservacion", query = "SELECT m FROM Mediovida m WHERE m.observacion = :observacion"),
    @NamedQuery(name = "Mediovida.findByIdevento", query = "SELECT m FROM Mediovida m WHERE m.idevento = :idevento"),
    @NamedQuery(name = "Mediovida.findByHombres", query = "SELECT m FROM Mediovida m WHERE m.hombres = :hombres"),
    @NamedQuery(name = "Mediovida.findByMujeres", query = "SELECT m FROM Mediovida m WHERE m.mujeres = :mujeres"),
    @NamedQuery(name = "Mediovida.findByIdtipomediovida", query = "SELECT m FROM Mediovida m WHERE m.idtipomediovida = :idtipomediovida"),
    @NamedQuery(name = "Mediovida.findByIdtipodano", query = "SELECT m FROM Mediovida m WHERE m.idtipodano = :idtipodano")})
public class Mediovida implements Serializable {
    private static final long serialVersionUID = 1L;
    //aumentamos id para no repetidos en clave foranea
    @Id
    @Size(max = 2147483647)
    @Column(name = "siaplica")
    private String siaplica;
    @Id
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Id
    @Size(max = 2147483647)
    @Column(name = "hombres")
    private String hombres;
    @Id
    @Size(max = 2147483647)
    @Column(name = "mujeres")
    private String mujeres;
    @Id
    @Size(max = 2147483647)
    @Column(name = "idtipomediovida")
    private String idtipomediovida;
    @Id
    @Size(max = 2147483647)
    @Column(name = "idtipodano")
    private String idtipodano;
   

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

    public String getIdtipomediovida() {
        return idtipomediovida;
    }

    public void setIdtipomediovida(String idtipomediovida) {
        this.idtipomediovida = idtipomediovida;
    }

    public String getIdtipodano() {
        return idtipodano;
    }

    public void setIdtipodano(String idtipodano) {
        this.idtipodano = idtipodano;
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
    
}
