package com.doctor;

/**
 * Clase abstracta que contiene los elementos compartidos por todos los roles
 */
abstract public class Persona {
    private static String id, nombre;

    public Persona(String id, String nombre) {
        Persona.id = id;
        Persona.nombre = nombre;
    }

    public static String getNombre() { return nombre; }
    public static void setNombre(String nombre) { Persona.nombre = nombre; }
    public static String getId() { return id; }
    public static void setId(String id) { Persona.id = id; }
}
