/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.resphere.server.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "ubicacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ubicacion.findAll", query = "SELECT u FROM Ubicacion u"),
    @NamedQuery(name = "Ubicacion.findByIdubicacion", query = "SELECT u FROM Ubicacion u WHERE u.idubicacion = :idubicacion"),
    @NamedQuery(name = "Ubicacion.findByProvincia", query = "SELECT u FROM Ubicacion u WHERE u.provincia = :provincia"),
    @NamedQuery(name = "Ubicacion.findByCanton", query = "SELECT u FROM Ubicacion u WHERE u.canton = :canton"),
    @NamedQuery(name = "Ubicacion.findByParroquia", query = "SELECT u FROM Ubicacion u WHERE u.parroquia = :parroquia"),
    @NamedQuery(name = "Ubicacion.findByTipo", query = "SELECT u FROM Ubicacion u WHERE u.tipo = :tipo"),
    @NamedQuery(name = "Ubicacion.findBySector", query = "SELECT u FROM Ubicacion u WHERE u.sector = :sector"),
    @NamedQuery(name = "Ubicacion.findByDistancia", query = "SELECT u FROM Ubicacion u WHERE u.distancia = :distancia"),
    @NamedQuery(name = "Ubicacion.findByTiempo", query = "SELECT u FROM Ubicacion u WHERE u.tiempo = :tiempo"),
    @NamedQuery(name = "Ubicacion.findByReferencia", query = "SELECT u FROM Ubicacion u WHERE u.referencia = :referencia"),
    @NamedQuery(name = "Ubicacion.findByLongitud", query = "SELECT u FROM Ubicacion u WHERE u.longitud = :longitud"),
    @NamedQuery(name = "Ubicacion.findByLatitud", query = "SELECT u FROM Ubicacion u WHERE u.latitud = :latitud"),
    @NamedQuery(name = "Ubicacion.findByAltitud", query = "SELECT u FROM Ubicacion u WHERE u.altitud = :altitud"),
    @NamedQuery(name = "Ubicacion.findByIdEvento", query = "SELECT u FROM Ubicacion u WHERE u.idevento = :idevento")})
public class Ubicacion implements Serializable {
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idevento")
    private String idevento;    
    private static final long serialVersionUID = 1L;   
    @Column(name = "idubicacion")
    private String idubicacion;
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
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 2147483647)
    @Column(name = "sector")
    private String sector;
    @Column(name = "distancia")
    private BigInteger distancia;
    @Column(name = "tiempo")
    private BigInteger tiempo;
    @Size(max = 2147483647)
    @Column(name = "referencia")
    private String referencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "longitud")
    private Double longitud;
    @Column(name = "latitud")
    private Double latitud;
    @Column(name = "altitud")
    private Double altitud;
    @JoinColumn(name = "idevento", referencedColumnName = "idevento", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Evento evento;

    public Ubicacion() {
    }

    public Ubicacion(String idubicacion) {
        this.idubicacion = idubicacion;
    }

    public String getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(String idubicacion) {
        this.idubicacion = idubicacion;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public BigInteger getDistancia() {
        return distancia;
    }

    public void setDistancia(BigInteger distancia) {
        this.distancia = distancia;
    }

    public BigInteger getTiempo() {
        return tiempo;
    }

    public void setTiempo(BigInteger tiempo) {
        this.tiempo = tiempo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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

    public Double getAltitud() {
        return altitud;
    }

    public void setAltitud(Double altitud) {
        this.altitud = altitud;
    }

    @XmlTransient
    @JsonIgnore
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getIdevento() {
        return idevento;
    }
    
    public void setIdevento(String idevento){
        this.idevento = idevento;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idubicacion != null ? idubicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubicacion)) {
            return false;
        }
        Ubicacion other = (Ubicacion) object;
        if ((this.idubicacion == null && other.idubicacion != null) || (this.idubicacion != null && !this.idubicacion.equals(other.idubicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resphere.server.model.Ubicacion[ idubicacion=" + idubicacion + " ]";
    }
}
