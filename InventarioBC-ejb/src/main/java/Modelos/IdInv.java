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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "IdInv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IdInv.findAll", query = "SELECT i FROM IdInv i")
    , @NamedQuery(name = "IdInv.findByAmComCod", query = "SELECT i FROM IdInv i WHERE i.amComCod = :amComCod")
    , @NamedQuery(name = "IdInv.findByIdInvLin", query = "SELECT i FROM IdInv i WHERE i.idInvLin = :idInvLin")
    , @NamedQuery(name = "IdInv.findByIdInvSeq", query = "SELECT i FROM IdInv i WHERE i.idInvSeq = :idInvSeq")
    , @NamedQuery(name = "IdInv.findByIdInvLotF", query = "SELECT i FROM IdInv i WHERE i.idInvLotF = :idInvLotF")
    , @NamedQuery(name = "IdInv.findByIdInvLotP", query = "SELECT i FROM IdInv i WHERE i.idInvLotP = :idInvLotP")
    , @NamedQuery(name = "IdInv.findByIdInvCan", query = "SELECT i FROM IdInv i WHERE i.idInvCan = :idInvCan")
    , @NamedQuery(name = "IdInv.findByIdInvCanC", query = "SELECT i FROM IdInv i WHERE i.idInvCanC = :idInvCanC")
    , @NamedQuery(name = "IdInv.findByIdInvUndM", query = "SELECT i FROM IdInv i WHERE i.idInvUndM = :idInvUndM")
    , @NamedQuery(name = "IdInv.findByIdInvCstS", query = "SELECT i FROM IdInv i WHERE i.idInvCstS = :idInvCstS")
    , @NamedQuery(name = "IdInv.findByIdInvCstR", query = "SELECT i FROM IdInv i WHERE i.idInvCstR = :idInvCstR")
    , @NamedQuery(name = "IdInv.findByIdInvCstP", query = "SELECT i FROM IdInv i WHERE i.idInvCstP = :idInvCstP")
    , @NamedQuery(name = "IdInv.findByIdInvVCom", query = "SELECT i FROM IdInv i WHERE i.idInvVCom = :idInvVCom")
    , @NamedQuery(name = "IdInv.findByIdInvCstA", query = "SELECT i FROM IdInv i WHERE i.idInvCstA = :idInvCstA")
    , @NamedQuery(name = "IdInv.findByIdInvCstST", query = "SELECT i FROM IdInv i WHERE i.idInvCstST = :idInvCstST")
    , @NamedQuery(name = "IdInv.findByIdInvCstRT", query = "SELECT i FROM IdInv i WHERE i.idInvCstRT = :idInvCstRT")
    , @NamedQuery(name = "IdInv.findByIdInvCstPT", query = "SELECT i FROM IdInv i WHERE i.idInvCstPT = :idInvCstPT")
    , @NamedQuery(name = "IdInv.findByIdInvVComT", query = "SELECT i FROM IdInv i WHERE i.idInvVComT = :idInvVComT")
    , @NamedQuery(name = "IdInv.findByIdInvOrd", query = "SELECT i FROM IdInv i WHERE i.idInvOrd = :idInvOrd")
    , @NamedQuery(name = "IdInv.findByIdInvCanA", query = "SELECT i FROM IdInv i WHERE i.idInvCanA = :idInvCanA")
    , @NamedQuery(name = "IdInv.findByIdInvCtaC", query = "SELECT i FROM IdInv i WHERE i.idInvCtaC = :idInvCtaC")
    , @NamedQuery(name = "IdInv.findByIdInvCCsC", query = "SELECT i FROM IdInv i WHERE i.idInvCCsC = :idInvCCsC")
    , @NamedQuery(name = "IdInv.findByIdInvCtaD", query = "SELECT i FROM IdInv i WHERE i.idInvCtaD = :idInvCtaD")
    , @NamedQuery(name = "IdInv.findByIdInvCCsD", query = "SELECT i FROM IdInv i WHERE i.idInvCCsD = :idInvCCsD")
    , @NamedQuery(name = "IdInv.findByIdInvCCsP", query = "SELECT i FROM IdInv i WHERE i.idInvCCsP = :idInvCCsP")
    , @NamedQuery(name = "IdInv.findByIdInvEstL", query = "SELECT i FROM IdInv i WHERE i.idInvEstL = :idInvEstL")
    , @NamedQuery(name = "IdInv.findByIdInvTpR", query = "SELECT i FROM IdInv i WHERE i.idInvTpR = :idInvTpR")
    , @NamedQuery(name = "IdInv.findByIdInvCom", query = "SELECT i FROM IdInv i WHERE i.idInvCom = :idInvCom")
    , @NamedQuery(name = "IdInv.findByIdInvCau", query = "SELECT i FROM IdInv i WHERE i.idInvCau = :idInvCau")
    , @NamedQuery(name = "IdInv.findByIdInvEst", query = "SELECT i FROM IdInv i WHERE i.idInvEst = :idInvEst")
    , @NamedQuery(name = "IdInv.findByIdInvBon", query = "SELECT i FROM IdInv i WHERE i.idInvBon = :idInvBon")
    , @NamedQuery(name = "IdInv.findByIdInvTipV", query = "SELECT i FROM IdInv i WHERE i.idInvTipV = :idInvTipV")
    , @NamedQuery(name = "IdInv.findByIdInvNum", query = "SELECT i FROM IdInv i WHERE i.idInvNum = :idInvNum")
    , @NamedQuery(name = "IdInv.findByIdInvSec", query = "SELECT i FROM IdInv i WHERE i.idInvSec = :idInvSec")
    , @NamedQuery(name = "IdInv.findByIdInvLinea", query = "SELECT i FROM IdInv i WHERE i.idInvLinea = :idInvLinea")
    , @NamedQuery(name = "IdInv.findByIdInvCanT", query = "SELECT i FROM IdInv i WHERE i.idInvCanT = :idInvCanT")
    , @NamedQuery(name = "IdInv.findByIdInvNota", query = "SELECT i FROM IdInv i WHERE i.idInvNota = :idInvNota")
    , @NamedQuery(name = "IdInv.findByIdInvBodDes", query = "SELECT i FROM IdInv i WHERE i.idInvBodDes = :idInvBodDes")
    , @NamedQuery(name = "IdInv.findByIdInvComL", query = "SELECT i FROM IdInv i WHERE i.idInvComL = :idInvComL")
    , @NamedQuery(name = "IdInv.findByIcInvFec", query = "SELECT i FROM IdInv i WHERE i.icInvFec = :icInvFec")
    , @NamedQuery(name = "IdInv.findByIcInvFecC", query = "SELECT i FROM IdInv i WHERE i.icInvFecC = :icInvFecC")})
public class IdInv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmComCod")
    private short amComCod;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvLin")
    private Short idInvLin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvSeq")
    private long idInvSeq;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "IdInvLotF")
    private String idInvLotF;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "IdInvLotP")
    private String idInvLotP;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvCan")
    private BigDecimal idInvCan;
    @Column(name = "IdInvCanC")
    private BigDecimal idInvCanC;
    @Size(max = 3)
    @Column(name = "IdInvUndM")
    private String idInvUndM;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvCstS")
    private BigDecimal idInvCstS;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvCstR")
    private BigDecimal idInvCstR;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvCstP")
    private BigDecimal idInvCstP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvVCom")
    private BigDecimal idInvVCom;
    @Column(name = "IdInvCstA")
    private BigDecimal idInvCstA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvCstST")
    private BigDecimal idInvCstST;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvCstRT")
    private BigDecimal idInvCstRT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvCstPT")
    private BigDecimal idInvCstPT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInvVComT")
    private BigDecimal idInvVComT;
    @Size(max = 40)
    @Column(name = "IdInvOrd")
    private String idInvOrd;
    @Column(name = "IdInvCanA")
    private BigDecimal idInvCanA;
    @Size(max = 20)
    @Column(name = "IdInvCtaC")
    private String idInvCtaC;
    @Size(max = 20)
    @Column(name = "IdInvCCsC")
    private String idInvCCsC;
    @Size(max = 20)
    @Column(name = "IdInvCtaD")
    private String idInvCtaD;
    @Size(max = 20)
    @Column(name = "IdInvCCsD")
    private String idInvCCsD;
    @Size(max = 20)
    @Column(name = "IdInvCCsP")
    private String idInvCCsP;
    @Column(name = "IdInvEstL")
    private Character idInvEstL;
    @Size(max = 6)
    @Column(name = "IdInvTpR")
    private String idInvTpR;
    @Size(max = 60)
    @Column(name = "IdInvCom")
    private String idInvCom;
    @Size(max = 20)
    @Column(name = "IdInvCau")
    private String idInvCau;
    @Column(name = "IdInvEst")
    private Character idInvEst;
    @Column(name = "IdInvBon")
    private Character idInvBon;
    @Size(max = 20)
    @Column(name = "IdInvTipV")
    private String idInvTipV;
    @Size(max = 20)
    @Column(name = "IdInvNum")
    private String idInvNum;
    @Column(name = "IdInvSec")
    private Short idInvSec;
    @Column(name = "IdInvLinea")
    private Short idInvLinea;
    @Column(name = "IdInvCanT")
    private BigDecimal idInvCanT;
    @Size(max = 200)
    @Column(name = "IdInvNota")
    private String idInvNota;
    @Size(max = 6)
    @Column(name = "IdInvBodDes")
    private String idInvBodDes;
    @Size(max = 200)
    @Column(name = "IdInvComL")
    private String idInvComL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IcInvFec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date icInvFec;
    @Column(name = "IcInvFecC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date icInvFecC;
    @JoinColumn(name = "IcInvNum", referencedColumnName = "IcInvNum")
    @ManyToOne(optional = false)
    private IcInv icInvNum;
    @JoinColumn(name = "ImBodCod", referencedColumnName = "ImBodCod")
    @ManyToOne(optional = false)
    private ImBod imBodCod;
    @JoinColumn(name = "ImLotCod", referencedColumnName = "ImLotCod")
    @ManyToOne(optional = false)
    private ImLot imLotCod;
    @JoinColumn(name = "ImRecCod", referencedColumnName = "ImRecCod")
    @ManyToOne(optional = false)
    private ImRec imRecCod;
    @JoinColumn(name = "ImTDcCod", referencedColumnName = "ImTDcCod")
    @ManyToOne(optional = false)
    private ImTDc imTDcCod;
    @JoinColumn(name = "ImUbiCod", referencedColumnName = "ImUbiCod")
    @ManyToOne(optional = false)
    private ImUbi imUbiCod;
    @JoinColumn(name = "ImUndCod", referencedColumnName = "ImUndCod")
    @ManyToOne(optional = false)
    private ImUnd imUndCod;

    public IdInv() {
    }

    public IdInv(Short idInvLin) {
        this.idInvLin = idInvLin;
    }

    public IdInv(Short idInvLin, short amComCod, long idInvSeq, String idInvLotF, String idInvLotP, BigDecimal idInvCan, BigDecimal idInvCstS, BigDecimal idInvCstR, BigDecimal idInvCstP, BigDecimal idInvVCom, BigDecimal idInvCstST, BigDecimal idInvCstRT, BigDecimal idInvCstPT, BigDecimal idInvVComT, Date icInvFec) {
        this.idInvLin = idInvLin;
        this.amComCod = amComCod;
        this.idInvSeq = idInvSeq;
        this.idInvLotF = idInvLotF;
        this.idInvLotP = idInvLotP;
        this.idInvCan = idInvCan;
        this.idInvCstS = idInvCstS;
        this.idInvCstR = idInvCstR;
        this.idInvCstP = idInvCstP;
        this.idInvVCom = idInvVCom;
        this.idInvCstST = idInvCstST;
        this.idInvCstRT = idInvCstRT;
        this.idInvCstPT = idInvCstPT;
        this.idInvVComT = idInvVComT;
        this.icInvFec = icInvFec;
    }

    public short getAmComCod() {
        return amComCod;
    }

    public void setAmComCod(short amComCod) {
        this.amComCod = amComCod;
    }

    public Short getIdInvLin() {
        return idInvLin;
    }

    public void setIdInvLin(Short idInvLin) {
        this.idInvLin = idInvLin;
    }

    public long getIdInvSeq() {
        return idInvSeq;
    }

    public void setIdInvSeq(long idInvSeq) {
        this.idInvSeq = idInvSeq;
    }

    public String getIdInvLotF() {
        return idInvLotF;
    }

    public void setIdInvLotF(String idInvLotF) {
        this.idInvLotF = idInvLotF;
    }

    public String getIdInvLotP() {
        return idInvLotP;
    }

    public void setIdInvLotP(String idInvLotP) {
        this.idInvLotP = idInvLotP;
    }

    public BigDecimal getIdInvCan() {
        return idInvCan;
    }

    public void setIdInvCan(BigDecimal idInvCan) {
        this.idInvCan = idInvCan;
    }

    public BigDecimal getIdInvCanC() {
        return idInvCanC;
    }

    public void setIdInvCanC(BigDecimal idInvCanC) {
        this.idInvCanC = idInvCanC;
    }

    public String getIdInvUndM() {
        return idInvUndM;
    }

    public void setIdInvUndM(String idInvUndM) {
        this.idInvUndM = idInvUndM;
    }

    public BigDecimal getIdInvCstS() {
        return idInvCstS;
    }

    public void setIdInvCstS(BigDecimal idInvCstS) {
        this.idInvCstS = idInvCstS;
    }

    public BigDecimal getIdInvCstR() {
        return idInvCstR;
    }

    public void setIdInvCstR(BigDecimal idInvCstR) {
        this.idInvCstR = idInvCstR;
    }

    public BigDecimal getIdInvCstP() {
        return idInvCstP;
    }

    public void setIdInvCstP(BigDecimal idInvCstP) {
        this.idInvCstP = idInvCstP;
    }

    public BigDecimal getIdInvVCom() {
        return idInvVCom;
    }

    public void setIdInvVCom(BigDecimal idInvVCom) {
        this.idInvVCom = idInvVCom;
    }

    public BigDecimal getIdInvCstA() {
        return idInvCstA;
    }

    public void setIdInvCstA(BigDecimal idInvCstA) {
        this.idInvCstA = idInvCstA;
    }

    public BigDecimal getIdInvCstST() {
        return idInvCstST;
    }

    public void setIdInvCstST(BigDecimal idInvCstST) {
        this.idInvCstST = idInvCstST;
    }

    public BigDecimal getIdInvCstRT() {
        return idInvCstRT;
    }

    public void setIdInvCstRT(BigDecimal idInvCstRT) {
        this.idInvCstRT = idInvCstRT;
    }

    public BigDecimal getIdInvCstPT() {
        return idInvCstPT;
    }

    public void setIdInvCstPT(BigDecimal idInvCstPT) {
        this.idInvCstPT = idInvCstPT;
    }

    public BigDecimal getIdInvVComT() {
        return idInvVComT;
    }

    public void setIdInvVComT(BigDecimal idInvVComT) {
        this.idInvVComT = idInvVComT;
    }

    public String getIdInvOrd() {
        return idInvOrd;
    }

    public void setIdInvOrd(String idInvOrd) {
        this.idInvOrd = idInvOrd;
    }

    public BigDecimal getIdInvCanA() {
        return idInvCanA;
    }

    public void setIdInvCanA(BigDecimal idInvCanA) {
        this.idInvCanA = idInvCanA;
    }

    public String getIdInvCtaC() {
        return idInvCtaC;
    }

    public void setIdInvCtaC(String idInvCtaC) {
        this.idInvCtaC = idInvCtaC;
    }

    public String getIdInvCCsC() {
        return idInvCCsC;
    }

    public void setIdInvCCsC(String idInvCCsC) {
        this.idInvCCsC = idInvCCsC;
    }

    public String getIdInvCtaD() {
        return idInvCtaD;
    }

    public void setIdInvCtaD(String idInvCtaD) {
        this.idInvCtaD = idInvCtaD;
    }

    public String getIdInvCCsD() {
        return idInvCCsD;
    }

    public void setIdInvCCsD(String idInvCCsD) {
        this.idInvCCsD = idInvCCsD;
    }

    public String getIdInvCCsP() {
        return idInvCCsP;
    }

    public void setIdInvCCsP(String idInvCCsP) {
        this.idInvCCsP = idInvCCsP;
    }

    public Character getIdInvEstL() {
        return idInvEstL;
    }

    public void setIdInvEstL(Character idInvEstL) {
        this.idInvEstL = idInvEstL;
    }

    public String getIdInvTpR() {
        return idInvTpR;
    }

    public void setIdInvTpR(String idInvTpR) {
        this.idInvTpR = idInvTpR;
    }

    public String getIdInvCom() {
        return idInvCom;
    }

    public void setIdInvCom(String idInvCom) {
        this.idInvCom = idInvCom;
    }

    public String getIdInvCau() {
        return idInvCau;
    }

    public void setIdInvCau(String idInvCau) {
        this.idInvCau = idInvCau;
    }

    public Character getIdInvEst() {
        return idInvEst;
    }

    public void setIdInvEst(Character idInvEst) {
        this.idInvEst = idInvEst;
    }

    public Character getIdInvBon() {
        return idInvBon;
    }

    public void setIdInvBon(Character idInvBon) {
        this.idInvBon = idInvBon;
    }

    public String getIdInvTipV() {
        return idInvTipV;
    }

    public void setIdInvTipV(String idInvTipV) {
        this.idInvTipV = idInvTipV;
    }

    public String getIdInvNum() {
        return idInvNum;
    }

    public void setIdInvNum(String idInvNum) {
        this.idInvNum = idInvNum;
    }

    public Short getIdInvSec() {
        return idInvSec;
    }

    public void setIdInvSec(Short idInvSec) {
        this.idInvSec = idInvSec;
    }

    public Short getIdInvLinea() {
        return idInvLinea;
    }

    public void setIdInvLinea(Short idInvLinea) {
        this.idInvLinea = idInvLinea;
    }

    public BigDecimal getIdInvCanT() {
        return idInvCanT;
    }

    public void setIdInvCanT(BigDecimal idInvCanT) {
        this.idInvCanT = idInvCanT;
    }

    public String getIdInvNota() {
        return idInvNota;
    }

    public void setIdInvNota(String idInvNota) {
        this.idInvNota = idInvNota;
    }

    public String getIdInvBodDes() {
        return idInvBodDes;
    }

    public void setIdInvBodDes(String idInvBodDes) {
        this.idInvBodDes = idInvBodDes;
    }

    public String getIdInvComL() {
        return idInvComL;
    }

    public void setIdInvComL(String idInvComL) {
        this.idInvComL = idInvComL;
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

    public IcInv getIcInvNum() {
        return icInvNum;
    }

    public void setIcInvNum(IcInv icInvNum) {
        this.icInvNum = icInvNum;
    }

    public ImBod getImBodCod() {
        return imBodCod;
    }

    public void setImBodCod(ImBod imBodCod) {
        this.imBodCod = imBodCod;
    }

    public ImLot getImLotCod() {
        return imLotCod;
    }

    public void setImLotCod(ImLot imLotCod) {
        this.imLotCod = imLotCod;
    }

    public ImRec getImRecCod() {
        return imRecCod;
    }

    public void setImRecCod(ImRec imRecCod) {
        this.imRecCod = imRecCod;
    }

    public ImTDc getImTDcCod() {
        return imTDcCod;
    }

    public void setImTDcCod(ImTDc imTDcCod) {
        this.imTDcCod = imTDcCod;
    }

    public ImUbi getImUbiCod() {
        return imUbiCod;
    }

    public void setImUbiCod(ImUbi imUbiCod) {
        this.imUbiCod = imUbiCod;
    }

    public ImUnd getImUndCod() {
        return imUndCod;
    }

    public void setImUndCod(ImUnd imUndCod) {
        this.imUndCod = imUndCod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInvLin != null ? idInvLin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IdInv)) {
            return false;
        }
        IdInv other = (IdInv) object;
        if ((this.idInvLin == null && other.idInvLin != null) || (this.idInvLin != null && !this.idInvLin.equals(other.idInvLin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.IdInv[ idInvLin=" + idInvLin + " ]";
    }
    
}
