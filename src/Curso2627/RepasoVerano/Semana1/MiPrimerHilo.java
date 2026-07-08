package Curso2627.RepasoVerano.Semana1;

public class MiPrimerHilo extends Thread {

    private String mensaje;

    public MiPrimerHilo(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        System.out.println(mensaje);
    }
}