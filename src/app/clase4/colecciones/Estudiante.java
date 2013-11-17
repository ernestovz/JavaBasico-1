/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase4.colecciones;

/**
 *
 * @author alumno
 */
public class Estudiante implements Comparable<Estudiante> { //IMPLEMENTA LA INTERFACE COMPARABLE, IMPONE UN ORDENAMIENTO DE LOS OBJETO
    // tipo de objeto que va a comparar <Estudiante>

    private String nombres;
    private String apellidos;
    private String direccion;
    private int codMatricula;

    public Estudiante(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int compareTo(Estudiante o) {
        String apellidoExterno = o.getApellidos().toLowerCase();
        String apellidosLocal = this.getApellidos().toLowerCase();
        return apellidosLocal.compareTo(apellidoExterno);
    }

    // Crear su constructor y getters/setters por cada atributo
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public void printEstudiante() {
        System.out.println(this.apellidos + " " + this.nombres);
        
    }
    
}