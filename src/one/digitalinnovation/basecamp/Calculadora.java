package one.digitalinnovation.basecamp;

/*
 * Classe calculadora para exercício 01
 */

public class Calculadora {

    public static void soma( double numero1, double numero2 ) {
        double resultado = numero1 + numero2;
        System.out.println("Soma: " + resultado);
    }

    public static void subtracao( double numero1, double numero2 ) {
        double resultado = numero1 - numero2;
        System.out.println("Subtracao: " + resultado);
    }

    public static void multiplicacao( double numero1, double numero2 ) {
        double resultado = numero1 * numero2;
        System.out.println("Multiplicacao: " + resultado);
    }

    public static void divisao( double numero1, double numero2 ) {
        double resultado = numero1 / numero2;
        System.out.println("divisao: " + resultado);
    }

}
