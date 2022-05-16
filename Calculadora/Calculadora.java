import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;
import javax.swing.BoundedRangeModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField operation;
	private JTextField result;
	private JTextField expression;
	//private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		
		setForeground(Color.GRAY);
		setFont(new Font("Arial Black", Font.BOLD, 16));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_9 = new JButton("9");
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_9.setBounds(257, 166, 116, 62);
		contentPane.add(btn_9);
		
		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_7.setBounds(5, 166, 116, 62);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_8.setBounds(131, 166, 116, 62);
		contentPane.add(btn_8);
		
		JButton btn_4 = new JButton("4");
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_4.setBounds(5, 233, 116, 62);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_5.setBounds(131, 233, 116, 62);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_6.setBounds(257, 233, 116, 62);
		contentPane.add(btn_6);
		
		JButton btn_1 = new JButton("1");
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_1.setBounds(5, 300, 116, 62);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_2.setBounds(131, 300, 116, 62);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_3.setBounds(257, 300, 116, 62);
		contentPane.add(btn_3);
		
		JButton btn_0 = new JButton("0");
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_0.setBounds(5, 367, 116, 62);
		contentPane.add(btn_0);
		
		JButton btn_plus = new JButton("+");
		btn_plus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_plus.setBounds(383, 166, 93, 62);
		contentPane.add(btn_plus);
		
		JButton btn_minus = new JButton("-");
		btn_minus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_minus.setBounds(383, 233, 93, 62);
		contentPane.add(btn_minus);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_multiply.setBounds(383, 300, 93, 62);
		contentPane.add(btn_multiply);
		
		JButton btn_divide = new JButton("/");
		btn_divide.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_divide.setBounds(383, 367, 93, 62);
		contentPane.add(btn_divide);
		
		JTextField textField = new JTextField();
		BoundedRangeModel brm = textField.getHorizontalVisibility();
		JScrollBar scroll = new JScrollBar(JScrollBar.HORIZONTAL);
		scroll.setModel(brm);
		
		textField.setBounds(5, 35, 471, 125);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		contentPane.add(scroll);
		
		JButton btn_equals = new JButton("=");
		btn_equals.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_equals.setBounds(257, 367, 116, 62);
		contentPane.add(btn_equals);
		
		JButton btn_dot = new JButton(".");
		btn_dot.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_dot.setBounds(131, 367, 116, 62);
		contentPane.add(btn_dot);
		
		num1 = new JTextField();
		num1.setText("");
		num1.setForeground(SystemColor.control);
		num1.setEditable(false);
		num1.setBounds(10, 62, 86, 0);
		contentPane.add(num1);
		num1.setColumns(10);
		
		operation = new JTextField();
		operation.setText("");
		operation.setForeground(SystemColor.menu);
		operation.setEditable(false);
		operation.setColumns(10);
		operation.setBounds(180, 62, 86, 0);
		contentPane.add(operation);
		
		result = new JTextField();
		result.setBackground(SystemColor.control);
		result.setEditable(false);
		result.setBounds(242, 61, 86, 0);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton btn_clear = new JButton("C");
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_clear.setBounds(7, 5, 89, 23);
		contentPane.add(btn_clear);
		
		expression = new JTextField();
		expression.setFont(new Font("Tahoma", Font.BOLD, 11));
		expression.setHorizontalAlignment(SwingConstants.RIGHT);
		expression.setEditable(false);
		expression.setBounds(106, 6, 370, 20);
		contentPane.add(expression);
		expression.setColumns(10);
		
		////////////// CONFIGURAÇÃO DE NÚMEROS ///////////////////
		
		btn_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "1");
            }
        });
		btn_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "2");
            }
        });
		btn_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "3");
            }
        });
		btn_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "4");
            }
        });
		btn_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "5");
            }
        });
		btn_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "6");
            }
        });
		btn_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "7");
            }
        });
		btn_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "8");
            }
        });
		btn_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "9");
            }
        });
		btn_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText().equals("S")) {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	textField.setText(textField.getText() + "0");
            }
        });
		
		
		
		//////////////CONFIGURAÇÃO DE BOTÕES ESPECIAIS ///////////////////
		
		btn_dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(result.getText() == "S") {
            		textField.setText("");
            		result.setText("N");
            	}
            	
            	try {            		
            		Integer.parseInt(textField.getText().substring(textField.getText().length() - 1));
            		
            		if(textField.getText().indexOf(".") == -1) {            			
            			textField.setText(textField.getText() + ".");
            		}
            	}catch(Exception excep) {}
            }
        });
		
		btn_plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(!textField.getText().isEmpty()) {   
            		operation.setText("+");
            		
            		try {            			
            			if(num1.getText().isEmpty()) {
            				num1.setText(textField.getText());
            				textField.setText("");
            				
            				expression.setText(num1.getText() + " + ? =");
            			}else {
            				float num2 = Float.parseFloat(textField.getText());
            				
            				float countResult = Float.parseFloat(num1.getText()) + num2;
            				
            				textField.setText("" + countResult);
            				
            				num1.setText("");
            				result.setText("S");
            			}
            		}catch(Exception excep) {
            			textField.setText("ERROR!");
            		}
            	}
            }
        });
		
		btn_minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(!textField.getText().isEmpty()) {
            		operation.setText("-");
            		
            		try {
            			if(num1.getText().isEmpty()) {
            				num1.setText(textField.getText());
            				textField.setText("");
            				
            				expression.setText(num1.getText() + " - ? =");
            			}else {
            				float num2 = Float.parseFloat(textField.getText());
            				
            				float countResult = Float.parseFloat(num1.getText()) - num2;
            				
            				textField.setText("" + countResult);
            				
            				num1.setText("");
            				result.setText("S");
            			}            			
            		}catch(Exception excep) {
            			textField.setText("ERROR!");
            		}
            	}
            }
        });
		
		btn_multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(!textField.getText().isEmpty()) {  
            		operation.setText("*");
            		
            		try {
            			if(num1.getText().isEmpty()) {
            				num1.setText(textField.getText());
            				textField.setText("");
            				
            				expression.setText(num1.getText() + " * ? =");
            			}else {
            				float num2 = Float.parseFloat(textField.getText());
            				
            				float countResult = Float.parseFloat(num1.getText()) * num2;
            				
            				textField.setText("" + countResult);
            				
            				expression.setText(num1.getText() + " * " + num2 + " = " + countResult);
            				num1.setText("");
            				result.setText("S");
            			}
            		}catch(Exception excep) {
            			textField.setText("ERROR!");
            		}
            	}
            }
        });
		
		btn_divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(!textField.getText().isEmpty()) {
            		operation.setText("/");
            		
            		try {            			
            			if(num1.getText().isEmpty()) {
            				num1.setText(textField.getText());
            				textField.setText("");
            				
            				expression.setText(num1.getText() + " / ? =");
            			}else {
            				float num2 = Float.parseFloat(textField.getText());
            				
            				float countResult = Float.parseFloat(num1.getText()) / num2;
            				
            				textField.setText("" + countResult);
            				
            				expression.setText(num1.getText() + " / " + num2 + " = " + countResult);
            				num1.setText("");
            				result.setText("S");
            			}
            		}catch(Exception excep) {
            			textField.setText("ERROR!");
            		}
            	}
            }
        });
		
		btn_equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(!textField.getText().isEmpty()) {
            		
            		try {
            			if(!num1.getText().isEmpty()) {
                			float num2 = Float.parseFloat(textField.getText());
                			
                			if(operation.getText().equals("+")) {            				
                				float countResult = Float.parseFloat(num1.getText()) + num2;
                				           				
                				textField.setText("" + countResult);
                				expression.setText(num1.getText() + " + " + num2 + " = " + countResult);
                			}
                			else if(operation.getText().equals("-")) {
                				float countResult = Float.parseFloat(num1.getText()) - num2;
                				         				
                				textField.setText("" + countResult);
                				expression.setText(num1.getText() + " - " + num2 + " = " + countResult);
                			}
                			else if(operation.getText().equals("*")) {
                				float countResult = Float.parseFloat(num1.getText()) * num2;
                				         				
                				textField.setText("" + countResult);
                				expression.setText(num1.getText() + " * " + num2 + " = " + countResult);
                			}
                			else if(operation.getText().equals("/")) {
                				float countResult = Float.parseFloat(num1.getText()) / num2;
                				
                				textField.setText("" + countResult);
                				expression.setText(num1.getText() + " / " + num2 + " = " + countResult);
                			}
                			
                			num1.setText("");
                			result.setText("S");
                		}
            		}catch(Exception excep) {
            			textField.setText("ERROR!");
            		}
            	}
            }
        });
		
		btn_clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	num1.setText("");
            	operation.setText("");
            	result.setText("");
            	textField.setText("");
            	expression.setText("");
            }
        });
	}
}
