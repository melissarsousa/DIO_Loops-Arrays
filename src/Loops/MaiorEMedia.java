package Loops;
import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            count = count + 1;

        } while (count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + (soma / count));

        scan.close();

    }
}