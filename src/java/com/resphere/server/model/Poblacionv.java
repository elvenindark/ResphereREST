/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resphere.server.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "rptpoblacionv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poblacionv.findAll", query = "SELECT p FROM Poblacionv p"),
    @NamedQuery(name = "Poblacionv.findByIdevento", query = "SELECT p FROM Poblacionv p WHERE p.idevento = :idevento"),
    @NamedQuery(name = "Poblacionv.findByIdtipoafectacion", query = "SELECT p FROM Poblacionv p WHERE p.idtipoafectacion = :idtipoafectacion"),
    @NamedQuery(name = "Poblacionv.findByTipoafectacion", query = "SELECT p FROM Poblacionv p WHERE p.tipoafectacion = :tipoafectacion"),
    @NamedQuery(name = "Poblacionv.findByHombres", query = "SELECT p FROM Poblacionv p WHERE p.hombres = :hombres"),
    @NamedQuery(name = "Poblacionv.findByMujeres", query = "SELECT p FROM Poblacionv p WHERE p.mujeres = :mujeres"),
    @NamedQuery(name = "Poblacionv.findByNinos", query = "SELECT p FROM Poblacionv p WHERE p.ninos = :ninos"),
    @NamedQuery(name = "Poblacionv.findByNinas", query = "SELECT p FROM Poblacionv p WHERE p.ninas = :ninas"),
    @NamedQuery(name = "Poblacionv.findByPersonas", query = "SELECT p FROM Poblacionv p WHERE p.personas = :personas"),
    @NamedQuery(name = "Poblacionv.findByHogares", query = "SELECT p FROM Poblacionv p WHERE p.hogares = :hogares")})
public class Poblacionv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtipoafectacion")
    private String idtipoafectacion;
    @Size(max = 2147483647)
    @Column(name = "tipoafectacion")
    private String tipoafectacion;
    @Column(name = "hombres")
    private BigInteger hombres;
    @Column(name = "mujeres")
    private BigInteger mujeres;
    @Column(name = "ninos")
    private BigInteger ninos;
    @Column(name = "ninas")
    private BigInteger ninas;
    @Column(name = "personas")
    private BigInteger personas;
    @Column(name = "hogares")
    private BigInteger hogares;

    public Poblacionv() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdtipoafectacion() {
        return idtipoafectacion;
    }

    public void setIdtipoafectacion(String idtipoafectacion) {
        this.idtipoafectacion = idtipoafectacion;
    }

    public String getTipoafectacion() {
        return tipoafectacion;
    }

    public void setTipoafectacion(String tipoafectacion) {
        this.tipoafectacion = tipoafectacion;
    }

    public BigInteger getHombres() {
        return hombres;
    }

    public void setHombres(BigInteger hombres) {
        this.hombres = hombres;
    }

    public BigInteger getMujeres() {
        return mujeres;
    }

    public void setMujeres(BigInteger mujeres) {
        this.mujeres = mujeres;
    }

    public BigInteger getNinos() {
        return ninos;
    }

    public void setNinos(BigInteger ninos) {
        this.ninos = ninos;
    }

    public BigInteger getNinas() {
        return ninas;
    }

    public void setNinas(BigInteger ninas) {
        this.ninas = ninas;
    }

    public BigInteger getPersonas() {
        return personas;
    }

    public void setPersonas(BigInteger personas) {
        this.personas = personas;
    }

    public BigInteger getHogares() {
        return hogares;
    }

    public void setHogares(BigInteger hogares) {
        this.hogares = hogares;
    }
    
}
