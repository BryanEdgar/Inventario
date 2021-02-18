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
@Table(name = "AmMon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AmMon.findAll", query = "SELECT a FROM AmMon a")
    , @NamedQuery(name = "AmMon.findByAmMonCod", query = "SELECT a FROM AmMon a WHERE a.amMonCod = :amMonCod")
    , @NamedQuery(name = "AmMon.findByAmMonNom", query = "SELECT a FROM AmMon a WHERE a.amMonNom = :amMonNom")
    , @NamedQuery(name = "AmMon.findByAmMonSim", query = "SELECT a FROM AmMon a WHERE a.amMonSim = :amMonSim")
    , @NamedQuery(name = "AmMon.findByAmMonDec", query = "SELECT a FROM AmMon a WHERE a.amMonDec = :amMonDec")
    , @NamedQuery(name = "AmMon.findByAmMonBal", query = "SELECT a FROM AmMon a WHERE a.amMonBal = :amMonBal")
    , @NamedQuery(name = "AmMon.findByAmMonEst", query = "SELECT a FROM AmMon a WHERE a.amMonEst = :amMonEst")
    , @NamedQuery(name = "AmMon.findByAmMonUsr", query = "SELECT a FROM AmMon a WHERE a.amMonUsr = :amMonUsr")
    , @NamedQuery(name = "AmMon.findByAmMonVMAJ", query = "SELECT a FROM AmMon a WHERE a.amMonVMAJ = :amMonVMAJ")
    , @NamedQuery(name = "AmMon.findByAmMonFHR", query = "SELECT a FROM AmMon a WHERE a.amMonFHR = :amMonFHR")})
public class AmMon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "AmMonCod")
    private String amMonCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "AmMonNom")
    private String amMonNom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "AmMonSim")
    private String amMonSim;
    @Column(name = "AmMonDec")
    private Character amMonDec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmMonBal")
    private Character amMonBal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmMonEst")
    private Character amMonEst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmMonUsr")
    private String amMonUsr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AmMonVMAJ")
    private BigDecimal amMonVMAJ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmMonFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date amMonFHR;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "amComMonB")
    private Collection<AmCom> amComCollection;

    public AmMon() {
    }

    public AmMon(String amMonCod) {
        this.amMonCod = amMonCod;
    }

    public AmMon(String amMonCod, String amMonNom, String amMonSim, Character amMonBal, Character amMonEst, String amMonUsr, Date amMonFHR) {
        this.amMonCod = amMonCod;
        this.amMonNom = amMonNom;
        this.amMonSim = amMonSim;
        this.amMonBal = amMonBal;
        this.amMonEst = amMonEst;
        this.amMonUsr = amMonUsr;
        this.amMonFHR = amMonFHR;
    }

    public String getAmMonCod() {
        return amMonCod;
    }

    public void setAmMonCod(String amMonCod) {
        this.amMonCod = amMonCod;
    }

    public String getAmMonNom() {
        return amMonNom;
    }

    public void setAmMonNom(String amMonNom) {
        this.amMonNom = amMonNom;
    }

    public String getAmMonSim() {
        return amMonSim;
    }

    public void setAmMonSim(String amMonSim) {
        this.amMonSim = amMonSim;
    }

    public Character getAmMonDec() {
        return amMonDec;
    }

    public void setAmMonDec(Character amMonDec) {
        this.amMonDec = amMonDec;
    }

    public Character getAmMonBal() {
        return amMonBal;
    }

    public void setAmMonBal(Character amMonBal) {
        this.amMonBal = amMonBal;
    }

    public Character getAmMonEst() {
        return amMonEst;
    }

    public void setAmMonEst(Character amMonEst) {
        this.amMonEst = amMonEst;
    }

    public String getAmMonUsr() {
        return amMonUsr;
    }

    public void setAmMonUsr(String amMonUsr) {
        this.amMonUsr = amMonUsr;
    }

    public BigDecimal getAmMonVMAJ() {
        return amMonVMAJ;
    }

    public void setAmMonVMAJ(BigDecimal amMonVMAJ) {
        this.amMonVMAJ = amMonVMAJ;
    }

    public Date getAmMonFHR() {
        return amMonFHR;
    }

    public void setAmMonFHR(Date amMonFHR) {
        this.amMonFHR = amMonFHR;
    }

    @XmlTransient
    public Collection<AmCom> getAmComCollection() {
        return amComCollection;
    }

    public void setAmComCollection(Collection<AmCom> amComCollection) {
        this.amComCollection = amComCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (amMonCod != null ? amMonCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmMon)) {
            return false;
        }
        AmMon other = (AmMon) object;
        if ((this.amMonCod == null && other.amMonCod != null) || (this.amMonCod != null && !this.amMonCod.equals(other.amMonCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.AmMon[ amMonCod=" + amMonCod + " ]";
    }
    
}
