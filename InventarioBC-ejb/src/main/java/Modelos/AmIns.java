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
@Table(name = "AmIns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AmIns.findAll", query = "SELECT a FROM AmIns a")
    , @NamedQuery(name = "AmIns.findByAmInsCod", query = "SELECT a FROM AmIns a WHERE a.amInsCod = :amInsCod")
    , @NamedQuery(name = "AmIns.findByAmInsDes", query = "SELECT a FROM AmIns a WHERE a.amInsDes = :amInsDes")
    , @NamedQuery(name = "AmIns.findByAmInsDir", query = "SELECT a FROM AmIns a WHERE a.amInsDir = :amInsDir")
    , @NamedQuery(name = "AmIns.findByAmInsTel1", query = "SELECT a FROM AmIns a WHERE a.amInsTel1 = :amInsTel1")
    , @NamedQuery(name = "AmIns.findByAmInsTel2", query = "SELECT a FROM AmIns a WHERE a.amInsTel2 = :amInsTel2")
    , @NamedQuery(name = "AmIns.findByAmInsEst", query = "SELECT a FROM AmIns a WHERE a.amInsEst = :amInsEst")
    , @NamedQuery(name = "AmIns.findByAmInsUsr", query = "SELECT a FROM AmIns a WHERE a.amInsUsr = :amInsUsr")
    , @NamedQuery(name = "AmIns.findByAmInsFHR", query = "SELECT a FROM AmIns a WHERE a.amInsFHR = :amInsFHR")
    , @NamedQuery(name = "AmIns.findByAmInsSig", query = "SELECT a FROM AmIns a WHERE a.amInsSig = :amInsSig")
    , @NamedQuery(name = "AmIns.findByAmInsArea", query = "SELECT a FROM AmIns a WHERE a.amInsArea = :amInsArea")
    , @NamedQuery(name = "AmIns.findByAmInsPais", query = "SELECT a FROM AmIns a WHERE a.amInsPais = :amInsPais")
    , @NamedQuery(name = "AmIns.findByAmInsPrv", query = "SELECT a FROM AmIns a WHERE a.amInsPrv = :amInsPrv")
    , @NamedQuery(name = "AmIns.findByAmInsCton", query = "SELECT a FROM AmIns a WHERE a.amInsCton = :amInsCton")
    , @NamedQuery(name = "AmIns.findByAmInsParr", query = "SELECT a FROM AmIns a WHERE a.amInsParr = :amInsParr")
    , @NamedQuery(name = "AmIns.findByAmInsMod", query = "SELECT a FROM AmIns a WHERE a.amInsMod = :amInsMod")
    , @NamedQuery(name = "AmIns.findByAmInsNPre", query = "SELECT a FROM AmIns a WHERE a.amInsNPre = :amInsNPre")
    , @NamedQuery(name = "AmIns.findByAmInsFecC", query = "SELECT a FROM AmIns a WHERE a.amInsFecC = :amInsFecC")
    , @NamedQuery(name = "AmIns.findByAmInsZon", query = "SELECT a FROM AmIns a WHERE a.amInsZon = :amInsZon")
    , @NamedQuery(name = "AmIns.findByAmInsHac", query = "SELECT a FROM AmIns a WHERE a.amInsHac = :amInsHac")
    , @NamedQuery(name = "AmIns.findByAmInsBodHac", query = "SELECT a FROM AmIns a WHERE a.amInsBodHac = :amInsBodHac")
    , @NamedQuery(name = "AmIns.findByAmInsAreaF", query = "SELECT a FROM AmIns a WHERE a.amInsAreaF = :amInsAreaF")
    , @NamedQuery(name = "AmIns.findByAmInsAnioC", query = "SELECT a FROM AmIns a WHERE a.amInsAnioC = :amInsAnioC")
    , @NamedQuery(name = "AmIns.findByAmInsCicCul", query = "SELECT a FROM AmIns a WHERE a.amInsCicCul = :amInsCicCul")
    , @NamedQuery(name = "AmIns.findByAmInsVivero", query = "SELECT a FROM AmIns a WHERE a.amInsVivero = :amInsVivero")})
public class AmIns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "AmInsCod")
    private String amInsCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AmInsDes")
    private String amInsDes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "AmInsDir")
    private String amInsDir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmInsTel1")
    private String amInsTel1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmInsTel2")
    private String amInsTel2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmInsEst")
    private Character amInsEst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmInsUsr")
    private String amInsUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmInsFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date amInsFHR;
    @Size(max = 6)
    @Column(name = "AmInsSig")
    private String amInsSig;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AmInsArea")
    private BigDecimal amInsArea;
    @Size(max = 10)
    @Column(name = "AmInsPais")
    private String amInsPais;
    @Size(max = 10)
    @Column(name = "AmInsPrv")
    private String amInsPrv;
    @Size(max = 10)
    @Column(name = "AmInsCton")
    private String amInsCton;
    @Size(max = 60)
    @Column(name = "AmInsParr")
    private String amInsParr;
    @Column(name = "AmInsMod")
    private Character amInsMod;
    @Size(max = 1000)
    @Column(name = "AmInsNPre")
    private String amInsNPre;
    @Column(name = "AmInsFecC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date amInsFecC;
    @Size(max = 5)
    @Column(name = "AmInsZon")
    private String amInsZon;
    @Column(name = "AmInsHac")
    private Character amInsHac;
    @Size(max = 6)
    @Column(name = "AmInsBodHac")
    private String amInsBodHac;
    @Column(name = "AmInsAreaF")
    private BigDecimal amInsAreaF;
    @Column(name = "AmInsAnioC")
    private Short amInsAnioC;
    @Column(name = "AmInsCicCul")
    private Short amInsCicCul;
    @Column(name = "AmInsVivero")
    private Boolean amInsVivero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "amInsCod")
    private Collection<ImBod> imBodCollection;

    public AmIns() {
    }

    public AmIns(String amInsCod) {
        this.amInsCod = amInsCod;
    }

    public AmIns(String amInsCod, String amInsDes, String amInsDir, String amInsTel1, String amInsTel2, Character amInsEst, String amInsUsr, Date amInsFHR) {
        this.amInsCod = amInsCod;
        this.amInsDes = amInsDes;
        this.amInsDir = amInsDir;
        this.amInsTel1 = amInsTel1;
        this.amInsTel2 = amInsTel2;
        this.amInsEst = amInsEst;
        this.amInsUsr = amInsUsr;
        this.amInsFHR = amInsFHR;
    }

    public String getAmInsCod() {
        return amInsCod;
    }

    public void setAmInsCod(String amInsCod) {
        this.amInsCod = amInsCod;
    }

    public String getAmInsDes() {
        return amInsDes;
    }

    public void setAmInsDes(String amInsDes) {
        this.amInsDes = amInsDes;
    }

    public String getAmInsDir() {
        return amInsDir;
    }

    public void setAmInsDir(String amInsDir) {
        this.amInsDir = amInsDir;
    }

    public String getAmInsTel1() {
        return amInsTel1;
    }

    public void setAmInsTel1(String amInsTel1) {
        this.amInsTel1 = amInsTel1;
    }

    public String getAmInsTel2() {
        return amInsTel2;
    }

    public void setAmInsTel2(String amInsTel2) {
        this.amInsTel2 = amInsTel2;
    }

    public Character getAmInsEst() {
        return amInsEst;
    }

    public void setAmInsEst(Character amInsEst) {
        this.amInsEst = amInsEst;
    }

    public String getAmInsUsr() {
        return amInsUsr;
    }

    public void setAmInsUsr(String amInsUsr) {
        this.amInsUsr = amInsUsr;
    }

    public Date getAmInsFHR() {
        return amInsFHR;
    }

    public void setAmInsFHR(Date amInsFHR) {
        this.amInsFHR = amInsFHR;
    }

    public String getAmInsSig() {
        return amInsSig;
    }

    public void setAmInsSig(String amInsSig) {
        this.amInsSig = amInsSig;
    }

    public BigDecimal getAmInsArea() {
        return amInsArea;
    }

    public void setAmInsArea(BigDecimal amInsArea) {
        this.amInsArea = amInsArea;
    }

    public String getAmInsPais() {
        return amInsPais;
    }

    public void setAmInsPais(String amInsPais) {
        this.amInsPais = amInsPais;
    }

    public String getAmInsPrv() {
        return amInsPrv;
    }

    public void setAmInsPrv(String amInsPrv) {
        this.amInsPrv = amInsPrv;
    }

    public String getAmInsCton() {
        return amInsCton;
    }

    public void setAmInsCton(String amInsCton) {
        this.amInsCton = amInsCton;
    }

    public String getAmInsParr() {
        return amInsParr;
    }

    public void setAmInsParr(String amInsParr) {
        this.amInsParr = amInsParr;
    }

    public Character getAmInsMod() {
        return amInsMod;
    }

    public void setAmInsMod(Character amInsMod) {
        this.amInsMod = amInsMod;
    }

    public String getAmInsNPre() {
        return amInsNPre;
    }

    public void setAmInsNPre(String amInsNPre) {
        this.amInsNPre = amInsNPre;
    }

    public Date getAmInsFecC() {
        return amInsFecC;
    }

    public void setAmInsFecC(Date amInsFecC) {
        this.amInsFecC = amInsFecC;
    }

    public String getAmInsZon() {
        return amInsZon;
    }

    public void setAmInsZon(String amInsZon) {
        this.amInsZon = amInsZon;
    }

    public Character getAmInsHac() {
        return amInsHac;
    }

    public void setAmInsHac(Character amInsHac) {
        this.amInsHac = amInsHac;
    }

    public String getAmInsBodHac() {
        return amInsBodHac;
    }

    public void setAmInsBodHac(String amInsBodHac) {
        this.amInsBodHac = amInsBodHac;
    }

    public BigDecimal getAmInsAreaF() {
        return amInsAreaF;
    }

    public void setAmInsAreaF(BigDecimal amInsAreaF) {
        this.amInsAreaF = amInsAreaF;
    }

    public Short getAmInsAnioC() {
        return amInsAnioC;
    }

    public void setAmInsAnioC(Short amInsAnioC) {
        this.amInsAnioC = amInsAnioC;
    }

    public Short getAmInsCicCul() {
        return amInsCicCul;
    }

    public void setAmInsCicCul(Short amInsCicCul) {
        this.amInsCicCul = amInsCicCul;
    }

    public Boolean getAmInsVivero() {
        return amInsVivero;
    }

    public void setAmInsVivero(Boolean amInsVivero) {
        this.amInsVivero = amInsVivero;
    }

    @XmlTransient
    public Collection<ImBod> getImBodCollection() {
        return imBodCollection;
    }

    public void setImBodCollection(Collection<ImBod> imBodCollection) {
        this.imBodCollection = imBodCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (amInsCod != null ? amInsCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmIns)) {
            return false;
        }
        AmIns other = (AmIns) object;
        if ((this.amInsCod == null && other.amInsCod != null) || (this.amInsCod != null && !this.amInsCod.equals(other.amInsCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.AmIns[ amInsCod=" + amInsCod + " ]";
    }
    
}
