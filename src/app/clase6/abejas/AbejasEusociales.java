package app.clase6.abejas;


public abstract class AbejasEusociales {

    private String especie;
    private int desarrollo;
    private String celda;
    private String trabajo;

   
   

    public abstract void comer();

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getDesarrollo() {
        return desarrollo;
    }

    public void setDesarrollo(int desarrollo) {
        this.desarrollo = desarrollo;
    }

    public String getCelda() {
        return celda;
    }

    public void setCelda(String celda) {
        this.celda = celda;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    
   
    
    
    
    
}
