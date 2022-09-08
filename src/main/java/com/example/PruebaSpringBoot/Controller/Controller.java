package com.example.PruebaSpringBoot.Controller;

import com.example.PruebaSpringBoot.model.Persona;
import com.example.PruebaSpringBoot.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersona(); 
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("/modificar/{id}")
    public void modificarPersona (@PathVariable Long id,@RequestBody Persona per){
        
        Persona persona = persoServ.buscarpersona(id) ; 
        
        persona.setNombre(per.getNombre());
        persona.setApellido(per.getApellido());
        
        persoServ.modificarPersona(persona);
        
    }
    

}
