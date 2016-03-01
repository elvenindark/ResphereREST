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
@Table(name = "v_rptdanioserviciosinfra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Serviciov.findAll", query = "SELECT s FROM Serviciov s"),
    @NamedQuery(name = "Serviciov.findByIdevento", query = "SELECT s FROM Serviciov s WHERE s.idevento = :idevento"),
    @NamedQuery(name = "Serviciov.findByIdtiposervicio", query = "SELECT s FROM Serviciov s WHERE s.idtiposervicio = :idtiposervicio"),
    @NamedQuery(name = "Serviciov.findByIdtipodano", query = "SELECT s FROM Serviciov s WHERE s.idtipodano = :idtipodano"),
    @NamedQuery(name = "Serviciov.findByTiposervicio", query = "SELECT s FROM Serviciov s WHERE s.tiposervicio = :tiposervicio"),
    @NamedQuery(name = "Serviciov.findBySifunciona", query = "SELECT s FROM Serviciov s WHERE s.sifunciona = :sifunciona"),
    @NamedQuery(name = "Serviciov.findByTipodano", query = "SELECT s FROM Serviciov s WHERE s.tipodano = :tipodano"),
    @NamedQuery(name = "Serviciov.findBySiaplica", query = "SELECT s FROM Serviciov s WHERE s.siaplica = :siaplica"),
    @NamedQuery(name = "Serviciov.findByObservacion", query = "SELECT s FROM Serviciov s WHERE s.observacion = :observacion")})
public class Serviciov implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtiposervicio")
    private String idtiposervicio;
    @Size(max = 2147483647)
    @Column(name = "idtipodano")
    private String idtipodano;
    @Size(max = 2147483647)
    @Column(name = "tiposervicio")
    private String tiposervicio;
    @Size(max = 2147483647)
    @Column(name = "sifunciona")
    private String sifunciona;
    @Size(max = 2147483647)
    @Column(name = "tipodano")
    private String tipodano;
    @Size(max = 2147483647)
    @Column(name = "siaplica")
    private String siaplica;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;

    public Serviciov() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdtiposervicio() {
        return idtiposervicio;
    }

    public void setIdtiposervicio(String idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
    }

    public String getIdtipodano() {
        return idtipodano;
    }

    public void setIdtipodano(String idtipodano) {
        this.idtipodano = idtipodano;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public String getSifunciona() {
        return sifunciona;
    }

    public void setSifunciona(String sifunciona) {
        this.sifunciona = sifunciona;
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
