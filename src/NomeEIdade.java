import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Digite seu nome completo: ");
            nome = scan.nextLine();
            System.out.println("Nome: " + nome);
            if (nome.equals("0")) break;

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            System.out.println("Idade: " + idade);


        }
        scan.close();
        
    }

}

