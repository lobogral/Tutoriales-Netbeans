package controller;

import java.util.LinkedHashMap;
import java.util.Map;
import modelos.Persona;
import modelos.PersonaValidar;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="form.htm")
public class FormController {
    
    private PersonaValidar personaValidar;

    public FormController() {
        this.personaValidar = new PersonaValidar();
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("form");
        mav.addObject("persona", new Persona());
        return mav;
    }
    
    //Recibimos y validamos datos
    //Se puede usar un string, pero esto ayuda con la validacion
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView form
                       (
                           @ModelAttribute("persona") Persona p,
                           BindingResult result,
                           SessionStatus status
                       )
    {
        this.personaValidar.validate(p, result);
        // Usuario ingreso mal los datos
        if(result.hasErrors())
        {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("form");
            mav.addObject("persona", new Persona());
            return mav;
        } 
        // Usuario ingreso bien los datos
        else 
        {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("exito");
            mav.addObject("nombre", p.getNombre());
            mav.addObject("correo", p.getCorreo());
            mav.addObject("edad", p.getEdad());
            mav.addObject("pais", p.getPais());
            return mav;
        }
    }
    
    //Metodo para poblar el select
    @ModelAttribute("paisLista")
    public Map<String,String> listadoPaises(){
        Map<String, String> pais = new LinkedHashMap<>();
        pais.put("1", "Colombia");
        pais.put("2", "Mexico");
        pais.put("3", "Chile");
        pais.put("4", "Bolivia");
        pais.put("5", "España");
        pais.put("6", "Argentina");
        return pais;
    }
}
