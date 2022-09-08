
package com.example.PruebaSpringBoot.service;

import com.example.PruebaSpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersona ();
    
    public void crearPersona (Persona pers);
    
    public void borrarPersona (Long id);
    
    public Persona buscarpersona (Long id);
    
    public void modificarPersona (Persona per);
}
