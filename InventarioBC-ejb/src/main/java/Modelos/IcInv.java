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
@Table(name = "IcInv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IcInv.findAll", query = "SELECT i FROM IcInv i")
    , @NamedQuery(name = "IcInv.findByIcInvNum", query = "SELECT i FROM IcInv i WHERE i.icInvNum = :icInvNum")
    , @NamedQuery(name = "IcInv.findByIcInvScN", query = "SELECT i FROM IcInv i WHERE i.icInvScN = :icInvScN")
    , @NamedQuery(name = "IcInv.findByIcInvFec", query = "SELECT i FROM IcInv i WHERE i.icInvFec = :icInvFec")
    , @NamedQuery(name = "IcInv.findByIcInvFecC", query = "SELECT i FROM IcInv i WHERE i.icInvFecC = :icInvFecC")
    , @NamedQuery(name = "IcInv.findByIcInvBdOD", query = "SELECT i FROM IcInv i WHERE i.icInvBdOD = :icInvBdOD")
    , @NamedQuery(name = "IcInv.findByIcInvBodO", query = "SELECT i FROM IcInv i WHERE i.icInvBodO = :icInvBodO")
    , @NamedQuery(name = "IcInv.findByIcInvCau", query = "SELECT i FROM IcInv i WHERE i.icInvCau = :icInvCau")
    , @NamedQuery(name = "IcInv.findByIcInvDCau", query = "SELECT i FROM IcInv i WHERE i.icInvDCau = :icInvDCau")
    , @NamedQuery(name = "IcInv.findByIcInvRef", query = "SELECT i FROM IcInv i WHERE i.icInvRef = :icInvRef")
    , @NamedQuery(name = "IcInv.findByIcInvOrd", query = "SELECT i FROM IcInv i WHERE i.icInvOrd = :icInvOrd")
    , @NamedQuery(name = "IcInv.findByIcInvEst", query = "SELECT i FROM IcInv i WHERE i.icInvEst = :icInvEst")
    , @NamedQuery(name = "IcInv.findByIcInvEstT", query = "SELECT i FROM IcInv i WHERE i.icInvEstT = :icInvEstT")
    , @NamedQuery(name = "IcInv.findByIcInvCnt", query = "SELECT i FROM IcInv i WHERE i.icInvCnt = :icInvCnt")
    , @NamedQuery(name = "IcInv.findByIcInvNumA", query = "SELECT i FROM IcInv i WHERE i.icInvNumA = :icInvNumA")
    , @NamedQuery(name = "IcInv.findByIcInvTipA", query = "SELECT i FROM IcInv i WHERE i.icInvTipA = :icInvTipA")
    , @NamedQuery(name = "IcInv.findByIcInvCCs", query = "SELECT i FROM IcInv i WHERE i.icInvCCs = :icInvCCs")
    , @NamedQuery(name = "IcInv.findByIcInvCta", query = "SELECT i FROM IcInv i WHERE i.icInvCta = :icInvCta")
    , @NamedQuery(name = "IcInv.findByIcInvSel", query = "SELECT i FROM IcInv i WHERE i.icInvSel = :icInvSel")
    , @NamedQuery(name = "IcInv.findByIcInvFac", query = "SELECT i FROM IcInv i WHERE i.icInvFac = :icInvFac")
    , @NamedQuery(name = "IcInv.findByIcInvFCnt", query = "SELECT i FROM IcInv i WHERE i.icInvFCnt = :icInvFCnt")
    , @NamedQuery(name = "IcInv.findByIcInvCot", query = "SELECT i FROM IcInv i WHERE i.icInvCot = :icInvCot")
    , @NamedQuery(name = "IcInv.findByIcInvNumI", query = "SELECT i FROM IcInv i WHERE i.icInvNumI = :icInvNumI")
    , @NamedQuery(name = "IcInv.findByIcInvUsr", query = "SELECT i FROM IcInv i WHERE i.icInvUsr = :icInvUsr")
    , @NamedQuery(name = "IcInv.findByIcInvFHR", query = "SELECT i FROM IcInv i WHERE i.icInvFHR = :icInvFHR")
    , @NamedQuery(name = "IcInv.findByIcInvIns", query = "SELECT i FROM IcInv i WHERE i.icInvIns = :icInvIns")
    , @NamedQuery(name = "IcInv.findByIcInvInfo", query = "SELECT i FROM IcInv i WHERE i.icInvInfo = :icInvInfo")
    , @NamedQuery(name = "IcInv.findByIcInvEstWS", query = "SELECT i FROM IcInv i WHERE i.icInvEstWS = :icInvEstWS")})
public class IcInv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "IcInvNum")
    private String icInvNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IcInvScN")
    private int icInvScN;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IcInvFec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date icInvFec;
    @Column(name = "IcInvFecC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date icInvFecC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "IcInvBdOD")
    private String icInvBdOD;
    @Size(max = 6)
    @Column(name = "IcInvBodO")
    private String icInvBodO;
    @Size(max = 20)
    @Column(name = "IcInvCau")
    private String icInvCau;
    @Size(max = 50)
    @Column(name = "IcInvDCau")
    private String icInvDCau;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "IcInvRef")
    private String icInvRef;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "IcInvOrd")
    private String icInvOrd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IcInvEst")
    private Character icInvEst;
    @Column(name = "IcInvEstT")
    private Character icInvEstT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IcInvCnt")
    private Character icInvCnt;
    @Size(max = 20)
    @Column(name = "IcInvNumA")
    private String icInvNumA;
    @Size(max = 3)
    @Column(name = "IcInvTipA")
    private String icInvTipA;
    @Size(max = 20)
    @Column(name = "IcInvCCs")
    private String icInvCCs;
    @Size(max = 20)
    @Column(name = "IcInvCta")
    private String icInvCta;
    @Size(max = 30)
    @Column(name = "IcInvSel")
    private String icInvSel;
    @Size(max = 20)
    @Column(name = "IcInvFac")
    private String icInvFac;
    @Column(name = "IcInvFCnt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date icInvFCnt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IcInvCot")
    private BigDecimal icInvCot;
    @Size(max = 20)
    @Column(name = "IcInvNumI")
    private String icInvNumI;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "IcInvUsr")
    private String icInvUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IcInvFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date icInvFHR;
    @Size(max = 6)
    @Column(name = "IcInvIns")
    private String icInvIns;
    @Size(max = 2147483647)
    @Column(name = "IcInvInfo")
    private String icInvInfo;
    @Size(max = 20)
    @Column(name = "IcInvEstWS")
    private String icInvEstWS;
    @JoinColumn(name = "ImTDcCod", referencedColumnName = "ImTDcCod")
    @ManyToOne(optional = false)
    private ImTDc imTDcCod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "icInvNum")
    private Collection<IdInv> idInvCollection;

    public IcInv() {
    }

    public IcInv(String icInvNum) {
        this.icInvNum = icInvNum;
    }

    public IcInv(String icInvNum, int icInvScN, Date icInvFec, String icInvBdOD, String icInvRef, String icInvOrd, Character icInvEst, Character icInvCnt, String icInvUsr, Date icInvFHR) {
        this.icInvNum = icInvNum;
        this.icInvScN = icInvScN;
        this.icInvFec = icInvFec;
        this.icInvBdOD = icInvBdOD;
        this.icInvRef = icInvRef;
        this.icInvOrd = icInvOrd;
        this.icInvEst = icInvEst;
        this.icInvCnt = icInvCnt;
        this.icInvUsr = icInvUsr;
        this.icInvFHR = icInvFHR;
    }

    public String getIcInvNum() {
        return icInvNum;
    }

    public void setIcInvNum(String icInvNum) {
        this.icInvNum = icInvNum;
    }

    public int getIcInvScN() {
        return icInvScN;
    }

    public void setIcInvScN(int icInvScN) {
        this.icInvScN = icInvScN;
    }

    public Date getIcInvFec() {
        return icInvFec;
    }

    public void setIcInvFec(Date icInvFec) {
        this.icInvFec = icInvFec;
    }

    public Date getIcInvFecC() {
        return icInvFecC;
    }

    public void setIcInvFecC(Date icInvFecC) {
        this.icInvFecC = icInvFecC;
    }

    public String getIcInvBdOD() {
        return icInvBdOD;
    }

    public void setIcInvBdOD(String icInvBdOD) {
        this.icInvBdOD = icInvBdOD;
    }

    public String getIcInvBodO() {
        return icInvBodO;
    }

    public void setIcInvBodO(String icInvBodO) {
        this.icInvBodO = icInvBodO;
    }

    public String getIcInvCau() {
        return icInvCau;
    }

    public void setIcInvCau(String icInvCau) {
        this.icInvCau = icInvCau;
    }

    public String getIcInvDCau() {
        return icInvDCau;
    }

    public void setIcInvDCau(String icInvDCau) {
        this.icInvDCau = icInvDCau;
    }

    public String getIcInvRef() {
        return icInvRef;
    }

    public void setIcInvRef(String icInvRef) {
        this.icInvRef = icInvRef;
    }

    public String getIcInvOrd() {
        return icInvOrd;
    }

    public void setIcInvOrd(String icInvOrd) {
        this.icInvOrd = icInvOrd;
    }

    public Character getIcInvEst() {
        return icInvEst;
    }

    public void setIcInvEst(Character icInvEst) {
        this.icInvEst = icInvEst;
    }

    public Character getIcInvEstT() {
        return icInvEstT;
    }

    public void setIcInvEstT(Character icInvEstT) {
        this.icInvEstT = icInvEstT;
    }

    public Character getIcInvCnt() {
        return icInvCnt;
    }

    public void setIcInvCnt(Character icInvCnt) {
        this.icInvCnt = icInvCnt;
    }

    public String getIcInvNumA() {
        return icInvNumA;
    }

    public void setIcInvNumA(String icInvNumA) {
        this.icInvNumA = icInvNumA;
    }

    public String getIcInvTipA() {
        return icInvTipA;
    }

    public void setIcInvTipA(String icInvTipA) {
        this.icInvTipA = icInvTipA;
    }

    public String getIcInvCCs() {
        return icInvCCs;
    }

    public void setIcInvCCs(String icInvCCs) {
        this.icInvCCs = icInvCCs;
    }

    public String getIcInvCta() {
        return icInvCta;
    }

    public void setIcInvCta(String icInvCta) {
        this.icInvCta = icInvCta;
    }

    public String getIcInvSel() {
        return icInvSel;
    }

    public void setIcInvSel(String icInvSel) {
        this.icInvSel = icInvSel;
    }

    public String getIcInvFac() {
        return icInvFac;
    }

    public void setIcInvFac(String icInvFac) {
        this.icInvFac = icInvFac;
    }

    public Date getIcInvFCnt() {
        return icInvFCnt;
    }

    public void setIcInvFCnt(Date icInvFCnt) {
        this.icInvFCnt = icInvFCnt;
    }

    public BigDecimal getIcInvCot() {
        return icInvCot;
    }

    public void setIcInvCot(BigDecimal icInvCot) {
        this.icInvCot = icInvCot;
    }

    public String getIcInvNumI() {
        return icInvNumI;
    }

    public void setIcInvNumI(String icInvNumI) {
        this.icInvNumI = icInvNumI;
    }

    public String getIcInvUsr() {
        return icInvUsr;
    }

    public void setIcInvUsr(String icInvUsr) {
        this.icInvUsr = icInvUsr;
    }

    public Date getIcInvFHR() {
        return icInvFHR;
    }

    public void setIcInvFHR(Date icInvFHR) {
        this.icInvFHR = icInvFHR;
    }

    public String getIcInvIns() {
        return icInvIns;
    }

    public void setIcInvIns(String icInvIns) {
        this.icInvIns = icInvIns;
    }

    public String getIcInvInfo() {
        return icInvInfo;
    }

    public void setIcInvInfo(String icInvInfo) {
        this.icInvInfo = icInvInfo;
    }

    public String getIcInvEstWS() {
        return icInvEstWS;
    }

    public void setIcInvEstWS(String icInvEstWS) {
        this.icInvEstWS = icInvEstWS;
    }

    public ImTDc getImTDcCod() {
        return imTDcCod;
    }

    public void setImTDcCod(ImTDc imTDcCod) {
        this.imTDcCod = imTDcCod;
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
        hash += (icInvNum != null ? icInvNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IcInv)) {
            return false;
        }
        IcInv other = (IcInv) object;
        if ((this.icInvNum == null && other.icInvNum != null) || (this.icInvNum != null && !this.icInvNum.equals(other.icInvNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.IcInv[ icInvNum=" + icInvNum + " ]";
    }
    
}
