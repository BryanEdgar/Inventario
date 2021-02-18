/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "AmCom")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AmCom.findAll", query = "SELECT a FROM AmCom a")
    , @NamedQuery(name = "AmCom.findByAmComCod", query = "SELECT a FROM AmCom a WHERE a.amComCod = :amComCod")
    , @NamedQuery(name = "AmCom.findByAmComRazS", query = "SELECT a FROM AmCom a WHERE a.amComRazS = :amComRazS")
    , @NamedQuery(name = "AmCom.findByAmComRUC", query = "SELECT a FROM AmCom a WHERE a.amComRUC = :amComRUC")
    , @NamedQuery(name = "AmCom.findByAmComNit", query = "SELECT a FROM AmCom a WHERE a.amComNit = :amComNit")
    , @NamedQuery(name = "AmCom.findByAmComDig", query = "SELECT a FROM AmCom a WHERE a.amComDig = :amComDig")
    , @NamedQuery(name = "AmCom.findByAmComPrJ", query = "SELECT a FROM AmCom a WHERE a.amComPrJ = :amComPrJ")
    , @NamedQuery(name = "AmCom.findByAmComDCall", query = "SELECT a FROM AmCom a WHERE a.amComDCall = :amComDCall")
    , @NamedQuery(name = "AmCom.findByAmComDNum", query = "SELECT a FROM AmCom a WHERE a.amComDNum = :amComDNum")
    , @NamedQuery(name = "AmCom.findByAmComDInt", query = "SELECT a FROM AmCom a WHERE a.amComDInt = :amComDInt")
    , @NamedQuery(name = "AmCom.findByAmComLink", query = "SELECT a FROM AmCom a WHERE a.amComLink = :amComLink")
    , @NamedQuery(name = "AmCom.findByAmComDirM", query = "SELECT a FROM AmCom a WHERE a.amComDirM = :amComDirM")
    , @NamedQuery(name = "AmCom.findByAmComCiuM", query = "SELECT a FROM AmCom a WHERE a.amComCiuM = :amComCiuM")
    , @NamedQuery(name = "AmCom.findByAmComPrvM", query = "SELECT a FROM AmCom a WHERE a.amComPrvM = :amComPrvM")
    , @NamedQuery(name = "AmCom.findByAmComPaisM", query = "SELECT a FROM AmCom a WHERE a.amComPaisM = :amComPaisM")
    , @NamedQuery(name = "AmCom.findByAmComTel1M", query = "SELECT a FROM AmCom a WHERE a.amComTel1M = :amComTel1M")
    , @NamedQuery(name = "AmCom.findByAmComTel2M", query = "SELECT a FROM AmCom a WHERE a.amComTel2M = :amComTel2M")
    , @NamedQuery(name = "AmCom.findByAmComFaxM", query = "SELECT a FROM AmCom a WHERE a.amComFaxM = :amComFaxM")
    , @NamedQuery(name = "AmCom.findByAmComEmail", query = "SELECT a FROM AmCom a WHERE a.amComEmail = :amComEmail")
    , @NamedQuery(name = "AmCom.findByAmComRepL", query = "SELECT a FROM AmCom a WHERE a.amComRepL = :amComRepL")
    , @NamedQuery(name = "AmCom.findByAmComCRRL", query = "SELECT a FROM AmCom a WHERE a.amComCRRL = :amComCRRL")
    , @NamedQuery(name = "AmCom.findByAmComConG", query = "SELECT a FROM AmCom a WHERE a.amComConG = :amComConG")
    , @NamedQuery(name = "AmCom.findByAmComCRCG", query = "SELECT a FROM AmCom a WHERE a.amComCRCG = :amComCRCG")
    , @NamedQuery(name = "AmCom.findByAmComEst", query = "SELECT a FROM AmCom a WHERE a.amComEst = :amComEst")
    , @NamedQuery(name = "AmCom.findByAmComAmb", query = "SELECT a FROM AmCom a WHERE a.amComAmb = :amComAmb")
    , @NamedQuery(name = "AmCom.findByAmComAut", query = "SELECT a FROM AmCom a WHERE a.amComAut = :amComAut")
    , @NamedQuery(name = "AmCom.findByAmComCte", query = "SELECT a FROM AmCom a WHERE a.amComCte = :amComCte")
    , @NamedQuery(name = "AmCom.findByAmComFir", query = "SELECT a FROM AmCom a WHERE a.amComFir = :amComFir")
    , @NamedQuery(name = "AmCom.findByAmComEmi", query = "SELECT a FROM AmCom a WHERE a.amComEmi = :amComEmi")
    , @NamedQuery(name = "AmCom.findByAmComMailE", query = "SELECT a FROM AmCom a WHERE a.amComMailE = :amComMailE")
    , @NamedQuery(name = "AmCom.findByAmComPasE", query = "SELECT a FROM AmCom a WHERE a.amComPasE = :amComPasE")
    , @NamedQuery(name = "AmCom.findByAmComSMTP", query = "SELECT a FROM AmCom a WHERE a.amComSMTP = :amComSMTP")
    , @NamedQuery(name = "AmCom.findByAmComUsrE", query = "SELECT a FROM AmCom a WHERE a.amComUsrE = :amComUsrE")
    , @NamedQuery(name = "AmCom.findByAmComXml", query = "SELECT a FROM AmCom a WHERE a.amComXml = :amComXml")
    , @NamedQuery(name = "AmCom.findByAmComCon", query = "SELECT a FROM AmCom a WHERE a.amComCon = :amComCon")
    , @NamedQuery(name = "AmCom.findByAmComUsr", query = "SELECT a FROM AmCom a WHERE a.amComUsr = :amComUsr")
    , @NamedQuery(name = "AmCom.findByAmComFHR", query = "SELECT a FROM AmCom a WHERE a.amComFHR = :amComFHR")
    , @NamedQuery(name = "AmCom.findByAmComTAp", query = "SELECT a FROM AmCom a WHERE a.amComTAp = :amComTAp")
    , @NamedQuery(name = "AmCom.findByAmComPto", query = "SELECT a FROM AmCom a WHERE a.amComPto = :amComPto")
    , @NamedQuery(name = "AmCom.findByAmComARet", query = "SELECT a FROM AmCom a WHERE a.amComARet = :amComARet")
    , @NamedQuery(name = "AmCom.findByAmComOff", query = "SELECT a FROM AmCom a WHERE a.amComOff = :amComOff")
    , @NamedQuery(name = "AmCom.findByAmComWSO", query = "SELECT a FROM AmCom a WHERE a.amComWSO = :amComWSO")
    , @NamedQuery(name = "AmCom.findByAmComWSA", query = "SELECT a FROM AmCom a WHERE a.amComWSA = :amComWSA")
    , @NamedQuery(name = "AmCom.findByAmComComPwm", query = "SELECT a FROM AmCom a WHERE a.amComComPwm = :amComComPwm")
    , @NamedQuery(name = "AmCom.findByAmComColorTop", query = "SELECT a FROM AmCom a WHERE a.amComColorTop = :amComColorTop")
    , @NamedQuery(name = "AmCom.findByAmComColorFont", query = "SELECT a FROM AmCom a WHERE a.amComColorFont = :amComColorFont")
    , @NamedQuery(name = "AmCom.findByAmComParM", query = "SELECT a FROM AmCom a WHERE a.amComParM = :amComParM")
    , @NamedQuery(name = "AmCom.findByAmComFirLog", query = "SELECT a FROM AmCom a WHERE a.amComFirLog = :amComFirLog")
    , @NamedQuery(name = "AmCom.findByAmComUsrEN", query = "SELECT a FROM AmCom a WHERE a.amComUsrEN = :amComUsrEN")
    , @NamedQuery(name = "AmCom.findByAmComSMTPN", query = "SELECT a FROM AmCom a WHERE a.amComSMTPN = :amComSMTPN")
    , @NamedQuery(name = "AmCom.findByAmComPasN", query = "SELECT a FROM AmCom a WHERE a.amComPasN = :amComPasN")
    , @NamedQuery(name = "AmCom.findByAmComMailN", query = "SELECT a FROM AmCom a WHERE a.amComMailN = :amComMailN")
    , @NamedQuery(name = "AmCom.findByAmComSec", query = "SELECT a FROM AmCom a WHERE a.amComSec = :amComSec")
    , @NamedQuery(name = "AmCom.findByAmComAuten", query = "SELECT a FROM AmCom a WHERE a.amComAuten = :amComAuten")
    , @NamedQuery(name = "AmCom.findByAmComPrtN", query = "SELECT a FROM AmCom a WHERE a.amComPrtN = :amComPrtN")
    , @NamedQuery(name = "AmCom.findByAmcomnce", query = "SELECT a FROM AmCom a WHERE a.amcomnce = :amcomnce")})
public class AmCom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmComCod")
    private Short amComCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "AmComRazS")
    private String amComRazS;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "AmComRUC")
    private String amComRUC;
    @Column(name = "AmComNit")
    private Integer amComNit;
    @Column(name = "AmComDig")
    private Short amComDig;
    @Column(name = "AmComPrJ")
    private Character amComPrJ;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AmComDCall")
    private String amComDCall;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AmComDNum")
    private String amComDNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AmComDInt")
    private String amComDInt;
    @Size(max = 512)
    @Column(name = "AmComLink")
    private String amComLink;
    @Size(max = 250)
    @Column(name = "AmComDirM")
    private String amComDirM;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AmComCiuM")
    private String amComCiuM;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AmComPrvM")
    private String amComPrvM;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AmComPaisM")
    private String amComPaisM;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmComTel1M")
    private String amComTel1M;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmComTel2M")
    private String amComTel2M;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmComFaxM")
    private String amComFaxM;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "AmComEmail")
    private String amComEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AmComRepL")
    private String amComRepL;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "AmComCRRL")
    private String amComCRRL;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AmComConG")
    private String amComConG;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "AmComCRCG")
    private String amComCRCG;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "AmComLogo")
    private byte[] amComLogo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmComEst")
    private Character amComEst;
    @Column(name = "AmComAmb")
    private Character amComAmb;
    @Size(max = 512)
    @Column(name = "AmComAut")
    private String amComAut;
    @Column(name = "AmComCte")
    private Integer amComCte;
    @Size(max = 512)
    @Column(name = "AmComFir")
    private String amComFir;
    @Column(name = "AmComEmi")
    private Character amComEmi;
    @Size(max = 40)
    @Column(name = "AmComMailE")
    private String amComMailE;
    @Size(max = 40)
    @Column(name = "AmComPasE")
    private String amComPasE;
    @Size(max = 100)
    @Column(name = "AmComSMTP")
    private String amComSMTP;
    @Size(max = 40)
    @Column(name = "AmComUsrE")
    private String amComUsrE;
    @Size(max = 512)
    @Column(name = "AmComXml")
    private String amComXml;
    @Size(max = 512)
    @Column(name = "AmComCon")
    private String amComCon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AmComUsr")
    private String amComUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmComFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date amComFHR;
    @Size(max = 20)
    @Column(name = "AmComTAp")
    private String amComTAp;
    @Column(name = "AmComPto")
    private Integer amComPto;
    @Column(name = "AmComARet")
    private Character amComARet;
    @Size(max = 512)
    @Column(name = "AmComOff")
    private String amComOff;
    @Size(max = 512)
    @Column(name = "AmComWSO")
    private String amComWSO;
    @Size(max = 512)
    @Column(name = "AmComWSA")
    private String amComWSA;
    @Size(max = 10)
    @Column(name = "AmComComPwm")
    private String amComComPwm;
    @Size(max = 50)
    @Column(name = "AmComColorTop")
    private String amComColorTop;
    @Size(max = 50)
    @Column(name = "AmComColorFont")
    private String amComColorFont;
    @Size(max = 200)
    @Column(name = "AmComParM")
    private String amComParM;
    @Size(max = 300)
    @Column(name = "AmComFirLog")
    private String amComFirLog;
    @Size(max = 40)
    @Column(name = "AmComUsrEN")
    private String amComUsrEN;
    @Size(max = 100)
    @Column(name = "AmComSMTPN")
    private String amComSMTPN;
    @Size(max = 40)
    @Column(name = "AmComPasN")
    private String amComPasN;
    @Size(max = 100)
    @Column(name = "AmComMailN")
    private String amComMailN;
    @Column(name = "AmComSec")
    private Short amComSec;
    @Column(name = "AmComAuten")
    private Short amComAuten;
    @Column(name = "AmComPrtN")
    private Short amComPrtN;
    @Column(name = "amcomnce")
    private Character amcomnce;
    @JoinColumn(name = "AmComMonB", referencedColumnName = "AmMonCod")
    @ManyToOne(optional = false)
    private AmMon amComMonB;
    @JoinColumn(name = "TcIdFCod", referencedColumnName = "TcIdFCod")
    @ManyToOne(optional = false)
    private TcIdF tcIdFCod;

    public AmCom() {
    }

    public AmCom(Short amComCod) {
        this.amComCod = amComCod;
    }

    public AmCom(Short amComCod, String amComRazS, String amComRUC, String amComDCall, String amComDNum, String amComDInt, String amComCiuM, String amComPrvM, String amComPaisM, String amComTel1M, String amComTel2M, String amComFaxM, String amComEmail, String amComRepL, String amComCRRL, String amComConG, String amComCRCG, byte[] amComLogo, Character amComEst, String amComUsr, Date amComFHR) {
        this.amComCod = amComCod;
        this.amComRazS = amComRazS;
        this.amComRUC = amComRUC;
        this.amComDCall = amComDCall;
        this.amComDNum = amComDNum;
        this.amComDInt = amComDInt;
        this.amComCiuM = amComCiuM;
        this.amComPrvM = amComPrvM;
        this.amComPaisM = amComPaisM;
        this.amComTel1M = amComTel1M;
        this.amComTel2M = amComTel2M;
        this.amComFaxM = amComFaxM;
        this.amComEmail = amComEmail;
        this.amComRepL = amComRepL;
        this.amComCRRL = amComCRRL;
        this.amComConG = amComConG;
        this.amComCRCG = amComCRCG;
        this.amComLogo = amComLogo;
        this.amComEst = amComEst;
        this.amComUsr = amComUsr;
        this.amComFHR = amComFHR;
    }

    public Short getAmComCod() {
        return amComCod;
    }

    public void setAmComCod(Short amComCod) {
        this.amComCod = amComCod;
    }

    public String getAmComRazS() {
        return amComRazS;
    }

    public void setAmComRazS(String amComRazS) {
        this.amComRazS = amComRazS;
    }

    public String getAmComRUC() {
        return amComRUC;
    }

    public void setAmComRUC(String amComRUC) {
        this.amComRUC = amComRUC;
    }

    public Integer getAmComNit() {
        return amComNit;
    }

    public void setAmComNit(Integer amComNit) {
        this.amComNit = amComNit;
    }

    public Short getAmComDig() {
        return amComDig;
    }

    public void setAmComDig(Short amComDig) {
        this.amComDig = amComDig;
    }

    public Character getAmComPrJ() {
        return amComPrJ;
    }

    public void setAmComPrJ(Character amComPrJ) {
        this.amComPrJ = amComPrJ;
    }

    public String getAmComDCall() {
        return amComDCall;
    }

    public void setAmComDCall(String amComDCall) {
        this.amComDCall = amComDCall;
    }

    public String getAmComDNum() {
        return amComDNum;
    }

    public void setAmComDNum(String amComDNum) {
        this.amComDNum = amComDNum;
    }

    public String getAmComDInt() {
        return amComDInt;
    }

    public void setAmComDInt(String amComDInt) {
        this.amComDInt = amComDInt;
    }

    public String getAmComLink() {
        return amComLink;
    }

    public void setAmComLink(String amComLink) {
        this.amComLink = amComLink;
    }

    public String getAmComDirM() {
        return amComDirM;
    }

    public void setAmComDirM(String amComDirM) {
        this.amComDirM = amComDirM;
    }

    public String getAmComCiuM() {
        return amComCiuM;
    }

    public void setAmComCiuM(String amComCiuM) {
        this.amComCiuM = amComCiuM;
    }

    public String getAmComPrvM() {
        return amComPrvM;
    }

    public void setAmComPrvM(String amComPrvM) {
        this.amComPrvM = amComPrvM;
    }

    public String getAmComPaisM() {
        return amComPaisM;
    }

    public void setAmComPaisM(String amComPaisM) {
        this.amComPaisM = amComPaisM;
    }

    public String getAmComTel1M() {
        return amComTel1M;
    }

    public void setAmComTel1M(String amComTel1M) {
        this.amComTel1M = amComTel1M;
    }

    public String getAmComTel2M() {
        return amComTel2M;
    }

    public void setAmComTel2M(String amComTel2M) {
        this.amComTel2M = amComTel2M;
    }

    public String getAmComFaxM() {
        return amComFaxM;
    }

    public void setAmComFaxM(String amComFaxM) {
        this.amComFaxM = amComFaxM;
    }

    public String getAmComEmail() {
        return amComEmail;
    }

    public void setAmComEmail(String amComEmail) {
        this.amComEmail = amComEmail;
    }

    public String getAmComRepL() {
        return amComRepL;
    }

    public void setAmComRepL(String amComRepL) {
        this.amComRepL = amComRepL;
    }

    public String getAmComCRRL() {
        return amComCRRL;
    }

    public void setAmComCRRL(String amComCRRL) {
        this.amComCRRL = amComCRRL;
    }

    public String getAmComConG() {
        return amComConG;
    }

    public void setAmComConG(String amComConG) {
        this.amComConG = amComConG;
    }

    public String getAmComCRCG() {
        return amComCRCG;
    }

    public void setAmComCRCG(String amComCRCG) {
        this.amComCRCG = amComCRCG;
    }

    public byte[] getAmComLogo() {
        return amComLogo;
    }

    public void setAmComLogo(byte[] amComLogo) {
        this.amComLogo = amComLogo;
    }

    public Character getAmComEst() {
        return amComEst;
    }

    public void setAmComEst(Character amComEst) {
        this.amComEst = amComEst;
    }

    public Character getAmComAmb() {
        return amComAmb;
    }

    public void setAmComAmb(Character amComAmb) {
        this.amComAmb = amComAmb;
    }

    public String getAmComAut() {
        return amComAut;
    }

    public void setAmComAut(String amComAut) {
        this.amComAut = amComAut;
    }

    public Integer getAmComCte() {
        return amComCte;
    }

    public void setAmComCte(Integer amComCte) {
        this.amComCte = amComCte;
    }

    public String getAmComFir() {
        return amComFir;
    }

    public void setAmComFir(String amComFir) {
        this.amComFir = amComFir;
    }

    public Character getAmComEmi() {
        return amComEmi;
    }

    public void setAmComEmi(Character amComEmi) {
        this.amComEmi = amComEmi;
    }

    public String getAmComMailE() {
        return amComMailE;
    }

    public void setAmComMailE(String amComMailE) {
        this.amComMailE = amComMailE;
    }

    public String getAmComPasE() {
        return amComPasE;
    }

    public void setAmComPasE(String amComPasE) {
        this.amComPasE = amComPasE;
    }

    public String getAmComSMTP() {
        return amComSMTP;
    }

    public void setAmComSMTP(String amComSMTP) {
        this.amComSMTP = amComSMTP;
    }

    public String getAmComUsrE() {
        return amComUsrE;
    }

    public void setAmComUsrE(String amComUsrE) {
        this.amComUsrE = amComUsrE;
    }

    public String getAmComXml() {
        return amComXml;
    }

    public void setAmComXml(String amComXml) {
        this.amComXml = amComXml;
    }

    public String getAmComCon() {
        return amComCon;
    }

    public void setAmComCon(String amComCon) {
        this.amComCon = amComCon;
    }

    public String getAmComUsr() {
        return amComUsr;
    }

    public void setAmComUsr(String amComUsr) {
        this.amComUsr = amComUsr;
    }

    public Date getAmComFHR() {
        return amComFHR;
    }

    public void setAmComFHR(Date amComFHR) {
        this.amComFHR = amComFHR;
    }

    public String getAmComTAp() {
        return amComTAp;
    }

    public void setAmComTAp(String amComTAp) {
        this.amComTAp = amComTAp;
    }

    public Integer getAmComPto() {
        return amComPto;
    }

    public void setAmComPto(Integer amComPto) {
        this.amComPto = amComPto;
    }

    public Character getAmComARet() {
        return amComARet;
    }

    public void setAmComARet(Character amComARet) {
        this.amComARet = amComARet;
    }

    public String getAmComOff() {
        return amComOff;
    }

    public void setAmComOff(String amComOff) {
        this.amComOff = amComOff;
    }

    public String getAmComWSO() {
        return amComWSO;
    }

    public void setAmComWSO(String amComWSO) {
        this.amComWSO = amComWSO;
    }

    public String getAmComWSA() {
        return amComWSA;
    }

    public void setAmComWSA(String amComWSA) {
        this.amComWSA = amComWSA;
    }

    public String getAmComComPwm() {
        return amComComPwm;
    }

    public void setAmComComPwm(String amComComPwm) {
        this.amComComPwm = amComComPwm;
    }

    public String getAmComColorTop() {
        return amComColorTop;
    }

    public void setAmComColorTop(String amComColorTop) {
        this.amComColorTop = amComColorTop;
    }

    public String getAmComColorFont() {
        return amComColorFont;
    }

    public void setAmComColorFont(String amComColorFont) {
        this.amComColorFont = amComColorFont;
    }

    public String getAmComParM() {
        return amComParM;
    }

    public void setAmComParM(String amComParM) {
        this.amComParM = amComParM;
    }

    public String getAmComFirLog() {
        return amComFirLog;
    }

    public void setAmComFirLog(String amComFirLog) {
        this.amComFirLog = amComFirLog;
    }

    public String getAmComUsrEN() {
        return amComUsrEN;
    }

    public void setAmComUsrEN(String amComUsrEN) {
        this.amComUsrEN = amComUsrEN;
    }

    public String getAmComSMTPN() {
        return amComSMTPN;
    }

    public void setAmComSMTPN(String amComSMTPN) {
        this.amComSMTPN = amComSMTPN;
    }

    public String getAmComPasN() {
        return amComPasN;
    }

    public void setAmComPasN(String amComPasN) {
        this.amComPasN = amComPasN;
    }

    public String getAmComMailN() {
        return amComMailN;
    }

    public void setAmComMailN(String amComMailN) {
        this.amComMailN = amComMailN;
    }

    public Short getAmComSec() {
        return amComSec;
    }

    public void setAmComSec(Short amComSec) {
        this.amComSec = amComSec;
    }

    public Short getAmComAuten() {
        return amComAuten;
    }

    public void setAmComAuten(Short amComAuten) {
        this.amComAuten = amComAuten;
    }

    public Short getAmComPrtN() {
        return amComPrtN;
    }

    public void setAmComPrtN(Short amComPrtN) {
        this.amComPrtN = amComPrtN;
    }

    public Character getAmcomnce() {
        return amcomnce;
    }

    public void setAmcomnce(Character amcomnce) {
        this.amcomnce = amcomnce;
    }

    public AmMon getAmComMonB() {
        return amComMonB;
    }

    public void setAmComMonB(AmMon amComMonB) {
        this.amComMonB = amComMonB;
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
        hash += (amComCod != null ? amComCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmCom)) {
            return false;
        }
        AmCom other = (AmCom) object;
        if ((this.amComCod == null && other.amComCod != null) || (this.amComCod != null && !this.amComCod.equals(other.amComCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.AmCom[ amComCod=" + amComCod + " ]";
    }
    
}
