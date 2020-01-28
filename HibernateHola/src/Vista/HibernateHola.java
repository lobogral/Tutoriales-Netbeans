/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Operaciones;
import Modelo.Person;

/**
 *
 * @author Camilo
 */
public class HibernateHola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crea un usuario
        Operaciones opr = new Operaciones();
        Person persona = new Person((long)4,"Andres");
        opr.crearUsuario(persona);
        
        // Busca un usuario
        Person usuario = opr.buscarUsuario((long)2);
        System.out.println("----" + usuario.getId());
        System.out.println("----" + usuario.getName());
        
        // Modifica un usuario
        usuario = opr.buscarUsuario((long)2);
        usuario.setName("Carlos");
        opr.modificarUsuario(usuario);
        
        // Borra un usuario
        usuario = opr.buscarUsuario((long)1);
        opr.borrarUsuario(usuario);
        
    }
    
}
