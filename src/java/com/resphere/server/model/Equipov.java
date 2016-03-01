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
@Table(name = "v_rptequipoev")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipov.findAll", query = "SELECT e FROM Equipov e"),
    @NamedQuery(name = "Equipov.findByIdevento", query = "SELECT e FROM Equipov e WHERE e.idevento = :idevento"),
    @NamedQuery(name = "Equipov.findByIdtipopoblacion", query = "SELECT e FROM Equipov e WHERE e.idtipopoblacion = :idtipopoblacion"),
    @NamedQuery(name = "Equipov.findByIdroltecnico", query = "SELECT e FROM Equipov e WHERE e.idroltecnico = :idroltecnico"),
    @NamedQuery(name = "Equipov.findByNombre", query = "SELECT e FROM Equipov e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Equipov.findByOrganizacion", query = "SELECT e FROM Equipov e WHERE e.organizacion = :organizacion"),
    @NamedQuery(name = "Equipov.findByTelefono", query = "SELECT e FROM Equipov e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Equipov.findByEmail", query = "SELECT e FROM Equipov e WHERE e.email = :email"),
    @NamedQuery(name = "Equipov.findByRoltecnico", query = "SELECT e FROM Equipov e WHERE e.roltecnico = :roltecnico"),
    @NamedQuery(name = "Equipov.findByTipopoblacion", query = "SELECT e FROM Equipov e WHERE e.tipopoblacion = :tipopoblacion")})
public class Equipov implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtipopoblacion")
    private String idtipopoblacion;
    @Size(max = 2147483647)
    @Column(name = "idroltecnico")
    private String idroltecnico;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "organizacion")
    private String organizacion;
    @Size(max = 2147483647)
    @Column(name = "telefono")
    private String telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "email")
    private String email;
    @Size(max = 2147483647)
    @Column(name = "roltecnico")
    private String roltecnico;
    @Size(max = 2147483647)
    @Column(name = "tipopoblacion")
    private String tipopoblacion;

    public Equipov() {
    }

    public String getIdevento() {
        return idevento;
    }

    public void setIdevento(String idevento) {
        this.idevento = idevento;
    }

    public String getIdtipopoblacion() {
        return idtipopoblacion;
    }

    public void setIdtipopoblacion(String idtipopoblacion) {
        this.idtipopoblacion = idtipopoblacion;
    }

    public String getIdroltecnico() {
        return idroltecnico;
    }

    public void setIdroltecnico(String idroltecnico) {
        this.idroltecnico = idroltecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoltecnico() {
        return roltecnico;
    }

    public void setRoltecnico(String roltecnico) {
        this.roltecnico = roltecnico;
    }

    public String getTipopoblacion() {
        return tipopoblacion;
    }

    public void setTipopoblacion(String tipopoblacion) {
        this.tipopoblacion = tipopoblacion;
    }
    
}
