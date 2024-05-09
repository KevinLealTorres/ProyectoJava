package com.doctor;

public abstract class Persona {
    private static String id;
    private static String nombre;

    // Constructor vacío
    public Persona() {
    }

    // Constructor completo
    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
