package com.example.eduardo.escuela;

/**
 * Created by eduardo on 17/08/17.
 */

public class Trabajador extends MainActivity implements Escuela {

    @Override
    public String nombre(String name) {
        return name;
    }

    @Override
    public String rol() {
        return "Trabajador";
    }

    @Override
    public String pago() {
        return "1 000 000";
    }
}
