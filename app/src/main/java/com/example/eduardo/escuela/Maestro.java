package com.example.eduardo.escuela;


/**
 * Created by eduardo on 16/08/17.
 */

public class Maestro extends MainActivity implements Escuela {

    @Override
    public String nombre(String name) {
        return name;
    }

    @Override
    public String rol() {
        return "Maestro";
    }

    @Override
    public String pago() {
        return "1 500 000";
    }
}


