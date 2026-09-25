package Curso2627.AccesoADatos.RA1.Ejercicio1;

import java.io.*;

public class OPERACIONESTEXTOS {

    public static void infoFichero(String rutaFichero, String rutaDirectorio) {
        File f1 = new File(rutaFichero);
        File dir = new File(rutaDirectorio);
        if (f1.exists()) {
            System.out.println("Nombre del fichero  : " + f1.getName());
            System.out.println("Ruta                : " + f1.getPath());
            System.out.println("Ruta absoluta       : " + f1.getAbsolutePath());
            System.out.println("Se puede escribir   : " + f1.canRead());
            System.out.println("Se puede leer       : " + f1.canWrite());
            System.out.println("Tamaño              : " + f1.length());
            System.out.println("Es un directorio    : " + f1.isDirectory());
            System.out.println("Es un fichero       : " + f1.isFile());
        } else {
            System.err.println("El fichero no existe");
        }
        if (dir.isDirectory()) {
            File[] contenido = dir.listFiles();
            if (contenido != null) {
                for (int i = 0; i < contenido.length; i++) {
                    System.out.println(contenido[i].getName());
                }
            }
        } else {
            System.err.println("El directorio no existe o no es un directorio");
        }
    }

    public static void crearFicheroDirectorio(String rutaDirectorio, String nombreArchivo, String nombreDirectorio) {


    }

    public static void leerCaracteres(String rutaFichero) {
        int contador = 0;
        try (Reader lector = new FileReader(rutaFichero)) {
            int valorUnicode;
            while ((valorUnicode = lector.read()) != -1) {
                System.out.println("Valor Unicode: " + valorUnicode
                        + " | Carácter: " + (char) valorUnicode);
                contador++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("No se ha encontrado el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
        System.out.println("Número de caracteres: " + contador);
    }

    public static void leerLineas(String rutaFichero) {
        try(BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println("Línea " + (contador + 1) + ": " + linea);
                contador++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("No se ha encontrado el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public static void leerLineasPares(String rutaFichero) {


    }

    public static void escribirFichero(String rutaFichero, String[] lineas) {


    }

    public static void escribirLineasImpares(String rutaFichero, String[] lineas) {


    }

    public static void copiarFicheroConFin(String rutaOrigen, String rutaDestino) {


    }

    public static void separarParesImpares(String rutaFichero, String rutaPares, String rutaImpares) {


    }

    public static void buscarLinea(String rutaFichero, String lineaBuscada) {


    }

    public static void copiarLineasMayores10(String rutaEntrada, String rutaSalida) {


    }

    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {

    }

}