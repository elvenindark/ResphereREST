/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e"),
    @NamedQuery(name = "Equipo.findByNombre", query = "SELECT e FROM Equipo e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Equipo.findByOrganizacion", query = "SELECT e FROM Equipo e WHERE e.organizacion = :organizacion"),
    @NamedQuery(name = "Equipo.findByTelefono", query = "SELECT e FROM Equipo e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Equipo.findByEmail", query = "SELECT e FROM Equipo e WHERE e.email = :email"),
    @NamedQuery(name = "Equipo.findByIdevento", query = "SELECT e FROM Equipo e WHERE e.idevento = :idevento"),
    @NamedQuery(name = "Equipo.findByIdtipopoblacion", query = "SELECT e FROM Equipo e WHERE e.idtipopoblacion = :idtipopoblacion"),
    @NamedQuery(name = "Equipo.findByIdroltecnico", query = "SELECT e FROM Equipo e WHERE e.idroltecnico = :idroltecnico")})
public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;
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
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;
    @Size(max = 2147483647)
    @Column(name = "idtipopoblacion")
    private String idtipopoblacion;
    @Size(max = 2147483647)
    @Column(name = "idroltecnico")
    private String idroltecnico;
    

    public Equipo() {
    }

    public Equipo(String idevento) {
        this.idevento = idevento;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idevento != null ? idevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.idevento == null && other.idevento != null) || (this.idevento != null && !this.idevento.equals(other.idevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Equipo[ idevento=" + idevento + " ]";
    }
    
}
