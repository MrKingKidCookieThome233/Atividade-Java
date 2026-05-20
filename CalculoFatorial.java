package com.pratica;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner Fat = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = Fat.nextInt();

        long fatorial = 1;

        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + " = " + fatorial);

        Fat.close();
    }
} 
