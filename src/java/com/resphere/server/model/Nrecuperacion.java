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
@Table(name = "nrecuperacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nrecuperacion.findAll", query = "SELECT n FROM Nrecuperacion n"),
    @NamedQuery(name = "Nrecuperacion.findByAplica", query = "SELECT n FROM Nrecuperacion n WHERE n.aplica = :aplica"),
    @NamedQuery(name = "Nrecuperacion.findByObservacion", query = "SELECT n FROM Nrecuperacion n WHERE n.observacion = :observacion"),
    @NamedQuery(name = "Nrecuperacion.findByIdevento", query = "SELECT n FROM Nrecuperacion n WHERE n.idevento = :idevento"),
    @NamedQuery(name = "Nrecuperacion.findByIdtiposector", query = "SELECT n FROM Nrecuperacion n WHERE n.idtiposector = :idtiposector")})
public class Nrecuperacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "aplica")
    private String aplica;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtiposector")
    private String idtiposector;

    public Nrecuperacion() {
    }

    public Nrecuperacion(String idevento) {
        this.idevento = idevento;
    }

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
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

    public String getIdtiposector() {
        return idtiposector;
    }

    public void setIdtiposector(String idtiposector) {
        this.idtiposector = idtiposector;
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
        if (!(object instanceof Nrecuperacion)) {
            return false;
        }
        Nrecuperacion other = (Nrecuperacion) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Nrecuperacion[ idevento=" + idevento + " ]";
    }
    
}
