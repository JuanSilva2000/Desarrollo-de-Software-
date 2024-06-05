package org.Sprint1;

public class Habitacion {
    private int id;

    public Habitacion(int id) {
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
}
