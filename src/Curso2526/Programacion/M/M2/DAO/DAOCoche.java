package Curso2526.Programacion.M.M2.DAO;

import Curso2526.Programacion.M.M2.modelo.Coche;

import java.util.List;

public interface DAOCoche {
    boolean insertarCoche(Coche c);

    boolean eliminarCoche(String matricula);

    boolean actualizarPreciosCoches(double incremento);

    List<Coche> obtenerCoches();

    double sumarPreciosCochesPorAntiguedad(int antiguedad);

    List<String> obtenerMatriculasPorMarca(String marca);
}