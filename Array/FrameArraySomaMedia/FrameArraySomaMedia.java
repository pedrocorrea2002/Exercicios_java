import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JList;

public class FrameArraySomaMedia extends JFrame {

    private JPanel contentPane;
    private JTextField Atext;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	FrameArraySomaMedia frame = new FrameArraySomaMedia();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public FrameArraySomaMedia() {

        String[] C = new String[10];
        int[] G = new int[10];

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 472, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        Atext = new JTextField();
        Atext.setBounds(55, 93, 197, 20);
        contentPane.add(Atext);
        Atext.setColumns(10);

        JButton NumberButton = new JButton("Inserir n\u00FAmero");
        NumberButton.setBounds(85, 124, 143, 23);
        contentPane.add(NumberButton);

        JLabel lblNewLabel = new JLabel("<html>Insira 10 n\u00FAmeros inteiros com no m\u00E1ximo 9 d\u00EDgitos:</html>");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(55, 41, 216, 46);
        contentPane.add(lblNewLabel);

        Label label = new Label("1\u00B0");
        label.setAlignment(Label.RIGHT);
        label.setFont(new Font("Dialog", Font.BOLD, 16));
        label.setBounds(24, 93, 29, 22);
        contentPane.add(label);

        JList list = new JList();
        list.setBounds(281, 59, 165, 191);
        contentPane.add(list);

        JLabel MediaLabel = new JLabel("M\u00C9DIA = ");
        MediaLabel.setBounds(40, 195, 212, 14);
        contentPane.add(MediaLabel);

        JLabel SomaLabel = new JLabel("SOMA = ");
        SomaLabel.setBounds(40, 220, 212, 14);
        contentPane.add(SomaLabel);

        NumberButton.addActionListener(new ActionListener() {
            int A = 0;

            public void actionPerformed(ActionEvent e) {

                try {
                    if (!Atext.getText().isEmpty()) {
                        int D = Integer.parseInt(Atext.getText());

                        if (C[9] == null) {

                            C[A] = (D + "");

                            G[A] = D;

                            list.setListData(C);

                            int media = 0;
                            int soma = 0;
                            
                            for(Integer g : G) {
                            	soma += g;
                            }
                            
                            media = soma/(A + 1);
                            
                            MediaLabel.setText("MÉDIA = " + media);
                            SomaLabel.setText("SOMA = " + soma);

                            A++;

                            label.setText((A + 1) + "°");
                            Atext.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "Valor máximo de valores inseridos");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Preencha um valor!");
                    }
                } catch (java.lang.NumberFormatException excep) {
                    JOptionPane.showMessageDialog(null, "Por favor, verifique o que você está digitando!");
                } catch (Exception excep) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro, tente novamente!");
                    Atext.setText("");
                }
            }
        });
    }
}