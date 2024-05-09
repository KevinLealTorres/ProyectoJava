package com.doctor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Cita> citas = new ArrayList<>();

    // Añadir otras funcionalidades del calendario
    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public void eliminarCita(String id) {
        citas.removeIf(c -> c.getId().equals(id));
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void exportarAJSON(String archivo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(this, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Calendario cargarDesdeJSON(String archivo) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(archivo)) {
            return gson.fromJson(reader, Calendario.class);
        } catch (IOException e) {
            return new Calendario(); // Retorna un calendario vacío si el archivo no existe
        }
    }
}
