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
import javax.persistence.Lob;
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
@Table(name = "ImRec")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImRec.findAll", query = "SELECT i FROM ImRec i")
    , @NamedQuery(name = "ImRec.findByImRecCod", query = "SELECT i FROM ImRec i WHERE i.imRecCod = :imRecCod")
    , @NamedQuery(name = "ImRec.findByImRecDes", query = "SELECT i FROM ImRec i WHERE i.imRecDes = :imRecDes")
    , @NamedQuery(name = "ImRec.findByImRecDEx", query = "SELECT i FROM ImRec i WHERE i.imRecDEx = :imRecDEx")
    , @NamedQuery(name = "ImRec.findByImRecEst", query = "SELECT i FROM ImRec i WHERE i.imRecEst = :imRecEst")
    , @NamedQuery(name = "ImRec.findByImRecECst", query = "SELECT i FROM ImRec i WHERE i.imRecECst = :imRecECst")
    , @NamedQuery(name = "ImRec.findByImRecCUM", query = "SELECT i FROM ImRec i WHERE i.imRecCUM = :imRecCUM")
    , @NamedQuery(name = "ImRec.findByImRecReg", query = "SELECT i FROM ImRec i WHERE i.imRecReg = :imRecReg")
    , @NamedQuery(name = "ImRec.findByImRecFec", query = "SELECT i FROM ImRec i WHERE i.imRecFec = :imRecFec")
    , @NamedQuery(name = "ImRec.findByImRecUndS", query = "SELECT i FROM ImRec i WHERE i.imRecUndS = :imRecUndS")
    , @NamedQuery(name = "ImRec.findByImRecUndC", query = "SELECT i FROM ImRec i WHERE i.imRecUndC = :imRecUndC")
    , @NamedQuery(name = "ImRec.findByImRecUndV", query = "SELECT i FROM ImRec i WHERE i.imRecUndV = :imRecUndV")
    , @NamedQuery(name = "ImRec.findByImRecFac", query = "SELECT i FROM ImRec i WHERE i.imRecFac = :imRecFac")
    , @NamedQuery(name = "ImRec.findByImRecGrIC", query = "SELECT i FROM ImRec i WHERE i.imRecGrIC = :imRecGrIC")
    , @NamedQuery(name = "ImRec.findByImRecGrIV", query = "SELECT i FROM ImRec i WHERE i.imRecGrIV = :imRecGrIV")
    , @NamedQuery(name = "ImRec.findByImRecLot", query = "SELECT i FROM ImRec i WHERE i.imRecLot = :imRecLot")
    , @NamedQuery(name = "ImRec.findByImRecSqL", query = "SELECT i FROM ImRec i WHERE i.imRecSqL = :imRecSqL")
    , @NamedQuery(name = "ImRec.findByImRecNLot", query = "SELECT i FROM ImRec i WHERE i.imRecNLot = :imRecNLot")
    , @NamedQuery(name = "ImRec.findByImRecFlgC", query = "SELECT i FROM ImRec i WHERE i.imRecFlgC = :imRecFlgC")
    , @NamedQuery(name = "ImRec.findByImRecFlgV", query = "SELECT i FROM ImRec i WHERE i.imRecFlgV = :imRecFlgV")
    , @NamedQuery(name = "ImRec.findByImRecFlgP", query = "SELECT i FROM ImRec i WHERE i.imRecFlgP = :imRecFlgP")
    , @NamedQuery(name = "ImRec.findByImRecPrv", query = "SELECT i FROM ImRec i WHERE i.imRecPrv = :imRecPrv")
    , @NamedQuery(name = "ImRec.findByImRecCst", query = "SELECT i FROM ImRec i WHERE i.imRecCst = :imRecCst")
    , @NamedQuery(name = "ImRec.findByImRecBROC", query = "SELECT i FROM ImRec i WHERE i.imRecBROC = :imRecBROC")
    , @NamedQuery(name = "ImRec.findByImRecUROC", query = "SELECT i FROM ImRec i WHERE i.imRecUROC = :imRecUROC")
    , @NamedQuery(name = "ImRec.findByImRecBDC", query = "SELECT i FROM ImRec i WHERE i.imRecBDC = :imRecBDC")
    , @NamedQuery(name = "ImRec.findByImRecUDC", query = "SELECT i FROM ImRec i WHERE i.imRecUDC = :imRecUDC")
    , @NamedQuery(name = "ImRec.findByImRecTRcp", query = "SELECT i FROM ImRec i WHERE i.imRecTRcp = :imRecTRcp")
    , @NamedQuery(name = "ImRec.findByImRecPBrt", query = "SELECT i FROM ImRec i WHERE i.imRecPBrt = :imRecPBrt")
    , @NamedQuery(name = "ImRec.findByImRecPNet", query = "SELECT i FROM ImRec i WHERE i.imRecPNet = :imRecPNet")
    , @NamedQuery(name = "ImRec.findByImRecLrg", query = "SELECT i FROM ImRec i WHERE i.imRecLrg = :imRecLrg")
    , @NamedQuery(name = "ImRec.findByImRecAnc", query = "SELECT i FROM ImRec i WHERE i.imRecAnc = :imRecAnc")
    , @NamedQuery(name = "ImRec.findByImRecAlt", query = "SELECT i FROM ImRec i WHERE i.imRecAlt = :imRecAlt")
    , @NamedQuery(name = "ImRec.findByImRecGUn", query = "SELECT i FROM ImRec i WHERE i.imRecGUn = :imRecGUn")
    , @NamedQuery(name = "ImRec.findByImRecPln", query = "SELECT i FROM ImRec i WHERE i.imRecPln = :imRecPln")
    , @NamedQuery(name = "ImRec.findByImRecGrp01", query = "SELECT i FROM ImRec i WHERE i.imRecGrp01 = :imRecGrp01")
    , @NamedQuery(name = "ImRec.findByImRecGrp02", query = "SELECT i FROM ImRec i WHERE i.imRecGrp02 = :imRecGrp02")
    , @NamedQuery(name = "ImRec.findByImRecGrp03", query = "SELECT i FROM ImRec i WHERE i.imRecGrp03 = :imRecGrp03")
    , @NamedQuery(name = "ImRec.findByImRecGrp04", query = "SELECT i FROM ImRec i WHERE i.imRecGrp04 = :imRecGrp04")
    , @NamedQuery(name = "ImRec.findByImRecGrp05", query = "SELECT i FROM ImRec i WHERE i.imRecGrp05 = :imRecGrp05")
    , @NamedQuery(name = "ImRec.findByImRecGrp06", query = "SELECT i FROM ImRec i WHERE i.imRecGrp06 = :imRecGrp06")
    , @NamedQuery(name = "ImRec.findByImRecGrp07", query = "SELECT i FROM ImRec i WHERE i.imRecGrp07 = :imRecGrp07")
    , @NamedQuery(name = "ImRec.findByImRecGrp08", query = "SELECT i FROM ImRec i WHERE i.imRecGrp08 = :imRecGrp08")
    , @NamedQuery(name = "ImRec.findByImRecGrp09", query = "SELECT i FROM ImRec i WHERE i.imRecGrp09 = :imRecGrp09")
    , @NamedQuery(name = "ImRec.findByImRecGrp10", query = "SELECT i FROM ImRec i WHERE i.imRecGrp10 = :imRecGrp10")
    , @NamedQuery(name = "ImRec.findByImRecCCs1", query = "SELECT i FROM ImRec i WHERE i.imRecCCs1 = :imRecCCs1")
    , @NamedQuery(name = "ImRec.findByImRecCCn1", query = "SELECT i FROM ImRec i WHERE i.imRecCCn1 = :imRecCCn1")
    , @NamedQuery(name = "ImRec.findByImRecCCs2", query = "SELECT i FROM ImRec i WHERE i.imRecCCs2 = :imRecCCs2")
    , @NamedQuery(name = "ImRec.findByImRecCCn2", query = "SELECT i FROM ImRec i WHERE i.imRecCCn2 = :imRecCCn2")
    , @NamedQuery(name = "ImRec.findByImRecCCs3", query = "SELECT i FROM ImRec i WHERE i.imRecCCs3 = :imRecCCs3")
    , @NamedQuery(name = "ImRec.findByImRecCCn3", query = "SELECT i FROM ImRec i WHERE i.imRecCCn3 = :imRecCCn3")
    , @NamedQuery(name = "ImRec.findByImRecCCs4", query = "SELECT i FROM ImRec i WHERE i.imRecCCs4 = :imRecCCs4")
    , @NamedQuery(name = "ImRec.findByImRecCCn4", query = "SELECT i FROM ImRec i WHERE i.imRecCCn4 = :imRecCCn4")
    , @NamedQuery(name = "ImRec.findByImRecIdF", query = "SELECT i FROM ImRec i WHERE i.imRecIdF = :imRecIdF")
    , @NamedQuery(name = "ImRec.findByImRecBar", query = "SELECT i FROM ImRec i WHERE i.imRecBar = :imRecBar")
    , @NamedQuery(name = "ImRec.findByImRecDis", query = "SELECT i FROM ImRec i WHERE i.imRecDis = :imRecDis")
    , @NamedQuery(name = "ImRec.findByImRecPar", query = "SELECT i FROM ImRec i WHERE i.imRecPar = :imRecPar")
    , @NamedQuery(name = "ImRec.findByImRecUsr", query = "SELECT i FROM ImRec i WHERE i.imRecUsr = :imRecUsr")
    , @NamedQuery(name = "ImRec.findByImRecFHR", query = "SELECT i FROM ImRec i WHERE i.imRecFHR = :imRecFHR")
    , @NamedQuery(name = "ImRec.findByImRecSqD", query = "SELECT i FROM ImRec i WHERE i.imRecSqD = :imRecSqD")
    , @NamedQuery(name = "ImRec.findByImRecDesMC", query = "SELECT i FROM ImRec i WHERE i.imRecDesMC = :imRecDesMC")
    , @NamedQuery(name = "ImRec.findByImRecDesMV", query = "SELECT i FROM ImRec i WHERE i.imRecDesMV = :imRecDesMV")
    , @NamedQuery(name = "ImRec.findByImRecRep", query = "SELECT i FROM ImRec i WHERE i.imRecRep = :imRecRep")
    , @NamedQuery(name = "ImRec.findByImRecEAN13", query = "SELECT i FROM ImRec i WHERE i.imRecEAN13 = :imRecEAN13")
    , @NamedQuery(name = "ImRec.findByImRecEAN13N", query = "SELECT i FROM ImRec i WHERE i.imRecEAN13N = :imRecEAN13N")
    , @NamedQuery(name = "ImRec.findByImRecEAN141", query = "SELECT i FROM ImRec i WHERE i.imRecEAN141 = :imRecEAN141")
    , @NamedQuery(name = "ImRec.findByImRecEAN1412", query = "SELECT i FROM ImRec i WHERE i.imRecEAN1412 = :imRecEAN1412")
    , @NamedQuery(name = "ImRec.findByImRecFecA", query = "SELECT i FROM ImRec i WHERE i.imRecFecA = :imRecFecA")
    , @NamedQuery(name = "ImRec.findByImRecFecR", query = "SELECT i FROM ImRec i WHERE i.imRecFecR = :imRecFecR")
    , @NamedQuery(name = "ImRec.findByImRecURC", query = "SELECT i FROM ImRec i WHERE i.imRecURC = :imRecURC")
    , @NamedQuery(name = "ImRec.findByImRecRegA", query = "SELECT i FROM ImRec i WHERE i.imRecRegA = :imRecRegA")
    , @NamedQuery(name = "ImRec.findByImRecInst", query = "SELECT i FROM ImRec i WHERE i.imRecInst = :imRecInst")
    , @NamedQuery(name = "ImRec.findByImRecNomC", query = "SELECT i FROM ImRec i WHERE i.imRecNomC = :imRecNomC")
    , @NamedQuery(name = "ImRec.findByImRecNomG", query = "SELECT i FROM ImRec i WHERE i.imRecNomG = :imRecNomG")
    , @NamedQuery(name = "ImRec.findByImRecRegS", query = "SELECT i FROM ImRec i WHERE i.imRecRegS = :imRecRegS")
    , @NamedQuery(name = "ImRec.findByImRecProc", query = "SELECT i FROM ImRec i WHERE i.imRecProc = :imRecProc")
    , @NamedQuery(name = "ImRec.findByImRecVDen", query = "SELECT i FROM ImRec i WHERE i.imRecVDen = :imRecVDen")
    , @NamedQuery(name = "ImRec.findByImRecFlgO", query = "SELECT i FROM ImRec i WHERE i.imRecFlgO = :imRecFlgO")
    , @NamedQuery(name = "ImRec.findByImRecCstI", query = "SELECT i FROM ImRec i WHERE i.imRecCstI = :imRecCstI")
    , @NamedQuery(name = "ImRec.findByImRecExp", query = "SELECT i FROM ImRec i WHERE i.imRecExp = :imRecExp")
    , @NamedQuery(name = "ImRec.findByImRecODis", query = "SELECT i FROM ImRec i WHERE i.imRecODis = :imRecODis")
    , @NamedQuery(name = "ImRec.findByImRecPIn", query = "SELECT i FROM ImRec i WHERE i.imRecPIn = :imRecPIn")
    , @NamedQuery(name = "ImRec.findByImRecPEb", query = "SELECT i FROM ImRec i WHERE i.imRecPEb = :imRecPEb")
    , @NamedQuery(name = "ImRec.findByImRecPrsV", query = "SELECT i FROM ImRec i WHERE i.imRecPrsV = :imRecPrsV")
    , @NamedQuery(name = "ImRec.findByImRecCAS", query = "SELECT i FROM ImRec i WHERE i.imRecCAS = :imRecCAS")
    , @NamedQuery(name = "ImRec.findByImRecFEMA", query = "SELECT i FROM ImRec i WHERE i.imRecFEMA = :imRecFEMA")
    , @NamedQuery(name = "ImRec.findByImRecForG", query = "SELECT i FROM ImRec i WHERE i.imRecForG = :imRecForG")
    , @NamedQuery(name = "ImRec.findByImReCGrpQ", query = "SELECT i FROM ImRec i WHERE i.imReCGrpQ = :imReCGrpQ")
    , @NamedQuery(name = "ImRec.findByImRecSolA", query = "SELECT i FROM ImRec i WHERE i.imRecSolA = :imRecSolA")
    , @NamedQuery(name = "ImRec.findByImRecSolAl", query = "SELECT i FROM ImRec i WHERE i.imRecSolAl = :imRecSolAl")
    , @NamedQuery(name = "ImRec.findByImRecSolOA", query = "SELECT i FROM ImRec i WHERE i.imRecSolOA = :imRecSolOA")
    , @NamedQuery(name = "ImRec.findByImRecINCJ", query = "SELECT i FROM ImRec i WHERE i.imRecINCJ = :imRecINCJ")
    , @NamedQuery(name = "ImRec.findByImRecSin", query = "SELECT i FROM ImRec i WHERE i.imRecSin = :imRecSin")
    , @NamedQuery(name = "ImRec.findByImRecPrP", query = "SELECT i FROM ImRec i WHERE i.imRecPrP = :imRecPrP")
    , @NamedQuery(name = "ImRec.findByImRecPrA", query = "SELECT i FROM ImRec i WHERE i.imRecPrA = :imRecPrA")
    , @NamedQuery(name = "ImRec.findByImRecSqN", query = "SELECT i FROM ImRec i WHERE i.imRecSqN = :imRecSqN")
    , @NamedQuery(name = "ImRec.findByImRecPre", query = "SELECT i FROM ImRec i WHERE i.imRecPre = :imRecPre")
    , @NamedQuery(name = "ImRec.findByImRecIngA", query = "SELECT i FROM ImRec i WHERE i.imRecIngA = :imRecIngA")
    , @NamedQuery(name = "ImRec.findByImRecModA", query = "SELECT i FROM ImRec i WHERE i.imRecModA = :imRecModA")
    , @NamedQuery(name = "ImRec.findByImRecForA", query = "SELECT i FROM ImRec i WHERE i.imRecForA = :imRecForA")
    , @NamedQuery(name = "ImRec.findByImRecFreA", query = "SELECT i FROM ImRec i WHERE i.imRecFreA = :imRecFreA")
    , @NamedQuery(name = "ImRec.findByImRecPerC", query = "SELECT i FROM ImRec i WHERE i.imRecPerC = :imRecPerC")
    , @NamedQuery(name = "ImRec.findByImRecFCon", query = "SELECT i FROM ImRec i WHERE i.imRecFCon = :imRecFCon")
    , @NamedQuery(name = "ImRec.findByImRecPSem", query = "SELECT i FROM ImRec i WHERE i.imRecPSem = :imRecPSem")
    , @NamedQuery(name = "ImRec.findByImRecTipoLabor", query = "SELECT i FROM ImRec i WHERE i.imRecTipoLabor = :imRecTipoLabor")
    , @NamedQuery(name = "ImRec.findByImRecBeneficios", query = "SELECT i FROM ImRec i WHERE i.imRecBeneficios = :imRecBeneficios")
    , @NamedQuery(name = "ImRec.findByImRecAfePre", query = "SELECT i FROM ImRec i WHERE i.imRecAfePre = :imRecAfePre")
    , @NamedQuery(name = "ImRec.findByImRecMinZ", query = "SELECT i FROM ImRec i WHERE i.imRecMinZ = :imRecMinZ")
    , @NamedQuery(name = "ImRec.findByImRecMaxZ", query = "SELECT i FROM ImRec i WHERE i.imRecMaxZ = :imRecMaxZ")
    , @NamedQuery(name = "ImRec.findByImRecEsp", query = "SELECT i FROM ImRec i WHERE i.imRecEsp = :imRecEsp")
    , @NamedQuery(name = "ImRec.findByImRecSim", query = "SELECT i FROM ImRec i WHERE i.imRecSim = :imRecSim")})
public class ImRec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ImRecCod")
    private String imRecCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ImRecDes")
    private String imRecDes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ImRecDEx")
    private String imRecDEx;
    @Column(name = "ImRecEst")
    private Character imRecEst;
    @Size(max = 10)
    @Column(name = "ImRecECst")
    private String imRecECst;
    @Size(max = 30)
    @Column(name = "ImRecCUM")
    private String imRecCUM;
    @Size(max = 30)
    @Column(name = "ImRecReg")
    private String imRecReg;
    @Column(name = "ImRecFec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imRecFec;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ImRecUndS")
    private String imRecUndS;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ImRecUndC")
    private String imRecUndC;
    @Size(max = 3)
    @Column(name = "ImRecUndV")
    private String imRecUndV;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ImRecFac")
    private BigDecimal imRecFac;
    @Size(max = 5)
    @Column(name = "ImRecGrIC")
    private String imRecGrIC;
    @Size(max = 5)
    @Column(name = "ImRecGrIV")
    private String imRecGrIV;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImRecLot")
    private Character imRecLot;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ImRecSqL")
    private String imRecSqL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImRecNLot")
    private Character imRecNLot;
    @Column(name = "ImRecFlgC")
    private Character imRecFlgC;
    @Column(name = "ImRecFlgV")
    private Character imRecFlgV;
    @Column(name = "ImRecFlgP")
    private Character imRecFlgP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImRecPrv")
    private int imRecPrv;
    @Column(name = "ImRecCst")
    private BigDecimal imRecCst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ImRecBROC")
    private String imRecBROC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ImRecUROC")
    private String imRecUROC;
    @Size(max = 6)
    @Column(name = "ImRecBDC")
    private String imRecBDC;
    @Size(max = 10)
    @Column(name = "ImRecUDC")
    private String imRecUDC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImRecTRcp")
    private BigDecimal imRecTRcp;
    @Column(name = "ImRecPBrt")
    private BigDecimal imRecPBrt;
    @Column(name = "ImRecPNet")
    private BigDecimal imRecPNet;
    @Column(name = "ImRecLrg")
    private BigDecimal imRecLrg;
    @Column(name = "ImRecAnc")
    private BigDecimal imRecAnc;
    @Column(name = "ImRecAlt")
    private BigDecimal imRecAlt;
    @Column(name = "ImRecGUn")
    private BigDecimal imRecGUn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImRecPln")
    private short imRecPln;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp01")
    private String imRecGrp01;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp02")
    private String imRecGrp02;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp03")
    private String imRecGrp03;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp04")
    private String imRecGrp04;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp05")
    private String imRecGrp05;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp06")
    private String imRecGrp06;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp07")
    private String imRecGrp07;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp08")
    private String imRecGrp08;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp09")
    private String imRecGrp09;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImRecGrp10")
    private String imRecGrp10;
    @Size(max = 20)
    @Column(name = "ImRecCCs1")
    private String imRecCCs1;
    @Size(max = 20)
    @Column(name = "ImRecCCn1")
    private String imRecCCn1;
    @Size(max = 20)
    @Column(name = "ImRecCCs2")
    private String imRecCCs2;
    @Size(max = 20)
    @Column(name = "ImRecCCn2")
    private String imRecCCn2;
    @Size(max = 20)
    @Column(name = "ImRecCCs3")
    private String imRecCCs3;
    @Size(max = 20)
    @Column(name = "ImRecCCn3")
    private String imRecCCn3;
    @Size(max = 20)
    @Column(name = "ImRecCCs4")
    private String imRecCCs4;
    @Size(max = 20)
    @Column(name = "ImRecCCn4")
    private String imRecCCn4;
    @Size(max = 3)
    @Column(name = "ImRecIdF")
    private String imRecIdF;
    @Lob
    @Column(name = "ImRecImg")
    private byte[] imRecImg;
    @Size(max = 13)
    @Column(name = "ImRecBar")
    private String imRecBar;
    @Column(name = "ImRecDis")
    private Character imRecDis;
    @Size(max = 20)
    @Column(name = "ImRecPar")
    private String imRecPar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImRecUsr")
    private String imRecUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImRecFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imRecFHR;
    @Column(name = "ImRecSqD")
    private Short imRecSqD;
    @Column(name = "ImRecDesMC")
    private BigDecimal imRecDesMC;
    @Column(name = "ImRecDesMV")
    private BigDecimal imRecDesMV;
    @Column(name = "ImRecRep")
    private Character imRecRep;
    @Size(max = 13)
    @Column(name = "ImRecEAN13")
    private String imRecEAN13;
    @Size(max = 13)
    @Column(name = "ImRecEAN13N")
    private String imRecEAN13N;
    @Size(max = 14)
    @Column(name = "ImRecEAN141")
    private String imRecEAN141;
    @Size(max = 14)
    @Column(name = "ImRecEAN1412")
    private String imRecEAN1412;
    @Column(name = "ImRecFecA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imRecFecA;
    @Column(name = "ImRecFecR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imRecFecR;
    @Column(name = "ImRecURC")
    private Integer imRecURC;
    @Size(max = 30)
    @Column(name = "ImRecRegA")
    private String imRecRegA;
    @Size(max = 6)
    @Column(name = "ImRecInst")
    private String imRecInst;
    @Size(max = 50)
    @Column(name = "ImRecNomC")
    private String imRecNomC;
    @Size(max = 50)
    @Column(name = "ImRecNomG")
    private String imRecNomG;
    @Size(max = 40)
    @Column(name = "ImRecRegS")
    private String imRecRegS;
    @Size(max = 40)
    @Column(name = "ImRecProc")
    private String imRecProc;
    @Column(name = "ImRecVDen")
    private BigDecimal imRecVDen;
    @Column(name = "ImRecFlgO")
    private Character imRecFlgO;
    @Column(name = "ImRecCstI")
    private Character imRecCstI;
    @Column(name = "ImRecExp")
    private Character imRecExp;
    @Column(name = "ImRecODis")
    private Character imRecODis;
    @Size(max = 20)
    @Column(name = "ImRecPIn")
    private String imRecPIn;
    @Size(max = 20)
    @Column(name = "ImRecPEb")
    private String imRecPEb;
    @Size(max = 20)
    @Column(name = "ImRecPrsV")
    private String imRecPrsV;
    @Size(max = 20)
    @Column(name = "ImRecCAS")
    private String imRecCAS;
    @Size(max = 20)
    @Column(name = "ImRecFEMA")
    private String imRecFEMA;
    @Size(max = 20)
    @Column(name = "ImRecForG")
    private String imRecForG;
    @Size(max = 20)
    @Column(name = "ImReCGrpQ")
    private String imReCGrpQ;
    @Size(max = 20)
    @Column(name = "ImRecSolA")
    private String imRecSolA;
    @Size(max = 20)
    @Column(name = "ImRecSolAl")
    private String imRecSolAl;
    @Size(max = 20)
    @Column(name = "ImRecSolOA")
    private String imRecSolOA;
    @Size(max = 20)
    @Column(name = "ImRecINCJ")
    private String imRecINCJ;
    @Size(max = 20)
    @Column(name = "ImRecSin")
    private String imRecSin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImRecPrP")
    private int imRecPrP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImRecPrA")
    private int imRecPrA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImRecSqN")
    private short imRecSqN;
    @Column(name = "ImRecPre")
    private BigDecimal imRecPre;
    @Size(max = 100)
    @Column(name = "ImRecIngA")
    private String imRecIngA;
    @Size(max = 100)
    @Column(name = "ImRecModA")
    private String imRecModA;
    @Size(max = 100)
    @Column(name = "ImRecForA")
    private String imRecForA;
    @Size(max = 100)
    @Column(name = "ImRecFreA")
    private String imRecFreA;
    @Size(max = 100)
    @Column(name = "ImRecPerC")
    private String imRecPerC;
    @Column(name = "ImRecFCon")
    private BigDecimal imRecFCon;
    @Column(name = "ImRecPSem")
    private BigDecimal imRecPSem;
    @Column(name = "ImRecTipoLabor")
    private Character imRecTipoLabor;
    @Column(name = "ImRecBeneficios")
    private Character imRecBeneficios;
    @Column(name = "ImRecAfePre")
    private Boolean imRecAfePre;
    @Size(max = 10)
    @Column(name = "ImRecMinZ")
    private String imRecMinZ;
    @Size(max = 10)
    @Column(name = "ImRecMaxZ")
    private String imRecMaxZ;
    @Size(max = 50)
    @Column(name = "ImRecEsp")
    private String imRecEsp;
    @Size(max = 10)
    @Column(name = "ImRecSim")
    private String imRecSim;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imRecCod")
    private Collection<IdInv> idInvCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imRecCod")
    private Collection<ImLot> imLotCollection;
    @JoinColumn(name = "ImClaCod", referencedColumnName = "ImClaCod")
    @ManyToOne(optional = false)
    private ImCla imClaCod;
    @JoinColumn(name = "ImTpRCod", referencedColumnName = "ImTpRCod")
    @ManyToOne(optional = false)
    private ImTpR imTpRCod;

    public ImRec() {
    }

    public ImRec(String imRecCod) {
        this.imRecCod = imRecCod;
    }

    public ImRec(String imRecCod, String imRecDes, String imRecDEx, String imRecUndS, String imRecUndC, Character imRecLot, String imRecSqL, Character imRecNLot, int imRecPrv, String imRecBROC, String imRecUROC, BigDecimal imRecTRcp, short imRecPln, String imRecGrp01, String imRecGrp02, String imRecGrp03, String imRecGrp04, String imRecGrp05, String imRecGrp06, String imRecGrp07, String imRecGrp08, String imRecGrp09, String imRecGrp10, String imRecUsr, Date imRecFHR, int imRecPrP, int imRecPrA, short imRecSqN) {
        this.imRecCod = imRecCod;
        this.imRecDes = imRecDes;
        this.imRecDEx = imRecDEx;
        this.imRecUndS = imRecUndS;
        this.imRecUndC = imRecUndC;
        this.imRecLot = imRecLot;
        this.imRecSqL = imRecSqL;
        this.imRecNLot = imRecNLot;
        this.imRecPrv = imRecPrv;
        this.imRecBROC = imRecBROC;
        this.imRecUROC = imRecUROC;
        this.imRecTRcp = imRecTRcp;
        this.imRecPln = imRecPln;
        this.imRecGrp01 = imRecGrp01;
        this.imRecGrp02 = imRecGrp02;
        this.imRecGrp03 = imRecGrp03;
        this.imRecGrp04 = imRecGrp04;
        this.imRecGrp05 = imRecGrp05;
        this.imRecGrp06 = imRecGrp06;
        this.imRecGrp07 = imRecGrp07;
        this.imRecGrp08 = imRecGrp08;
        this.imRecGrp09 = imRecGrp09;
        this.imRecGrp10 = imRecGrp10;
        this.imRecUsr = imRecUsr;
        this.imRecFHR = imRecFHR;
        this.imRecPrP = imRecPrP;
        this.imRecPrA = imRecPrA;
        this.imRecSqN = imRecSqN;
    }

    public String getImRecCod() {
        return imRecCod;
    }

    public void setImRecCod(String imRecCod) {
        this.imRecCod = imRecCod;
    }

    public String getImRecDes() {
        return imRecDes;
    }

    public void setImRecDes(String imRecDes) {
        this.imRecDes = imRecDes;
    }

    public String getImRecDEx() {
        return imRecDEx;
    }

    public void setImRecDEx(String imRecDEx) {
        this.imRecDEx = imRecDEx;
    }

    public Character getImRecEst() {
        return imRecEst;
    }

    public void setImRecEst(Character imRecEst) {
        this.imRecEst = imRecEst;
    }

    public String getImRecECst() {
        return imRecECst;
    }

    public void setImRecECst(String imRecECst) {
        this.imRecECst = imRecECst;
    }

    public String getImRecCUM() {
        return imRecCUM;
    }

    public void setImRecCUM(String imRecCUM) {
        this.imRecCUM = imRecCUM;
    }

    public String getImRecReg() {
        return imRecReg;
    }

    public void setImRecReg(String imRecReg) {
        this.imRecReg = imRecReg;
    }

    public Date getImRecFec() {
        return imRecFec;
    }

    public void setImRecFec(Date imRecFec) {
        this.imRecFec = imRecFec;
    }

    public String getImRecUndS() {
        return imRecUndS;
    }

    public void setImRecUndS(String imRecUndS) {
        this.imRecUndS = imRecUndS;
    }

    public String getImRecUndC() {
        return imRecUndC;
    }

    public void setImRecUndC(String imRecUndC) {
        this.imRecUndC = imRecUndC;
    }

    public String getImRecUndV() {
        return imRecUndV;
    }

    public void setImRecUndV(String imRecUndV) {
        this.imRecUndV = imRecUndV;
    }

    public BigDecimal getImRecFac() {
        return imRecFac;
    }

    public void setImRecFac(BigDecimal imRecFac) {
        this.imRecFac = imRecFac;
    }

    public String getImRecGrIC() {
        return imRecGrIC;
    }

    public void setImRecGrIC(String imRecGrIC) {
        this.imRecGrIC = imRecGrIC;
    }

    public String getImRecGrIV() {
        return imRecGrIV;
    }

    public void setImRecGrIV(String imRecGrIV) {
        this.imRecGrIV = imRecGrIV;
    }

    public Character getImRecLot() {
        return imRecLot;
    }

    public void setImRecLot(Character imRecLot) {
        this.imRecLot = imRecLot;
    }

    public String getImRecSqL() {
        return imRecSqL;
    }

    public void setImRecSqL(String imRecSqL) {
        this.imRecSqL = imRecSqL;
    }

    public Character getImRecNLot() {
        return imRecNLot;
    }

    public void setImRecNLot(Character imRecNLot) {
        this.imRecNLot = imRecNLot;
    }

    public Character getImRecFlgC() {
        return imRecFlgC;
    }

    public void setImRecFlgC(Character imRecFlgC) {
        this.imRecFlgC = imRecFlgC;
    }

    public Character getImRecFlgV() {
        return imRecFlgV;
    }

    public void setImRecFlgV(Character imRecFlgV) {
        this.imRecFlgV = imRecFlgV;
    }

    public Character getImRecFlgP() {
        return imRecFlgP;
    }

    public void setImRecFlgP(Character imRecFlgP) {
        this.imRecFlgP = imRecFlgP;
    }

    public int getImRecPrv() {
        return imRecPrv;
    }

    public void setImRecPrv(int imRecPrv) {
        this.imRecPrv = imRecPrv;
    }

    public BigDecimal getImRecCst() {
        return imRecCst;
    }

    public void setImRecCst(BigDecimal imRecCst) {
        this.imRecCst = imRecCst;
    }

    public String getImRecBROC() {
        return imRecBROC;
    }

    public void setImRecBROC(String imRecBROC) {
        this.imRecBROC = imRecBROC;
    }

    public String getImRecUROC() {
        return imRecUROC;
    }

    public void setImRecUROC(String imRecUROC) {
        this.imRecUROC = imRecUROC;
    }

    public String getImRecBDC() {
        return imRecBDC;
    }

    public void setImRecBDC(String imRecBDC) {
        this.imRecBDC = imRecBDC;
    }

    public String getImRecUDC() {
        return imRecUDC;
    }

    public void setImRecUDC(String imRecUDC) {
        this.imRecUDC = imRecUDC;
    }

    public BigDecimal getImRecTRcp() {
        return imRecTRcp;
    }

    public void setImRecTRcp(BigDecimal imRecTRcp) {
        this.imRecTRcp = imRecTRcp;
    }

    public BigDecimal getImRecPBrt() {
        return imRecPBrt;
    }

    public void setImRecPBrt(BigDecimal imRecPBrt) {
        this.imRecPBrt = imRecPBrt;
    }

    public BigDecimal getImRecPNet() {
        return imRecPNet;
    }

    public void setImRecPNet(BigDecimal imRecPNet) {
        this.imRecPNet = imRecPNet;
    }

    public BigDecimal getImRecLrg() {
        return imRecLrg;
    }

    public void setImRecLrg(BigDecimal imRecLrg) {
        this.imRecLrg = imRecLrg;
    }

    public BigDecimal getImRecAnc() {
        return imRecAnc;
    }

    public void setImRecAnc(BigDecimal imRecAnc) {
        this.imRecAnc = imRecAnc;
    }

    public BigDecimal getImRecAlt() {
        return imRecAlt;
    }

    public void setImRecAlt(BigDecimal imRecAlt) {
        this.imRecAlt = imRecAlt;
    }

    public BigDecimal getImRecGUn() {
        return imRecGUn;
    }

    public void setImRecGUn(BigDecimal imRecGUn) {
        this.imRecGUn = imRecGUn;
    }

    public short getImRecPln() {
        return imRecPln;
    }

    public void setImRecPln(short imRecPln) {
        this.imRecPln = imRecPln;
    }

    public String getImRecGrp01() {
        return imRecGrp01;
    }

    public void setImRecGrp01(String imRecGrp01) {
        this.imRecGrp01 = imRecGrp01;
    }

    public String getImRecGrp02() {
        return imRecGrp02;
    }

    public void setImRecGrp02(String imRecGrp02) {
        this.imRecGrp02 = imRecGrp02;
    }

    public String getImRecGrp03() {
        return imRecGrp03;
    }

    public void setImRecGrp03(String imRecGrp03) {
        this.imRecGrp03 = imRecGrp03;
    }

    public String getImRecGrp04() {
        return imRecGrp04;
    }

    public void setImRecGrp04(String imRecGrp04) {
        this.imRecGrp04 = imRecGrp04;
    }

    public String getImRecGrp05() {
        return imRecGrp05;
    }

    public void setImRecGrp05(String imRecGrp05) {
        this.imRecGrp05 = imRecGrp05;
    }

    public String getImRecGrp06() {
        return imRecGrp06;
    }

    public void setImRecGrp06(String imRecGrp06) {
        this.imRecGrp06 = imRecGrp06;
    }

    public String getImRecGrp07() {
        return imRecGrp07;
    }

    public void setImRecGrp07(String imRecGrp07) {
        this.imRecGrp07 = imRecGrp07;
    }

    public String getImRecGrp08() {
        return imRecGrp08;
    }

    public void setImRecGrp08(String imRecGrp08) {
        this.imRecGrp08 = imRecGrp08;
    }

    public String getImRecGrp09() {
        return imRecGrp09;
    }

    public void setImRecGrp09(String imRecGrp09) {
        this.imRecGrp09 = imRecGrp09;
    }

    public String getImRecGrp10() {
        return imRecGrp10;
    }

    public void setImRecGrp10(String imRecGrp10) {
        this.imRecGrp10 = imRecGrp10;
    }

    public String getImRecCCs1() {
        return imRecCCs1;
    }

    public void setImRecCCs1(String imRecCCs1) {
        this.imRecCCs1 = imRecCCs1;
    }

    public String getImRecCCn1() {
        return imRecCCn1;
    }

    public void setImRecCCn1(String imRecCCn1) {
        this.imRecCCn1 = imRecCCn1;
    }

    public String getImRecCCs2() {
        return imRecCCs2;
    }

    public void setImRecCCs2(String imRecCCs2) {
        this.imRecCCs2 = imRecCCs2;
    }

    public String getImRecCCn2() {
        return imRecCCn2;
    }

    public void setImRecCCn2(String imRecCCn2) {
        this.imRecCCn2 = imRecCCn2;
    }

    public String getImRecCCs3() {
        return imRecCCs3;
    }

    public void setImRecCCs3(String imRecCCs3) {
        this.imRecCCs3 = imRecCCs3;
    }

    public String getImRecCCn3() {
        return imRecCCn3;
    }

    public void setImRecCCn3(String imRecCCn3) {
        this.imRecCCn3 = imRecCCn3;
    }

    public String getImRecCCs4() {
        return imRecCCs4;
    }

    public void setImRecCCs4(String imRecCCs4) {
        this.imRecCCs4 = imRecCCs4;
    }

    public String getImRecCCn4() {
        return imRecCCn4;
    }

    public void setImRecCCn4(String imRecCCn4) {
        this.imRecCCn4 = imRecCCn4;
    }

    public String getImRecIdF() {
        return imRecIdF;
    }

    public void setImRecIdF(String imRecIdF) {
        this.imRecIdF = imRecIdF;
    }

    public byte[] getImRecImg() {
        return imRecImg;
    }

    public void setImRecImg(byte[] imRecImg) {
        this.imRecImg = imRecImg;
    }

    public String getImRecBar() {
        return imRecBar;
    }

    public void setImRecBar(String imRecBar) {
        this.imRecBar = imRecBar;
    }

    public Character getImRecDis() {
        return imRecDis;
    }

    public void setImRecDis(Character imRecDis) {
        this.imRecDis = imRecDis;
    }

    public String getImRecPar() {
        return imRecPar;
    }

    public void setImRecPar(String imRecPar) {
        this.imRecPar = imRecPar;
    }

    public String getImRecUsr() {
        return imRecUsr;
    }

    public void setImRecUsr(String imRecUsr) {
        this.imRecUsr = imRecUsr;
    }

    public Date getImRecFHR() {
        return imRecFHR;
    }

    public void setImRecFHR(Date imRecFHR) {
        this.imRecFHR = imRecFHR;
    }

    public Short getImRecSqD() {
        return imRecSqD;
    }

    public void setImRecSqD(Short imRecSqD) {
        this.imRecSqD = imRecSqD;
    }

    public BigDecimal getImRecDesMC() {
        return imRecDesMC;
    }

    public void setImRecDesMC(BigDecimal imRecDesMC) {
        this.imRecDesMC = imRecDesMC;
    }

    public BigDecimal getImRecDesMV() {
        return imRecDesMV;
    }

    public void setImRecDesMV(BigDecimal imRecDesMV) {
        this.imRecDesMV = imRecDesMV;
    }

    public Character getImRecRep() {
        return imRecRep;
    }

    public void setImRecRep(Character imRecRep) {
        this.imRecRep = imRecRep;
    }

    public String getImRecEAN13() {
        return imRecEAN13;
    }

    public void setImRecEAN13(String imRecEAN13) {
        this.imRecEAN13 = imRecEAN13;
    }

    public String getImRecEAN13N() {
        return imRecEAN13N;
    }

    public void setImRecEAN13N(String imRecEAN13N) {
        this.imRecEAN13N = imRecEAN13N;
    }

    public String getImRecEAN141() {
        return imRecEAN141;
    }

    public void setImRecEAN141(String imRecEAN141) {
        this.imRecEAN141 = imRecEAN141;
    }

    public String getImRecEAN1412() {
        return imRecEAN1412;
    }

    public void setImRecEAN1412(String imRecEAN1412) {
        this.imRecEAN1412 = imRecEAN1412;
    }

    public Date getImRecFecA() {
        return imRecFecA;
    }

    public void setImRecFecA(Date imRecFecA) {
        this.imRecFecA = imRecFecA;
    }

    public Date getImRecFecR() {
        return imRecFecR;
    }

    public void setImRecFecR(Date imRecFecR) {
        this.imRecFecR = imRecFecR;
    }

    public Integer getImRecURC() {
        return imRecURC;
    }

    public void setImRecURC(Integer imRecURC) {
        this.imRecURC = imRecURC;
    }

    public String getImRecRegA() {
        return imRecRegA;
    }

    public void setImRecRegA(String imRecRegA) {
        this.imRecRegA = imRecRegA;
    }

    public String getImRecInst() {
        return imRecInst;
    }

    public void setImRecInst(String imRecInst) {
        this.imRecInst = imRecInst;
    }

    public String getImRecNomC() {
        return imRecNomC;
    }

    public void setImRecNomC(String imRecNomC) {
        this.imRecNomC = imRecNomC;
    }

    public String getImRecNomG() {
        return imRecNomG;
    }

    public void setImRecNomG(String imRecNomG) {
        this.imRecNomG = imRecNomG;
    }

    public String getImRecRegS() {
        return imRecRegS;
    }

    public void setImRecRegS(String imRecRegS) {
        this.imRecRegS = imRecRegS;
    }

    public String getImRecProc() {
        return imRecProc;
    }

    public void setImRecProc(String imRecProc) {
        this.imRecProc = imRecProc;
    }

    public BigDecimal getImRecVDen() {
        return imRecVDen;
    }

    public void setImRecVDen(BigDecimal imRecVDen) {
        this.imRecVDen = imRecVDen;
    }

    public Character getImRecFlgO() {
        return imRecFlgO;
    }

    public void setImRecFlgO(Character imRecFlgO) {
        this.imRecFlgO = imRecFlgO;
    }

    public Character getImRecCstI() {
        return imRecCstI;
    }

    public void setImRecCstI(Character imRecCstI) {
        this.imRecCstI = imRecCstI;
    }

    public Character getImRecExp() {
        return imRecExp;
    }

    public void setImRecExp(Character imRecExp) {
        this.imRecExp = imRecExp;
    }

    public Character getImRecODis() {
        return imRecODis;
    }

    public void setImRecODis(Character imRecODis) {
        this.imRecODis = imRecODis;
    }

    public String getImRecPIn() {
        return imRecPIn;
    }

    public void setImRecPIn(String imRecPIn) {
        this.imRecPIn = imRecPIn;
    }

    public String getImRecPEb() {
        return imRecPEb;
    }

    public void setImRecPEb(String imRecPEb) {
        this.imRecPEb = imRecPEb;
    }

    public String getImRecPrsV() {
        return imRecPrsV;
    }

    public void setImRecPrsV(String imRecPrsV) {
        this.imRecPrsV = imRecPrsV;
    }

    public String getImRecCAS() {
        return imRecCAS;
    }

    public void setImRecCAS(String imRecCAS) {
        this.imRecCAS = imRecCAS;
    }

    public String getImRecFEMA() {
        return imRecFEMA;
    }

    public void setImRecFEMA(String imRecFEMA) {
        this.imRecFEMA = imRecFEMA;
    }

    public String getImRecForG() {
        return imRecForG;
    }

    public void setImRecForG(String imRecForG) {
        this.imRecForG = imRecForG;
    }

    public String getImReCGrpQ() {
        return imReCGrpQ;
    }

    public void setImReCGrpQ(String imReCGrpQ) {
        this.imReCGrpQ = imReCGrpQ;
    }

    public String getImRecSolA() {
        return imRecSolA;
    }

    public void setImRecSolA(String imRecSolA) {
        this.imRecSolA = imRecSolA;
    }

    public String getImRecSolAl() {
        return imRecSolAl;
    }

    public void setImRecSolAl(String imRecSolAl) {
        this.imRecSolAl = imRecSolAl;
    }

    public String getImRecSolOA() {
        return imRecSolOA;
    }

    public void setImRecSolOA(String imRecSolOA) {
        this.imRecSolOA = imRecSolOA;
    }

    public String getImRecINCJ() {
        return imRecINCJ;
    }

    public void setImRecINCJ(String imRecINCJ) {
        this.imRecINCJ = imRecINCJ;
    }

    public String getImRecSin() {
        return imRecSin;
    }

    public void setImRecSin(String imRecSin) {
        this.imRecSin = imRecSin;
    }

    public int getImRecPrP() {
        return imRecPrP;
    }

    public void setImRecPrP(int imRecPrP) {
        this.imRecPrP = imRecPrP;
    }

    public int getImRecPrA() {
        return imRecPrA;
    }

    public void setImRecPrA(int imRecPrA) {
        this.imRecPrA = imRecPrA;
    }

    public short getImRecSqN() {
        return imRecSqN;
    }

    public void setImRecSqN(short imRecSqN) {
        this.imRecSqN = imRecSqN;
    }

    public BigDecimal getImRecPre() {
        return imRecPre;
    }

    public void setImRecPre(BigDecimal imRecPre) {
        this.imRecPre = imRecPre;
    }

    public String getImRecIngA() {
        return imRecIngA;
    }

    public void setImRecIngA(String imRecIngA) {
        this.imRecIngA = imRecIngA;
    }

    public String getImRecModA() {
        return imRecModA;
    }

    public void setImRecModA(String imRecModA) {
        this.imRecModA = imRecModA;
    }

    public String getImRecForA() {
        return imRecForA;
    }

    public void setImRecForA(String imRecForA) {
        this.imRecForA = imRecForA;
    }

    public String getImRecFreA() {
        return imRecFreA;
    }

    public void setImRecFreA(String imRecFreA) {
        this.imRecFreA = imRecFreA;
    }

    public String getImRecPerC() {
        return imRecPerC;
    }

    public void setImRecPerC(String imRecPerC) {
        this.imRecPerC = imRecPerC;
    }

    public BigDecimal getImRecFCon() {
        return imRecFCon;
    }

    public void setImRecFCon(BigDecimal imRecFCon) {
        this.imRecFCon = imRecFCon;
    }

    public BigDecimal getImRecPSem() {
        return imRecPSem;
    }

    public void setImRecPSem(BigDecimal imRecPSem) {
        this.imRecPSem = imRecPSem;
    }

    public Character getImRecTipoLabor() {
        return imRecTipoLabor;
    }

    public void setImRecTipoLabor(Character imRecTipoLabor) {
        this.imRecTipoLabor = imRecTipoLabor;
    }

    public Character getImRecBeneficios() {
        return imRecBeneficios;
    }

    public void setImRecBeneficios(Character imRecBeneficios) {
        this.imRecBeneficios = imRecBeneficios;
    }

    public Boolean getImRecAfePre() {
        return imRecAfePre;
    }

    public void setImRecAfePre(Boolean imRecAfePre) {
        this.imRecAfePre = imRecAfePre;
    }

    public String getImRecMinZ() {
        return imRecMinZ;
    }

    public void setImRecMinZ(String imRecMinZ) {
        this.imRecMinZ = imRecMinZ;
    }

    public String getImRecMaxZ() {
        return imRecMaxZ;
    }

    public void setImRecMaxZ(String imRecMaxZ) {
        this.imRecMaxZ = imRecMaxZ;
    }

    public String getImRecEsp() {
        return imRecEsp;
    }

    public void setImRecEsp(String imRecEsp) {
        this.imRecEsp = imRecEsp;
    }

    public String getImRecSim() {
        return imRecSim;
    }

    public void setImRecSim(String imRecSim) {
        this.imRecSim = imRecSim;
    }

    @XmlTransient
    public Collection<IdInv> getIdInvCollection() {
        return idInvCollection;
    }

    public void setIdInvCollection(Collection<IdInv> idInvCollection) {
        this.idInvCollection = idInvCollection;
    }

    @XmlTransient
    public Collection<ImLot> getImLotCollection() {
        return imLotCollection;
    }

    public void setImLotCollection(Collection<ImLot> imLotCollection) {
        this.imLotCollection = imLotCollection;
    }

    public ImCla getImClaCod() {
        return imClaCod;
    }

    public void setImClaCod(ImCla imClaCod) {
        this.imClaCod = imClaCod;
    }

    public ImTpR getImTpRCod() {
        return imTpRCod;
    }

    public void setImTpRCod(ImTpR imTpRCod) {
        this.imTpRCod = imTpRCod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imRecCod != null ? imRecCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImRec)) {
            return false;
        }
        ImRec other = (ImRec) object;
        if ((this.imRecCod == null && other.imRecCod != null) || (this.imRecCod != null && !this.imRecCod.equals(other.imRecCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ImRec[ imRecCod=" + imRecCod + " ]";
    }
    
}
