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
@Table(name = "AmScN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AmScN.findAll", query = "SELECT a FROM AmScN a")
    , @NamedQuery(name = "AmScN.findByAmScnCod", query = "SELECT a FROM AmScN a WHERE a.amScnCod = :amScnCod")
    , @NamedQuery(name = "AmScN.findByAmScNRazS", query = "SELECT a FROM AmScN a WHERE a.amScNRazS = :amScNRazS")
    , @NamedQuery(name = "AmScN.findByAmScNTiId", query = "SELECT a FROM AmScN a WHERE a.amScNTiId = :amScNTiId")
    , @NamedQuery(name = "AmScN.findByAmScNIdF", query = "SELECT a FROM AmScN a WHERE a.amScNIdF = :amScNIdF")
    , @NamedQuery(name = "AmScN.findByAmScNIdN", query = "SELECT a FROM AmScN a WHERE a.amScNIdN = :amScNIdN")
    , @NamedQuery(name = "AmScN.findByAmScNDig", query = "SELECT a FROM AmScN a WHERE a.amScNDig = :amScNDig")
    , @NamedQuery(name = "AmScN.findByAmScNTipo", query = "SELECT a FROM AmScN a WHERE a.amScNTipo = :amScNTipo")
    , @NamedQuery(name = "AmScN.findByAmScNCall", query = "SELECT a FROM AmScN a WHERE a.amScNCall = :amScNCall")
    , @NamedQuery(name = "AmScN.findByAmScNInt", query = "SELECT a FROM AmScN a WHERE a.amScNInt = :amScNInt")
    , @NamedQuery(name = "AmScN.findByAmScNNum", query = "SELECT a FROM AmScN a WHERE a.amScNNum = :amScNNum")
    , @NamedQuery(name = "AmScN.findByAmScNUbi", query = "SELECT a FROM AmScN a WHERE a.amScNUbi = :amScNUbi")
    , @NamedQuery(name = "AmScN.findByAdCiuCod", query = "SELECT a FROM AmScN a WHERE a.adCiuCod = :adCiuCod")
    , @NamedQuery(name = "AmScN.findByAdPrvCod", query = "SELECT a FROM AmScN a WHERE a.adPrvCod = :adPrvCod")
    , @NamedQuery(name = "AmScN.findByAmScNPaq", query = "SELECT a FROM AmScN a WHERE a.amScNPaq = :amScNPaq")
    , @NamedQuery(name = "AmScN.findByAmScnFol", query = "SELECT a FROM AmScN a WHERE a.amScnFol = :amScnFol")
    , @NamedQuery(name = "AmScN.findByAmScNBar", query = "SELECT a FROM AmScN a WHERE a.amScNBar = :amScNBar")
    , @NamedQuery(name = "AmScN.findByAmPaisCod", query = "SELECT a FROM AmScN a WHERE a.amPaisCod = :amPaisCod")
    , @NamedQuery(name = "AmScN.findByAmScNTel1", query = "SELECT a FROM AmScN a WHERE a.amScNTel1 = :amScNTel1")
    , @NamedQuery(name = "AmScN.findByAmScNTel2", query = "SELECT a FROM AmScN a WHERE a.amScNTel2 = :amScNTel2")
    , @NamedQuery(name = "AmScN.findByAmScNTel3", query = "SELECT a FROM AmScN a WHERE a.amScNTel3 = :amScNTel3")
    , @NamedQuery(name = "AmScN.findByAmScNNFax", query = "SELECT a FROM AmScN a WHERE a.amScNNFax = :amScNNFax")
    , @NamedQuery(name = "AmScN.findByAmScNEma", query = "SELECT a FROM AmScN a WHERE a.amScNEma = :amScNEma")
    , @NamedQuery(name = "AmScN.findByAmScNEst", query = "SELECT a FROM AmScN a WHERE a.amScNEst = :amScNEst")
    , @NamedQuery(name = "AmScN.findByAmScNCodI", query = "SELECT a FROM AmScN a WHERE a.amScNCodI = :amScNCodI")
    , @NamedQuery(name = "AmScN.findByAmScNUsr", query = "SELECT a FROM AmScN a WHERE a.amScNUsr = :amScNUsr")
    , @NamedQuery(name = "AmScN.findByAmScNFHR", query = "SELECT a FROM AmScN a WHERE a.amScNFHR = :amScNFHR")
    , @NamedQuery(name = "AmScN.findByAmScNPNm", query = "SELECT a FROM AmScN a WHERE a.amScNPNm = :amScNPNm")
    , @NamedQuery(name = "AmScN.findByAmScNSNm", query = "SELECT a FROM AmScN a WHERE a.amScNSNm = :amScNSNm")
    , @NamedQuery(name = "AmScN.findByAmScNPAp", query = "SELECT a FROM AmScN a WHERE a.amScNPAp = :amScNPAp")
    , @NamedQuery(name = "AmScN.findByAmScNSAp", query = "SELECT a FROM AmScN a WHERE a.amScNSAp = :amScNSAp")
    , @NamedQuery(name = "AmScN.findByAmScNNomC", query = "SELECT a FROM AmScN a WHERE a.amScNNomC = :amScNNomC")
    , @NamedQuery(name = "AmScN.findByAmScNNac", query = "SELECT a FROM AmScN a WHERE a.amScNNac = :amScNNac")
    , @NamedQuery(name = "AmScN.findByAmScNMil", query = "SELECT a FROM AmScN a WHERE a.amScNMil = :amScNMil")
    , @NamedQuery(name = "AmScN.findByAmScNDEC", query = "SELECT a FROM AmScN a WHERE a.amScNDEC = :amScNDEC")
    , @NamedQuery(name = "AmScN.findByAmScNDir", query = "SELECT a FROM AmScN a WHERE a.amScNDir = :amScNDir")
    , @NamedQuery(name = "AmScN.findByAmScNLEC", query = "SELECT a FROM AmScN a WHERE a.amScNLEC = :amScNLEC")
    , @NamedQuery(name = "AmScN.findByAmScNDNa", query = "SELECT a FROM AmScN a WHERE a.amScNDNa = :amScNDNa")
    , @NamedQuery(name = "AmScN.findByAmScNTDc", query = "SELECT a FROM AmScN a WHERE a.amScNTDc = :amScNTDc")
    , @NamedQuery(name = "AmScN.findByAmScNSect", query = "SELECT a FROM AmScN a WHERE a.amScNSect = :amScNSect")
    , @NamedQuery(name = "AmScN.findByAmScNZon", query = "SELECT a FROM AmScN a WHERE a.amScNZon = :amScNZon")})
public class AmScN implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmScnCod")
    private Integer amScnCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AmScNRazS")
    private String amScNRazS;
    @Column(name = "AmScNTiId")
    private Character amScNTiId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "AmScNIdF")
    private String amScNIdF;
    @Column(name = "AmScNIdN")
    private Long amScNIdN;
    @Column(name = "AmScNDig")
    private Short amScNDig;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmScNTipo")
    private Character amScNTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AmScNCall")
    private String amScNCall;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AmScNInt")
    private String amScNInt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AmScNNum")
    private String amScNNum;
    @Size(max = 50)
    @Column(name = "AmScNUbi")
    private String amScNUbi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AdCiuCod")
    private String adCiuCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AdPrvCod")
    private String adPrvCod;
    @Size(max = 200)
    @Column(name = "AmScNPaq")
    private String amScNPaq;
    @Size(max = 10)
    @Column(name = "AmScnFol")
    private String amScnFol;
    @Size(max = 10)
    @Column(name = "AmScNBar")
    private String amScNBar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AmPaisCod")
    private String amPaisCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmScNTel1")
    private String amScNTel1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmScNTel2")
    private String amScNTel2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmScNTel3")
    private String amScNTel3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AmScNNFax")
    private String amScNNFax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AmScNEma")
    private String amScNEma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmScNEst")
    private Character amScNEst;
    @Size(max = 25)
    @Column(name = "AmScNCodI")
    private String amScNCodI;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmScNUsr")
    private String amScNUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmScNFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date amScNFHR;
    @Size(max = 24)
    @Column(name = "AmScNPNm")
    private String amScNPNm;
    @Size(max = 24)
    @Column(name = "AmScNSNm")
    private String amScNSNm;
    @Size(max = 24)
    @Column(name = "AmScNPAp")
    private String amScNPAp;
    @Size(max = 24)
    @Column(name = "AmScNSAp")
    private String amScNSAp;
    @Size(max = 100)
    @Column(name = "AmScNNomC")
    private String amScNNomC;
    @Size(max = 10)
    @Column(name = "AmScNNac")
    private String amScNNac;
    @Size(max = 20)
    @Column(name = "AmScNMil")
    private String amScNMil;
    @Size(max = 10)
    @Column(name = "AmScNDEC")
    private String amScNDEC;
    @Size(max = 100)
    @Column(name = "AmScNDir")
    private String amScNDir;
    @Size(max = 10)
    @Column(name = "AmScNLEC")
    private String amScNLEC;
    @Size(max = 10)
    @Column(name = "AmScNDNa")
    private String amScNDNa;
    @Column(name = "AmScNTDc")
    private Short amScNTDc;
    @Size(max = 200)
    @Column(name = "AmScNSect")
    private String amScNSect;
    @Size(max = 5)
    @Column(name = "AmScNZon")
    private String amScNZon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "amScN")
    private Collection<AmUsr> amUsrCollection;
    @JoinColumn(name = "TcIdFCod", referencedColumnName = "TcIdFCod")
    @ManyToOne(optional = false)
    private TcIdF tcIdFCod;

    public AmScN() {
    }

    public AmScN(Integer amScnCod) {
        this.amScnCod = amScnCod;
    }

    public AmScN(Integer amScnCod, String amScNRazS, String amScNIdF, Character amScNTipo, String amScNCall, String amScNInt, String amScNNum, String adCiuCod, String adPrvCod, String amPaisCod, String amScNTel1, String amScNTel2, String amScNTel3, String amScNNFax, String amScNEma, Character amScNEst, String amScNUsr, Date amScNFHR) {
        this.amScnCod = amScnCod;
        this.amScNRazS = amScNRazS;
        this.amScNIdF = amScNIdF;
        this.amScNTipo = amScNTipo;
        this.amScNCall = amScNCall;
        this.amScNInt = amScNInt;
        this.amScNNum = amScNNum;
        this.adCiuCod = adCiuCod;
        this.adPrvCod = adPrvCod;
        this.amPaisCod = amPaisCod;
        this.amScNTel1 = amScNTel1;
        this.amScNTel2 = amScNTel2;
        this.amScNTel3 = amScNTel3;
        this.amScNNFax = amScNNFax;
        this.amScNEma = amScNEma;
        this.amScNEst = amScNEst;
        this.amScNUsr = amScNUsr;
        this.amScNFHR = amScNFHR;
    }

    public Integer getAmScnCod() {
        return amScnCod;
    }

    public void setAmScnCod(Integer amScnCod) {
        this.amScnCod = amScnCod;
    }

    public String getAmScNRazS() {
        return amScNRazS;
    }

    public void setAmScNRazS(String amScNRazS) {
        this.amScNRazS = amScNRazS;
    }

    public Character getAmScNTiId() {
        return amScNTiId;
    }

    public void setAmScNTiId(Character amScNTiId) {
        this.amScNTiId = amScNTiId;
    }

    public String getAmScNIdF() {
        return amScNIdF;
    }

    public void setAmScNIdF(String amScNIdF) {
        this.amScNIdF = amScNIdF;
    }

    public Long getAmScNIdN() {
        return amScNIdN;
    }

    public void setAmScNIdN(Long amScNIdN) {
        this.amScNIdN = amScNIdN;
    }

    public Short getAmScNDig() {
        return amScNDig;
    }

    public void setAmScNDig(Short amScNDig) {
        this.amScNDig = amScNDig;
    }

    public Character getAmScNTipo() {
        return amScNTipo;
    }

    public void setAmScNTipo(Character amScNTipo) {
        this.amScNTipo = amScNTipo;
    }

    public String getAmScNCall() {
        return amScNCall;
    }

    public void setAmScNCall(String amScNCall) {
        this.amScNCall = amScNCall;
    }

    public String getAmScNInt() {
        return amScNInt;
    }

    public void setAmScNInt(String amScNInt) {
        this.amScNInt = amScNInt;
    }

    public String getAmScNNum() {
        return amScNNum;
    }

    public void setAmScNNum(String amScNNum) {
        this.amScNNum = amScNNum;
    }

    public String getAmScNUbi() {
        return amScNUbi;
    }

    public void setAmScNUbi(String amScNUbi) {
        this.amScNUbi = amScNUbi;
    }

    public String getAdCiuCod() {
        return adCiuCod;
    }

    public void setAdCiuCod(String adCiuCod) {
        this.adCiuCod = adCiuCod;
    }

    public String getAdPrvCod() {
        return adPrvCod;
    }

    public void setAdPrvCod(String adPrvCod) {
        this.adPrvCod = adPrvCod;
    }

    public String getAmScNPaq() {
        return amScNPaq;
    }

    public void setAmScNPaq(String amScNPaq) {
        this.amScNPaq = amScNPaq;
    }

    public String getAmScnFol() {
        return amScnFol;
    }

    public void setAmScnFol(String amScnFol) {
        this.amScnFol = amScnFol;
    }

    public String getAmScNBar() {
        return amScNBar;
    }

    public void setAmScNBar(String amScNBar) {
        this.amScNBar = amScNBar;
    }

    public String getAmPaisCod() {
        return amPaisCod;
    }

    public void setAmPaisCod(String amPaisCod) {
        this.amPaisCod = amPaisCod;
    }

    public String getAmScNTel1() {
        return amScNTel1;
    }

    public void setAmScNTel1(String amScNTel1) {
        this.amScNTel1 = amScNTel1;
    }

    public String getAmScNTel2() {
        return amScNTel2;
    }

    public void setAmScNTel2(String amScNTel2) {
        this.amScNTel2 = amScNTel2;
    }

    public String getAmScNTel3() {
        return amScNTel3;
    }

    public void setAmScNTel3(String amScNTel3) {
        this.amScNTel3 = amScNTel3;
    }

    public String getAmScNNFax() {
        return amScNNFax;
    }

    public void setAmScNNFax(String amScNNFax) {
        this.amScNNFax = amScNNFax;
    }

    public String getAmScNEma() {
        return amScNEma;
    }

    public void setAmScNEma(String amScNEma) {
        this.amScNEma = amScNEma;
    }

    public Character getAmScNEst() {
        return amScNEst;
    }

    public void setAmScNEst(Character amScNEst) {
        this.amScNEst = amScNEst;
    }

    public String getAmScNCodI() {
        return amScNCodI;
    }

    public void setAmScNCodI(String amScNCodI) {
        this.amScNCodI = amScNCodI;
    }

    public String getAmScNUsr() {
        return amScNUsr;
    }

    public void setAmScNUsr(String amScNUsr) {
        this.amScNUsr = amScNUsr;
    }

    public Date getAmScNFHR() {
        return amScNFHR;
    }

    public void setAmScNFHR(Date amScNFHR) {
        this.amScNFHR = amScNFHR;
    }

    public String getAmScNPNm() {
        return amScNPNm;
    }

    public void setAmScNPNm(String amScNPNm) {
        this.amScNPNm = amScNPNm;
    }

    public String getAmScNSNm() {
        return amScNSNm;
    }

    public void setAmScNSNm(String amScNSNm) {
        this.amScNSNm = amScNSNm;
    }

    public String getAmScNPAp() {
        return amScNPAp;
    }

    public void setAmScNPAp(String amScNPAp) {
        this.amScNPAp = amScNPAp;
    }

    public String getAmScNSAp() {
        return amScNSAp;
    }

    public void setAmScNSAp(String amScNSAp) {
        this.amScNSAp = amScNSAp;
    }

    public String getAmScNNomC() {
        return amScNNomC;
    }

    public void setAmScNNomC(String amScNNomC) {
        this.amScNNomC = amScNNomC;
    }

    public String getAmScNNac() {
        return amScNNac;
    }

    public void setAmScNNac(String amScNNac) {
        this.amScNNac = amScNNac;
    }

    public String getAmScNMil() {
        return amScNMil;
    }

    public void setAmScNMil(String amScNMil) {
        this.amScNMil = amScNMil;
    }

    public String getAmScNDEC() {
        return amScNDEC;
    }

    public void setAmScNDEC(String amScNDEC) {
        this.amScNDEC = amScNDEC;
    }

    public String getAmScNDir() {
        return amScNDir;
    }

    public void setAmScNDir(String amScNDir) {
        this.amScNDir = amScNDir;
    }

    public String getAmScNLEC() {
        return amScNLEC;
    }

    public void setAmScNLEC(String amScNLEC) {
        this.amScNLEC = amScNLEC;
    }

    public String getAmScNDNa() {
        return amScNDNa;
    }

    public void setAmScNDNa(String amScNDNa) {
        this.amScNDNa = amScNDNa;
    }

    public Short getAmScNTDc() {
        return amScNTDc;
    }

    public void setAmScNTDc(Short amScNTDc) {
        this.amScNTDc = amScNTDc;
    }

    public String getAmScNSect() {
        return amScNSect;
    }

    public void setAmScNSect(String amScNSect) {
        this.amScNSect = amScNSect;
    }

    public String getAmScNZon() {
        return amScNZon;
    }

    public void setAmScNZon(String amScNZon) {
        this.amScNZon = amScNZon;
    }

    @XmlTransient
    public Collection<AmUsr> getAmUsrCollection() {
        return amUsrCollection;
    }

    public void setAmUsrCollection(Collection<AmUsr> amUsrCollection) {
        this.amUsrCollection = amUsrCollection;
    }

    public TcIdF getTcIdFCod() {
        return tcIdFCod;
    }

    public void setTcIdFCod(TcIdF tcIdFCod) {
        this.tcIdFCod = tcIdFCod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (amScnCod != null ? amScnCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmScN)) {
            return false;
        }
        AmScN other = (AmScN) object;
        if ((this.amScnCod == null && other.amScnCod != null) || (this.amScnCod != null && !this.amScnCod.equals(other.amScnCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.AmScN[ amScnCod=" + amScnCod + " ]";
    }
    
}
