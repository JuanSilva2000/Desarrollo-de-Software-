package org.Sprint2;

public class Jugador2 {
    private String nombre;
    private Habitacion2 habitacionActual;

    public Jugador2(String nombre, Habitacion2 habitacionActual) {
        this.nombre = nombre;
        this.habitacionActual = habitacionActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Habitacion2 getHabitacionActual() {
        return habitacionActual;
    }

    public void setHabitacionActual(Habitacion2 habitacionActual) {
        this.habitacionActual = habitacionActual;
    }

    public void mover(String movimiento,Habitacion2[] habitaciones){
        if(movimiento.equals("mover norte") && this.habitacionActual.getId() != 4){
            setHabitacionActual(habitaciones[this.habitacionActual.getId()+1]);

        }else if(movimiento.equals("mover sur") && this.habitacionActual.getId() != 0){
            setHabitacionActual(habitaciones[this.habitacionActual.getId()-1]);

        }else {
            throw new IllegalArgumentException("Movimientto invalido");
        }
    }
}
