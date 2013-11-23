package app.clase4.hilos;

public class Memory extends  Thread{

    
    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {

            try {
                Lamemoria();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        }
    public void Lamemoria()
    {
            
    long mem0 = Runtime.getRuntime().totalMemory();
        System.out.println(mem0);
    long mem1 = Runtime.getRuntime().freeMemory();
        System.out.println(mem1);
    long mem2 = Runtime.getRuntime().availableProcessors();
        System.out.println(mem2);
    long mem3 = Runtime.getRuntime().maxMemory();
        System.out.println(mem3);

}}
