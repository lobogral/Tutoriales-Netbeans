/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Calendar;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Camilo
 */
@Named("navegacionBean")
@RequestScoped
public class NavegacionBean {

    /**
     * Creates a new instance of NavegacionBean
     */
    public NavegacionBean() {
    }
    
    public String saludar(){
        String mensaje;
        int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hora < 12){
            mensaje = "Buenos-dias";
        } else if (hora < 18){
            mensaje = "Buenas-tardes";
        } else {
            mensaje = "Buenas-noches";
        }
        return mensaje;
    }
    
}
