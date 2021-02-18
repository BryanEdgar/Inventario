/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "ImUnd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImUnd.findAll", query = "SELECT i FROM ImUnd i")
    , @NamedQuery(name = "ImUnd.findByImUndCod", query = "SELECT i FROM ImUnd i WHERE i.imUndCod = :imUndCod")
    , @NamedQuery(name = "ImUnd.findByImUndDes", query = "SELECT i FROM ImUnd i WHERE i.imUndDes = :imUndDes")
    , @NamedQuery(name = "ImUnd.findByImUndEst", query = "SELECT i FROM ImUnd i WHERE i.imUndEst = :imUndEst")
    , @NamedQuery(name = "ImUnd.findByImUndUsr", query = "SELECT i FROM ImUnd i WHERE i.imUndUsr = :imUndUsr")
    , @NamedQuery(name = "ImUnd.findByImUndFHR", query = "SELECT i FROM ImUnd i WHERE i.imUndFHR = :imUndFHR")
    , @NamedQuery(name = "ImUnd.findByImUndFac", query = "SELECT i FROM ImUnd i WHERE i.imUndFac = :imUndFac")
    , @NamedQuery(name = "ImUnd.findByImUndOpr", query = "SELECT i FROM ImUnd i WHERE i.imUndOpr = :imUndOpr")
    , @NamedQuery(name = "ImUnd.findByImUndUnd", query = "SELECT i FROM ImUnd i WHERE i.imUndUnd = :imUndUnd")
    , @NamedQuery(name = "ImUnd.findByImUndAux", query = "SELECT i FROM ImUnd i WHERE i.imUndAux = :imUndAux")})
public class ImUnd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ImUndCod")
    private String imUndCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImUndDes")
    private String imUndDes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImUndEst")
    private Character imUndEst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImUndUsr")
    private String imUndUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImUndFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imUndFHR;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImUndFac")
    private short imUndFac;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImUndOpr")
    private Character imUndOpr;
    @Column(name = "ImUndUnd")
    private Character imUndUnd;
    @Size(max = 5)
    @Column(name = "ImUndAux")
    private String imUndAux;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imUndCod")
    private Collection<IdInv> idInvCollection;

    public ImUnd() {
    }

    public ImUnd(String imUndCod) {
        this.imUndCod = imUndCod;
    }

    public ImUnd(String imUndCod, String imUndDes, Character imUndEst, String imUndUsr, Date imUndFHR, short imUndFac, Character imUndOpr) {
        this.imUndCod = imUndCod;
        this.imUndDes = imUndDes;
        this.imUndEst = imUndEst;
        this.imUndUsr = imUndUsr;
        this.imUndFHR = imUndFHR;
        this.imUndFac = imUndFac;
        this.imUndOpr = imUndOpr;
    }

    public String getImUndCod() {
        return imUndCod;
    }

    public void setImUndCod(String imUndCod) {
        this.imUndCod = imUndCod;
    }

    public String getImUndDes() {
        return imUndDes;
    }

    public void setImUndDes(String imUndDes) {
        this.imUndDes = imUndDes;
    }

    public Character getImUndEst() {
        return imUndEst;
    }

    public void setImUndEst(Character imUndEst) {
        this.imUndEst = imUndEst;
    }

    public String getImUndUsr() {
        return imUndUsr;
    }

    public void setImUndUsr(String imUndUsr) {
        this.imUndUsr = imUndUsr;
    }

    public Date getImUndFHR() {
        return imUndFHR;
    }

    public void setImUndFHR(Date imUndFHR) {
        this.imUndFHR = imUndFHR;
    }

    public short getImUndFac() {
        return imUndFac;
    }

    public void setImUndFac(short imUndFac) {
        this.imUndFac = imUndFac;
    }

    public Character getImUndOpr() {
        return imUndOpr;
    }

    public void setImUndOpr(Character imUndOpr) {
        this.imUndOpr = imUndOpr;
    }

    public Character getImUndUnd() {
        return imUndUnd;
    }

    public void setImUndUnd(Character imUndUnd) {
        this.imUndUnd = imUndUnd;
    }

    public String getImUndAux() {
        return imUndAux;
    }

    public void setImUndAux(String imUndAux) {
        this.imUndAux = imUndAux;
    }

    @XmlTransient
    public Collection<IdInv> getIdInvCollection() {
        return idInvCollection;
    }

    public void setIdInvCollection(Collection<IdInv> idInvCollection) {
        this.idInvCollection = idInvCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imUndCod != null ? imUndCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImUnd)) {
            return false;
        }
        ImUnd other = (ImUnd) object;
        if ((this.imUndCod == null && other.imUndCod != null) || (this.imUndCod != null && !this.imUndCod.equals(other.imUndCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ImUnd[ imUndCod=" + imUndCod + " ]";
    }
    
}
