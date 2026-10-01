
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("1 - Alterar");
            System.out.println("2 - Retornar");
            System.out.println("3 - Encerrar");

            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite a marca:");
                carro.marca = sc.next();

                System.out.println("Digite o modelo:");
                carro.modelo = sc.next();

                System.out.println("Digite o ano:");
                carro.ano = sc.nextInt();
            }

            if (opcao == 2) {
                System.out.println("Marca: " + carro.marca);
                System.out.println("Modelo: " + carro.modelo);
                System.out.println("Ano: " + carro.ano);
            }
        }

        sc.close();
    }
}

class Carro {
    String marca;
    String modelo;
    int ano;
}
