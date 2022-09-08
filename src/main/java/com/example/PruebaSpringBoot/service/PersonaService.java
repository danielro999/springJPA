
package com.example.PruebaSpringBoot.service;

import com.example.PruebaSpringBoot.model.Persona;
import com.example.PruebaSpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarpersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(Persona per) {
           persoRepo.save(per) ;
     }
 
}
