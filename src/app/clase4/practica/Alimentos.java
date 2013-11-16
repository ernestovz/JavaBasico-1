/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase4.practica;

/**
 *
 * @author alumno
 */
public abstract class Alimentos {

    private String nombre;
    private String tipo;
    private String unidadMedida ;
    private double costoUnidad;
    private String valorNutricional;
    private Nutrientes nombreNutrientes;
    private Nutrientes cantidad;

    public Alimentos(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        
    }

    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUnidadmedida() {
        return unidadMedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadMedida = unidadmedida;
    }

    public double getCostoporunidad() {
        return costoUnidad;
    }

    public void setCostoporunidad(double costoporunidad) {
        this.costoUnidad = costoporunidad;
    }

    public String getValornutricional() {
        return valorNutricional;
    }

    public void setValornutricional(String valornutricional) {
        this.valorNutricional = valornutricional;
    }

      
    public Nutrientes getCantidad() {
        return cantidad;
    }

    public void setCantidad(Nutrientes cantidad) {
        this.cantidad = cantidad;
    }
        
}
