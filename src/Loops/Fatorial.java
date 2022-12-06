package Loops;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 
*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = scan.nextInt();
        int multiplicacao = 1;

    for (int i=numero;i>=1; i--){
        multiplicacao = multiplicacao*i;
    }
    System.out.println(numero+"! = "+multiplicacao);

    scan.close();
    }

}
