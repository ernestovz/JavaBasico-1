package app.clase5.socket.sockethilo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServidorHilo extends Thread {

    private Socket cliente;
    private boolean nombre;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;

    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            
              out.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");
            
            String nombre = in.readLine();
            System.out.println(nombre);
            
            String operacion = in.readLine();
            Double operador1 = Double.parseDouble(in.readLine());
            Double operador2 = Double.parseDouble(in.readLine());

            if (operacion.equals("m")) {
                out.println("Servidor Multiplicacion");
                out.println(operador1 * operador2);

            } else if (operacion.equals("s")) {
                out.println("Servidor : suma");
                out.println(operador1 + operador2);
            
            } else if (operacion.equals("r")) {
                out.println("Servidor : resta");
                out.println(operador1 + operador2);
            } else if (operacion.equals("d")) {
                out.println("Servidor : division");
                out.println(operador1 + operador2);

            }
            
            in.close();
            out.close();
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente != null) {
                    cliente.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void calculadora(PrintWriter out, BufferedReader in) throws IOException {
        
          

        }
    }

