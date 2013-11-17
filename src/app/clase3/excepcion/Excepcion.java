package app.clase3.excepcion;
// CRTL + L LIMPIA PANTALLA DE OUTPUT
// CRTL + CLICK EN EL ERROR DE LA CONSOLA OUTPUT

public class Excepcion {

    public static void main(String[] args) {
        Excepcion.testExcepcion3();
    }

    public static void testExcepcion() {


        try {
            /* int dividendo = 10;
             int divisor = 0;
             int resultado = dividendo / divisor; */

            int[] array = new int[2];
            array[10] = 100;

        } catch (ArrayIndexOutOfBoundsException e) { // se maneja la excepcion
            System.out.println("HUBO UN ARRAY: ");
            // e.printStackTrace(); // imprime la traza del error; las lineas del error

        } catch (ArithmeticException e) {
            System.out.println("HUBO UN MATEMATICO: ");
        } finally {
            System.out.println("FIN DEL PROGRAMA");
        }
    }

    public static void testExcepcion3() {
        
        try{
        //int[] numero = null;
        int[] numero = {1,1,2,2,3,3,1,1,3,2,31,2,13,12};
        for (int i = 0; i < 11; i++) {
            int j = numero[i];
            System.out.println(j);
        }
        } catch (NullPointerException e ){
            
            System.out.println("ERROR ARRAY NULO");
            e.printStackTrace();
            
            
        } finally{
            System.out.println("APLICACION TERMINADA");
        }

    }





}





