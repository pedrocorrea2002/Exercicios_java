import java.util.Scanner;

public class ArrayNomes {
    public static void main(String[] args) {

        int A = 0;
        String B = null;
        
        @SuppressWarnings("resource")
        Scanner name = new Scanner(System.in).useDelimiter("\n");

        String[] nomes = new String[10];

        System.out.println("Eu preciso que você escreva 10 nomes");

        int C = 1;

        while (A < 10) {

            System.out.println("Escreva o " + C + "° nome");


            B = name.next().trim();

            System.out.println(B);

            nomes[A] = B;

            C++;
            A++;
        }
        System.out.println("");
        System.out.println("NOMES LISTADOS:");

        A = 0;

        while (A < 7) {
            System.out.print(nomes[A] + ", ");
            A++;
        }
        
        System.out.print(nomes[8] + " e " + nomes[9]);
    }
}