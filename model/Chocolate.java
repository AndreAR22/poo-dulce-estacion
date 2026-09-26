package model;

public class Chocolate extends Maquina {

    private double capacidad;

    public Chocolate(int codigo, String marca, String modelo, double capacidad) {
        super(codigo, marca, modelo, 0.0);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    @Override
    public double calcularCosto(int dias) {
        return 0;
    }

    public String getSpecs() {
        return null;
    }
}
