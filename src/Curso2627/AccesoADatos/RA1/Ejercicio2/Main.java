package Curso2627.AccesoADatos.RA1.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OperacionesEjemplo op = new OperacionesEjemplo();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n===== MENÚ FICHEROS BINARIOS EJEMPLO. =====");
            System.out.println("1. Ejemplo Fichero Binario sin clases");
            System.out.println("2. Ejemplo Fichero Binario con clases (Serializable)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1 :
                    System.out.println("Introduce la ruta del fichero binario: ");
                    String rutaFichero = sc.nextLine();
                    op.ejemploSimple(rutaFichero, sc);
                    break;
                case 2 : op.ejemploEmpleados();
                    break;
                case 0 : System.out.println("FIN DEL PROGRAMA");
                    break;
                default : System.out.println("OPCION ERRONEA");
            }
        } while (opcion != 0);
        sc.close();
    }
}