package ui;

import data.GestorDatos;
import java.util.ArrayList;
import model.Tour;

/**
clase Main
*/
public class Main {

    public static void main(String[] args) {
        
        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours = gestor.cargarTours("tours.txt");

        System.out.println("Tours Disponiles");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println ("Precio mayor o igual a 27000");

        for (Tour tour : tours) {
            if (tour.getPrecio() >= 27000) {
                System.out.println(tour);
            }
        }
        System.out.println ("Precio menor a 27000");

        for (Tour tour : tours) {

            if (tour.getPrecio() < 27000) {
                System.out.println(tour);
            }
        }
    }
}