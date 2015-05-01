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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "normaminima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Normaminima.findAll", query = "SELECT n FROM Normaminima n"),
    @NamedQuery(name = "Normaminima.findByIdnormaminima", query = "SELECT n FROM Normaminima n WHERE n.idnormaminima = :idnormaminima"),
    @NamedQuery(name = "Normaminima.findByNormaminima", query = "SELECT n FROM Normaminima n WHERE n.normaminima = :normaminima"),
    @NamedQuery(name = "Normaminima.findByIdsectorhumanitario", query = "SELECT n FROM Normaminima n WHERE n.idsectorhumanitario.idsectorhumanitario = :idsectorhumanitario"),
    @NamedQuery(name = "Normaminima.findByDescripcion", query = "SELECT n FROM Normaminima n WHERE n.descripcion = :descripcion")})
public class Normaminima implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnormaminima")
    private Integer idnormaminima;
    @Size(max = 2147483647)
    @Column(name = "normaminima")
    private String normaminima;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idsectorhumanitario", referencedColumnName = "idsectorhumanitario")
    @ManyToOne
    private Sectorhumanitario idsectorhumanitario;
    @OneToMany(mappedBy = "idnormaminima")
    private List<Normaesencial> normaesencialList;
    @OneToMany(mappedBy = "idnormaminima")
    private List<Indicadorclave> indicadorclaveList;

    public Normaminima() {
    }

    public Normaminima(Integer idnormaminima) {
        this.idnormaminima = idnormaminima;
    }

    public Integer getIdnormaminima() {
        return idnormaminima;
    }

    public void setIdnormaminima(Integer idnormaminima) {
        this.idnormaminima = idnormaminima;
    }

    public String getNormaminima() {
        return normaminima;
    }

    public void setNormaminima(String normaminima) {
        this.normaminima = normaminima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    @JsonIgnore
    public Sectorhumanitario getIdsectorhumanitario() {
        return idsectorhumanitario;
    }

    public void setIdsectorhumanitario(Sectorhumanitario idsectorhumanitario) {
        this.idsectorhumanitario = idsectorhumanitario;
    }

    @XmlTransient
    @JsonIgnore
    public List<Normaesencial> getNormaesencialList() {
        return normaesencialList;
    }

    public void setNormaesencialList(List<Normaesencial> normaesencialList) {
        this.normaesencialList = normaesencialList;
    }

    @XmlTransient
    @JsonIgnore
    public List<Indicadorclave> getIndicadorclaveList() {
        return indicadorclaveList;
    }

    public void setIndicadorclaveList(List<Indicadorclave> indicadorclaveList) {
        this.indicadorclaveList = indicadorclaveList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnormaminima != null ? idnormaminima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Normaminima)) {
            return false;
        }
        Normaminima other = (Normaminima) object;
        if ((this.idnormaminima == null && other.idnormaminima != null) || (this.idnormaminima != null && !this.idnormaminima.equals(other.idnormaminima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Normaminima[ idnormaminima=" + idnormaminima + " ]";
    }
    
}
