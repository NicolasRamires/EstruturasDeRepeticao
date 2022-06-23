package EstruturasDeRepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fornecido;
        int mult=1;

        System.out.println("Número para calculo fatorial: " );
        fornecido= scan.nextInt();

        System.out.print(fornecido + "!= ");

        for(int n=fornecido;n>=1; n--){
            mult =mult*n;
        }
        System.out.println(mult );

    }
}
