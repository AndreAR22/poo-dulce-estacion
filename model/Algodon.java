package model;

public class Algodon extends Maquina {

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
        return 0;
    }

    public String getSpecs() {
        return null;
    }
}
