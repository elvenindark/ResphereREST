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
@Table(name = "tiposervicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposervicio.findAll", query = "SELECT t FROM Tiposervicio t"),
    @NamedQuery(name = "Tiposervicio.findByIdtiposervicio", query = "SELECT t FROM Tiposervicio t WHERE t.idtiposervicio = :idtiposervicio"),
    @NamedQuery(name = "Tiposervicio.findByTiposervicio", query = "SELECT t FROM Tiposervicio t WHERE t.tiposervicio = :tiposervicio")})
public class Tiposervicio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtiposervicio")
    private String idtiposervicio;
    @Size(max = 2147483647)
    @Column(name = "tiposervicio")
    private String tiposervicio;

    public Tiposervicio() {
    }

    public Tiposervicio(String idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
    }

    public String getIdtiposervicio() {
        return idtiposervicio;
    }

    public void setIdtiposervicio(String idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposervicio != null ? idtiposervicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposervicio)) {
            return false;
        }
        Tiposervicio other = (Tiposervicio) object;
        if ((this.idtiposervicio == null && other.idtiposervicio != null) || (this.idtiposervicio != null && !this.idtiposervicio.equals(other.idtiposervicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tiposervicio[ idtiposervicio=" + idtiposervicio + " ]";
    }
    
}
