/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "AmUsr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AmUsr.findAll", query = "SELECT a FROM AmUsr a")
    , @NamedQuery(name = "AmUsr.findByAmScnCod", query = "SELECT a FROM AmUsr a WHERE a.amUsrPK.amScnCod = :amScnCod")
    , @NamedQuery(name = "AmUsr.findByAmUsrFlg", query = "SELECT a FROM AmUsr a WHERE a.amUsrPK.amUsrFlg = :amUsrFlg")
    , @NamedQuery(name = "AmUsr.findByAmUsrLog", query = "SELECT a FROM AmUsr a WHERE a.amUsrLog = :amUsrLog")
    , @NamedQuery(name = "AmUsr.findByAmUsrPass", query = "SELECT a FROM AmUsr a WHERE a.amUsrPass = :amUsrPass")
    , @NamedQuery(name = "AmUsr.findByAmUsrTipo", query = "SELECT a FROM AmUsr a WHERE a.amUsrTipo = :amUsrTipo")
    , @NamedQuery(name = "AmUsr.findByAmUsrEst", query = "SELECT a FROM AmUsr a WHERE a.amUsrEst = :amUsrEst")
    , @NamedQuery(name = "AmUsr.findByAmUsrRol", query = "SELECT a FROM AmUsr a WHERE a.amUsrRol = :amUsrRol")
    , @NamedQuery(name = "AmUsr.findByAmUsrUsr", query = "SELECT a FROM AmUsr a WHERE a.amUsrUsr = :amUsrUsr")
    , @NamedQuery(name = "AmUsr.findByAmUsrFHR", query = "SELECT a FROM AmUsr a WHERE a.amUsrFHR = :amUsrFHR")
    , @NamedQuery(name = "AmUsr.findByAmUsrImgGXI", query = "SELECT a FROM AmUsr a WHERE a.amUsrImgGXI = :amUsrImgGXI")
    , @NamedQuery(name = "AmUsr.findByAmUsrHoras", query = "SELECT a FROM AmUsr a WHERE a.amUsrHoras = :amUsrHoras")})
public class AmUsr implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected AmUsrPK amUsrPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "AmUsrLog")
    private String amUsrLog;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "AmUsrPass")
    private String amUsrPass;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmUsrTipo")
    private Character amUsrTipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmUsrEst")
    private Character amUsrEst;
    @Column(name = "AmUsrRol")
    private Character amUsrRol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmUsrUsr")
    private String amUsrUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmUsrFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date amUsrFHR;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "AmUsrImg")
    private byte[] amUsrImg;
    @Size(max = 2048)
    @Column(name = "AmUsrImg_GXI")
    private String amUsrImgGXI;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AmUsrHoras")
    private BigDecimal amUsrHoras;
    @JoinColumn(name = "AmScnCod", referencedColumnName = "AmScnCod", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AmScN amScN;

    public AmUsr() {
    }

    public AmUsr(AmUsrPK amUsrPK) {
        this.amUsrPK = amUsrPK;
    }

    public AmUsr(AmUsrPK amUsrPK, String amUsrLog, String amUsrPass, Character amUsrTipo, Character amUsrEst, String amUsrUsr, Date amUsrFHR, byte[] amUsrImg) {
        this.amUsrPK = amUsrPK;
        this.amUsrLog = amUsrLog;
        this.amUsrPass = amUsrPass;
        this.amUsrTipo = amUsrTipo;
        this.amUsrEst = amUsrEst;
        this.amUsrUsr = amUsrUsr;
        this.amUsrFHR = amUsrFHR;
        this.amUsrImg = amUsrImg;
    }

    public AmUsr(int amScnCod, Character amUsrFlg) {
        this.amUsrPK = new AmUsrPK(amScnCod, amUsrFlg);
    }

    public AmUsrPK getAmUsrPK() {
        return amUsrPK;
    }

    public void setAmUsrPK(AmUsrPK amUsrPK) {
        this.amUsrPK = amUsrPK;
    }

    public String getAmUsrLog() {
        return amUsrLog;
    }

    public void setAmUsrLog(String amUsrLog) {
        this.amUsrLog = amUsrLog;
    }

    public String getAmUsrPass() {
        return amUsrPass;
    }

    public void setAmUsrPass(String amUsrPass) {
        this.amUsrPass = amUsrPass;
    }

    public Character getAmUsrTipo() {
        return amUsrTipo;
    }

    public void setAmUsrTipo(Character amUsrTipo) {
        this.amUsrTipo = amUsrTipo;
    }

    public Character getAmUsrEst() {
        return amUsrEst;
    }

    public void setAmUsrEst(Character amUsrEst) {
        this.amUsrEst = amUsrEst;
    }

    public Character getAmUsrRol() {
        return amUsrRol;
    }

    public void setAmUsrRol(Character amUsrRol) {
        this.amUsrRol = amUsrRol;
    }

    public String getAmUsrUsr() {
        return amUsrUsr;
    }

    public void setAmUsrUsr(String amUsrUsr) {
        this.amUsrUsr = amUsrUsr;
    }

    public Date getAmUsrFHR() {
        return amUsrFHR;
    }

    public void setAmUsrFHR(Date amUsrFHR) {
        this.amUsrFHR = amUsrFHR;
    }

    public byte[] getAmUsrImg() {
        return amUsrImg;
    }

    public void setAmUsrImg(byte[] amUsrImg) {
        this.amUsrImg = amUsrImg;
    }

    public String getAmUsrImgGXI() {
        return amUsrImgGXI;
    }

    public void setAmUsrImgGXI(String amUsrImgGXI) {
        this.amUsrImgGXI = amUsrImgGXI;
    }

    public BigDecimal getAmUsrHoras() {
        return amUsrHoras;
    }

    public void setAmUsrHoras(BigDecimal amUsrHoras) {
        this.amUsrHoras = amUsrHoras;
    }

    public AmScN getAmScN() {
        return amScN;
    }

    public void setAmScN(AmScN amScN) {
        this.amScN = amScN;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (amUsrPK != null ? amUsrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmUsr)) {
            return false;
        }
        AmUsr other = (AmUsr) object;
        if ((this.amUsrPK == null && other.amUsrPK != null) || (this.amUsrPK != null && !this.amUsrPK.equals(other.amUsrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.AmUsr[ amUsrPK=" + amUsrPK + " ]";
    }
    
}
