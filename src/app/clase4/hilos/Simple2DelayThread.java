package app.clase4.hilos;

public class Simple2DelayThread extends Thread {

    public String nombre;
    public long delay;

    public Simple2DelayThread(String nombre, long delay) {
        this.nombre = nombre;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (long i =0; i<5; i ++) {
            System.out.println("Nombre: " + nombre + "Delay: " + delay);
        }
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
        System.out.println("Error: " + ex.getMessage());    
        }
        
    }
}
