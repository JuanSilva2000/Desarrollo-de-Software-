package org.Sprint2;

public class Habitacion2 {
    private int id;
    private String acertijo;
    private String respuesta;
    private boolean completado = false;

    public Habitacion2(int id) {
        if (id<5 && id>=0) {
            this.id = id;
        }else {
            throw new IllegalArgumentException("Habitacion no valida");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAcertijoRespuesta(String acertijo,String respuesta) {
        this.acertijo = acertijo;
        this.respuesta = respuesta;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public String getAcertijo() {
        return acertijo;
    }

    public String getRespuesta() {
        return respuesta;
    }
}
