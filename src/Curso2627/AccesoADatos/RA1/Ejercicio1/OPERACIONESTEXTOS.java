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
        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
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
        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                if ((contador + 1) % 2 == 0) {
                    System.out.println("Línea " + (contador + 1) + ": " + linea);
                }
                contador++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("No se ha encontrado el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public static void escribirFichero(String rutaFichero, String[] lineas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaFichero))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    public static void escribirLineasImpares(String rutaFichero, String[] lineas) {
        int contador = 0;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaFichero))) {
            for (String linea : lineas) {
                if (linea != null) {
                    if ((contador + 1) % 2 != 0) {
                        bw.write(linea);
                        bw.newLine();
                    }
                }
                contador++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copiarFicheroConFin(String rutaOrigen, String rutaDestino) {
        try (FileReader fr = new FileReader(rutaOrigen)) {
            try (FileWriter fw = new FileWriter(rutaDestino)) {
                int c;
                while ((c = fr.read()) != -1) {
                    fw.write(c);
                }
                fw.write("\nFin del fichero");
            }
        } catch(IOException e){
            System.err.println("Error al copiar el fichero: " + e.getMessage());
        }
    }

    public static void separarParesImpares(String rutaFichero, String rutaPares, String rutaImpares) {
        try (FileReader fr = new FileReader(rutaFichero)) {
            try (FileWriter fw = new FileWriter(rutaPares)) {
                int contador = 0;
                int c;
                while ((c = fr.read()) != -1) {
                    if ((contador + 1) % 2 == 0) {
                        fw.write(c);
                    }
                    contador++;
                }
                fw.write("\nFin PARES");
            }
        } catch(IOException e){
            System.err.println("Error al copiar el fichero: " + e.getMessage());
        }
        try (FileReader fr = new FileReader(rutaFichero)) {
            try (FileWriter fw = new FileWriter(rutaImpares)) {
                int contador = 0;
                int c;
                while ((c = fr.read()) != -1) {
                    if ((contador + 1) % 2 != 0) {
                        fw.write(c);
                    }
                    contador++;
                }
                fw.write("\nFin IMPARES");
            }
        } catch(IOException e){
            System.err.println("Error al copiar el fichero: " + e.getMessage());
        }
    }

    public static void buscarLinea(String rutaFichero, String lineaBuscada) {


    }

    public static void copiarLineasMayores10(String rutaEntrada, String rutaSalida) {


    }

    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {

    }

}