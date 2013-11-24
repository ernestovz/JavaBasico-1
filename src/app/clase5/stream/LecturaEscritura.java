package app.clase5.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscritura {

    public static void main(String[] args) {
        LecturaEscritura.escribirArchivo(); 
        LecturaEscritura.leerArchivo();
        EjemploStream ejemplo = new EjemploStream("C:\\javaTecsup\\ejemplo.txt");
        ejemplo.actualizarDatos();
    
    }

    public static void escribirArchivo() {
        try {
            FileWriter fw = new FileWriter("C:\\javaTecsup\\ejemplo.txt"); // EL ARCHIVO SE CREA EN ESTA RUTA
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("buenas noches Tecsup");
            bw.newLine();
            bw.write("Programa Integral de Java");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void leerArchivo() {
            String sInput;
        try {
            FileReader fr = new FileReader("C:\\javaTecsup\\ejemplo.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) 
            {  // leyendo lina a linea
                System.out.println(sInput); 
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
      }
}

  }

