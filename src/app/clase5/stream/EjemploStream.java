package app.clase5.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class EjemploStream {

    private List<String> lineas;
    private String filename;

    public EjemploStream(String file) {
        this.lineas = new  ArrayList<String>();
        this.filename = file;
    }

    public void actualizarDatos() { // EJECUTA 2 METODOS
        leerArchivo();
        guardarArchivo();
    }
    
    
    
    public void leerArchivo() { 
        try {
            String line;
            FileReader fr = new FileReader(this.filename);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) { 
                this.lineas.add(line); // en vez de imprimir lo metemos en este array
                }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
    
    
    public void guardarArchivo() {
       
        try {
       FileWriter fw = new FileWriter(this.filename); // EL ARCHIVO SE CREA EN ESTA RUTA
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (String line: this.lineas){
            bw.write(line);
            bw.newLine();
            }
            bw.write("Nuevo Mensaje");
            bw.newLine();
            bw.write("diciembre");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
