package com.example.eduardo.escuela;

/**
 * Created by eduardo on 17/08/17.
 */

public class Alumno implements Escuela {

    @Override
    public String nombre(String name) {
        return name;
    }

    @Override
    public String rol() {
        return "Alumno";
    }

    @Override
    public String pago() {
        return "No Aplica";
    }
}
