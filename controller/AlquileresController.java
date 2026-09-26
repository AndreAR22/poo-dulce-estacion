package controller;

import model.Alquileres;

public class AlquileresController {

    private Alquileres alquileres;

    public AlquileresController() {
        this.alquileres = new Alquileres();
    }

    public Alquileres getAlquileres() {
        return alquileres;
    }

    public void cotizar(int codigo, int dias) {
        alquileres.cotizar(codigo, dias);
    }

    public void confirmarAlquiler(int codigo, int dias) {
        alquileres.confirmarAlquiler(codigo, dias);
    }

    public void registrarDevolucion(int codigo) {
    }

    public String getReporte() {
        return alquileres.getReporte();
    }
}
