package model;

public class Maquina {

    private int codigo;
    private String marca;
    private String modelo;
    private double tarifa;
    private boolean disponible = true;

    public Maquina(int codigo, String marca, String modelo, double tarifa) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.tarifa = tarifa;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public double calcularCosto(int dias) {
        return redondear(getTarifa() * dias);
    }

    public String obtenerDetalle() {
        return "Codigo: " + getCodigo()
                + " | Marca: " + getMarca()
                + " | Modelo: " + getModelo()
                + " | Tarifa: Q" + String.format("%.2f", getTarifa())
                + " | Disponible: " + (isDisponible() ? "Si" : "No");
    }

    public void alquilar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }

    protected static double redondear(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}
