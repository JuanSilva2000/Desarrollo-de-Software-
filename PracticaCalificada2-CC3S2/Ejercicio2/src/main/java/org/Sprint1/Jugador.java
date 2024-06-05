package org.Sprint1;

public class Jugador {
    private String nombre;
    private Habitacion habitacionActual;

    public Jugador(String nombre, Habitacion habitacionActual) {
        this.nombre = nombre;
        this.habitacionActual = habitacionActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Habitacion getHabitacionActual() {
        return habitacionActual;
    }

    public void setHabitacionActual(Habitacion habitacionActual) {
        this.habitacionActual = habitacionActual;
    }

    public void mover(String movimiento,Habitacion[] habitaciones){
        if(movimiento.equals("mover norte") && this.habitacionActual.getId() != 4){
            setHabitacionActual(habitaciones[this.habitacionActual.getId()+1]);

        }else if(movimiento.equals("mover sur") && this.habitacionActual.getId() != 0){
            setHabitacionActual(habitaciones[this.habitacionActual.getId()-1]);

        }else {
            throw new IllegalArgumentException("Movimientto invalido");
        }
    }
}
