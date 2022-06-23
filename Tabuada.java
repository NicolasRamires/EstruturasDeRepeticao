package EstruturasDeRepeticao;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Valor;

        System.out.print("Digite um número para tabuada: ");
        Valor = scan.nextInt();

        for (int mult=1; mult<=10; mult++) {
            System.out.println(Valor + "x" + mult + " = " + (Valor * mult));
        }
    }
}
