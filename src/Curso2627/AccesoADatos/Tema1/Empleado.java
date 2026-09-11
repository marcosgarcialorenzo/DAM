package Curso2627.AccesoADatos.Tema1;

import lombok.Data;

import java.io.Serializable;

@Data
public class Empleado implements Serializable {
    private int id;
    private String nombre;
    private int departamentoId;

    public Empleado() {
    }
}