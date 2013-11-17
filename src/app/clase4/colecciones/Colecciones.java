package app.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Colecciones {

    private static List<Estudiante> New;

    public static void main(String[] args) {
        Colecciones.ejemploMap();
    }

    public static void ejemploMap() {
        Estudiante jose = new Estudiante("jose", "eusebio alderete");
        Estudiante gomes = new Estudiante("jean", "gomez gutierrez");
        Estudiante jorge = new Estudiante("jorge", "ortiz pisco");
        Estudiante rafa = new Estudiante("rafael", "lopez ponce");
        Estudiante luis = new Estudiante("luis", "gutierrez paloma");
// HashMap
        HashMap<String, Estudiante> listado = new HashMap<String, Estudiante>();
        listado.put("100525", jose);
        listado.put("100526", gomes);
        listado.put("100527", rafa);
        
        listado.get("100527").printEstudiante();
        
        Collection<Estudiante> listadoMap = listado.values();
        for (Estudiante estudiante : listadoMap) {
            estudiante.printEstudiante();
            
        }
        
    }

    public static void ejemploHashset() { // instanciamos
        Estudiante jose = new Estudiante("jose", "eusebio alderete");
        Estudiante gomes = new Estudiante("jean", "gomez gutierrez");
        Estudiante jorge = new Estudiante("jorge", "ortiz pisco");
        Estudiante rafa = new Estudiante("rafael", "lopez ponce");
        Estudiante luis = new Estudiante("luis", "gutierrez paloma");

        Set<Estudiante> listado = new HashSet<Estudiante>(); // verifica que el objeto no se duplique
        listado.add(jose);
        listado.add(gomes);
        listado.add(jorge);
        listado.add(rafa);
        listado.add(luis);
        listado.add(jose);
        listado.add(gomes);
        listado.add(jorge);

        // PARA IMPRIMIR UNA LISTA  fore + tab
        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }
    }

    public static void ejemploEstudiantes() { // instanciamos
        Estudiante jose = new Estudiante("jose", "eusebio alderete");
        Estudiante gomes = new Estudiante("jean", "gomez gutierrez");
        Estudiante jorge = new Estudiante("jorge", "ortiz pisco");
        Estudiante rafa = new Estudiante("rafael", "lopez ponce");
        Estudiante luis = new Estudiante("luis", "gutierrez paloma");

        List<Estudiante> listado = new ArrayList<Estudiante>(); // lista
        listado.add(jose);
        listado.add(gomes);
        listado.add(jorge);
        listado.add(rafa);
        listado.add(luis);
        listado.add(jose);
        listado.add(gomes);
        listado.add(jorge);
        listado.add(rafa);
        listado.add(luis);

        Collections.sort(listado); // ordenamos


        // PARA IMPRIMIR UNA LISTA  fore + tab
        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }

        System.out.println(listado.size());
        Estudiante luis2 = listado.get(5);
        luis2.printEstudiante();

    }

    public static void ejemploLinkedList() {
        Estudiante jose = new Estudiante("jose", "eusebio alderete");
        Estudiante gomes = new Estudiante("jean", "gomez gutierrez");
        Estudiante jorge = new Estudiante("jorge", "ortiz pisco");


        LinkedList<Estudiante> listado = new LinkedList<Estudiante>();
        listado.add(jose);
        listado.add(gomes);
        listado.add(jorge);


        ListIterator<Estudiante> ite = listado.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) listado.poll();
            System.out.println(e.getNombres());
        }
        System.out.println(listado.size());
    }
}
