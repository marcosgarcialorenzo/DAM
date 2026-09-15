package Curso2627.AccesoADatos.Tema1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestorDatos = new GestorDatos();
        Menu menu = new Menu(gestorDatos);
        menu.mostrarMenu();
    }
}