package modelos;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorMonedas {

    private float calcularTipoCambio(String monedaA, String monedaB){

        ManejadorConsultasExchange manejadorExchange = new ManejadorConsultasExchange();
        //Obtencion de la consulta
        String json = manejadorExchange.obtenerRespuesta(monedaA);

        // Convert to JSON Object
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(json);
        JsonObject jsonobj = root.getAsJsonObject();

        // Acceso al tipo de cambio de la segunda moneda
        JsonObject conversionRates = jsonobj.get("conversion_rates").getAsJsonObject();
        float tipoCambio = Float.parseFloat(conversionRates.get(monedaB).getAsString());

        return tipoCambio;

    }

    public String calcularValorCambio(float valorInicial, String monedaA, String monedaB){

        float valorDeCambio = valorInicial*calcularTipoCambio(monedaA,monedaB);

        return "El valor de " + valorInicial + "[" + monedaA + "] corresponde al valor final de =>>> " + valorDeCambio + "["+monedaB+"]";
    }

}
