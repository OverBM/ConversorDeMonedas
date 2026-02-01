package modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Historial {
    private final String mensaje;
    public Historial(double monto, String base, double resultado, String destino) {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.mensaje =
                "[" + fechaHora.format(formato) + "] " +
                        monto + " [" + base + "] => " +
                        resultado + " [" + destino + "]";
    }
    public String getMensaje() {
        return mensaje;
    }
}