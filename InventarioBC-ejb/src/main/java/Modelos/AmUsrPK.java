/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author user
 */
@Embeddable
public class AmUsrPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "AmScnCod")
    private int amScnCod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmUsrFlg")
    private Character amUsrFlg;

    public AmUsrPK() {
    }

    public AmUsrPK(int amScnCod, Character amUsrFlg) {
        this.amScnCod = amScnCod;
        this.amUsrFlg = amUsrFlg;
    }

    public int getAmScnCod() {
        return amScnCod;
    }

    public void setAmScnCod(int amScnCod) {
        this.amScnCod = amScnCod;
    }

    public Character getAmUsrFlg() {
        return amUsrFlg;
    }

    public void setAmUsrFlg(Character amUsrFlg) {
        this.amUsrFlg = amUsrFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) amScnCod;
        hash += (amUsrFlg != null ? amUsrFlg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmUsrPK)) {
            return false;
        }
        AmUsrPK other = (AmUsrPK) object;
        if (this.amScnCod != other.amScnCod) {
            return false;
        }
        if ((this.amUsrFlg == null && other.amUsrFlg != null) || (this.amUsrFlg != null && !this.amUsrFlg.equals(other.amUsrFlg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.AmUsrPK[ amScnCod=" + amScnCod + ", amUsrFlg=" + amUsrFlg + " ]";
    }
    
}
