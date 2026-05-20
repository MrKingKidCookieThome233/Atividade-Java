package com.pratica;
import java.util.Scanner;

public class ContagemImpares {
    public static void main(String[] args) {
        Scanner impar = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int inicio = impar.nextInt();

        System.out.print("Digite o número final: ");
        int fim = impar.nextInt();

        int contador = 0;
        int i = inicio;

        while (i <= fim) {
            if (i % 2 != 0) {
                contador++;
            }
            i++;
        }

        System.out.println("Quantidade de ímpares no intervalo [" + inicio + ", " + fim + "]: " + contador);

        impar.close();
    }
}
