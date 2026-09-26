public class Popcorn extends Maquina {

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
        return 0;
    }

    public String getSpecs() {
        return null;
    }
}
