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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "sectorhumanitario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sectorhumanitario.findAll", query = "SELECT s FROM Sectorhumanitario s"),
    @NamedQuery(name = "Sectorhumanitario.findByIdsectorhumanitario", query = "SELECT s FROM Sectorhumanitario s WHERE s.idsectorhumanitario = :idsectorhumanitario"),
    @NamedQuery(name = "Sectorhumanitario.findBySectorhumanitario", query = "SELECT s FROM Sectorhumanitario s WHERE s.sectorhumanitario = :sectorhumanitario"),
    @NamedQuery(name = "Sectorhumanitario.findByDescripcion", query = "SELECT s FROM Sectorhumanitario s WHERE s.descripcion = :descripcion")})
public class Sectorhumanitario implements Serializable {
    @OneToMany(mappedBy = "idsectorhumanitario")
    private List<Normaminima> normaminimaList;
    @OneToMany(mappedBy = "idsectorhumanitario")
    private List<Indicadorclave> indicadorclaveList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsectorhumanitario")
    private Integer idsectorhumanitario;
    @Size(max = 2147483647)
    @Column(name = "sectorhumanitario")
    private String sectorhumanitario;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;

    public Sectorhumanitario() {
    }

    public Sectorhumanitario(Integer idsectorhumanitario) {
        this.idsectorhumanitario = idsectorhumanitario;
    }

    public Integer getIdsectorhumanitario() {
        return idsectorhumanitario;
    }

    public void setIdsectorhumanitario(Integer idsectorhumanitario) {
        this.idsectorhumanitario = idsectorhumanitario;
    }

    public String getSectorhumanitario() {
        return sectorhumanitario;
    }

    public void setSectorhumanitario(String sectorhumanitario) {
        this.sectorhumanitario = sectorhumanitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsectorhumanitario != null ? idsectorhumanitario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sectorhumanitario)) {
            return false;
        }
        Sectorhumanitario other = (Sectorhumanitario) object;
        if ((this.idsectorhumanitario == null && other.idsectorhumanitario != null) || (this.idsectorhumanitario != null && !this.idsectorhumanitario.equals(other.idsectorhumanitario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Sectorhumanitario[ idsectorhumanitario=" + idsectorhumanitario + " ]";
    }

    @XmlTransient
    @JsonIgnore
    public List<Normaminima> getNormaminimaList() {
        return normaminimaList;
    }

    public void setNormaminimaList(List<Normaminima> normaminimaList) {
        this.normaminimaList = normaminimaList;
    }

    @XmlTransient
    @JsonIgnore
    public List<Indicadorclave> getIndicadorclaveList() {
        return indicadorclaveList;
    }

    public void setIndicadorclaveList(List<Indicadorclave> indicadorclaveList) {
        this.indicadorclaveList = indicadorclaveList;
    }
    
}
