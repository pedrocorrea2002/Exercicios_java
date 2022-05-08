import java.util.Scanner;

import javax.swing.JOptionPane;

public class BemVindo {
    public static void main(String[] args) {

        String nome = null, cidade = null;
        int idade = 0;
        
        Scanner leitor = new Scanner(System.in).useDelimiter("\n");;

        JOptionPane.showMessageDialog(null, "Ol�","Bem vindo", JOptionPane.INFORMATION_MESSAGE);

        while (nome == null || nome.isEmpty()) {
            nome = JOptionPane.showInputDialog("Qual � o seu nome?");

            if (nome == null || nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "N�o entendi, repita por favor","Bem Vindo",JOptionPane.ERROR_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome,"Bem vindo", JOptionPane.INFORMATION_MESSAGE);

        while (idade == 0) {
            try {
                idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � a sua idade?"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "N�o entendi, repita por favor","Bem Vindo",JOptionPane.ERROR_MESSAGE);
            }
        }

        while (cidade == null || cidade.isEmpty()) {
            cidade = JOptionPane.showInputDialog("E voc� mora onde?");

            if (cidade == null || cidade.isEmpty()) {
                JOptionPane.showMessageDialog(null, "N�o entendi, repita por favor","Bem Vindo",JOptionPane.ERROR_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "Prazer em conhece-lo, " + nome + " de " + idade + " anos que mora em " + cidade + " [^-^]","Bem vindo", JOptionPane.PLAIN_MESSAGE);
    }
}