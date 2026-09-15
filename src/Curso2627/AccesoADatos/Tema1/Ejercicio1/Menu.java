package Curso2627.AccesoADatos.Tema1.Ejercicio1;

import java.util.Scanner;

public class Menu {
    private GestorDatos gestorDatos;

    public Menu(GestorDatos gestorDatos) {
        this.gestorDatos = gestorDatos;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Listar Productos");
            System.out.println("3. Agregar Cliente");
            System.out.println("4. Agregar Producto");
            System.out.println("5. Producto con precio más alto");
            System.out.println("6. Cliente con el nombre más largo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> listarClientes();
                case 2 -> listarProductos();
                case 3 -> agregarCliente(scanner);
                case 4 -> agregarProducto(scanner);
                case 5 -> productoPrecioMasAlto();
                case 6 -> clienteNombreMasLargo();
                case 7 -> System.out.println("Fin!");
                default -> System.out.println("Opción errónea, intente de nuevo.");
            }

        } while (opcion != 7);

        scanner.close();
    }

    private void listarClientes() {

    }

    private void listarProductos() {

    }

    private void agregarCliente(Scanner scanner) {

    }

    private void agregarProducto(Scanner scanner) {

    }

    private void productoPrecioMasAlto() {

    }

    private void clienteNombreMasLargo() {

    }
}

