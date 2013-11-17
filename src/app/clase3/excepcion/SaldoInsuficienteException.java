/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.excepcion;

/**
 *
 * @author alumno
 */
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene " + saldo + " soles. No puede retirar " + cuantoDesea + " soles.");
      
    }


}
