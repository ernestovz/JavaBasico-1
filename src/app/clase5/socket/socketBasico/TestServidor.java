/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase5.socket.socketBasico;

/**
 *
 * @author alumno
 */
public class TestServidor {
    public static void main(String[] args) {
        TestServidor.testServer();
       
    }
    
    
    public static void testServer() {
        Servidor server = new Servidor(9999);
        server.ejecutar();
        
    }
    

}
