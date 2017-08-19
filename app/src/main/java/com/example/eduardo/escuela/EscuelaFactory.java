package com.example.eduardo.escuela;

/**
 * Created by eduardo on 16/08/17.
 */

public class EscuelaFactory {
    public Escuela getEscuela(String rolEscuela){

        if (rolEscuela == "Maestro"){
            return new Maestro();
        }else if (rolEscuela == "Alumno"){
            return new Alumno();
        }else if (rolEscuela == "Trabajador"){
            return new Trabajador();
        }
        return null;
    }
}
