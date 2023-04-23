package com.example.hilos_mascorto;

import java.util.*;

public class MainHilos  {
    static Scanner t =new Scanner(System.in);


    public static void main(String[] args) {

        List<Trabajo> trabajos = new ArrayList<>(); //crea los trabajos
        System.out.println("Tiempo de trabajo 1 =");
        trabajos.add(new Trabajo(t.nextInt()));
        System.out.println("Tiempo de trabajo 2 =");
        trabajos.add(new Trabajo(t.nextInt()));
        System.out.println("Tiempo de trabajo 3 =");
        trabajos.add(new Trabajo(t.nextInt()));
        Collections.sort(trabajos, Comparator.comparingInt(t -> t.duracion));

        ThreadGroup grupo = new ThreadGroup("Trabajos");
        for (Trabajo trabajo : trabajos) {
            Thread hilo = new Thread(grupo, trabajo);
            hilo.start();
        }

    }

    public static class Trabajo implements Runnable {
        private int duracion;

        public Trabajo(int duracion) {
            this.duracion = duracion;
        }

        @Override
        public void run() {
            try {
                // Simula el trabajo haciendo una pausa de duración aleatoria
                Thread.sleep(duracion);
            } catch (InterruptedException ex) {
                // Manejo de excepciones
            }
            System.out.println("Trabajo con duracion " + duracion + " completado.");
        }
    }
}