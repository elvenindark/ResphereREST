/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
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
@Table(name = "respuestav")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Respuestav.findAll", query = "SELECT r FROM Respuestav r"),
    @NamedQuery(name = "Respuestav.findByIdevento", query = "SELECT r FROM Respuestav r WHERE r.idevento = :idevento"),
    @NamedQuery(name = "Respuestav.findByEvento", query = "SELECT r FROM Respuestav r WHERE r.evento = :evento"),
    @NamedQuery(name = "Respuestav.findByFecha", query = "SELECT r FROM Respuestav r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "Respuestav.findByProvincia", query = "SELECT r FROM Respuestav r WHERE r.provincia = :provincia"),
    @NamedQuery(name = "Respuestav.findByCanton", query = "SELECT r FROM Respuestav r WHERE r.canton = :canton"),
    @NamedQuery(name = "Respuestav.findByParroquia", query = "SELECT r FROM Respuestav r WHERE r.parroquia = :parroquia")})
public class Respuestav implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "evento")
    private String evento;
    @Size(max = 2147483647)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 2147483647)
    @Column(name = "provincia")
    private String provincia;
    @Size(max = 2147483647)
    @Column(name = "canton")
    private String canton;
    @Size(max = 2147483647)
    @Column(name = "parroquia")
    private String parroquia;

    public Respuestav() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }
    
}
