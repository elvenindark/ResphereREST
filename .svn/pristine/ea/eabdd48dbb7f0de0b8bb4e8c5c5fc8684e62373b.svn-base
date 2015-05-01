/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
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
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "tiposalud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposalud.findAll", query = "SELECT t FROM Tiposalud t"),
    @NamedQuery(name = "Tiposalud.findByIdtiposalud", query = "SELECT t FROM Tiposalud t WHERE t.idtiposalud = :idtiposalud"),
    @NamedQuery(name = "Tiposalud.findByTiposalud", query = "SELECT t FROM Tiposalud t WHERE t.tiposalud = :tiposalud")})
public class Tiposalud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "idtiposalud")
    private String idtiposalud;
    @Size(max = 2147483647)
    @Column(name = "tiposalud")
    private String tiposalud;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtiposalud")
    private List<Salud> saludList;

    public Tiposalud() {
    }

    public Tiposalud(String idtiposalud) {
        this.idtiposalud = idtiposalud;
    }

    public String getIdtiposalud() {
        return idtiposalud;
    }

    public void setIdtiposalud(String idtiposalud) {
        this.idtiposalud = idtiposalud;
    }

    public String getTiposalud() {
        return tiposalud;
    }

    public void setTiposalud(String tiposalud) {
        this.tiposalud = tiposalud;
    }

    @XmlTransient
    @JsonIgnore
    public List<Salud> getSaludList() {
        return saludList;
    }

    public void setSaludList(List<Salud> saludList) {
        this.saludList = saludList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposalud != null ? idtiposalud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposalud)) {
            return false;
        }
        Tiposalud other = (Tiposalud) object;
        if ((this.idtiposalud == null && other.idtiposalud != null) || (this.idtiposalud != null && !this.idtiposalud.equals(other.idtiposalud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Tiposalud[ idtiposalud=" + idtiposalud + " ]";
    }
    
}
