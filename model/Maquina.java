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
        return 0;
    }

    public String obtenerDetalle() {
        return this.marca;
    }

    public void alquilar() {
    }

    public void devolver() {
    }
}
