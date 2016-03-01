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
@Table(name = "v_rptaccesibilidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accesov.findAll", query = "SELECT a FROM Accesov a"),
    @NamedQuery(name = "Accesov.findByIdevento", query = "SELECT a FROM Accesov a WHERE a.idevento = :idevento"),
    @NamedQuery(name = "Accesov.findByIdtipoacceso", query = "SELECT a FROM Accesov a WHERE a.idtipoacceso = :idtipoacceso"),
    @NamedQuery(name = "Accesov.findByTipoacceso", query = "SELECT a FROM Accesov a WHERE a.tipoacceso = :tipoacceso"),
    @NamedQuery(name = "Accesov.findByTransporte", query = "SELECT a FROM Accesov a WHERE a.transporte = :transporte")})
public class Accesov implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtipoacceso")
    private String idtipoacceso;
    @Size(max = 2147483647)
    @Column(name = "tipoacceso")
    private String tipoacceso;
    @Size(max = 2147483647)
    @Column(name = "transporte")
    private String transporte;

    public Accesov() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdtipoacceso() {
        return idtipoacceso;
    }

    public void setIdtipoacceso(String idtipoacceso) {
        this.idtipoacceso = idtipoacceso;
    }

    public String getTipoacceso() {
        return tipoacceso;
    }

    public void setTipoacceso(String tipoacceso) {
        this.tipoacceso = tipoacceso;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
    
}
