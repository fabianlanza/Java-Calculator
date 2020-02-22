package Calculators;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculatorBuilder {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorBuilder window = new CalculatorBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 280, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 243, 32);
		
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//------------------Row 1-------------------------
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace = strB.toString();
					textField.setText(backspace);
					
				}
			
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackSpace.setBounds(10, 72, 60, 60);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(71, 72, 60, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(132, 72, 60, 60);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(193, 72, 60, 60);
		frame.getContentPane().add(btnDiv);
		
		
		//------------------Row 2-------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 133, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(71, 133, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(132, 133, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
					
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(193, 133, 60, 60);
		frame.getContentPane().add(btnPlus);
		
		//------------------Row 3-------------------------
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn4.getText();
						textField.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(10, 194, 60, 60);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn5.getText();
						textField.setText(EnterNumber);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBounds(71, 194, 60, 60);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn6.getText();
						textField.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(132, 194, 60, 60);
				frame.getContentPane().add(btn6);
				
				JButton btnSub = new JButton("-");
				btnSub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "-";
					}
				});
				btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnSub.setBounds(193, 194, 60, 60);
				frame.getContentPane().add(btnSub);
				
				//------------------Row 4-------------------------
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn1.getText();
						textField.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 255, 60, 60);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn2.getText();
						textField.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(71, 255, 60, 60);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn3.getText();
						textField.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(132, 255, 60, 60);
				frame.getContentPane().add(btn3);
				
				JButton btnMult = new JButton("*");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "*";
					}
				});
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMult.setBounds(193, 255, 60, 60);
				frame.getContentPane().add(btnMult);
				
				//------------------Row 5-------------------------
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textField.getText() + btn0.getText();
						textField.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(10, 316, 60, 60);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(71, 316, 60, 60);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("+-");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					double ops = Double.parseDouble(String.valueOf(textField.getText()));
					ops = ops * (-1);
					textField.setText(String.valueOf(ops));
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPM.setBounds(132, 316, 60, 60);
				frame.getContentPane().add(btnPM);
				
				JButton btnPercent = new JButton("%");
				btnPercent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "%";
					}
				});
				btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPercent.setBounds(193, 316, 60, 60);
				frame.getContentPane().add(btnPercent);
				
				
		
		
		
			
		
	}
}
