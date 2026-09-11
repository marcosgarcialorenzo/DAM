package Curso2627.AccesoADatos.Tema1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Departamento dept1 = new Departamento();
        dept1.setNombre("Recursos Humanos");
        dept1.setId(1);
        Departamento dept2 = new Departamento();
        dept2.setNombre("Tecnología");
        dept2.setId(2);
        Empleado emp1 = new Empleado();
        emp1.setNombre("Ana Pérez");
        emp1.setId(1);
        emp1.setDepartamentoId(1);
        Empleado emp2 = new Empleado();
        emp2.setNombre("Luis Gómez");
        emp2.setId(102);
        emp2.setDepartamentoId(2);
        Empleado emp3 = new Empleado();
        emp3.setNombre("Carla Ruiz");
        emp3.setId(103);
        emp3.setDepartamentoId(2);
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        List<Departamento> departamentos = List.of(dept1, dept2);
        for (Departamento dept : departamentos) {
            System.out.println("Departamento: " + dept.getNombre());
            for (Empleado emp : empleados) {
                if (emp.getDepartamentoId() == dept.getId()) {
                    System.out.println(" - " + emp.getNombre());
                }
            }
        }
    }
}