package modelo;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "saludo")
@RequestScoped
public class Saludo {

    /**
     * Creates a new instance of Saludo
     */
    public Saludo() {
    }
    
    private String texto = "Hola, saludo desde managedBeans y ñandu";

    /**
     * Get the value of texto
     *
     * @return the value of texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Set the value of texto
     *
     * @param texto new value of texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

}
