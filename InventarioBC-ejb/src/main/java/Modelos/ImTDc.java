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
@Table(name = "ImTDc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImTDc.findAll", query = "SELECT i FROM ImTDc i")
    , @NamedQuery(name = "ImTDc.findByImTDcCod", query = "SELECT i FROM ImTDc i WHERE i.imTDcCod = :imTDcCod")
    , @NamedQuery(name = "ImTDc.findByImTDcDes", query = "SELECT i FROM ImTDc i WHERE i.imTDcDes = :imTDcDes")
    , @NamedQuery(name = "ImTDc.findByImTDcDesC", query = "SELECT i FROM ImTDc i WHERE i.imTDcDesC = :imTDcDesC")
    , @NamedQuery(name = "ImTDc.findByImTDcSeq", query = "SELECT i FROM ImTDc i WHERE i.imTDcSeq = :imTDcSeq")
    , @NamedQuery(name = "ImTDc.findByImTDcEst", query = "SELECT i FROM ImTDc i WHERE i.imTDcEst = :imTDcEst")
    , @NamedQuery(name = "ImTDc.findByImTDcEfe", query = "SELECT i FROM ImTDc i WHERE i.imTDcEfe = :imTDcEfe")
    , @NamedQuery(name = "ImTDc.findByImTDcNat", query = "SELECT i FROM ImTDc i WHERE i.imTDcNat = :imTDcNat")
    , @NamedQuery(name = "ImTDc.findByImTDcCCsD", query = "SELECT i FROM ImTDc i WHERE i.imTDcCCsD = :imTDcCCsD")
    , @NamedQuery(name = "ImTDc.findByImTDcCCsC", query = "SELECT i FROM ImTDc i WHERE i.imTDcCCsC = :imTDcCCsC")
    , @NamedQuery(name = "ImTDc.findByImTDcCCsP", query = "SELECT i FROM ImTDc i WHERE i.imTDcCCsP = :imTDcCCsP")
    , @NamedQuery(name = "ImTDc.findByImTDcCtaD", query = "SELECT i FROM ImTDc i WHERE i.imTDcCtaD = :imTDcCtaD")
    , @NamedQuery(name = "ImTDc.findByImTDcCtaC", query = "SELECT i FROM ImTDc i WHERE i.imTDcCtaC = :imTDcCtaC")
    , @NamedQuery(name = "ImTDc.findByImTDcCtaP", query = "SELECT i FROM ImTDc i WHERE i.imTDcCtaP = :imTDcCtaP")
    , @NamedQuery(name = "ImTDc.findByImTDcEdi", query = "SELECT i FROM ImTDc i WHERE i.imTDcEdi = :imTDcEdi")
    , @NamedQuery(name = "ImTDc.findByImTDcTpA", query = "SELECT i FROM ImTDc i WHERE i.imTDcTpA = :imTDcTpA")
    , @NamedQuery(name = "ImTDc.findByImTDcCnt", query = "SELECT i FROM ImTDc i WHERE i.imTDcCnt = :imTDcCnt")
    , @NamedQuery(name = "ImTDc.findByImTDcAcuC", query = "SELECT i FROM ImTDc i WHERE i.imTDcAcuC = :imTDcAcuC")
    , @NamedQuery(name = "ImTDc.findByImTDcFlgN", query = "SELECT i FROM ImTDc i WHERE i.imTDcFlgN = :imTDcFlgN")
    , @NamedQuery(name = "ImTDc.findByImTDcCntT", query = "SELECT i FROM ImTDc i WHERE i.imTDcCntT = :imTDcCntT")
    , @NamedQuery(name = "ImTDc.findByImTDcFPrm", query = "SELECT i FROM ImTDc i WHERE i.imTDcFPrm = :imTDcFPrm")
    , @NamedQuery(name = "ImTDc.findByImTDcUsr", query = "SELECT i FROM ImTDc i WHERE i.imTDcUsr = :imTDcUsr")
    , @NamedQuery(name = "ImTDc.findByImTDcFHR", query = "SELECT i FROM ImTDc i WHERE i.imTDcFHR = :imTDcFHR")
    , @NamedQuery(name = "ImTDc.findByImTDcPrc", query = "SELECT i FROM ImTDc i WHERE i.imTDcPrc = :imTDcPrc")
    , @NamedQuery(name = "ImTDc.findByImTDcRef", query = "SELECT i FROM ImTDc i WHERE i.imTDcRef = :imTDcRef")
    , @NamedQuery(name = "ImTDc.findByImTDcCau", query = "SELECT i FROM ImTDc i WHERE i.imTDcCau = :imTDcCau")
    , @NamedQuery(name = "ImTDc.findByImTDcCst", query = "SELECT i FROM ImTDc i WHERE i.imTDcCst = :imTDcCst")
    , @NamedQuery(name = "ImTDc.findByImTDcMCnt", query = "SELECT i FROM ImTDc i WHERE i.imTDcMCnt = :imTDcMCnt")
    , @NamedQuery(name = "ImTDc.findByImTDcCstR", query = "SELECT i FROM ImTDc i WHERE i.imTDcCstR = :imTDcCstR")
    , @NamedQuery(name = "ImTDc.findByImTDcNimpK", query = "SELECT i FROM ImTDc i WHERE i.imTDcNimpK = :imTDcNimpK")
    , @NamedQuery(name = "ImTDc.findByImTDcCauCod", query = "SELECT i FROM ImTDc i WHERE i.imTDcCauCod = :imTDcCauCod")})
public class ImTDc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ImTDcCod")
    private String imTDcCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ImTDcDes")
    private String imTDcDes;
    @Size(max = 15)
    @Column(name = "ImTDcDesC")
    private String imTDcDesC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ImTDcSeq")
    private String imTDcSeq;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImTDcEst")
    private Character imTDcEst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ImTDcEfe")
    private String imTDcEfe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImTDcNat")
    private Character imTDcNat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImTDcCCsD")
    private String imTDcCCsD;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImTDcCCsC")
    private String imTDcCCsC;
    @Size(max = 20)
    @Column(name = "ImTDcCCsP")
    private String imTDcCCsP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImTDcCtaD")
    private String imTDcCtaD;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImTDcCtaC")
    private String imTDcCtaC;
    @Size(max = 20)
    @Column(name = "ImTDcCtaP")
    private String imTDcCtaP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImTDcEdi")
    private Character imTDcEdi;
    @Size(max = 3)
    @Column(name = "ImTDcTpA")
    private String imTDcTpA;
    @Column(name = "ImTDcCnt")
    private Character imTDcCnt;
    @Column(name = "ImTDcAcuC")
    private Character imTDcAcuC;
    @Column(name = "ImTDcFlgN")
    private Character imTDcFlgN;
    @Column(name = "ImTDcCntT")
    private Character imTDcCntT;
    @Column(name = "ImTDcFPrm")
    private Character imTDcFPrm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImTDcUsr")
    private String imTDcUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImTDcFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imTDcFHR;
    @Size(max = 2)
    @Column(name = "ImTDcPrc")
    private String imTDcPrc;
    @Column(name = "ImTDcRef")
    private Character imTDcRef;
    @Column(name = "ImTDcCau")
    private Character imTDcCau;
    @Column(name = "ImTDcCst")
    private Character imTDcCst;
    @Column(name = "ImTDcMCnt")
    private Character imTDcMCnt;
    @Column(name = "ImTDcCstR")
    private Character imTDcCstR;
    @Column(name = "ImTDcNimpK")
    private Character imTDcNimpK;
    @Size(max = 10)
    @Column(name = "ImTDcCauCod")
    private String imTDcCauCod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imTDcCod")
    private Collection<IcInv> icInvCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imTDcCod")
    private Collection<IdInv> idInvCollection;

    public ImTDc() {
    }

    public ImTDc(String imTDcCod) {
        this.imTDcCod = imTDcCod;
    }

    public ImTDc(String imTDcCod, String imTDcDes, String imTDcSeq, Character imTDcEst, String imTDcEfe, Character imTDcNat, String imTDcCCsD, String imTDcCCsC, String imTDcCtaD, String imTDcCtaC, Character imTDcEdi, String imTDcUsr, Date imTDcFHR) {
        this.imTDcCod = imTDcCod;
        this.imTDcDes = imTDcDes;
        this.imTDcSeq = imTDcSeq;
        this.imTDcEst = imTDcEst;
        this.imTDcEfe = imTDcEfe;
        this.imTDcNat = imTDcNat;
        this.imTDcCCsD = imTDcCCsD;
        this.imTDcCCsC = imTDcCCsC;
        this.imTDcCtaD = imTDcCtaD;
        this.imTDcCtaC = imTDcCtaC;
        this.imTDcEdi = imTDcEdi;
        this.imTDcUsr = imTDcUsr;
        this.imTDcFHR = imTDcFHR;
    }

    public String getImTDcCod() {
        return imTDcCod;
    }

    public void setImTDcCod(String imTDcCod) {
        this.imTDcCod = imTDcCod;
    }

    public String getImTDcDes() {
        return imTDcDes;
    }

    public void setImTDcDes(String imTDcDes) {
        this.imTDcDes = imTDcDes;
    }

    public String getImTDcDesC() {
        return imTDcDesC;
    }

    public void setImTDcDesC(String imTDcDesC) {
        this.imTDcDesC = imTDcDesC;
    }

    public String getImTDcSeq() {
        return imTDcSeq;
    }

    public void setImTDcSeq(String imTDcSeq) {
        this.imTDcSeq = imTDcSeq;
    }

    public Character getImTDcEst() {
        return imTDcEst;
    }

    public void setImTDcEst(Character imTDcEst) {
        this.imTDcEst = imTDcEst;
    }

    public String getImTDcEfe() {
        return imTDcEfe;
    }

    public void setImTDcEfe(String imTDcEfe) {
        this.imTDcEfe = imTDcEfe;
    }

    public Character getImTDcNat() {
        return imTDcNat;
    }

    public void setImTDcNat(Character imTDcNat) {
        this.imTDcNat = imTDcNat;
    }

    public String getImTDcCCsD() {
        return imTDcCCsD;
    }

    public void setImTDcCCsD(String imTDcCCsD) {
        this.imTDcCCsD = imTDcCCsD;
    }

    public String getImTDcCCsC() {
        return imTDcCCsC;
    }

    public void setImTDcCCsC(String imTDcCCsC) {
        this.imTDcCCsC = imTDcCCsC;
    }

    public String getImTDcCCsP() {
        return imTDcCCsP;
    }

    public void setImTDcCCsP(String imTDcCCsP) {
        this.imTDcCCsP = imTDcCCsP;
    }

    public String getImTDcCtaD() {
        return imTDcCtaD;
    }

    public void setImTDcCtaD(String imTDcCtaD) {
        this.imTDcCtaD = imTDcCtaD;
    }

    public String getImTDcCtaC() {
        return imTDcCtaC;
    }

    public void setImTDcCtaC(String imTDcCtaC) {
        this.imTDcCtaC = imTDcCtaC;
    }

    public String getImTDcCtaP() {
        return imTDcCtaP;
    }

    public void setImTDcCtaP(String imTDcCtaP) {
        this.imTDcCtaP = imTDcCtaP;
    }

    public Character getImTDcEdi() {
        return imTDcEdi;
    }

    public void setImTDcEdi(Character imTDcEdi) {
        this.imTDcEdi = imTDcEdi;
    }

    public String getImTDcTpA() {
        return imTDcTpA;
    }

    public void setImTDcTpA(String imTDcTpA) {
        this.imTDcTpA = imTDcTpA;
    }

    public Character getImTDcCnt() {
        return imTDcCnt;
    }

    public void setImTDcCnt(Character imTDcCnt) {
        this.imTDcCnt = imTDcCnt;
    }

    public Character getImTDcAcuC() {
        return imTDcAcuC;
    }

    public void setImTDcAcuC(Character imTDcAcuC) {
        this.imTDcAcuC = imTDcAcuC;
    }

    public Character getImTDcFlgN() {
        return imTDcFlgN;
    }

    public void setImTDcFlgN(Character imTDcFlgN) {
        this.imTDcFlgN = imTDcFlgN;
    }

    public Character getImTDcCntT() {
        return imTDcCntT;
    }

    public void setImTDcCntT(Character imTDcCntT) {
        this.imTDcCntT = imTDcCntT;
    }

    public Character getImTDcFPrm() {
        return imTDcFPrm;
    }

    public void setImTDcFPrm(Character imTDcFPrm) {
        this.imTDcFPrm = imTDcFPrm;
    }

    public String getImTDcUsr() {
        return imTDcUsr;
    }

    public void setImTDcUsr(String imTDcUsr) {
        this.imTDcUsr = imTDcUsr;
    }

    public Date getImTDcFHR() {
        return imTDcFHR;
    }

    public void setImTDcFHR(Date imTDcFHR) {
        this.imTDcFHR = imTDcFHR;
    }

    public String getImTDcPrc() {
        return imTDcPrc;
    }

    public void setImTDcPrc(String imTDcPrc) {
        this.imTDcPrc = imTDcPrc;
    }

    public Character getImTDcRef() {
        return imTDcRef;
    }

    public void setImTDcRef(Character imTDcRef) {
        this.imTDcRef = imTDcRef;
    }

    public Character getImTDcCau() {
        return imTDcCau;
    }

    public void setImTDcCau(Character imTDcCau) {
        this.imTDcCau = imTDcCau;
    }

    public Character getImTDcCst() {
        return imTDcCst;
    }

    public void setImTDcCst(Character imTDcCst) {
        this.imTDcCst = imTDcCst;
    }

    public Character getImTDcMCnt() {
        return imTDcMCnt;
    }

    public void setImTDcMCnt(Character imTDcMCnt) {
        this.imTDcMCnt = imTDcMCnt;
    }

    public Character getImTDcCstR() {
        return imTDcCstR;
    }

    public void setImTDcCstR(Character imTDcCstR) {
        this.imTDcCstR = imTDcCstR;
    }

    public Character getImTDcNimpK() {
        return imTDcNimpK;
    }

    public void setImTDcNimpK(Character imTDcNimpK) {
        this.imTDcNimpK = imTDcNimpK;
    }

    public String getImTDcCauCod() {
        return imTDcCauCod;
    }

    public void setImTDcCauCod(String imTDcCauCod) {
        this.imTDcCauCod = imTDcCauCod;
    }

    @XmlTransient
    public Collection<IcInv> getIcInvCollection() {
        return icInvCollection;
    }

    public void setIcInvCollection(Collection<IcInv> icInvCollection) {
        this.icInvCollection = icInvCollection;
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
        hash += (imTDcCod != null ? imTDcCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImTDc)) {
            return false;
        }
        ImTDc other = (ImTDc) object;
        if ((this.imTDcCod == null && other.imTDcCod != null) || (this.imTDcCod != null && !this.imTDcCod.equals(other.imTDcCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ImTDc[ imTDcCod=" + imTDcCod + " ]";
    }
    
}
