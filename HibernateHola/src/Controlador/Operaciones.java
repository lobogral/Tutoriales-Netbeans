/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author Camilo
 */
public class Operaciones {

    public void crearUsuario(Person user){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
        System.out.println("Insertado correctamente");
    }
    
    public Person buscarUsuario(long id){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Person usr = (Person) session.get(Person.class, id);
        tx.commit();
        session.close();
        System.out.println("Encontrado correctamente");
        return usr;
    }
    
    public void modificarUsuario(Person user){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.merge(user);
        tx.commit();
        session.close();
        System.out.println("Modificado correctamente");
    }
    
    public void borrarUsuario(Person user){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(user);
        tx.commit();
        session.close();
        System.out.println("Borrado correctamente");
    }
    
    
    
}
