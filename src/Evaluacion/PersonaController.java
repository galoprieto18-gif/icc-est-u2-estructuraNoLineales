package Evaluacion;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.Persona;

public class PersonaController {
    
    public Set<Persona> filtrarYOrdenar(List<Persona> personas,int edadUmbral) {
        
        Set<Persona> personasFiltradas = new TreeSet<>(
            (p1,p2) -> {
                int compE = Integer.compare(p1.getEdad(), p2.getEdad());
                if(compE != 0 && p1.getEdad() > edadUmbral) {
                    return compE;
                } 
                int compN = p1.getNombre().compareTo(p2.getNombre());
                return compN;
            }
        );
        for (Persona persona : personas) {
            if(persona.getEdad() > edadUmbral) {
                personasFiltradas.add(persona);
            }
        }
        return personasFiltradas;
    }
   

    

        
    public Map<String, Set<String>> agruparPorEdad(List<Persona> personas) {
        
        String nombre = "Juan Perez";
        String[] palabras = nombre.split(" "); 
        String primerNombre = palabras[0]; // "Juan"
        String pNombre = nombre.split(" ")[0]; 
        // Extraer el nombre de la variable nombre
        nombre.split("");// el método split() me va ayudar a dividr palabras de un arreglo String
        // me va a devolver un arreglo de tipo String: ["Juan", "Perez"]
        nombre.split("e");
        // me va a devolver un arreglo de tipo String: ["Juan P", "rez"]
        return null;
    }

}




