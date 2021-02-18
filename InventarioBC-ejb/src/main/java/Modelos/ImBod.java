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
@Table(name = "ImBod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImBod.findAll", query = "SELECT i FROM ImBod i")
    , @NamedQuery(name = "ImBod.findByImBodCod", query = "SELECT i FROM ImBod i WHERE i.imBodCod = :imBodCod")
    , @NamedQuery(name = "ImBod.findByImBodDes", query = "SELECT i FROM ImBod i WHERE i.imBodDes = :imBodDes")
    , @NamedQuery(name = "ImBod.findByImBodAsg", query = "SELECT i FROM ImBod i WHERE i.imBodAsg = :imBodAsg")
    , @NamedQuery(name = "ImBod.findByImBodMRP", query = "SELECT i FROM ImBod i WHERE i.imBodMRP = :imBodMRP")
    , @NamedQuery(name = "ImBod.findByImBodVal", query = "SELECT i FROM ImBod i WHERE i.imBodVal = :imBodVal")
    , @NamedQuery(name = "ImBod.findByImBodCCs1", query = "SELECT i FROM ImBod i WHERE i.imBodCCs1 = :imBodCCs1")
    , @NamedQuery(name = "ImBod.findByImBodCta1", query = "SELECT i FROM ImBod i WHERE i.imBodCta1 = :imBodCta1")
    , @NamedQuery(name = "ImBod.findByImBodCCs2", query = "SELECT i FROM ImBod i WHERE i.imBodCCs2 = :imBodCCs2")
    , @NamedQuery(name = "ImBod.findByImBodCta2", query = "SELECT i FROM ImBod i WHERE i.imBodCta2 = :imBodCta2")
    , @NamedQuery(name = "ImBod.findByImBodCCs3", query = "SELECT i FROM ImBod i WHERE i.imBodCCs3 = :imBodCCs3")
    , @NamedQuery(name = "ImBod.findByImBodCta3", query = "SELECT i FROM ImBod i WHERE i.imBodCta3 = :imBodCta3")
    , @NamedQuery(name = "ImBod.findByImBodNRes", query = "SELECT i FROM ImBod i WHERE i.imBodNRes = :imBodNRes")
    , @NamedQuery(name = "ImBod.findByImBodCRes", query = "SELECT i FROM ImBod i WHERE i.imBodCRes = :imBodCRes")
    , @NamedQuery(name = "ImBod.findByImBodCiu", query = "SELECT i FROM ImBod i WHERE i.imBodCiu = :imBodCiu")
    , @NamedQuery(name = "ImBod.findByImBodDir", query = "SELECT i FROM ImBod i WHERE i.imBodDir = :imBodDir")
    , @NamedQuery(name = "ImBod.findByImBodDis", query = "SELECT i FROM ImBod i WHERE i.imBodDis = :imBodDis")
    , @NamedQuery(name = "ImBod.findByImBodTel", query = "SELECT i FROM ImBod i WHERE i.imBodTel = :imBodTel")
    , @NamedQuery(name = "ImBod.findByImBodEmail", query = "SELECT i FROM ImBod i WHERE i.imBodEmail = :imBodEmail")
    , @NamedQuery(name = "ImBod.findByImBodVol", query = "SELECT i FROM ImBod i WHERE i.imBodVol = :imBodVol")
    , @NamedQuery(name = "ImBod.findByImBodMCst", query = "SELECT i FROM ImBod i WHERE i.imBodMCst = :imBodMCst")
    , @NamedQuery(name = "ImBod.findByImBodMUnd1", query = "SELECT i FROM ImBod i WHERE i.imBodMUnd1 = :imBodMUnd1")
    , @NamedQuery(name = "ImBod.findByImBodMUnd2", query = "SELECT i FROM ImBod i WHERE i.imBodMUnd2 = :imBodMUnd2")
    , @NamedQuery(name = "ImBod.findByImBodSim", query = "SELECT i FROM ImBod i WHERE i.imBodSim = :imBodSim")
    , @NamedQuery(name = "ImBod.findByImBodSuc", query = "SELECT i FROM ImBod i WHERE i.imBodSuc = :imBodSuc")
    , @NamedQuery(name = "ImBod.findByImBodEAN", query = "SELECT i FROM ImBod i WHERE i.imBodEAN = :imBodEAN")
    , @NamedQuery(name = "ImBod.findByImBodUsr", query = "SELECT i FROM ImBod i WHERE i.imBodUsr = :imBodUsr")
    , @NamedQuery(name = "ImBod.findByImBodFHR", query = "SELECT i FROM ImBod i WHERE i.imBodFHR = :imBodFHR")
    , @NamedQuery(name = "ImBod.findByImBodEst", query = "SELECT i FROM ImBod i WHERE i.imBodEst = :imBodEst")
    , @NamedQuery(name = "ImBod.findByImBodBCli", query = "SELECT i FROM ImBod i WHERE i.imBodBCli = :imBodBCli")
    , @NamedQuery(name = "ImBod.findByImBodCon", query = "SELECT i FROM ImBod i WHERE i.imBodCon = :imBodCon")
    , @NamedQuery(name = "ImBod.findByImBodARet", query = "SELECT i FROM ImBod i WHERE i.imBodARet = :imBodARet")
    , @NamedQuery(name = "ImBod.findByImBodIns", query = "SELECT i FROM ImBod i WHERE i.imBodIns = :imBodIns")
    , @NamedQuery(name = "ImBod.findByImBodIExt", query = "SELECT i FROM ImBod i WHERE i.imBodIExt = :imBodIExt")
    , @NamedQuery(name = "ImBod.findByImBodSig", query = "SELECT i FROM ImBod i WHERE i.imBodSig = :imBodSig")
    , @NamedQuery(name = "ImBod.findByImBodArea", query = "SELECT i FROM ImBod i WHERE i.imBodArea = :imBodArea")
    , @NamedQuery(name = "ImBod.findByImBodAlt", query = "SELECT i FROM ImBod i WHERE i.imBodAlt = :imBodAlt")
    , @NamedQuery(name = "ImBod.findByImBodDen", query = "SELECT i FROM ImBod i WHERE i.imBodDen = :imBodDen")
    , @NamedQuery(name = "ImBod.findByImBodDisp", query = "SELECT i FROM ImBod i WHERE i.imBodDisp = :imBodDisp")
    , @NamedQuery(name = "ImBod.findByImBodAPlan", query = "SELECT i FROM ImBod i WHERE i.imBodAPlan = :imBodAPlan")
    , @NamedQuery(name = "ImBod.findByImBodDisGas", query = "SELECT i FROM ImBod i WHERE i.imBodDisGas = :imBodDisGas")})
public class ImBod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ImBodCod")
    private String imBodCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImBodDes")
    private String imBodDes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImBodAsg")
    private Character imBodAsg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImBodMRP")
    private Character imBodMRP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImBodVal")
    private Character imBodVal;
    @Size(max = 20)
    @Column(name = "ImBodCCs1")
    private String imBodCCs1;
    @Size(max = 20)
    @Column(name = "ImBodCta1")
    private String imBodCta1;
    @Size(max = 20)
    @Column(name = "ImBodCCs2")
    private String imBodCCs2;
    @Size(max = 20)
    @Column(name = "ImBodCta2")
    private String imBodCta2;
    @Size(max = 20)
    @Column(name = "ImBodCCs3")
    private String imBodCCs3;
    @Size(max = 20)
    @Column(name = "ImBodCta3")
    private String imBodCta3;
    @Size(max = 50)
    @Column(name = "ImBodNRes")
    private String imBodNRes;
    @Size(max = 15)
    @Column(name = "ImBodCRes")
    private String imBodCRes;
    @Size(max = 10)
    @Column(name = "ImBodCiu")
    private String imBodCiu;
    @Size(max = 120)
    @Column(name = "ImBodDir")
    private String imBodDir;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ImBodDis")
    private BigDecimal imBodDis;
    @Size(max = 15)
    @Column(name = "ImBodTel")
    private String imBodTel;
    @Size(max = 60)
    @Column(name = "ImBodEmail")
    private String imBodEmail;
    @Column(name = "ImBodVol")
    private BigDecimal imBodVol;
    @Column(name = "ImBodMCst")
    private BigDecimal imBodMCst;
    @Column(name = "ImBodMUnd1")
    private BigDecimal imBodMUnd1;
    @Column(name = "ImBodMUnd2")
    private BigDecimal imBodMUnd2;
    @Column(name = "ImBodSim")
    private Character imBodSim;
    @Column(name = "ImBodSuc")
    private Short imBodSuc;
    @Size(max = 14)
    @Column(name = "ImBodEAN")
    private String imBodEAN;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImBodUsr")
    private String imBodUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImBodFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imBodFHR;
    @Column(name = "ImBodEst")
    private Character imBodEst;
    @Size(max = 6)
    @Column(name = "ImBodBCli")
    private String imBodBCli;
    @Column(name = "ImBodCon")
    private Character imBodCon;
    @Column(name = "ImBodARet")
    private Character imBodARet;
    @Column(name = "ImBodIns")
    private Character imBodIns;
    @Column(name = "ImBodIExt")
    private Character imBodIExt;
    @Size(max = 6)
    @Column(name = "ImBodSig")
    private String imBodSig;
    @Column(name = "ImBodArea")
    private BigDecimal imBodArea;
    @Column(name = "ImBodAlt")
    private BigDecimal imBodAlt;
    @Column(name = "ImBodDen")
    private BigDecimal imBodDen;
    @Column(name = "ImBodDisp")
    private BigDecimal imBodDisp;
    @Column(name = "ImBodAPlan")
    private BigDecimal imBodAPlan;
    @Column(name = "ImBodDisGas")
    private Boolean imBodDisGas;
    @JoinColumn(name = "AmInsCod", referencedColumnName = "AmInsCod")
    @ManyToOne(optional = false)
    private AmIns amInsCod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imBodCod")
    private Collection<IdInv> idInvCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imBodCod")
    private Collection<ImUbi> imUbiCollection;

    public ImBod() {
    }

    public ImBod(String imBodCod) {
        this.imBodCod = imBodCod;
    }

    public ImBod(String imBodCod, String imBodDes, Character imBodAsg, Character imBodMRP, Character imBodVal, String imBodUsr, Date imBodFHR) {
        this.imBodCod = imBodCod;
        this.imBodDes = imBodDes;
        this.imBodAsg = imBodAsg;
        this.imBodMRP = imBodMRP;
        this.imBodVal = imBodVal;
        this.imBodUsr = imBodUsr;
        this.imBodFHR = imBodFHR;
    }

    public String getImBodCod() {
        return imBodCod;
    }

    public void setImBodCod(String imBodCod) {
        this.imBodCod = imBodCod;
    }

    public String getImBodDes() {
        return imBodDes;
    }

    public void setImBodDes(String imBodDes) {
        this.imBodDes = imBodDes;
    }

    public Character getImBodAsg() {
        return imBodAsg;
    }

    public void setImBodAsg(Character imBodAsg) {
        this.imBodAsg = imBodAsg;
    }

    public Character getImBodMRP() {
        return imBodMRP;
    }

    public void setImBodMRP(Character imBodMRP) {
        this.imBodMRP = imBodMRP;
    }

    public Character getImBodVal() {
        return imBodVal;
    }

    public void setImBodVal(Character imBodVal) {
        this.imBodVal = imBodVal;
    }

    public String getImBodCCs1() {
        return imBodCCs1;
    }

    public void setImBodCCs1(String imBodCCs1) {
        this.imBodCCs1 = imBodCCs1;
    }

    public String getImBodCta1() {
        return imBodCta1;
    }

    public void setImBodCta1(String imBodCta1) {
        this.imBodCta1 = imBodCta1;
    }

    public String getImBodCCs2() {
        return imBodCCs2;
    }

    public void setImBodCCs2(String imBodCCs2) {
        this.imBodCCs2 = imBodCCs2;
    }

    public String getImBodCta2() {
        return imBodCta2;
    }

    public void setImBodCta2(String imBodCta2) {
        this.imBodCta2 = imBodCta2;
    }

    public String getImBodCCs3() {
        return imBodCCs3;
    }

    public void setImBodCCs3(String imBodCCs3) {
        this.imBodCCs3 = imBodCCs3;
    }

    public String getImBodCta3() {
        return imBodCta3;
    }

    public void setImBodCta3(String imBodCta3) {
        this.imBodCta3 = imBodCta3;
    }

    public String getImBodNRes() {
        return imBodNRes;
    }

    public void setImBodNRes(String imBodNRes) {
        this.imBodNRes = imBodNRes;
    }

    public String getImBodCRes() {
        return imBodCRes;
    }

    public void setImBodCRes(String imBodCRes) {
        this.imBodCRes = imBodCRes;
    }

    public String getImBodCiu() {
        return imBodCiu;
    }

    public void setImBodCiu(String imBodCiu) {
        this.imBodCiu = imBodCiu;
    }

    public String getImBodDir() {
        return imBodDir;
    }

    public void setImBodDir(String imBodDir) {
        this.imBodDir = imBodDir;
    }

    public BigDecimal getImBodDis() {
        return imBodDis;
    }

    public void setImBodDis(BigDecimal imBodDis) {
        this.imBodDis = imBodDis;
    }

    public String getImBodTel() {
        return imBodTel;
    }

    public void setImBodTel(String imBodTel) {
        this.imBodTel = imBodTel;
    }

    public String getImBodEmail() {
        return imBodEmail;
    }

    public void setImBodEmail(String imBodEmail) {
        this.imBodEmail = imBodEmail;
    }

    public BigDecimal getImBodVol() {
        return imBodVol;
    }

    public void setImBodVol(BigDecimal imBodVol) {
        this.imBodVol = imBodVol;
    }

    public BigDecimal getImBodMCst() {
        return imBodMCst;
    }

    public void setImBodMCst(BigDecimal imBodMCst) {
        this.imBodMCst = imBodMCst;
    }

    public BigDecimal getImBodMUnd1() {
        return imBodMUnd1;
    }

    public void setImBodMUnd1(BigDecimal imBodMUnd1) {
        this.imBodMUnd1 = imBodMUnd1;
    }

    public BigDecimal getImBodMUnd2() {
        return imBodMUnd2;
    }

    public void setImBodMUnd2(BigDecimal imBodMUnd2) {
        this.imBodMUnd2 = imBodMUnd2;
    }

    public Character getImBodSim() {
        return imBodSim;
    }

    public void setImBodSim(Character imBodSim) {
        this.imBodSim = imBodSim;
    }

    public Short getImBodSuc() {
        return imBodSuc;
    }

    public void setImBodSuc(Short imBodSuc) {
        this.imBodSuc = imBodSuc;
    }

    public String getImBodEAN() {
        return imBodEAN;
    }

    public void setImBodEAN(String imBodEAN) {
        this.imBodEAN = imBodEAN;
    }

    public String getImBodUsr() {
        return imBodUsr;
    }

    public void setImBodUsr(String imBodUsr) {
        this.imBodUsr = imBodUsr;
    }

    public Date getImBodFHR() {
        return imBodFHR;
    }

    public void setImBodFHR(Date imBodFHR) {
        this.imBodFHR = imBodFHR;
    }

    public Character getImBodEst() {
        return imBodEst;
    }

    public void setImBodEst(Character imBodEst) {
        this.imBodEst = imBodEst;
    }

    public String getImBodBCli() {
        return imBodBCli;
    }

    public void setImBodBCli(String imBodBCli) {
        this.imBodBCli = imBodBCli;
    }

    public Character getImBodCon() {
        return imBodCon;
    }

    public void setImBodCon(Character imBodCon) {
        this.imBodCon = imBodCon;
    }

    public Character getImBodARet() {
        return imBodARet;
    }

    public void setImBodARet(Character imBodARet) {
        this.imBodARet = imBodARet;
    }

    public Character getImBodIns() {
        return imBodIns;
    }

    public void setImBodIns(Character imBodIns) {
        this.imBodIns = imBodIns;
    }

    public Character getImBodIExt() {
        return imBodIExt;
    }

    public void setImBodIExt(Character imBodIExt) {
        this.imBodIExt = imBodIExt;
    }

    public String getImBodSig() {
        return imBodSig;
    }

    public void setImBodSig(String imBodSig) {
        this.imBodSig = imBodSig;
    }

    public BigDecimal getImBodArea() {
        return imBodArea;
    }

    public void setImBodArea(BigDecimal imBodArea) {
        this.imBodArea = imBodArea;
    }

    public BigDecimal getImBodAlt() {
        return imBodAlt;
    }

    public void setImBodAlt(BigDecimal imBodAlt) {
        this.imBodAlt = imBodAlt;
    }

    public BigDecimal getImBodDen() {
        return imBodDen;
    }

    public void setImBodDen(BigDecimal imBodDen) {
        this.imBodDen = imBodDen;
    }

    public BigDecimal getImBodDisp() {
        return imBodDisp;
    }

    public void setImBodDisp(BigDecimal imBodDisp) {
        this.imBodDisp = imBodDisp;
    }

    public BigDecimal getImBodAPlan() {
        return imBodAPlan;
    }

    public void setImBodAPlan(BigDecimal imBodAPlan) {
        this.imBodAPlan = imBodAPlan;
    }

    public Boolean getImBodDisGas() {
        return imBodDisGas;
    }

    public void setImBodDisGas(Boolean imBodDisGas) {
        this.imBodDisGas = imBodDisGas;
    }

    public AmIns getAmInsCod() {
        return amInsCod;
    }

    public void setAmInsCod(AmIns amInsCod) {
        this.amInsCod = amInsCod;
    }

    @XmlTransient
    public Collection<IdInv> getIdInvCollection() {
        return idInvCollection;
    }

    public void setIdInvCollection(Collection<IdInv> idInvCollection) {
        this.idInvCollection = idInvCollection;
    }

    @XmlTransient
    public Collection<ImUbi> getImUbiCollection() {
        return imUbiCollection;
    }

    public void setImUbiCollection(Collection<ImUbi> imUbiCollection) {
        this.imUbiCollection = imUbiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imBodCod != null ? imBodCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImBod)) {
            return false;
        }
        ImBod other = (ImBod) object;
        if ((this.imBodCod == null && other.imBodCod != null) || (this.imBodCod != null && !this.imBodCod.equals(other.imBodCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ImBod[ imBodCod=" + imBodCod + " ]";
    }
    
}
