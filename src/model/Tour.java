package model;

/**
 Clase que representa un tour 
 */
public class Tour {

    private String nombre;
    private String destino;
    private double precio;

    public Tour(String nombre, String destino, double precio) {
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tour: " + nombre + " , Destino: " + destino + " , Precio: $" + precio;
        
    }
}
