import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayMaiorMenorSalario {
    public static void main(String[] args) {

        int A = 0;
        double B = 0;
        @SuppressWarnings("resource")
        Scanner number = new Scanner(System.in).useDelimiter("\n");
        DecimalFormat df = new DecimalFormat("0.00");
        double[] salarios = new double[10];

        System.out.println("Eu preciso que você escreva o salário de 10 pessoas");

        int C = 1;

        while (A < 10) {

            System.out.println("Escreva o " + C + "° salário");

            C++;

            while (B == 0) {
                try {
                    B = Integer.parseInt(number.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Não entendi, repita por favor");
                }
            }

            salarios[A] = B;

            A++;
            B = 0;
        }

        double maior = 0;
        double menor = Double.MAX_VALUE;

        for(double salario : salarios) {
        	if(salario > maior) {
        		maior = salario;
        	}
        	
        	if(salario < menor) {
        		menor = salario;
        	}
        }

        System.out.println(" ");
        System.out.println("MAIOR SALÁRIO = R$" + df.format(maior));
        System.out.println("MENOR SALÁRIO = R$" + df.format(menor));
    }
}