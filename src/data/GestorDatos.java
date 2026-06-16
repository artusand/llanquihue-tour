package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import model.Tour;

/**
clase que carga los tours de el archivo .txt
*/
public class GestorDatos {

    public ArrayList<Tour> cargarTours(String archivo) {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            String linea;

            while ((linea = lector.readLine()) != null) {
               
                String[] datos = linea.split(";");
                
                String nombre = datos[0];
                
                String destino = datos[1];
                
                double precio = Double.parseDouble(datos[2]);
                
                Tour tour = new Tour(nombre, destino, precio);
                
                listaTours.add(tour);
            }

            lector.close();

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        return listaTours;
    }
}
