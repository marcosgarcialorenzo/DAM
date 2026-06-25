package Programacion.Curso2526.ExamenesMGL.Evaluacion3.Ej1.service;


import Programacion.Curso2526.ExamenesMGL.Evaluacion3.Ej1.dao.DAOEmpresaImpl;
import Programacion.Curso2526.ExamenesMGL.Evaluacion3.Ej1.model.Alumno;
import Programacion.Curso2526.ExamenesMGL.Evaluacion3.Ej1.model.Grupo;
import Programacion.Curso2526.ExamenesMGL.Evaluacion3.Ej1.model.IES;
import Programacion.Curso2526.ExamenesMGL.Evaluacion3.Ej1.model.Relaciones;

import java.util.ArrayList;

public class PracticasServicio {

    public Relaciones crearRelacion(String NIF, String[] dnis, int inicio, int fin) {
        DAOEmpresaImpl dao = new DAOEmpresaImpl();
        Grupo g = new Grupo();
        Relaciones r1 = new Relaciones(NIF, dao.obtenerRepresentante(NIF), g.buscarAlumnos(dnis), inicio, fin);
        System.out.println("Id relacion: " + 1);
        return r1;
    }


}