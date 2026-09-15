package Curso2627.AccesoADatos.Tema1;

import java.util.ArrayList;
import java.util.List;

public class Datos {
    private List<Empleado> empleados;
    private List<Departamento> departamentos;

    public Datos() {
        empleados = new ArrayList<>();
        departamentos = new ArrayList<>();
        cargarDatos();
    }

    void cargarDatos() {
        departamentos.add(new Departamento(1, "Recursos Humanos"));
        departamentos.add(new Departamento(2, "Tecnología"));
        empleados.add(new Empleado(1, "Ana Pérez", 1));
        empleados.add(new Empleado(102, "Luis Gómez", 2));
        empleados.add(new Empleado(103, "Carla Ruiz", 2));


    }
}
