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
@Table(name = "salud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salud.findAll", query = "SELECT s FROM Salud s"),
    @NamedQuery(name = "Salud.findBySifunciona", query = "SELECT s FROM Salud s WHERE s.sifunciona = :sifunciona"),
    @NamedQuery(name = "Salud.findByObservaciones", query = "SELECT s FROM Salud s WHERE s.observaciones = :observaciones"),
    @NamedQuery(name = "Salud.findByIdevento", query = "SELECT s FROM Salud s WHERE s.idevento = :idevento"),
    @NamedQuery(name = "Salud.findByPorcentaje", query = "SELECT s FROM Salud s WHERE s.porcentaje = :porcentaje")})
public class Salud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "sifunciona")
    private String sifunciona;
    @Size(max = 2147483647)
    @Column(name = "observaciones")
    private String observaciones;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "porcentaje")
    private String porcentaje;
    @JoinColumn(name = "idtiposalud", referencedColumnName = "idtiposalud")
    @ManyToOne(optional = false)
    private Tiposalud idtiposalud;
    @JoinColumn(name = "idevento", referencedColumnName = "idevento", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evento evento;

    public Salud() {
    }

    public Salud(String idevento) {
        this.idevento = idevento;
    }

    public String getSifunciona() {
        return sifunciona;
    }

    public void setSifunciona(String sifunciona) {
        this.sifunciona = sifunciona;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Tiposalud getIdtiposalud() {
        return idtiposalud;
    }

    public void setIdtiposalud(Tiposalud idtiposalud) {
        this.idtiposalud = idtiposalud;
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
        if (!(object instanceof Salud)) {
            return false;
        }
        Salud other = (Salud) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Salud[ idevento=" + idevento + " ]";
    }
    
}
