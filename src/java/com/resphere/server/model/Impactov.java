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
@Table(name = "v_rptimpacto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Impactov.findAll", query = "SELECT i FROM Impactov i"),
    @NamedQuery(name = "Impactov.findByIdevento", query = "SELECT i FROM Impactov i WHERE i.idevento = :idevento"),
    @NamedQuery(name = "Impactov.findByIdtipoimpacto", query = "SELECT i FROM Impactov i WHERE i.idtipoimpacto = :idtipoimpacto"),
    @NamedQuery(name = "Impactov.findByDescripcion", query = "SELECT i FROM Impactov i WHERE i.descripcion = :descripcion")})
public class Impactov implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtipoimpacto")
    private String idtipoimpacto;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;

    public Impactov() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdtipoimpacto() {
        return idtipoimpacto;
    }

    public void setIdtipoimpacto(String idtipoimpacto) {
        this.idtipoimpacto = idtipoimpacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
