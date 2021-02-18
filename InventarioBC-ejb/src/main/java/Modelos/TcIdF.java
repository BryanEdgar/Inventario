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
@Table(name = "TcIdF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TcIdF.findAll", query = "SELECT t FROM TcIdF t")
    , @NamedQuery(name = "TcIdF.findByTcIdFCod", query = "SELECT t FROM TcIdF t WHERE t.tcIdFCod = :tcIdFCod")
    , @NamedQuery(name = "TcIdF.findByTcIdFDes", query = "SELECT t FROM TcIdF t WHERE t.tcIdFDes = :tcIdFDes")
    , @NamedQuery(name = "TcIdF.findByTcIdFSig", query = "SELECT t FROM TcIdF t WHERE t.tcIdFSig = :tcIdFSig")
    , @NamedQuery(name = "TcIdF.findByTcIdFDig", query = "SELECT t FROM TcIdF t WHERE t.tcIdFDig = :tcIdFDig")
    , @NamedQuery(name = "TcIdF.findByTcIdFTip", query = "SELECT t FROM TcIdF t WHERE t.tcIdFTip = :tcIdFTip")
    , @NamedQuery(name = "TcIdF.findByTcIdFEst", query = "SELECT t FROM TcIdF t WHERE t.tcIdFEst = :tcIdFEst")
    , @NamedQuery(name = "TcIdF.findByTcIdFUsr", query = "SELECT t FROM TcIdF t WHERE t.tcIdFUsr = :tcIdFUsr")
    , @NamedQuery(name = "TcIdF.findByTcIdFFHR", query = "SELECT t FROM TcIdF t WHERE t.tcIdFFHR = :tcIdFFHR")
    , @NamedQuery(name = "TcIdF.findByTcIdFNumA", query = "SELECT t FROM TcIdF t WHERE t.tcIdFNumA = :tcIdFNumA")
    , @NamedQuery(name = "TcIdF.findByTcIdFNumI", query = "SELECT t FROM TcIdF t WHERE t.tcIdFNumI = :tcIdFNumI")})
public class TcIdF implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TcIdFCod")
    private String tcIdFCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "TcIdFDes")
    private String tcIdFDes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "TcIdFSig")
    private String tcIdFSig;
    @Column(name = "TcIdFDig")
    private Character tcIdFDig;
    @Column(name = "TcIdFTip")
    private Character tcIdFTip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TcIdFEst")
    private Character tcIdFEst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TcIdFUsr")
    private String tcIdFUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TcIdFFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tcIdFFHR;
    @Column(name = "TcIdFNumA")
    private Character tcIdFNumA;
    @Column(name = "TcIdFNumI")
    private Integer tcIdFNumI;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tcIdFCod")
    private Collection<AmCom> amComCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tcIdFCod")
    private Collection<AmScN> amScNCollection;

    public TcIdF() {
    }

    public TcIdF(String tcIdFCod) {
        this.tcIdFCod = tcIdFCod;
    }

    public TcIdF(String tcIdFCod, String tcIdFDes, String tcIdFSig, Character tcIdFEst, String tcIdFUsr, Date tcIdFFHR) {
        this.tcIdFCod = tcIdFCod;
        this.tcIdFDes = tcIdFDes;
        this.tcIdFSig = tcIdFSig;
        this.tcIdFEst = tcIdFEst;
        this.tcIdFUsr = tcIdFUsr;
        this.tcIdFFHR = tcIdFFHR;
    }

    public String getTcIdFCod() {
        return tcIdFCod;
    }

    public void setTcIdFCod(String tcIdFCod) {
        this.tcIdFCod = tcIdFCod;
    }

    public String getTcIdFDes() {
        return tcIdFDes;
    }

    public void setTcIdFDes(String tcIdFDes) {
        this.tcIdFDes = tcIdFDes;
    }

    public String getTcIdFSig() {
        return tcIdFSig;
    }

    public void setTcIdFSig(String tcIdFSig) {
        this.tcIdFSig = tcIdFSig;
    }

    public Character getTcIdFDig() {
        return tcIdFDig;
    }

    public void setTcIdFDig(Character tcIdFDig) {
        this.tcIdFDig = tcIdFDig;
    }

    public Character getTcIdFTip() {
        return tcIdFTip;
    }

    public void setTcIdFTip(Character tcIdFTip) {
        this.tcIdFTip = tcIdFTip;
    }

    public Character getTcIdFEst() {
        return tcIdFEst;
    }

    public void setTcIdFEst(Character tcIdFEst) {
        this.tcIdFEst = tcIdFEst;
    }

    public String getTcIdFUsr() {
        return tcIdFUsr;
    }

    public void setTcIdFUsr(String tcIdFUsr) {
        this.tcIdFUsr = tcIdFUsr;
    }

    public Date getTcIdFFHR() {
        return tcIdFFHR;
    }

    public void setTcIdFFHR(Date tcIdFFHR) {
        this.tcIdFFHR = tcIdFFHR;
    }

    public Character getTcIdFNumA() {
        return tcIdFNumA;
    }

    public void setTcIdFNumA(Character tcIdFNumA) {
        this.tcIdFNumA = tcIdFNumA;
    }

    public Integer getTcIdFNumI() {
        return tcIdFNumI;
    }

    public void setTcIdFNumI(Integer tcIdFNumI) {
        this.tcIdFNumI = tcIdFNumI;
    }

    @XmlTransient
    public Collection<AmCom> getAmComCollection() {
        return amComCollection;
    }

    public void setAmComCollection(Collection<AmCom> amComCollection) {
        this.amComCollection = amComCollection;
    }

    @XmlTransient
    public Collection<AmScN> getAmScNCollection() {
        return amScNCollection;
    }

    public void setAmScNCollection(Collection<AmScN> amScNCollection) {
        this.amScNCollection = amScNCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tcIdFCod != null ? tcIdFCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TcIdF)) {
            return false;
        }
        TcIdF other = (TcIdF) object;
        if ((this.tcIdFCod == null && other.tcIdFCod != null) || (this.tcIdFCod != null && !this.tcIdFCod.equals(other.tcIdFCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.TcIdF[ tcIdFCod=" + tcIdFCod + " ]";
    }
    
}
