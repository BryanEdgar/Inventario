/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generico;
import java.util.Map;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.io.Serializable;
//import com.rmm.empresarial.generico.Prueba;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
//import lombok.Getter;
import javax.annotation.PostConstruct;
import lombok.Getter;

/**
 *
 * @author BryanM
 */
@LocalBean
@Stateless
public class EntityManagerProperties {

    @PersistenceContext
    @Getter
    private EntityManager entityManager;
    
    @Getter
    Map<String,Object> mapPropiedades;

    @PostConstruct
    public void cargar() {
       mapPropiedades =getEntityManager().getEntityManagerFactory().getProperties();
    }

    
    
    public String nombreUnidadPersistencia() {
        return getEntityManager().getEntityManagerFactory().getProperties().get("hibernate.ejb.persistenceUnitName").toString();
    }
    
    public String nombreDataSource() {
        return getEntityManager().getEntityManagerFactory().getProperties().get("datasource").toString();
    }
}
