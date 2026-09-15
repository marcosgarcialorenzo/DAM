package Curso2627.AccesoADatos.Tema1.Ejercicio1;

import lombok.Data;

import java.io.Serializable;

@Data
public class Producto implements Serializable {
    private int id;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
}