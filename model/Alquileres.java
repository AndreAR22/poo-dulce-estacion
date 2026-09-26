package model;

import java.util.ArrayList;

public class Alquileres {

    private ArrayList<Maquina> maquinas;
    private double ingresos;

    public Alquileres() {
        this.maquinas = new ArrayList<Maquina>();
    }

    public double getIngresos() {
        return ingresos;
    }

    public String getReporte() {
        return null;
    }

    public String getInventario() {
        StringBuilder inventario = new StringBuilder("INVENTARIO\n");
        for (Maquina maquina : maquinas) {
            inventario.append(maquina.obtenerDetalle()).append("\n");
        }
        inventario.append("Total de maquinas: ").append(maquinas.size());
        return inventario.toString();
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
        Maquina maquina = validarAlquiler(codigo, dias);
        if (maquina == null) {
            return;
        }
        System.out.println("Cotización: " + maquina.obtenerDetalle());
        System.out.println("Total por " + dias + " día(s): Q" + String.format("%.2f", maquina.calcularCosto(dias)));
    }

    public void confirmarAlquiler(int codigo, int dias) {
        Maquina maquina = validarAlquiler(codigo, dias);
        if (maquina == null) {
            return;
        }
        double costo = maquina.calcularCosto(dias);
        maquina.alquilar();
        ingresos = redondear(ingresos + costo);
        System.out.println("Alquiler confirmado: " + maquina.obtenerDetalle());
        System.out.println("Total por " + dias + " día(s): Q" + String.format("%.2f", costo));
        System.out.println("Ingresos acumulados: Q" + String.format("%.2f", ingresos));
    }

    private Maquina validarAlquiler(int codigo, int dias) {
        if (dias <= 0) {
            System.out.println("Error: los días deben ser un número entero positivo.");
            return null;
        }
        Maquina maquina = buscarMaquina(codigo);
        if (maquina == null) {
            System.out.println("Error: no existe una máquina con el código " + codigo + ".");
            return null;
        }
        if (!maquina.isDisponible()) {
            System.out.println("Error: la máquina " + codigo + " está alquilada.");
            return null;
        }
        return maquina;
    }

    private static double redondear(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}
