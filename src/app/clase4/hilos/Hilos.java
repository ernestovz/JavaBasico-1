package app.clase4.hilos;
public class Hilos {
    public static void main(String[] args) {
        //  Hilos.TestHiloHerencia();
        // Hilos.TestHiloInterfase();
        //Hilos.Test_SimpleDelayThread();
        // Hilos.Test_Simple2DelayThread();
        // Hilos.Prioridad();
        //Hilos.TestListProceso();
        Hilos.TestMemoria();
    }
    public static void TestHiloHerencia() {
        HiloHerencia h1 = new HiloHerencia();
        h1.start();
    }

    public static void TestHiloInterfase() {
        HiloInterfase st = new HiloInterfase();
        Thread th = new Thread(st);
        th.start();
    }

    public static void Test_SimpleDelayThread() {
        SimpleDelayThread sd = new SimpleDelayThread();
        sd.start();
    }

    public static void Test_Simple2DelayThread() {
        long delay1 = (long) (Math.random() * 2000);
        //long delay2 = (long) (Math.random() * 2000);
        //long delay3 = (long) (Math.random() * 1000);
        Simple2DelayThread delay = new Simple2DelayThread("ernesto ", delay1);
        //Simple2DelayThread delay1 = new Simple2DelayThread("thread2", delay2);
        //Simple2DelayThread delay2 = new Simple2DelayThread("thread3", delay3);
        delay.start();
        //delay1.start();
        //delay2.start();
    }

    public static void Prioridad() {
        Simple2DelayThread thread1 = new Simple2DelayThread("thread1", 0);
        Simple2DelayThread thread2 = new Simple2DelayThread("thread2", 0);
// Modificando las prioridades
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }

    public static void TestListProceso() {
    
    ProcesosHilo x = new ProcesosHilo();
    x.start();
    
    
    }

    public static void TestMemoria() {
        Memory xx = new Memory();
        xx.start();
        
    }


}
