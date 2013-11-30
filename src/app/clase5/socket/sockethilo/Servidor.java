/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase5.socket.sockethilo;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int port;

    public Servidor(int port) {
        this.port = port;

    }
    public void ejecutar() {
        try {
// Creamos un servidor de Socket
            ServerSocket socket = new ServerSocket(port);
            System.out.println("Servidor iniciado...");
            while (true) {
                System.out.println("Esperando ...");
                Socket cliente = socket.accept();
                ServidorHilo server = new ServidorHilo(cliente);
                server.start();
            }
        } catch (Exception e) {
            System.out.println("Error CLiente: ");

        }
    }
}
