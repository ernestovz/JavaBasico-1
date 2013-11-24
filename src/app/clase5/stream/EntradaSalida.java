package app.clase5.stream;

import java.io.File;

public class EntradaSalida {

    public static void main(String[] args) {
        //EntradaSalida.verifyFile();
        // EntradaSalida.listardirectorio();
        EntradaSalida.createDirectorio();

    }

    public static void listardirectorio() {

        File dir = new File("C:\\");

        if (dir.isDirectory() && dir.exists()) {

            for (String subDir : dir.list()) {
                System.out.println(subDir);

            }
        }
    }

    public static void verifyFile() {
        File file = new File("C:\\temario.txt");

        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta : " + file.getPath());
        System.out.println("Ruta Absoluta: " + file.getAbsolutePath());

        if (file.exists()) {
            System.out.println("Archivo sí existe!");
            System.out.println((file.canRead()) ? "Sí se puede leer" : "");
            System.out.println((file.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + file.length() + " bytes");
        } else {
            System.out.println("El Arrrrrchivo no existe");
        }
    }

    public static void createDirectorio() {
        File dir = new File("C:\\javaTecsup");
        if (!dir.isDirectory() && !dir.exists()) {
            dir.mkdir();
        }
    }


}
