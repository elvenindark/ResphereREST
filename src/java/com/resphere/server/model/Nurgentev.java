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
@Table(name = "v_rptnurgente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nurgentev.findAll", query = "SELECT n FROM Nurgentev n"),
    @NamedQuery(name = "Nurgentev.findByIdevento", query = "SELECT n FROM Nurgentev n WHERE n.idevento = :idevento"),
    @NamedQuery(name = "Nurgentev.findByIdtipourgente", query = "SELECT n FROM Nurgentev n WHERE n.idtipourgente = :idtipourgente"),
    @NamedQuery(name = "Nurgentev.findByTiponurgente", query = "SELECT n FROM Nurgentev n WHERE n.tiponurgente = :tiponurgente"),
    @NamedQuery(name = "Nurgentev.findByNumero", query = "SELECT n FROM Nurgentev n WHERE n.numero = :numero"),
    @NamedQuery(name = "Nurgentev.findByEspecificacion", query = "SELECT n FROM Nurgentev n WHERE n.especificacion = :especificacion")})
public class Nurgentev implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtipourgente")
    private String idtipourgente;
    @Size(max = 2147483647)
    @Column(name = "tiponurgente")
    private String tiponurgente;
    @Size(max = 2147483647)
    @Column(name = "numero")
    private String numero;
    @Size(max = 2147483647)
    @Column(name = "especificacion")
    private String especificacion;

    public Nurgentev() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdtipourgente() {
        return idtipourgente;
    }

    public void setIdtipourgente(String idtipourgente) {
        this.idtipourgente = idtipourgente;
    }

    public String getTiponurgente() {
        return tiponurgente;
    }

    public void setTiponurgente(String tiponurgente) {
        this.tiponurgente = tiponurgente;
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
    
}
