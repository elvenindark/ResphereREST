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
@Table(name = "eventosv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eventosv.findAll", query = "SELECT e FROM Eventosv e"),
    @NamedQuery(name = "Eventosv.findByIdevento", query = "SELECT e FROM Eventosv e WHERE e.idevento = :idevento"),
    @NamedQuery(name = "Eventosv.findAllMonitoreo", query = "SELECT e FROM Eventosv e WHERE e.idevento in ( "
            + "SELECT r.idevento FROM Respuestahumanitaria r WHERE r.idrespuesta in ("
            + "SELECT m.idrespuesta from Monitoreorespuesta m))"),
    @NamedQuery(name = "Eventosv.findByLongitud", query = "SELECT e FROM Eventosv e WHERE e.longitud = :longitud"),
    @NamedQuery(name = "Eventosv.findByLatitud", query = "SELECT e FROM Eventosv e WHERE e.latitud = :latitud"),
    @NamedQuery(name = "Eventosv.findByProvincia", query = "SELECT e FROM Eventosv e WHERE e.provincia = :provincia"),
    @NamedQuery(name = "Eventosv.findByCanton", query = "SELECT e FROM Eventosv e WHERE e.canton = :canton"),
    @NamedQuery(name = "Eventosv.findByParroquia", query = "SELECT e FROM Eventosv e WHERE e.parroquia = :parroquia"),
    @NamedQuery(name = "Eventosv.findByDescripcion", query = "SELECT e FROM Eventosv e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Eventosv.findByEvento", query = "SELECT e FROM Eventosv e WHERE e.evento = :evento")})
public class Eventosv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    @Column(name = "idevento")
    @Id
    private String idevento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "longitud")
    private Double longitud;
    @Column(name = "latitud")
    private Double latitud;
    @Size(max = 2147483647)
    @Column(name = "provincia")
    private String provincia;
    @Size(max = 2147483647)
    @Column(name = "canton")
    private String canton;
    @Size(max = 2147483647)
    @Column(name = "parroquia")
    private String parroquia;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2147483647)
    @Column(name = "evento")
    private String evento;

    public Eventosv() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
    
}
