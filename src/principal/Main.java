package principal;

import modelos.ConversorMonedas;


import java.util.Scanner;

public class Main {

    //Conversor de Dolar Peso Argentino
    //Conversor de Dolar a Sol peruano
    //Conversor de dolar a boliviano boliviano
    //y viceversa

    public static void main(String[] args) {

        ConversorMonedas miConversor = new ConversorMonedas();
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while(opcion != -1){

                    Main.textoMenu();
                    opcion = scanner.nextInt();
                    float valorInicial = 0;
                    String mensajeFinal = null;

            switch(opcion){
                        case 1 ->{
                            System.out.println("Ingrese el valor a convertir: ");
                            valorInicial = scanner.nextFloat();
                            mensajeFinal = miConversor.calcularValorCambio(valorInicial,"USD","ARS");
                        }
                        case 2 ->{
                            System.out.println("Ingrese el valor a convertir: ");
                            valorInicial = scanner.nextFloat();
                            mensajeFinal = miConversor.calcularValorCambio(valorInicial,"ARS","USD");
                        }
                        case 3 ->{
                            System.out.println("Ingrese el valor a convertir: ");
                            valorInicial = scanner.nextFloat();
                            mensajeFinal = miConversor.calcularValorCambio(valorInicial,"USD","PEN");
                        }
                        case 4 ->{
                            System.out.println("Ingrese el valor a convertir: ");
                            valorInicial = scanner.nextFloat();
                            mensajeFinal = miConversor.calcularValorCambio(valorInicial,"PEN","USD");
                        }
                        case 5 ->{
                            System.out.println("Ingrese el valor a convertir: ");
                            valorInicial = scanner.nextFloat();
                            mensajeFinal = miConversor.calcularValorCambio(valorInicial,"USD","BOB");
                        }
                        case 6 ->{
                            System.out.println("Ingrese el valor a convertir: ");
                            valorInicial = scanner.nextFloat();
                            mensajeFinal = miConversor.calcularValorCambio(valorInicial,"BOB","USD");
                        }
                        case 7 ->{
                            opcion = -1;
                        }
                        default ->{
                            System.out.println("Ingrese un valor valido");
                        }
                    }

            System.out.println(mensajeFinal);
        }
    }

    public static void textoMenu(){
        System.out.println("""
                    ***************************************************************
                    Sea bienvenido/a al Conversor de Moneda :)
                    
                    1) Dólar -> Peso Argetnino
                    2) Peso Argentino -> Dólar
                    3) Dólar -> Sol Peruano
                    4) Sol Peruano -> Dólar
                    5) Dólar -> Boliviano
                    6) Boliviano -> Dólar
                    7) Salir
                    Elija una opción válida:
                    ***************************************************************
                    """);
    }

}
