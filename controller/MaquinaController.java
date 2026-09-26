package controller;

import model.Alquileres;
import model.Algodon;
import model.Chocolate;
import model.Maquina;
import model.Popcorn;

public class MaquinaController {

    private AlquileresController alquileresController;

    public MaquinaController(AlquileresController alquileresController) {
        this.alquileresController = alquileresController;
    }

    public void registrarPopcorn(int codigo, String marca, String modelo, double tarifa, int porcionesHora, boolean conCarrito) {
        Popcorn popcorn = new Popcorn(codigo, marca, modelo, tarifa, porcionesHora, conCarrito);
        registrarMaquina(popcorn);
    }

    public void registrarChocolate(int codigo, String marca, String modelo, double tarifa, double capacidad) {
        Chocolate chocolate = new Chocolate(codigo, marca, modelo, tarifa, capacidad);
        registrarMaquina(chocolate);
    }

    public void registrarAlgodon(int codigo, String marca, String modelo, double tarifa, int potencia) {
        Algodon algodon = new Algodon(codigo, marca, modelo, tarifa, potencia);
        registrarMaquina(algodon);
    }

    public void consultarInventario() {
        System.out.println(getAlquileres().getInventario());
    }

    public void consultarMaquina(int codigo) {
        Maquina maquina = getAlquileres().buscarMaquina(codigo);
        if (maquina == null) {
            throw new IllegalArgumentException("No existe una máquina con el código " + codigo + ".");
        }
        System.out.println(maquina.obtenerDetalle());
    }

    private Alquileres getAlquileres() {
        return alquileresController.getAlquileres();
    }

    private void registrarMaquina(Maquina maquina) {
        if (maquina.getCodigo() <= 0) {
            throw new IllegalArgumentException("El código debe ser un número positivo.");
        }
        if (getAlquileres().buscarMaquina(maquina.getCodigo()) != null) {
            throw new IllegalArgumentException("El código " + maquina.getCodigo() + " ya está registrado.");
        }
        getAlquileres().registrarMaquina(maquina);
    }
}
