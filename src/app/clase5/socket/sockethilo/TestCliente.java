/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase5.socket.sockethilo;


/**
 *
 * @author alumno
 */
public class TestCliente{
    public static void main(String[] args) {
        Cliente cliente  = new Cliente("localhost",666);
        cliente.doConectar();
        
    }
    

}
