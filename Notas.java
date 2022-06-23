package EstruturasDeRepeticao;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int Notas;
        System.out.println("Informe a nota do aluno: ");
        Notas = scan.nextInt();

        while(Notas<0| Notas>10){
           System.out.println("Nota invalida! Digite novamente: ");
           Notas = scan.nextInt();
        }if(Notas>1|Notas<10){
            System.out.println("Nota cadastrada com sucesso!!!");
        }
    }
}
