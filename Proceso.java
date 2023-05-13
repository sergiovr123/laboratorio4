package Laboratorio4;

import java.util.List;

public class Proceso {
    public String nombre;
    public int tiempoLlegada;
    public int entradasSalidas;
    public int quantum;
    public int quantumRestante;
    public List<EntradaySalida> entradasysalidas;

    public Proceso(String nombre, int tiempoLlegada, int entradasSalidas, int quantum, List<EntradaySalida> entradasysalidas) {
        this.nombre = nombre;
        this.tiempoLlegada = tiempoLlegada;
        this.entradasSalidas = entradasSalidas;
        this.quantum = quantum;
        this.quantumRestante = quantum;
        this.entradasysalidas = entradasysalidas;
    }
}
