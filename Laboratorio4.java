package Laboratorio4;

import java.util.*;
import Laboratorio4.RoundRobin;

public class Laboratorio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el total de procesos
        System.out.print("Ingrese el total de procesos: ");
        int totalProcesos = sc.nextInt();

        // Crear una lista de procesos
        List<Proceso> listaProcesos = new ArrayList<>();

         // Crear una lista de entradas y salidas
         List<EntradaySalida> listaEntradaysalida = new ArrayList<>();

        // Solicitar información sobre cada proceso
        for (int i = 0; i <= totalProcesos -1; i++) {
            System.out.println("Proceso " + i);
            System.out.print("Tiempo de llegada: ");
            int tiempoLlegada = sc.nextInt();
            System.out.print("Quantum requerido: ");
            int quantum = sc.nextInt();
            System.out.print("Cantidad de entradas/salidas: ");
            int entradasSalidas = sc.nextInt();
            // Solicitar información sobre cada entrada y salida
            for (int j = 0; i <= entradasSalidas-1; j++) {
                System.out.print("Entrada" + j);
                System.out.print("Costo de entrada y salida: ");
                int costoentradasSalidas = sc.nextInt();
                System.out.print("Quantum: ");
                int inquantum = sc.nextInt();

                EntradaySalida es = new EntradaySalida(costoentradasSalidas,inquantum);
                listaEntradaysalida.add(es);
            }
            
            listaProcesos.add(new Proceso("P" + i, tiempoLlegada, entradasSalidas, quantum,listaEntradaysalida));
        }

        // Definir el tamaño del quantum y el intercambio
        int quantum = 20; // milisegundos
        int intercambio = 10; // milisegundos

        // Ejecutar el algoritmo Round Robin
        ejecutarRoundRobin(listaProcesos, quantum, intercambio);

        sc.close();
    }

}