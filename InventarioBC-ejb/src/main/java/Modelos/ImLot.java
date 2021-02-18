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
@Table(name = "ImLot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImLot.findAll", query = "SELECT i FROM ImLot i")
    , @NamedQuery(name = "ImLot.findByImLotCod", query = "SELECT i FROM ImLot i WHERE i.imLotCod = :imLotCod")
    , @NamedQuery(name = "ImLot.findByImLotEst", query = "SELECT i FROM ImLot i WHERE i.imLotEst = :imLotEst")
    , @NamedQuery(name = "ImLot.findByImLotLFb", query = "SELECT i FROM ImLot i WHERE i.imLotLFb = :imLotLFb")
    , @NamedQuery(name = "ImLot.findByImLotLPv", query = "SELECT i FROM ImLot i WHERE i.imLotLPv = :imLotLPv")
    , @NamedQuery(name = "ImLot.findByImLotPrv", query = "SELECT i FROM ImLot i WHERE i.imLotPrv = :imLotPrv")
    , @NamedQuery(name = "ImLot.findByImLotPot", query = "SELECT i FROM ImLot i WHERE i.imLotPot = :imLotPot")
    , @NamedQuery(name = "ImLot.findByImLotFPrd", query = "SELECT i FROM ImLot i WHERE i.imLotFPrd = :imLotFPrd")
    , @NamedQuery(name = "ImLot.findByImLotFRcp", query = "SELECT i FROM ImLot i WHERE i.imLotFRcp = :imLotFRcp")
    , @NamedQuery(name = "ImLot.findByImLotFVnc", query = "SELECT i FROM ImLot i WHERE i.imLotFVnc = :imLotFVnc")
    , @NamedQuery(name = "ImLot.findByImLotFRCt", query = "SELECT i FROM ImLot i WHERE i.imLotFRCt = :imLotFRCt")
    , @NamedQuery(name = "ImLot.findByImLotApCC", query = "SELECT i FROM ImLot i WHERE i.imLotApCC = :imLotApCC")
    , @NamedQuery(name = "ImLot.findByImLotCan", query = "SELECT i FROM ImLot i WHERE i.imLotCan = :imLotCan")
    , @NamedQuery(name = "ImLot.findByImLotCanA", query = "SELECT i FROM ImLot i WHERE i.imLotCanA = :imLotCanA")
    , @NamedQuery(name = "ImLot.findByImLotCanR", query = "SELECT i FROM ImLot i WHERE i.imLotCanR = :imLotCanR")
    , @NamedQuery(name = "ImLot.findByImLotCanQ", query = "SELECT i FROM ImLot i WHERE i.imLotCanQ = :imLotCanQ")
    , @NamedQuery(name = "ImLot.findByImLotNumE", query = "SELECT i FROM ImLot i WHERE i.imLotNumE = :imLotNumE")
    , @NamedQuery(name = "ImLot.findByImLotNumS", query = "SELECT i FROM ImLot i WHERE i.imLotNumS = :imLotNumS")
    , @NamedQuery(name = "ImLot.findByImLotErrE", query = "SELECT i FROM ImLot i WHERE i.imLotErrE = :imLotErrE")
    , @NamedQuery(name = "ImLot.findByImLotErrS", query = "SELECT i FROM ImLot i WHERE i.imLotErrS = :imLotErrS")
    , @NamedQuery(name = "ImLot.findByImLotNumC", query = "SELECT i FROM ImLot i WHERE i.imLotNumC = :imLotNumC")
    , @NamedQuery(name = "ImLot.findByImLotNot", query = "SELECT i FROM ImLot i WHERE i.imLotNot = :imLotNot")
    , @NamedQuery(name = "ImLot.findByImLotNSim", query = "SELECT i FROM ImLot i WHERE i.imLotNSim = :imLotNSim")
    , @NamedQuery(name = "ImLot.findByImLotNSSim", query = "SELECT i FROM ImLot i WHERE i.imLotNSSim = :imLotNSSim")
    , @NamedQuery(name = "ImLot.findByImLotImei", query = "SELECT i FROM ImLot i WHERE i.imLotImei = :imLotImei")
    , @NamedQuery(name = "ImLot.findByImLotImeiE", query = "SELECT i FROM ImLot i WHERE i.imLotImeiE = :imLotImeiE")
    , @NamedQuery(name = "ImLot.findByImLotNCell", query = "SELECT i FROM ImLot i WHERE i.imLotNCell = :imLotNCell")
    , @NamedQuery(name = "ImLot.findByImLotIP", query = "SELECT i FROM ImLot i WHERE i.imLotIP = :imLotIP")
    , @NamedQuery(name = "ImLot.findByImLotBar", query = "SELECT i FROM ImLot i WHERE i.imLotBar = :imLotBar")
    , @NamedQuery(name = "ImLot.findByImLotUsr", query = "SELECT i FROM ImLot i WHERE i.imLotUsr = :imLotUsr")
    , @NamedQuery(name = "ImLot.findByImLotFHR", query = "SELECT i FROM ImLot i WHERE i.imLotFHR = :imLotFHR")
    , @NamedQuery(name = "ImLot.findByImLotOrd", query = "SELECT i FROM ImLot i WHERE i.imLotOrd = :imLotOrd")
    , @NamedQuery(name = "ImLot.findByImLotCst", query = "SELECT i FROM ImLot i WHERE i.imLotCst = :imLotCst")
    , @NamedQuery(name = "ImLot.findByImLotLotSem", query = "SELECT i FROM ImLot i WHERE i.imLotLotSem = :imLotLotSem")
    , @NamedQuery(name = "ImLot.findByImLothac", query = "SELECT i FROM ImLot i WHERE i.imLothac = :imLothac")
    , @NamedQuery(name = "ImLot.findByImLotRod", query = "SELECT i FROM ImLot i WHERE i.imLotRod = :imLotRod")
    , @NamedQuery(name = "ImLot.findByImLotDen", query = "SELECT i FROM ImLot i WHERE i.imLotDen = :imLotDen")
    , @NamedQuery(name = "ImLot.findByImLotAnio", query = "SELECT i FROM ImLot i WHERE i.imLotAnio = :imLotAnio")
    , @NamedQuery(name = "ImLot.findByImLotHec", query = "SELECT i FROM ImLot i WHERE i.imLotHec = :imLotHec")
    , @NamedQuery(name = "ImLot.findByImLotSubRod", query = "SELECT i FROM ImLot i WHERE i.imLotSubRod = :imLotSubRod")
    , @NamedQuery(name = "ImLot.findByImLotTub", query = "SELECT i FROM ImLot i WHERE i.imLotTub = :imLotTub")
    , @NamedQuery(name = "ImLot.findByImLotLotFab", query = "SELECT i FROM ImLot i WHERE i.imLotLotFab = :imLotLotFab")})
public class ImLot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImLotCod")
    private String imLotCod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotEst")
    private Character imLotEst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImLotLFb")
    private String imLotLFb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImLotLPv")
    private String imLotLPv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotPrv")
    private int imLotPrv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotPot")
    private BigDecimal imLotPot;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotFPrd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imLotFPrd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotFRcp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imLotFRcp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotFVnc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imLotFVnc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotFRCt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imLotFRCt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotApCC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imLotApCC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotCan")
    private BigDecimal imLotCan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotCanA")
    private BigDecimal imLotCanA;
    @Column(name = "ImLotCanR")
    private BigDecimal imLotCanR;
    @Column(name = "ImLotCanQ")
    private BigDecimal imLotCanQ;
    @Size(max = 30)
    @Column(name = "ImLotNumE")
    private String imLotNumE;
    @Size(max = 30)
    @Column(name = "ImLotNumS")
    private String imLotNumS;
    @Size(max = 30)
    @Column(name = "ImLotErrE")
    private String imLotErrE;
    @Size(max = 30)
    @Column(name = "ImLotErrS")
    private String imLotErrS;
    @Size(max = 30)
    @Column(name = "ImLotNumC")
    private String imLotNumC;
    @Size(max = 50)
    @Column(name = "ImLotNot")
    private String imLotNot;
    @Size(max = 30)
    @Column(name = "ImLotNSim")
    private String imLotNSim;
    @Size(max = 30)
    @Column(name = "ImLotNSSim")
    private String imLotNSSim;
    @Size(max = 18)
    @Column(name = "ImLotImei")
    private String imLotImei;
    @Size(max = 18)
    @Column(name = "ImLotImeiE")
    private String imLotImeiE;
    @Size(max = 10)
    @Column(name = "ImLotNCell")
    private String imLotNCell;
    @Size(max = 31)
    @Column(name = "ImLotIP")
    private String imLotIP;
    @Size(max = 30)
    @Column(name = "ImLotBar")
    private String imLotBar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImLotUsr")
    private String imLotUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImLotFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imLotFHR;
    @Size(max = 40)
    @Column(name = "ImLotOrd")
    private String imLotOrd;
    @Column(name = "ImLotCst")
    private BigDecimal imLotCst;
    @Size(max = 20)
    @Column(name = "ImLotLotSem")
    private String imLotLotSem;
    @Size(max = 6)
    @Column(name = "ImLothac")
    private String imLothac;
    @Size(max = 6)
    @Column(name = "ImLotRod")
    private String imLotRod;
    @Column(name = "ImLotDen")
    private Short imLotDen;
    @Column(name = "ImLotAnio")
    private Short imLotAnio;
    @Column(name = "ImLotHec")
    private BigDecimal imLotHec;
    @Size(max = 6)
    @Column(name = "ImLotSubRod")
    private String imLotSubRod;
    @Column(name = "ImLotTub")
    private BigDecimal imLotTub;
    @Size(max = 40)
    @Column(name = "ImLotLotFab")
    private String imLotLotFab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imLotCod")
    private Collection<IdInv> idInvCollection;
    @JoinColumn(name = "ImRecCod", referencedColumnName = "ImRecCod")
    @ManyToOne(optional = false)
    private ImRec imRecCod;

    public ImLot() {
    }

    public ImLot(String imLotCod) {
        this.imLotCod = imLotCod;
    }

    public ImLot(String imLotCod, Character imLotEst, String imLotLFb, String imLotLPv, int imLotPrv, BigDecimal imLotPot, Date imLotFPrd, Date imLotFRcp, Date imLotFVnc, Date imLotFRCt, Date imLotApCC, BigDecimal imLotCan, BigDecimal imLotCanA, String imLotUsr, Date imLotFHR) {
        this.imLotCod = imLotCod;
        this.imLotEst = imLotEst;
        this.imLotLFb = imLotLFb;
        this.imLotLPv = imLotLPv;
        this.imLotPrv = imLotPrv;
        this.imLotPot = imLotPot;
        this.imLotFPrd = imLotFPrd;
        this.imLotFRcp = imLotFRcp;
        this.imLotFVnc = imLotFVnc;
        this.imLotFRCt = imLotFRCt;
        this.imLotApCC = imLotApCC;
        this.imLotCan = imLotCan;
        this.imLotCanA = imLotCanA;
        this.imLotUsr = imLotUsr;
        this.imLotFHR = imLotFHR;
    }

    public String getImLotCod() {
        return imLotCod;
    }

    public void setImLotCod(String imLotCod) {
        this.imLotCod = imLotCod;
    }

    public Character getImLotEst() {
        return imLotEst;
    }

    public void setImLotEst(Character imLotEst) {
        this.imLotEst = imLotEst;
    }

    public String getImLotLFb() {
        return imLotLFb;
    }

    public void setImLotLFb(String imLotLFb) {
        this.imLotLFb = imLotLFb;
    }

    public String getImLotLPv() {
        return imLotLPv;
    }

    public void setImLotLPv(String imLotLPv) {
        this.imLotLPv = imLotLPv;
    }

    public int getImLotPrv() {
        return imLotPrv;
    }

    public void setImLotPrv(int imLotPrv) {
        this.imLotPrv = imLotPrv;
    }

    public BigDecimal getImLotPot() {
        return imLotPot;
    }

    public void setImLotPot(BigDecimal imLotPot) {
        this.imLotPot = imLotPot;
    }

    public Date getImLotFPrd() {
        return imLotFPrd;
    }

    public void setImLotFPrd(Date imLotFPrd) {
        this.imLotFPrd = imLotFPrd;
    }

    public Date getImLotFRcp() {
        return imLotFRcp;
    }

    public void setImLotFRcp(Date imLotFRcp) {
        this.imLotFRcp = imLotFRcp;
    }

    public Date getImLotFVnc() {
        return imLotFVnc;
    }

    public void setImLotFVnc(Date imLotFVnc) {
        this.imLotFVnc = imLotFVnc;
    }

    public Date getImLotFRCt() {
        return imLotFRCt;
    }

    public void setImLotFRCt(Date imLotFRCt) {
        this.imLotFRCt = imLotFRCt;
    }

    public Date getImLotApCC() {
        return imLotApCC;
    }

    public void setImLotApCC(Date imLotApCC) {
        this.imLotApCC = imLotApCC;
    }

    public BigDecimal getImLotCan() {
        return imLotCan;
    }

    public void setImLotCan(BigDecimal imLotCan) {
        this.imLotCan = imLotCan;
    }

    public BigDecimal getImLotCanA() {
        return imLotCanA;
    }

    public void setImLotCanA(BigDecimal imLotCanA) {
        this.imLotCanA = imLotCanA;
    }

    public BigDecimal getImLotCanR() {
        return imLotCanR;
    }

    public void setImLotCanR(BigDecimal imLotCanR) {
        this.imLotCanR = imLotCanR;
    }

    public BigDecimal getImLotCanQ() {
        return imLotCanQ;
    }

    public void setImLotCanQ(BigDecimal imLotCanQ) {
        this.imLotCanQ = imLotCanQ;
    }

    public String getImLotNumE() {
        return imLotNumE;
    }

    public void setImLotNumE(String imLotNumE) {
        this.imLotNumE = imLotNumE;
    }

    public String getImLotNumS() {
        return imLotNumS;
    }

    public void setImLotNumS(String imLotNumS) {
        this.imLotNumS = imLotNumS;
    }

    public String getImLotErrE() {
        return imLotErrE;
    }

    public void setImLotErrE(String imLotErrE) {
        this.imLotErrE = imLotErrE;
    }

    public String getImLotErrS() {
        return imLotErrS;
    }

    public void setImLotErrS(String imLotErrS) {
        this.imLotErrS = imLotErrS;
    }

    public String getImLotNumC() {
        return imLotNumC;
    }

    public void setImLotNumC(String imLotNumC) {
        this.imLotNumC = imLotNumC;
    }

    public String getImLotNot() {
        return imLotNot;
    }

    public void setImLotNot(String imLotNot) {
        this.imLotNot = imLotNot;
    }

    public String getImLotNSim() {
        return imLotNSim;
    }

    public void setImLotNSim(String imLotNSim) {
        this.imLotNSim = imLotNSim;
    }

    public String getImLotNSSim() {
        return imLotNSSim;
    }

    public void setImLotNSSim(String imLotNSSim) {
        this.imLotNSSim = imLotNSSim;
    }

    public String getImLotImei() {
        return imLotImei;
    }

    public void setImLotImei(String imLotImei) {
        this.imLotImei = imLotImei;
    }

    public String getImLotImeiE() {
        return imLotImeiE;
    }

    public void setImLotImeiE(String imLotImeiE) {
        this.imLotImeiE = imLotImeiE;
    }

    public String getImLotNCell() {
        return imLotNCell;
    }

    public void setImLotNCell(String imLotNCell) {
        this.imLotNCell = imLotNCell;
    }

    public String getImLotIP() {
        return imLotIP;
    }

    public void setImLotIP(String imLotIP) {
        this.imLotIP = imLotIP;
    }

    public String getImLotBar() {
        return imLotBar;
    }

    public void setImLotBar(String imLotBar) {
        this.imLotBar = imLotBar;
    }

    public String getImLotUsr() {
        return imLotUsr;
    }

    public void setImLotUsr(String imLotUsr) {
        this.imLotUsr = imLotUsr;
    }

    public Date getImLotFHR() {
        return imLotFHR;
    }

    public void setImLotFHR(Date imLotFHR) {
        this.imLotFHR = imLotFHR;
    }

    public String getImLotOrd() {
        return imLotOrd;
    }

    public void setImLotOrd(String imLotOrd) {
        this.imLotOrd = imLotOrd;
    }

    public BigDecimal getImLotCst() {
        return imLotCst;
    }

    public void setImLotCst(BigDecimal imLotCst) {
        this.imLotCst = imLotCst;
    }

    public String getImLotLotSem() {
        return imLotLotSem;
    }

    public void setImLotLotSem(String imLotLotSem) {
        this.imLotLotSem = imLotLotSem;
    }

    public String getImLothac() {
        return imLothac;
    }

    public void setImLothac(String imLothac) {
        this.imLothac = imLothac;
    }

    public String getImLotRod() {
        return imLotRod;
    }

    public void setImLotRod(String imLotRod) {
        this.imLotRod = imLotRod;
    }

    public Short getImLotDen() {
        return imLotDen;
    }

    public void setImLotDen(Short imLotDen) {
        this.imLotDen = imLotDen;
    }

    public Short getImLotAnio() {
        return imLotAnio;
    }

    public void setImLotAnio(Short imLotAnio) {
        this.imLotAnio = imLotAnio;
    }

    public BigDecimal getImLotHec() {
        return imLotHec;
    }

    public void setImLotHec(BigDecimal imLotHec) {
        this.imLotHec = imLotHec;
    }

    public String getImLotSubRod() {
        return imLotSubRod;
    }

    public void setImLotSubRod(String imLotSubRod) {
        this.imLotSubRod = imLotSubRod;
    }

    public BigDecimal getImLotTub() {
        return imLotTub;
    }

    public void setImLotTub(BigDecimal imLotTub) {
        this.imLotTub = imLotTub;
    }

    public String getImLotLotFab() {
        return imLotLotFab;
    }

    public void setImLotLotFab(String imLotLotFab) {
        this.imLotLotFab = imLotLotFab;
    }

    @XmlTransient
    public Collection<IdInv> getIdInvCollection() {
        return idInvCollection;
    }

    public void setIdInvCollection(Collection<IdInv> idInvCollection) {
        this.idInvCollection = idInvCollection;
    }

    public ImRec getImRecCod() {
        return imRecCod;
    }

    public void setImRecCod(ImRec imRecCod) {
        this.imRecCod = imRecCod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imLotCod != null ? imLotCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImLot)) {
            return false;
        }
        ImLot other = (ImLot) object;
        if ((this.imLotCod == null && other.imLotCod != null) || (this.imLotCod != null && !this.imLotCod.equals(other.imLotCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ImLot[ imLotCod=" + imLotCod + " ]";
    }
    
}
