/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resphere.server.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "v_rptafecmediosvida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mediovidav.findAll", query = "SELECT m FROM Mediovidav m"),
    @NamedQuery(name = "Mediovidav.findByIdevento", query = "SELECT m FROM Mediovidav m WHERE m.idevento = :idevento"),
    @NamedQuery(name = "Mediovidav.findByIdtipomediovida", query = "SELECT m FROM Mediovidav m WHERE m.idtipomediovida = :idtipomediovida"),
    @NamedQuery(name = "Mediovidav.findByIdtipodano", query = "SELECT m FROM Mediovidav m WHERE m.idtipodano = :idtipodano"),
    @NamedQuery(name = "Mediovidav.findByTipomediovida", query = "SELECT m FROM Mediovidav m WHERE m.tipomediovida = :tipomediovida"),
    @NamedQuery(name = "Mediovidav.findByHombres", query = "SELECT m FROM Mediovidav m WHERE m.hombres = :hombres"),
    @NamedQuery(name = "Mediovidav.findByMujeres", query = "SELECT m FROM Mediovidav m WHERE m.mujeres = :mujeres"),
    @NamedQuery(name = "Mediovidav.findByTipodano", query = "SELECT m FROM Mediovidav m WHERE m.tipodano = :tipodano"),
    @NamedQuery(name = "Mediovidav.findBySiaplica", query = "SELECT m FROM Mediovidav m WHERE m.siaplica = :siaplica"),
    @NamedQuery(name = "Mediovidav.findByObservacion", query = "SELECT m FROM Mediovidav m WHERE m.observacion = :observacion")})
public class Mediovidav implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtipomediovida")
    private String idtipomediovida;
    @Size(max = 2147483647)
    @Column(name = "idtipodano")
    private String idtipodano;
    @Size(max = 2147483647)
    @Column(name = "tipomediovida")
    private String tipomediovida;
    @Size(max = 2147483647)
    @Column(name = "hombres")
    private String hombres;
    @Size(max = 2147483647)
    @Column(name = "mujeres")
    private String mujeres;
    @Size(max = 2147483647)
    @Column(name = "tipodano")
    private String tipodano;
    @Size(max = 2147483647)
    @Column(name = "siaplica")
    private String siaplica;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;

    public Mediovidav() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdtipomediovida() {
        return idtipomediovida;
    }

    public void setIdtipomediovida(String idtipomediovida) {
        this.idtipomediovida = idtipomediovida;
    }

    public String getIdtipodano() {
        return idtipodano;
    }

    public void setIdtipodano(String idtipodano) {
        this.idtipodano = idtipodano;
    }

    public String getTipomediovida() {
        return tipomediovida;
    }

    public void setTipomediovida(String tipomediovida) {
        this.tipomediovida = tipomediovida;
    }

    public String getHombres() {
        return hombres;
    }

    public void setHombres(String hombres) {
        this.hombres = hombres;
    }

    public String getMujeres() {
        return mujeres;
    }

    public void setMujeres(String mujeres) {
        this.mujeres = mujeres;
    }

    public String getTipodano() {
        return tipodano;
    }

    public void setTipodano(String tipodano) {
        this.tipodano = tipodano;
    }

    public String getSiaplica() {
        return siaplica;
    }

    public void setSiaplica(String siaplica) {
        this.siaplica = siaplica;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
}
