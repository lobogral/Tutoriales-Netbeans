package modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class PersonaValidar implements Validator{

    private static final String EMAIL_PATTERN = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
    
    private Pattern pattern;
    private Matcher matcher;
    
    @Override
    public boolean supports(Class<?> type) {
        //Establece comunicacion de esta clase con persona
        return Persona.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Persona persona = (Persona) o;
        ValidationUtils.rejectIfEmptyOrWhitespace
        (   
            errors,
            "nombre",
            "required.nombre",
            "El campo nombre es obligatorio"
        );
        ValidationUtils.rejectIfEmptyOrWhitespace
        (   
            errors,
            "correo",
            "required.corre",
            "El campo E-mail es obligatorio"
        );
        
        if(!(persona.getCorreo() != null && persona.getCorreo().isEmpty())){
            this.pattern = Pattern.compile(EMAIL_PATTERN);
            this.matcher = pattern.matcher(persona.getCorreo());
        
            if (!matcher.matches()){
                errors.rejectValue("correo", "correo.incorrect",
                "El E-mail " + persona.getCorreo() + " ingresado no es válido");
            }
        }
        
        if(persona.getPais() == 0){
            errors.rejectValue("pais", "required.pais", "Seleccione un pais");
        }
    }
    
}
