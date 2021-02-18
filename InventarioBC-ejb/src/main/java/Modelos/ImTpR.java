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
@Table(name = "ImTpR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImTpR.findAll", query = "SELECT i FROM ImTpR i")
    , @NamedQuery(name = "ImTpR.findByImTpRCod", query = "SELECT i FROM ImTpR i WHERE i.imTpRCod = :imTpRCod")
    , @NamedQuery(name = "ImTpR.findByImTpRDes", query = "SELECT i FROM ImTpR i WHERE i.imTpRDes = :imTpRDes")
    , @NamedQuery(name = "ImTpR.findByImTpREfe", query = "SELECT i FROM ImTpR i WHERE i.imTpREfe = :imTpREfe")
    , @NamedQuery(name = "ImTpR.findByImTpRCCs1", query = "SELECT i FROM ImTpR i WHERE i.imTpRCCs1 = :imTpRCCs1")
    , @NamedQuery(name = "ImTpR.findByImTpRCCn1", query = "SELECT i FROM ImTpR i WHERE i.imTpRCCn1 = :imTpRCCn1")
    , @NamedQuery(name = "ImTpR.findByImTpRCCs2", query = "SELECT i FROM ImTpR i WHERE i.imTpRCCs2 = :imTpRCCs2")
    , @NamedQuery(name = "ImTpR.findByImTpRCCn2", query = "SELECT i FROM ImTpR i WHERE i.imTpRCCn2 = :imTpRCCn2")
    , @NamedQuery(name = "ImTpR.findByImTpRCCs3", query = "SELECT i FROM ImTpR i WHERE i.imTpRCCs3 = :imTpRCCs3")
    , @NamedQuery(name = "ImTpR.findByImTpRCCn3", query = "SELECT i FROM ImTpR i WHERE i.imTpRCCn3 = :imTpRCCn3")
    , @NamedQuery(name = "ImTpR.findByImTpRCnt", query = "SELECT i FROM ImTpR i WHERE i.imTpRCnt = :imTpRCnt")
    , @NamedQuery(name = "ImTpR.findByImTpRCst", query = "SELECT i FROM ImTpR i WHERE i.imTpRCst = :imTpRCst")
    , @NamedQuery(name = "ImTpR.findByImTpRUsr", query = "SELECT i FROM ImTpR i WHERE i.imTpRUsr = :imTpRUsr")
    , @NamedQuery(name = "ImTpR.findByImTpRFHR", query = "SELECT i FROM ImTpR i WHERE i.imTpRFHR = :imTpRFHR")
    , @NamedQuery(name = "ImTpR.findByImTpRAC", query = "SELECT i FROM ImTpR i WHERE i.imTpRAC = :imTpRAC")
    , @NamedQuery(name = "ImTpR.findByImTpRDCon", query = "SELECT i FROM ImTpR i WHERE i.imTpRDCon = :imTpRDCon")
    , @NamedQuery(name = "ImTpR.findByImTpRDIng", query = "SELECT i FROM ImTpR i WHERE i.imTpRDIng = :imTpRDIng")
    , @NamedQuery(name = "ImTpR.findByImTpRPDis", query = "SELECT i FROM ImTpR i WHERE i.imTpRPDis = :imTpRPDis")})
public class ImTpR implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ImTpRCod")
    private String imTpRCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImTpRDes")
    private String imTpRDes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImTpREfe")
    private Character imTpREfe;
    @Size(max = 20)
    @Column(name = "ImTpRCCs1")
    private String imTpRCCs1;
    @Size(max = 20)
    @Column(name = "ImTpRCCn1")
    private String imTpRCCn1;
    @Size(max = 20)
    @Column(name = "ImTpRCCs2")
    private String imTpRCCs2;
    @Size(max = 20)
    @Column(name = "ImTpRCCn2")
    private String imTpRCCn2;
    @Size(max = 20)
    @Column(name = "ImTpRCCs3")
    private String imTpRCCs3;
    @Size(max = 20)
    @Column(name = "ImTpRCCn3")
    private String imTpRCCn3;
    @Column(name = "ImTpRCnt")
    private Character imTpRCnt;
    @Column(name = "ImTpRCst")
    private Character imTpRCst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImTpRUsr")
    private String imTpRUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImTpRFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imTpRFHR;
    @Column(name = "ImTpRAC")
    private Character imTpRAC;
    @Size(max = 6)
    @Column(name = "ImTpRDCon")
    private String imTpRDCon;
    @Size(max = 6)
    @Column(name = "ImTpRDIng")
    private String imTpRDIng;
    @Column(name = "ImTpRPDis")
    private Character imTpRPDis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imTpRCod")
    private Collection<ImRec> imRecCollection;

    public ImTpR() {
    }

    public ImTpR(String imTpRCod) {
        this.imTpRCod = imTpRCod;
    }

    public ImTpR(String imTpRCod, String imTpRDes, Character imTpREfe, String imTpRUsr, Date imTpRFHR) {
        this.imTpRCod = imTpRCod;
        this.imTpRDes = imTpRDes;
        this.imTpREfe = imTpREfe;
        this.imTpRUsr = imTpRUsr;
        this.imTpRFHR = imTpRFHR;
    }

    public String getImTpRCod() {
        return imTpRCod;
    }

    public void setImTpRCod(String imTpRCod) {
        this.imTpRCod = imTpRCod;
    }

    public String getImTpRDes() {
        return imTpRDes;
    }

    public void setImTpRDes(String imTpRDes) {
        this.imTpRDes = imTpRDes;
    }

    public Character getImTpREfe() {
        return imTpREfe;
    }

    public void setImTpREfe(Character imTpREfe) {
        this.imTpREfe = imTpREfe;
    }

    public String getImTpRCCs1() {
        return imTpRCCs1;
    }

    public void setImTpRCCs1(String imTpRCCs1) {
        this.imTpRCCs1 = imTpRCCs1;
    }

    public String getImTpRCCn1() {
        return imTpRCCn1;
    }

    public void setImTpRCCn1(String imTpRCCn1) {
        this.imTpRCCn1 = imTpRCCn1;
    }

    public String getImTpRCCs2() {
        return imTpRCCs2;
    }

    public void setImTpRCCs2(String imTpRCCs2) {
        this.imTpRCCs2 = imTpRCCs2;
    }

    public String getImTpRCCn2() {
        return imTpRCCn2;
    }

    public void setImTpRCCn2(String imTpRCCn2) {
        this.imTpRCCn2 = imTpRCCn2;
    }

    public String getImTpRCCs3() {
        return imTpRCCs3;
    }

    public void setImTpRCCs3(String imTpRCCs3) {
        this.imTpRCCs3 = imTpRCCs3;
    }

    public String getImTpRCCn3() {
        return imTpRCCn3;
    }

    public void setImTpRCCn3(String imTpRCCn3) {
        this.imTpRCCn3 = imTpRCCn3;
    }

    public Character getImTpRCnt() {
        return imTpRCnt;
    }

    public void setImTpRCnt(Character imTpRCnt) {
        this.imTpRCnt = imTpRCnt;
    }

    public Character getImTpRCst() {
        return imTpRCst;
    }

    public void setImTpRCst(Character imTpRCst) {
        this.imTpRCst = imTpRCst;
    }

    public String getImTpRUsr() {
        return imTpRUsr;
    }

    public void setImTpRUsr(String imTpRUsr) {
        this.imTpRUsr = imTpRUsr;
    }

    public Date getImTpRFHR() {
        return imTpRFHR;
    }

    public void setImTpRFHR(Date imTpRFHR) {
        this.imTpRFHR = imTpRFHR;
    }

    public Character getImTpRAC() {
        return imTpRAC;
    }

    public void setImTpRAC(Character imTpRAC) {
        this.imTpRAC = imTpRAC;
    }

    public String getImTpRDCon() {
        return imTpRDCon;
    }

    public void setImTpRDCon(String imTpRDCon) {
        this.imTpRDCon = imTpRDCon;
    }

    public String getImTpRDIng() {
        return imTpRDIng;
    }

    public void setImTpRDIng(String imTpRDIng) {
        this.imTpRDIng = imTpRDIng;
    }

    public Character getImTpRPDis() {
        return imTpRPDis;
    }

    public void setImTpRPDis(Character imTpRPDis) {
        this.imTpRPDis = imTpRPDis;
    }

    @XmlTransient
    public Collection<ImRec> getImRecCollection() {
        return imRecCollection;
    }

    public void setImRecCollection(Collection<ImRec> imRecCollection) {
        this.imRecCollection = imRecCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imTpRCod != null ? imTpRCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImTpR)) {
            return false;
        }
        ImTpR other = (ImTpR) object;
        if ((this.imTpRCod == null && other.imTpRCod != null) || (this.imTpRCod != null && !this.imTpRCod.equals(other.imTpRCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ImTpR[ imTpRCod=" + imTpRCod + " ]";
    }
    
}
