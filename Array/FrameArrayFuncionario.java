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

public class FrameArrayFuncionario extends JFrame {

    private JPanel contentPane;
    private JTextField Atext;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	FrameArrayFuncionario frame = new FrameArrayFuncionario();
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

    public FrameArrayFuncionario() {
        String[] C = new String[10];

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 580, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        Atext = new JTextField();
        Atext.setBounds(55, 93, 197, 20);
        contentPane.add(Atext);
        Atext.setColumns(10);

        JButton NumberButton = new JButton("Inserir nome");
        NumberButton.setBounds(85, 147, 143, 23);
        contentPane.add(NumberButton);

        JLabel lblNewLabel = new JLabel("Insira o nome de 10 funcion\u00E1rios:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(55, 59, 216, 23);
        contentPane.add(lblNewLabel);

        Label label = new Label("1\u00B0");
        label.setAlignment(Label.RIGHT);
        label.setFont(new Font("Dialog", Font.BOLD, 16));
        label.setBounds(24, 93, 29, 22);
        contentPane.add(label);

        JList list = new JList();
        list.setBounds(262, 59, 292, 191);
        contentPane.add(list);

        NumberButton.addActionListener(new ActionListener() {
            int A = 0;

            public void actionPerformed(ActionEvent e) {

            	try {
            		if(!Atext.getText().isEmpty()) {
            			if (C[9] == null) {
            				
            				C[A] = ((A + 1) + " - " + Atext.getText());
            				
            				list.setListData(C);            				
            				A++;
            				
            				label.setText((A + 1) + "°");
            				Atext.setText("");
            			} else {
            				JOptionPane.showMessageDialog(null, "Valor máximo de funcionários inseridos!");
            				Atext.setText("");
            			}
            		}else {
            			JOptionPane.showMessageDialog(null, "Preencha um valor!");
            		}
            	}catch(Exception excep) {
            		JOptionPane.showMessageDialog(null, "Ocorreu um erro, tente novamente!");
            		Atext.setText("");
            	}
            }
        });
    }
}