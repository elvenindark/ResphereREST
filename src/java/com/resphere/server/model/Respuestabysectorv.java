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
@Table(name = "respuestabysectorv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Respuestabysectorv.findAll", query = "SELECT r FROM Respuestabysectorv r"),
    @NamedQuery(name = "Respuestabysectorv.findByIdrespuesta", query = "SELECT r FROM Respuestabysectorv r WHERE r.idrespuesta = :idrespuesta"),
    @NamedQuery(name = "Respuestabysectorv.findByIdevento", query = "SELECT r FROM Respuestabysectorv r WHERE r.idevento = :idevento"),
    @NamedQuery(name = "Respuestabysectorv.findByIds", query = "SELECT r FROM Respuestabysectorv r WHERE r.idevento = :idevento and r.idsectorhumanitario =:idsectorhumanitario"),
    @NamedQuery(name = "Respuestabysectorv.findByIdindicadorclave", query = "SELECT r FROM Respuestabysectorv r WHERE r.idindicadorclave = :idindicadorclave"),
    @NamedQuery(name = "Respuestabysectorv.findByObservacion", query = "SELECT r FROM Respuestabysectorv r WHERE r.observacion = :observacion"),
    @NamedQuery(name = "Respuestabysectorv.findByIdsectorhumanitario", query = "SELECT r FROM Respuestabysectorv r WHERE r.idsectorhumanitario = :idsectorhumanitario"),
    @NamedQuery(name = "Respuestabysectorv.findByIndicadorclave", query = "SELECT r FROM Respuestabysectorv r WHERE r.indicadorclave = :indicadorclave")})
public class Respuestabysectorv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id    
    @Column(name = "idrespuesta")
    private Integer idrespuesta;
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 20)
    @Column(name = "idindicadorclave")
    private String idindicadorclave;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @Column(name = "idsectorhumanitario")
    private Integer idsectorhumanitario;
    @Size(max = 2147483647)
    @Column(name = "indicadorclave")
    private String indicadorclave;

    public Respuestabysectorv() {
    }

    public Integer getIdrespuesta() {
        return idrespuesta;
    }

    public void setIdrespuesta(Integer idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdindicadorclave() {
        return idindicadorclave;
    }

    public void setIdindicadorclave(String idindicadorclave) {
        this.idindicadorclave = idindicadorclave;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getIdsectorhumanitario() {
        return idsectorhumanitario;
    }

    public void setIdsectorhumanitario(Integer idsectorhumanitario) {
        this.idsectorhumanitario = idsectorhumanitario;
    }

    public String getIndicadorclave() {
        return indicadorclave;
    }

    public void setIndicadorclave(String indicadorclave) {
        this.indicadorclave = indicadorclave;
    }
    
}
