package Loops;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ParEImpar {

public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int quantidadeNumero = 0;
    int quantidadePar = 0;
    int quantidadeImpar = 0;
    int numero = 0;

    System.out.println("Insira a quantidade de números inteiros: ");
    quantidadeNumero = scan.nextInt();
    int count = 0;

    do {
        System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) quantidadePar++;
            else quantidadeImpar++;

            count++;

    } while (count < quantidadeNumero);

    System.out.println("A quantidade de números pares e ímpares é, respectivamente: " + quantidadePar + ", " + quantidadeImpar + ".");

    scan.close();
}

}


