package EstruturasDeRepeticao;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int numero;
        int count = 0;
        int pares = 0, impares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();
            count++;

            if (numero % 2 == 0) pares++;
            else impares++;

        } while (count < quantNumeros);

        System.out.println("Quantidade Pares: " + pares);
        System.out.println("Quantidade de Impares:" + impares);
    }
}
