package Curso2627.AccesoADatos.RA6.Ejercicio2;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
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