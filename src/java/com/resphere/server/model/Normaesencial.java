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
@Table(name = "normaesencial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Normaesencial.findAll", query = "SELECT n FROM Normaesencial n"),
    @NamedQuery(name = "Normaesencial.findByIdnormaesencial", query = "SELECT n FROM Normaesencial n WHERE n.idnormaesencial = :idnormaesencial"),
    @NamedQuery(name = "Normaesencial.findByNormaesencial", query = "SELECT n FROM Normaesencial n WHERE n.normaesencial = :normaesencial"),
    @NamedQuery(name = "Normaesencial.findByIdnormaminima", query = "SELECT n FROM Normaesencial n WHERE n.idnormaminima.idnormaminima = :idnormaminima"),
    @NamedQuery(name = "Normaesencial.findByDescripcion", query = "SELECT n FROM Normaesencial n WHERE n.descripcion = :descripcion")})
public class Normaesencial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnormaesencial")
    private Integer idnormaesencial;
    @Size(max = 2147483647)
    @Column(name = "normaesencial")
    private String normaesencial;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idnormaminima", referencedColumnName = "idnormaminima")
    @ManyToOne
    private Normaminima idnormaminima;
    @OneToMany(mappedBy = "idnormaesencial")
    private List<Indicadorclave> indicadorclaveList;

    public Normaesencial() {
    }

    public Normaesencial(Integer idnormaesencial) {
        this.idnormaesencial = idnormaesencial;
    }

    public Integer getIdnormaesencial() {
        return idnormaesencial;
    }

    public void setIdnormaesencial(Integer idnormaesencial) {
        this.idnormaesencial = idnormaesencial;
    }

    public String getNormaesencial() {
        return normaesencial;
    }

    public void setNormaesencial(String normaesencial) {
        this.normaesencial = normaesencial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    @JsonIgnore
    public Normaminima getIdnormaminima() {
        return idnormaminima;
    }

    public void setIdnormaminima(Normaminima idnormaminima) {
        this.idnormaminima = idnormaminima;
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
        hash += (idnormaesencial != null ? idnormaesencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Normaesencial)) {
            return false;
        }
        Normaesencial other = (Normaesencial) object;
        if ((this.idnormaesencial == null && other.idnormaesencial != null) || (this.idnormaesencial != null && !this.idnormaesencial.equals(other.idnormaesencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Normaesencial[ idnormaesencial=" + idnormaesencial + " ]";
    }
    
}
