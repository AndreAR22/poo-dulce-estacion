package model;

public class Popcorn extends Maquina {

    private static final double RECARGO_CARRITO_DIARIO = 40.0;

    private int porcionesHora;
    private boolean conCarrito;

    public Popcorn(int codigo, String marca, String modelo, double tarifa, int porcionesHora, boolean conCarrito) {
        super(codigo, marca, modelo, tarifa);
        this.porcionesHora = porcionesHora;
        this.conCarrito = conCarrito;
    }

    public int getPorcionesHora() {
        return porcionesHora;
    }

    public boolean getConCarrito() {
        return conCarrito;
    }

    @Override
    public double calcularCosto(int dias) {
        double costo = super.calcularCosto(dias);
        if (getConCarrito()) {
            costo += RECARGO_CARRITO_DIARIO * dias;
        }
        return redondear(costo);
    }

    public String getSpecs() {
        return "Porciones/hora: " + getPorcionesHora() + " | Con carrito: " + (getConCarrito() ? "Si" : "No");
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + " | " + getSpecs();
    }
}
