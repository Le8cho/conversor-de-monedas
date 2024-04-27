# Conversor de Monedas

Este proyecto consiste en una aplicación de consola que permite convertir entre diferentes monedas utilizando una API de tipo de cambio.

## Clases

### Main

La clase Main es la entrada principal del programa. Se encarga de ejecutar la aplicación, mostrar un menú interactivo y llamar al objeto de la clase Conversor de Monedas para realizar las conversiones.

### Conversor de Monedas

La clase Conversor de Monedas es responsable de realizar las conversiones de moneda. Recibe dos parámetros: la moneda de origen (Moneda A) y la moneda de destino (Moneda B).

#### Métodos

- `private float calcularTipoCambio(String monedaA, String monedaB)`: Este método calcula el tipo de cambio entre las dos monedas. Realiza una solicitud a una API utilizando el objeto de la clase ManejadorConsultasExchanje para obtener el JSON correspondiente a la moneda de origen (Moneda A). Luego, utiliza la moneda de destino (Moneda B) para obtener la tasa de cambio dentro de dicho JSON.

- `public String calcularValorCambio(float valorInicial, String monedaA, String monedaB)`: Este método devuelve el valor de cambio en un mensaje de cadena. Recibe como parámetros el valor inicial a convertir y las dos monedas involucradas en la conversión.

## Uso

Para utilizar la aplicación, sigue estos pasos:

1. Ejecuta la clase Main.
2. Se mostrará un menú con las opciones disponibles.
3. Selecciona la opción de conversión de monedas.
4. Ingresa la moneda de origen (Moneda A) y la moneda de destino (Moneda B).
5. Ingresa el valor inicial a convertir.
6. La aplicación calculará y mostrará el valor convertido.