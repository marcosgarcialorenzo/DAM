package Curso2627.AccesoADatos.RA6.Ejercicio1;

import lombok.Data;

import java.io.Serializable;

@Data
public class Cliente implements Serializable {
    private int id;
    private String nombre;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
}