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

        for (int i = 0; i < x*2; i++) {
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
            System.out.println(m*i);
            }

        }

        public static void esPrimo(){

            System.out.println("Ingrese un numero n ():");
            Scanner entrada = new Scanner(System.in);
            int n = entrada.nextInt();
            boolean esPrimo = true;

            for(int i=2; i<n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }
                if (esPrimo==true){
                    System.out.println(n+" Es primo");
                }
                else{
                    System.out.println(n+" No es primo");
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

        public static void NumerosNaturales(){

            System.out.println("Ingrese un n (primeros numeros naturales):");
            Scanner entrada = new Scanner(System.in);
            int n = entrada.nextInt();
            System.out.println("Ingrese un m (cantidad de digitos):");
            int m = entrada.nextInt();
            System.out.println("Ingrese un d (digito)");
            int d = entrada.nextInt();
            int cont=0;
            int i=1;

            while(cont<n){

                if(funciona(i, m, d)){
                    System.out.println(i);
                    cont ++;
                }
                i++;
            }

        }

        public static boolean funciona(int i, int m, int d){

            String cadena = Integer.toString(i);
            char c = (char)(d+0);
            return contarCaracter(cadena, c)==m;
        }

        public static int contarCaracter(String cadena, char c){

            int cont=0;
            for (int i =0; i<cadena.length(); i++){
                if (cadena.charAt(i)==c){
                    cont ++;
                }
            }
            return cont;

        }
    }






