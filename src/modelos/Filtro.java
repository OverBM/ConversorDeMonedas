package modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Filtro extends Moneda {
    private double monedaBuscada;
    public void buscarTasa() {
        String base = getMonedaDeCambio();
        String destino = getMonedaACambiar();
        String url = "https://v6.exchangerate-api.com/v6/821008857475554c0c8d4a09/latest/" + base;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject tasas = json.getAsJsonObject("conversion_rates");
            monedaBuscada = tasas.get(destino).getAsDouble();
        } catch (Exception e) {
            System.out.println("No se pudo leer API: " + e.getMessage());
            monedaBuscada = -1;
        }
    }
    public double getMonedaBuscada() {
        return monedaBuscada;
    }
}
