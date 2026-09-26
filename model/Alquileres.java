package model;

import java.util.ArrayList;

public class Alquileres {

    private ArrayList<Maquina> maquinas;
    private double ingresos;

    public Alquileres() {
        this.maquinas = new ArrayList<Maquina>();
    }

    public double getIngresos() {
        return 0;
    }

    public String getReporte() {
        return null;
    }

    public String getInventario() {
        return null;
    }

    public void registrarMaquina(Maquina maquina) {
        if (maquina == null) {
            System.out.println("Error: la máquina no puede ser nula.");
            return;
        }
        if (maquina.getCodigo() <= 0) {
            System.out.println("Error: el código debe ser un número positivo.");
            return;
        }
        if (buscarMaquina(maquina.getCodigo()) != null) {
            System.out.println("Error: el código " + maquina.getCodigo() + " ya está registrado.");
            return;
        }
        maquinas.add(maquina);
        System.out.println("Máquina registrada: " + maquina.obtenerDetalle());
    }

    public Maquina buscarMaquina(int codigo) {
        for (Maquina maquina : maquinas) {
            if (maquina.getCodigo() == codigo) {
                return maquina;
            }
        }
        return null;
    }

    public void cotizar(int codigo, int dias) {
    }

    public void confirmarAlquiler(int codigo, int dias) {
    }

    public void registrarDevolucion(int codigo) {
    }
}
