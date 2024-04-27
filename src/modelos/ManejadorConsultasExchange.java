package modelos;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ManejadorConsultasExchange {

    final String apiKey = "60f606d8f9076370dbf00dd3";
    final String uri = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/";

    public String obtenerRespuesta(String moneda) {

        String monedaEncoder = URLEncoder.encode(moneda, StandardCharsets.UTF_8);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri+monedaEncoder))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (IOException| InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
