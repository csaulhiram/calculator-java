package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double num1 = entrada.nextInt();

        System.out.println("Introduce el segundo número");
        double num2 = entrada.nextInt();

        if (num1 < num2) {
            System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2) + ""
                    + "\n La multiplicación de" + num1 + " * " + num2 + (num1 * num2));
        } else if (num1 > num2) {
            System.out.println("La suma de los números es: " + (num1 - num2) + ""
                    + "\n La división es: " + (num1 / num2));
        }

    }

}
