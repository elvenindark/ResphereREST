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
@Table(name = "v_rptafectacionsalud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Saludv.findAll", query = "SELECT s FROM Saludv s"),
    @NamedQuery(name = "Saludv.findByIdevento", query = "SELECT s FROM Saludv s WHERE s.idevento = :idevento"),
    @NamedQuery(name = "Saludv.findByIdtiposalud", query = "SELECT s FROM Saludv s WHERE s.idtiposalud = :idtiposalud"),
    @NamedQuery(name = "Saludv.findByTiposalud", query = "SELECT s FROM Saludv s WHERE s.tiposalud = :tiposalud"),
    @NamedQuery(name = "Saludv.findBySifunciona", query = "SELECT s FROM Saludv s WHERE s.sifunciona = :sifunciona"),
    @NamedQuery(name = "Saludv.findByObservaciones", query = "SELECT s FROM Saludv s WHERE s.observaciones = :observaciones"),
    @NamedQuery(name = "Saludv.findByPorcentaje", query = "SELECT s FROM Saludv s WHERE s.porcentaje = :porcentaje")})
public class Saludv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtiposalud")
    private String idtiposalud;
    @Size(max = 2147483647)
    @Column(name = "tiposalud")
    private String tiposalud;
    @Size(max = 2147483647)
    @Column(name = "sifunciona")
    private String sifunciona;
    @Size(max = 2147483647)
    @Column(name = "observaciones")
    private String observaciones;
    @Size(max = 2147483647)
    @Column(name = "porcentaje")
    private String porcentaje;

    public Saludv() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
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

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
