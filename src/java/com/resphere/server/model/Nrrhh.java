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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "nrrhh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nrrhh.findAll", query = "SELECT n FROM Nrrhh n"),
    @NamedQuery(name = "Nrrhh.findByAplica", query = "SELECT n FROM Nrrhh n WHERE n.aplica = :aplica"),
    @NamedQuery(name = "Nrrhh.findByRequerimiento", query = "SELECT n FROM Nrrhh n WHERE n.requerimiento = :requerimiento"),
    @NamedQuery(name = "Nrrhh.findByIdevento", query = "SELECT n FROM Nrrhh n WHERE n.idevento = :idevento")})
public class Nrrhh implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "aplica")
    private String aplica;
    @Size(max = 2147483647)
    @Column(name = "requerimiento")
    private String requerimiento;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @JoinColumn(name = "idtiponrrhh", referencedColumnName = "idtiponrrhh")
    @ManyToOne
    private Tiponrrhh idtiponrrhh;
    @JoinColumn(name = "idevento", referencedColumnName = "idevento", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evento evento;

    public Nrrhh() {
    }

    public Nrrhh(String idevento) {
        this.idevento = idevento;
    }

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public Tiponrrhh getIdtiponrrhh() {
        return idtiponrrhh;
    }

    public void setIdtiponrrhh(Tiponrrhh idtiponrrhh) {
        this.idtiponrrhh = idtiponrrhh;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
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
        if (!(object instanceof Nrrhh)) {
            return false;
        }
        Nrrhh other = (Nrrhh) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Nrrhh[ idevento=" + idevento + " ]";
    }
    
}
