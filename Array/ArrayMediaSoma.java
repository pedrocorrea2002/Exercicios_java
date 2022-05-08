import java.util.Scanner;

public class ArrayMediaSoma {
    public static void main(String[] args) {

        int A = 0;
        int B = 0;
        @SuppressWarnings("resource")
        Scanner number = new Scanner(System.in).useDelimiter("\n");

        int[] numbers = new int[10];

        System.out.println("Eu preciso que voc� escreva 10 n�meros");

        int C = 1;


        while (A < 10) {

            System.out.println("Escreva o " + C + "� n�mero");

            C++;

            while (B == 0) {
                try {
                    B = Integer.parseInt(number.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("N�o entendi, repita por favor");
                }
            }

            numbers[A] = B;

            A++;
            B = 0;
        }


        int media = 0;
        int soma = 0;

        for (Integer num: numbers) {
            soma += num;
        }

        media = soma / numbers.length;

        System.out.println(" ");
        System.out.println("M�DIA = " + media);
        System.out.println("SOMA = " + soma);
    }
}