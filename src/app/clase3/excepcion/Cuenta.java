/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.excepcion;

/**
 *
 * @author alumno
 */
public class Cuenta {

    String nombre;
    double saldo;

    public Cuenta(String nombre, double saldo) {  //constructor
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public double retirarCajero(double monteRetiro) throws SaldoInsuficienteException { // metodo

        if(monteRetiro > saldo){
            throw new SaldoInsuficienteException(saldo, monteRetiro);
                        
        }
      this.saldo = saldo - monteRetiro; // descuento el monto a retirar 
      return saldo; // el saldo que queda
      
    }
}
