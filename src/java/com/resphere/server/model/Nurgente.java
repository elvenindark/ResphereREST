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
@Table(name = "nurgente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nurgente.findAll", query = "SELECT n FROM Nurgente n"),
    @NamedQuery(name = "Nurgente.findByIdevento", query = "SELECT n FROM Nurgente n WHERE n.idevento = :idevento"),
    @NamedQuery(name = "Nurgente.findByNumero", query = "SELECT n FROM Nurgente n WHERE n.numero = :numero"),
    @NamedQuery(name = "Nurgente.findByEspecificacion", query = "SELECT n FROM Nurgente n WHERE n.especificacion = :especificacion")})
public class Nurgente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "numero")
    private String numero;
    @Size(max = 2147483647)
    @Column(name = "especificacion")
    private String especificacion;
    @JoinColumn(name = "idtipourgente", referencedColumnName = "idtipourgente")
    @ManyToOne
    private Tiponurgente idtipourgente;
    @JoinColumn(name = "idevento", referencedColumnName = "idevento", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evento evento;

    public Nurgente() {
    }

    public Nurgente(String idevento) {
        this.idevento = idevento;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public Tiponurgente getIdtipourgente() {
        return idtipourgente;
    }

    public void setIdtipourgente(Tiponurgente idtipourgente) {
        this.idtipourgente = idtipourgente;
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
        if (!(object instanceof Nurgente)) {
            return false;
        }
        Nurgente other = (Nurgente) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Nurgente[ idevento=" + idevento + " ]";
    }
    
}
