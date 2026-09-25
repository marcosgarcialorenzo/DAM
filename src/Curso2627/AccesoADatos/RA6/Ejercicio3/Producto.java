package Curso2627.AccesoADatos.RA6.Ejercicio3;

import lombok.Data;

import java.io.Serializable;

@Data
public class Producto implements Serializable {
    private String codigoFabrica;
    private String codigoProducto;
    private String descripcion;
    private double precio;
    private int existencias;

    public Producto() {
    }

    public Producto(String codigoFabrica, String codigoProducto, String descripcion,
                    double precio, int existencias) {
        this.codigoFabrica = codigoFabrica;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
    }
}