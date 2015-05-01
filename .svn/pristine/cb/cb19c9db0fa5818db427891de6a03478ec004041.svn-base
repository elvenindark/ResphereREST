/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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

/**
 *
 * @author hp
 */
@Entity
@Table(name = "tipomediovida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipomediovida.findAll", query = "SELECT t FROM Tipomediovida t"),
    @NamedQuery(name = "Tipomediovida.findByIdtipomediovida", query = "SELECT t FROM Tipomediovida t WHERE t.idtipomediovida = :idtipomediovida")})
public class Tipomediovida implements Serializable {
    @Size(max = 2147483647)
    @Column(name = "tipomediovida")
    private String tipomediovida;
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipomediovida")
    private String idtipomediovida;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipomediovida")
    private List<Mediovida> mediovidaList;

    public Tipomediovida() {
    }

    public Tipomediovida(String idtipomediovida) {
        this.idtipomediovida = idtipomediovida;
    }

    public String getIdtipomediovida() {
        return idtipomediovida;
    }

    public void setIdtipomediovida(String idtipomediovida) {
        this.idtipomediovida = idtipomediovida;
    }


    @XmlTransient
    public List<Mediovida> getMediovidaList() {
        return mediovidaList;
    }

    public void setMediovidaList(List<Mediovida> mediovidaList) {
        this.mediovidaList = mediovidaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipomediovida != null ? idtipomediovida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipomediovida)) {
            return false;
        }
        Tipomediovida other = (Tipomediovida) object;
        if ((this.idtipomediovida == null && other.idtipomediovida != null) || (this.idtipomediovida != null && !this.idtipomediovida.equals(other.idtipomediovida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tipomediovida[ idtipomediovida=" + idtipomediovida + " ]";
    }

    public String getTipomediovida() {
        return tipomediovida;
    }

    public void setTipomediovida(String tipomediovida) {
        this.tipomediovida = tipomediovida;
    }
    
}
