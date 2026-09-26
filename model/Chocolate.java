package model;

public class Chocolate extends Maquina {

    private static final double RECARGO_POR_KG_DIARIO = 20.0;

    private double capacidad;

    public Chocolate(int codigo, String marca, String modelo, double tarifa, double capacidad) {
        super(codigo, marca, modelo, tarifa);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    @Override
    public double calcularCosto(int dias) {
        double costo = super.calcularCosto(dias) + (RECARGO_POR_KG_DIARIO * getCapacidad() * dias);
        return redondear(costo);
    }

    public String getSpecs() {
        return "Capacidad: " + getCapacidad() + " kg";
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + " | " + getSpecs();
    }
}
