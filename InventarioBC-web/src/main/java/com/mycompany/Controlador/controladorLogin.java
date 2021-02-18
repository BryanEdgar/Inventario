/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Controlador;

import DAO.amUsrServicio;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author user
 */
@Named(value = "controladorLogin")
@ViewScoped
public class controladorLogin implements Serializable {

    @EJB
    private amUsrServicio amUsrEJB;
    @Getter
    @Setter
    private String usuario;

    @Getter
    @Setter
    private String pass;

    public controladorLogin() {
        usuario = "";
        pass = "";
    }

    public void inicio() {
        String faces = FacesContext.getCurrentInstance().getExternalContext().getApplicationContextPath();
        try {
            if (!amUsrEJB.Validar(usuario, pass)) {
                FacesContext.getCurrentInstance().getExternalContext().redirect(faces + "/dashboard.xhtml");
            } else {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Aviso", "Usuario o Contraseña Incorrectas");
                FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            }
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error en la base de datos");
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        }

    }

}
