/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.excepcion;

// DESARROLLANDO NUESTRA PROPIA EXCEPCION
public class Cajero {

    public static void main(String[] args) {

        try {


            Cuenta cuentaJose = new Cuenta("jose", 5000);
            System.out.println("SALDO " + cuentaJose.retirarCajero(3000));
            System.out.println("SALDO " + cuentaJose.retirarCajero(4000));
        } catch (SaldoInsuficienteException eC){
            System.out.println(eC.getMessage());
        }
    }
}
