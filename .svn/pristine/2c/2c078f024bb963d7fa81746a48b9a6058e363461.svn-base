/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "tipoimpacto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoimpacto.findAll", query = "SELECT t FROM Tipoimpacto t"),
    @NamedQuery(name = "Tipoimpacto.findByIdtipoimpacto", query = "SELECT t FROM Tipoimpacto t WHERE t.idtipoimpacto = :idtipoimpacto"),
    @NamedQuery(name = "Tipoimpacto.findByDescripcion", query = "SELECT t FROM Tipoimpacto t WHERE t.descripcion = :descripcion")})
public class Tipoimpacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtipoimpacto")
    private String idtipoimpacto;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idtipoimpacto")
    private List<Impacto> impactoList;

    public Tipoimpacto() {
    }

    public Tipoimpacto(String idtipoimpacto) {
        this.idtipoimpacto = idtipoimpacto;
    }

    public String getIdtipoimpacto() {
        return idtipoimpacto;
    }

    public void setIdtipoimpacto(String idtipoimpacto) {
        this.idtipoimpacto = idtipoimpacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    @JsonIgnore
    public List<Impacto> getImpactoList() {
        return impactoList;
    }

    public void setImpactoList(List<Impacto> impactoList) {
        this.impactoList = impactoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoimpacto != null ? idtipoimpacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoimpacto)) {
            return false;
        }
        Tipoimpacto other = (Tipoimpacto) object;
        if ((this.idtipoimpacto == null && other.idtipoimpacto != null) || (this.idtipoimpacto != null && !this.idtipoimpacto.equals(other.idtipoimpacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tipoimpacto[ idtipoimpacto=" + idtipoimpacto + " ]";
    }
    
}
