/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase5.socket.socketInfinito;

import app.clase5.socket.socketBasico.*;

/**
 *
 * @author alumno
 */
public class TestCliente{
    public static void main(String[] args) {
        Cliente cliente  = new Cliente("localhost",9999);
        cliente.doConectar();
        
    }
    

}
