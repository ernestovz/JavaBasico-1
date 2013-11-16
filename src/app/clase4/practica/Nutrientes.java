/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase4.practica;

/**
 *
 * @author alumno
 */
public class Nutrientes {

    private String nombreNutrientes;
    private String unidadmedida;
    private double cantidad;
    private String estado;

      public String getNombre() {
        return nombreNutrientes;
    }

    public void setNombre(String nombre) {
        this.nombreNutrientes = nombre;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   
}
