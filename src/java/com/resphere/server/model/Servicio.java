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
@Table(name = "servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s"),
    @NamedQuery(name = "Servicio.findBySifunciona", query = "SELECT s FROM Servicio s WHERE s.sifunciona = :sifunciona"),
    @NamedQuery(name = "Servicio.findBySiaplica", query = "SELECT s FROM Servicio s WHERE s.siaplica = :siaplica"),
    @NamedQuery(name = "Servicio.findByObservacion", query = "SELECT s FROM Servicio s WHERE s.observacion = :observacion"),
    @NamedQuery(name = "Servicio.findByIdevento", query = "SELECT s FROM Servicio s WHERE s.idevento = :idevento"),
    @NamedQuery(name = "Servicio.findByIdtiposervicio", query = "SELECT s FROM Servicio s WHERE s.idtiposervicio = :idtiposervicio"),
    @NamedQuery(name = "Servicio.findByIdtipodano", query = "SELECT s FROM Servicio s WHERE s.idtipodano = :idtipodano")})
public class Servicio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "sifunciona")
    private String sifunciona;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtiposervicio")
    private String idtiposervicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtipodano")
    private String idtipodano;
   

    public Servicio() {
    }

    public Servicio(String idevento) {
        this.idevento = idevento;
    }

    public Servicio(String idevento, String idtiposervicio, String idtipodano) {
        this.idevento = idevento;
        this.idtiposervicio = idtiposervicio;
        this.idtipodano = idtipodano;
    }

    public String getSifunciona() {
        return sifunciona;
    }

    public void setSifunciona(String sifunciona) {
        this.sifunciona = sifunciona;
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

    public String getIdtiposervicio() {
        return idtiposervicio;
    }

    public void setIdtiposervicio(String idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
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
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Servicio[ idevento=" + idevento + " ]";
    }
    
}
