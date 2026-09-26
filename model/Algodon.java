package model;

public class Algodon extends Maquina {

    private static final int POTENCIA_CON_RECARGO = 1000;
    private static final double RECARGO_POR_ALQUILER = 60.0;

    private int potencia;

    public Algodon(int codigo, String marca, String modelo, double tarifa, int potencia) {
        super(codigo, marca, modelo, tarifa);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public double calcularCosto(int dias) {
        double costo = super.calcularCosto(dias);
        if (getPotencia() > POTENCIA_CON_RECARGO) {
            costo += RECARGO_POR_ALQUILER;
        }
        return redondear(costo);
    }

    public String getSpecs() {
        return "Potencia: " + getPotencia() + " W";
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + " | " + getSpecs();
    }
}
