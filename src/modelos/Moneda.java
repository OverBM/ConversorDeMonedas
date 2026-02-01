package modelos;

public class Moneda {
    private double cambio;
    private double conversion;
    private String monedaDeCambio;
    private String monedaACambiar;

    public double getCambio() {
        return cambio;
    }

    public double getConversion() {
        return conversion;
    }

    public String getMonedaDeCambio() {
        return monedaDeCambio;
    }

    public String getMonedaACambiar() {
        return monedaACambiar;
    }
    public void setMonedaDeCambio(String monedaDeCambio) {
        this.monedaDeCambio = monedaDeCambio;
    }
    public void setMonedaACambiar(String monedaACambiar) {
        this.monedaACambiar = monedaACambiar;
    }
    public void setConversion(double conversion) {
        this.conversion = conversion;
    }
}
