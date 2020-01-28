/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import demo.HelloSessionBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Camilo
 */
@Named(value = "holaOtraVez")
@SessionScoped
public class holaOtraVez implements Serializable {

    @EJB
    private HelloSessionBean helloSessionBean;
    
    /**
     * Creates a new instance of holaOtraVez
     */
    public holaOtraVez() {
    }
    
    public String display(){
        return this.helloSessionBean.hello("Hola");
    }
    
    public int calculate(){
        return this.helloSessionBean.calculate(2, "+", 3);
    }
    
}
