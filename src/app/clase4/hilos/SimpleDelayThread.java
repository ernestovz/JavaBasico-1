/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase4.hilos;

/**
 *
 * @author alumno
 */
public class SimpleDelayThread extends Thread {

    public void run() {
// 
        for (int i = 0; i < 50; i++) {
            try {
// 1000 ms
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}