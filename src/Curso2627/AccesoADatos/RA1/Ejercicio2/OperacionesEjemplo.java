package Curso2627.AccesoADatos.RA1.Ejercicio2;

import java.io.*;
import java.util.Scanner;

public class OperacionesEjemplo {

    public void ejemploSimple(String rutaFichero) {
        Scanner sc = new Scanner(System.in);
        ejemploSimple(rutaFichero, sc);
    }

    public void ejemploSimple(String rutaFichero, Scanner sc) {
        System.out.println("Introduce el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce la fecha de nacimiento del empleado: ");
        String fecha = sc.nextLine();
        System.out.println("Introduce el código del empleado: ");
        long codigo = sc.nextLong();
        System.out.println("Introduce el salario del empleado: ");
        long salario = sc.nextLong();

        try (FileOutputStream entrada = new FileOutputStream(rutaFichero);
             DataOutputStream datos = new DataOutputStream(entrada)) {
            datos.writeUTF(nombre);
            datos.writeUTF(fecha);
            datos.writeLong(codigo);
            datos.writeLong(salario);
        } catch (IOException e) {
            throw new RuntimeException("No se pudieron guardar los datos", e);
        }

        try (FileInputStream entrada = new FileInputStream(rutaFichero);
             DataInputStream datos = new DataInputStream(entrada)) {
            String nombreLeido = datos.readUTF();
            String fechaLeida = datos.readUTF();
            long codigoLeido = datos.readLong();
            long salarioLeido = datos.readLong();

            System.out.println("\n=== Datos del empleado ===");
            System.out.println("Nombre: " + nombreLeido);
            System.out.println("Fecha de nacimiento: " + fechaLeida);
            System.out.println("Código: " + codigoLeido);
            System.out.println("Salario: " + salarioLeido);
        } catch (IOException e) {
            throw new RuntimeException("No se pudieron leer los datos", e);
        }
    }


    public void ejemploEmpleados() {

    }
}