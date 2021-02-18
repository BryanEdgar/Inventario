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
@Table(name = "ImCla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImCla.findAll", query = "SELECT i FROM ImCla i")
    , @NamedQuery(name = "ImCla.findByImClaCod", query = "SELECT i FROM ImCla i WHERE i.imClaCod = :imClaCod")
    , @NamedQuery(name = "ImCla.findByImClADes", query = "SELECT i FROM ImCla i WHERE i.imClADes = :imClADes")
    , @NamedQuery(name = "ImCla.findByImClaEst", query = "SELECT i FROM ImCla i WHERE i.imClaEst = :imClaEst")
    , @NamedQuery(name = "ImCla.findByImClaCCs1", query = "SELECT i FROM ImCla i WHERE i.imClaCCs1 = :imClaCCs1")
    , @NamedQuery(name = "ImCla.findByImClaCta1", query = "SELECT i FROM ImCla i WHERE i.imClaCta1 = :imClaCta1")
    , @NamedQuery(name = "ImCla.findByImClaCCs2", query = "SELECT i FROM ImCla i WHERE i.imClaCCs2 = :imClaCCs2")
    , @NamedQuery(name = "ImCla.findByImClaCta2", query = "SELECT i FROM ImCla i WHERE i.imClaCta2 = :imClaCta2")
    , @NamedQuery(name = "ImCla.findByImClaCCs3", query = "SELECT i FROM ImCla i WHERE i.imClaCCs3 = :imClaCCs3")
    , @NamedQuery(name = "ImCla.findByImClaCta3", query = "SELECT i FROM ImCla i WHERE i.imClaCta3 = :imClaCta3")
    , @NamedQuery(name = "ImCla.findByImClaCCs4", query = "SELECT i FROM ImCla i WHERE i.imClaCCs4 = :imClaCCs4")
    , @NamedQuery(name = "ImCla.findByImClaCta4", query = "SELECT i FROM ImCla i WHERE i.imClaCta4 = :imClaCta4")
    , @NamedQuery(name = "ImCla.findByImClAUsr", query = "SELECT i FROM ImCla i WHERE i.imClAUsr = :imClAUsr")
    , @NamedQuery(name = "ImCla.findByImClAFHR", query = "SELECT i FROM ImCla i WHERE i.imClAFHR = :imClAFHR")
    , @NamedQuery(name = "ImCla.findByImClaDis", query = "SELECT i FROM ImCla i WHERE i.imClaDis = :imClaDis")
    , @NamedQuery(name = "ImCla.findByImClaFFec", query = "SELECT i FROM ImCla i WHERE i.imClaFFec = :imClaFFec")
    , @NamedQuery(name = "ImCla.findByImClaRep", query = "SELECT i FROM ImCla i WHERE i.imClaRep = :imClaRep")})
public class ImCla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "ImClaCod")
    private String imClaCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ImClADes")
    private String imClADes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImClaEst")
    private Character imClaEst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImClaCCs1")
    private String imClaCCs1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImClaCta1")
    private String imClaCta1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImClaCCs2")
    private String imClaCCs2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImClaCta2")
    private String imClaCta2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImClaCCs3")
    private String imClaCCs3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImClaCta3")
    private String imClaCta3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImClaCCs4")
    private String imClaCCs4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ImClaCta4")
    private String imClaCta4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ImClAUsr")
    private String imClAUsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImClAFHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imClAFHR;
    @Column(name = "ImClaDis")
    private Character imClaDis;
    @Column(name = "ImClaFFec")
    private Character imClaFFec;
    @Column(name = "ImClaRep")
    private Character imClaRep;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imClaCod")
    private Collection<ImRec> imRecCollection;

    public ImCla() {
    }

    public ImCla(String imClaCod) {
        this.imClaCod = imClaCod;
    }

    public ImCla(String imClaCod, String imClADes, Character imClaEst, String imClaCCs1, String imClaCta1, String imClaCCs2, String imClaCta2, String imClaCCs3, String imClaCta3, String imClaCCs4, String imClaCta4, String imClAUsr, Date imClAFHR) {
        this.imClaCod = imClaCod;
        this.imClADes = imClADes;
        this.imClaEst = imClaEst;
        this.imClaCCs1 = imClaCCs1;
        this.imClaCta1 = imClaCta1;
        this.imClaCCs2 = imClaCCs2;
        this.imClaCta2 = imClaCta2;
        this.imClaCCs3 = imClaCCs3;
        this.imClaCta3 = imClaCta3;
        this.imClaCCs4 = imClaCCs4;
        this.imClaCta4 = imClaCta4;
        this.imClAUsr = imClAUsr;
        this.imClAFHR = imClAFHR;
    }

    public String getImClaCod() {
        return imClaCod;
    }

    public void setImClaCod(String imClaCod) {
        this.imClaCod = imClaCod;
    }

    public String getImClADes() {
        return imClADes;
    }

    public void setImClADes(String imClADes) {
        this.imClADes = imClADes;
    }

    public Character getImClaEst() {
        return imClaEst;
    }

    public void setImClaEst(Character imClaEst) {
        this.imClaEst = imClaEst;
    }

    public String getImClaCCs1() {
        return imClaCCs1;
    }

    public void setImClaCCs1(String imClaCCs1) {
        this.imClaCCs1 = imClaCCs1;
    }

    public String getImClaCta1() {
        return imClaCta1;
    }

    public void setImClaCta1(String imClaCta1) {
        this.imClaCta1 = imClaCta1;
    }

    public String getImClaCCs2() {
        return imClaCCs2;
    }

    public void setImClaCCs2(String imClaCCs2) {
        this.imClaCCs2 = imClaCCs2;
    }

    public String getImClaCta2() {
        return imClaCta2;
    }

    public void setImClaCta2(String imClaCta2) {
        this.imClaCta2 = imClaCta2;
    }

    public String getImClaCCs3() {
        return imClaCCs3;
    }

    public void setImClaCCs3(String imClaCCs3) {
        this.imClaCCs3 = imClaCCs3;
    }

    public String getImClaCta3() {
        return imClaCta3;
    }

    public void setImClaCta3(String imClaCta3) {
        this.imClaCta3 = imClaCta3;
    }

    public String getImClaCCs4() {
        return imClaCCs4;
    }

    public void setImClaCCs4(String imClaCCs4) {
        this.imClaCCs4 = imClaCCs4;
    }

    public String getImClaCta4() {
        return imClaCta4;
    }

    public void setImClaCta4(String imClaCta4) {
        this.imClaCta4 = imClaCta4;
    }

    public String getImClAUsr() {
        return imClAUsr;
    }

    public void setImClAUsr(String imClAUsr) {
        this.imClAUsr = imClAUsr;
    }

    public Date getImClAFHR() {
        return imClAFHR;
    }

    public void setImClAFHR(Date imClAFHR) {
        this.imClAFHR = imClAFHR;
    }

    public Character getImClaDis() {
        return imClaDis;
    }

    public void setImClaDis(Character imClaDis) {
        this.imClaDis = imClaDis;
    }

    public Character getImClaFFec() {
        return imClaFFec;
    }

    public void setImClaFFec(Character imClaFFec) {
        this.imClaFFec = imClaFFec;
    }

    public Character getImClaRep() {
        return imClaRep;
    }

    public void setImClaRep(Character imClaRep) {
        this.imClaRep = imClaRep;
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
        hash += (imClaCod != null ? imClaCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImCla)) {
            return false;
        }
        ImCla other = (ImCla) object;
        if ((this.imClaCod == null && other.imClaCod != null) || (this.imClaCod != null && !this.imClaCod.equals(other.imClaCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.ImCla[ imClaCod=" + imClaCod + " ]";
    }
    
}
