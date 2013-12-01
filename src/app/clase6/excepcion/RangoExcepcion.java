package app.clase6.excepcion;

import java.io.IOException;

public class RangoExcepcion {

    int valorincio;
    int valorfinal;
    private int i;

    public void metod() {
        try {

            for (i = 0; i < 10; i++) {
                System.out.println(i);
                if (i < 9) {
                    System.out.println("Error de fuera de rango");
                }
            }
        }catch (NullPointerException e) {
            System.out.println("error");
            e.printStackTrace();
        
    }
}
}
