package calculos;

import modelos.Filtro;
import modelos.Moneda;

public class Conversion {
    public double convertir(Moneda moneda) {
        Filtro filtro = new Filtro();
        filtro.setMonedaDeCambio(moneda.getMonedaDeCambio());
        filtro.setMonedaACambiar(moneda.getMonedaACambiar());
        filtro.buscarTasa();
        if (filtro.getMonedaBuscada() < 0) {
            return -1;
        }

        return moneda.getConversion() * filtro.getMonedaBuscada();
    }
}
