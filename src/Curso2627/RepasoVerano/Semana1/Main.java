package Curso2627.RepasoVerano.Semana1;

public class Main {

    public static void main(String[] args) {

        new MiPrimerHilo("¡Primer hilo!").start();
        new MiPrimerHilo("¡Segundo hilo!").start();
        new MiPrimerHilo("¡Tercer hilo!").start();

    }
}