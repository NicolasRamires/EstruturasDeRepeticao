package EstruturasDeRepeticao;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        int cont=0;
        int maior=0;
        int soma=0;

        do{
        System.out.println("Digite um número: ");
        n= scan.nextInt();
        soma=soma+n;
        if(n>maior)maior=n;
        cont = cont +1;
        }while(cont < 5);

        System.out.println("O maior número foi: " + maior);
        System.out.println("A media dos números é: " + (soma/5));
    }

}
