/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ImUbi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImUbi.findAll", query = "SELECT i FROM ImUbi i")
    , @NamedQuery(name = "ImUbi.findByImUbiCod", query = "SELECT i FROM ImUbi i WHERE i.imUbiCod = :imUbiCod")
    , @NamedQuery(name = "ImUbi.findByImUbiDes", query = "SELECT i FROM ImUbi i WHERE i.imUbiDes = :imUbiDes")
    , @NamedQuery(name = "ImUbi.findByImUbiAsg", query = "SELECT i FROM ImUbi i WHERE i.imUbiAsg = :imUbiAsg")
    , @NamedQuery(name = "ImUbi.findByImUbiVMax", query = "SELECT i FROM ImUbi i WHERE i.imUbiVMax = :imUbiVMax")
    , @NamedQuery(name = "ImUbi.findByImUbiVMin", query = "SELECT i FROM ImUbi i WHERE i.imUbiVMin = :imUbiVMin")
    , @NamedQuery(name = "ImUbi.findByImUbiNCon", query = "SELECT i FROM ImUbi i WHERE i.imUbiNCon = :imUbiNCon")
    , @NamedQuery(name = "ImUbi.findByImUbiUsr", query = "SELECT i FROM ImUbi i WHERE i.imUbiUsr = :imUbiUsr")
    , @NamedQuery(name = "ImUbi.findByImUbiFHR", query = "SELECT i FROM ImUbi i WHERE i.imUbiFHR = :imUbiFHR")})
public class ImUbi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ImUbiCod")
    private String imUbiCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImUbiDes")
    private String imUbiDes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImUbiAsg")
    private Character imUbiAsg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ImUbiVMax")
    private BigDecimal imUbiVMax;
    @Column(name = "ImUbiVMin")
    private BigDecimal imUbiVMin;
    @Column(name = "ImUbiNCon")
    private Short imUbiNCon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImUbiUsr")
    private String imUbiUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImUbiFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imUbiFHR;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imUbiCod")
    private Collection<IdInv> idInvCollection;
    @JoinColumn(name = "ImBodCod", referencedColumnName = "ImBodCod")
    @ManyToOne(optional = false)
    private ImBod imBodCod;

    public ImUbi() {
    }

    public ImUbi(String imUbiCod) {
        this.imUbiCod = imUbiCod;
    }

    public ImUbi(String imUbiCod, String imUbiDes, Character imUbiAsg, String imUbiUsr, Date imUbiFHR) {
        this.imUbiCod = imUbiCod;
        this.imUbiDes = imUbiDes;
        this.imUbiAsg = imUbiAsg;
        this.imUbiUsr = imUbiUsr;
        this.imUbiFHR = imUbiFHR;
    }

    public String getImUbiCod() {
        return imUbiCod;
    }

    public void setImUbiCod(String imUbiCod) {
        this.imUbiCod = imUbiCod;
    }

    public String getImUbiDes() {
        return imUbiDes;
    }

    public void setImUbiDes(String imUbiDes) {
        this.imUbiDes = imUbiDes;
    }

    public Character getImUbiAsg() {
        return imUbiAsg;
    }

    public void setImUbiAsg(Character imUbiAsg) {
        this.imUbiAsg = imUbiAsg;
    }

    public BigDecimal getImUbiVMax() {
        return imUbiVMax;
    }

    public void setImUbiVMax(BigDecimal imUbiVMax) {
        this.imUbiVMax = imUbiVMax;
    }

    public BigDecimal getImUbiVMin() {
        return imUbiVMin;
    }

    public void setImUbiVMin(BigDecimal imUbiVMin) {
        this.imUbiVMin = imUbiVMin;
    }

    public Short getImUbiNCon() {
        return imUbiNCon;
    }

    public void setImUbiNCon(Short imUbiNCon) {
        this.imUbiNCon = imUbiNCon;
    }

    public String getImUbiUsr() {
        return imUbiUsr;
    }

    public void setImUbiUsr(String imUbiUsr) {
        this.imUbiUsr = imUbiUsr;
    }

    public Date getImUbiFHR() {
        return imUbiFHR;
    }

    public void setImUbiFHR(Date imUbiFHR) {
        this.imUbiFHR = imUbiFHR;
    }

    @XmlTransient
    public Collection<IdInv> getIdInvCollection() {
        return idInvCollection;
    }

    public void setIdInvCollection(Collection<IdInv> idInvCollection) {
        this.idInvCollection = idInvCollection;
    }

    public ImBod getImBodCod() {
        return imBodCod;
    }

    public void setImBodCod(ImBod imBodCod) {
        this.imBodCod = imBodCod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imUbiCod != null ? imUbiCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImUbi)) {
            return false;
        }
        ImUbi other = (ImUbi) object;
        if ((this.imUbiCod == null && other.imUbiCod != null) || (this.imUbiCod != null && !this.imUbiCod.equals(other.imUbiCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ImUbi[ imUbiCod=" + imUbiCod + " ]";
    }
    
}
