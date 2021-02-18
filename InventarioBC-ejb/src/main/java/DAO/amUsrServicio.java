
package DAO;

import Generico.Generico;
import Modelos.AmUsr;
import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

@LocalBean
@Stateless
public class amUsrServicio extends Generico<AmUsr> implements Serializable{
    
    public Boolean Validar(String user, String pass) {
        String Sql = "SELECT * FROM AmUsr WHERE AmUsrLog = ? AND AmUsrPass = ?";
        Query q = getEntityManager().createNativeQuery(Sql, AmUsr.class);
        q.setParameter("1", user);
        q.setParameter("2", pass);
        
        return q.getResultList().isEmpty(); 
    }
}
