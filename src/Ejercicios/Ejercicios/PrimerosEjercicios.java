package Ejercicios;

import java.util.Scanner;

public class PrimerosEjercicios {

    // Primer ejercicio - primeros n pares.


    public static void main(String[] args) {
        System.out.println("Primer ejercicio (pares)");
        pares();
        System.out.println("Segundo ejercicio (multiplos)");
        multiplos();
        System.out.println("Tercer ejercicio  (¿Es primo?)");
        esPrimo();
        System.out.println("Cuarto ejercicio  (Primeros primos)");
        primerosNumerosPrimos();
        System.out.println("Quinto ejercicio (Nùmeros naturales)");
        NumerosNaturales();

    }

    public static void pares() {

        System.out.println("Ingrese un numero:");
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();

        for (int i = 0; i < x * 2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void multiplos() {

        System.out.println("Ingrese un numero n (cantidad de multiplos):");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        System.out.println("Ingrese un numero m (numero del cual desea saber los multiplos):");
        int m = entrada.nextInt();
        int aux = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(m * i);
        }

    }

    public static void esPrimo() {

        System.out.println("Ingrese un numero n ():");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        boolean esPrimo = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
            }
        }
        if (esPrimo == true) {
            System.out.println(n + " Es primo");
        } else {
            System.out.println(n + " No es primo");
        }
    }

    public static void primerosNumerosPrimos() {
        System.out.println("Ingrese un numero n ():");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int count = 0;


        for (int i = 0; count < n; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;

                }

            }
            if (primo == true) {
                System.out.println(i);
                count++;
            }

        }
    }

    public static void NumerosNaturales() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar la cantidad m que se repite el dígito d: ");
        int m = scan.nextInt();
        System.out.print("Ingresar el d dígito: ");
        int d = scan.nextInt();
        System.out.print("Ingresar la cantidad n de números: ");
        int n = scan.nextInt();

        int contador = 0;
        int countCadena = 0;
        int numeros = 3;
        String numCadena = String.valueOf(numeros);
        for (int i = 0; i < numCadena.length(); i++) {
            if (numCadena.charAt(i) == d) {
                countCadena++;
                int countNum = 0;
                int numero = 0;
                while (countNum < n) {
                    String numString = String.valueOf(numero);
                    for (int j = 0; j < numString.length(); j++) {
                        if (numString.charAt(j) == d) {
                            contador++;
                            System.out.println(countCadena + " " + contador);
                        }
                        if (contador >= m) {
                            System.out.print(numero + " ");
                            contador = 0;
                            countNum++;
                        }
                    }
                    numeros++;
                    //}
                    contador = 0;
                    numero++;
                }
            }
        }
    }
}






