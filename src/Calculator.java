import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	
	double num=0,ans=0;
	int calculation=0;
    
	
	
	public void arithmetic_operation(){
		
		switch(calculation) {
		case 1:
			ans=num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 2:
			ans=num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
			
		case 3:
			ans=num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 4:
			ans=num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		case 5:
			ans=num % Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		}
	}
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 397, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 13, 346, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		//........................row1......................
		
				JButton btnbackspace = new JButton("<-");
				btnbackspace.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
					int length=textField.getText().length();
					int number=textField.getText().length()-1;
			         String store;
					
			         
			         if(length>0)
			         {
			        	 StringBuilder back=new StringBuilder(textField.getText());
			        	 back.deleteCharAt(number);
			        	 store=back.toString();
			        	 textField.setText(store);
			         }
					}
				});
				btnbackspace.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnbackspace.setBounds(22, 69, 73, 50);
				frame.getContentPane().add(btnbackspace);
				
				JButton btnclr = new JButton("C");
				btnclr.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						
						textField.setText("");
					}
				});
				btnclr.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnclr.setBounds(112, 69, 73, 50);
				frame.getContentPane().add(btnclr);
				
				JButton btnpercntage = new JButton("%");
				btnpercntage.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//textField.setText(textField.getText()+"%");
					
						num=Double.parseDouble(textField.getText());
						calculation=5;
						textField.setText("");
						
					}
				});
				btnpercntage.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnpercntage.setBounds(200, 69, 73, 50);
				frame.getContentPane().add(btnpercntage);
				
				JButton btnplus = new JButton("+");
				btnplus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						//textField.setText(textField.getText()+"+");
						num=Double.parseDouble(textField.getText());
						calculation=1;
						textField.setText("");
						
					}
				});
				btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnplus.setBounds(285, 69, 73, 50);
				frame.getContentPane().add(btnplus);

		
	//........................row2......................
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent arg0) {
							
				textField.setText(textField.getText()+"7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(22, 129, 73, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textField.setText(textField.getText()+"8");
				}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(112, 129, 73, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent arg0) {
		
			textField.setText(textField.getText()+"9");
		
		}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(200, 129, 73, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				//textField.setText(textField.getText()+"-");
			
				num=Double.parseDouble(textField.getText());
				calculation=2;
				textField.setText("");
			
			
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(285, 129, 73, 50);
		frame.getContentPane().add(btnsub);
		
		//...............................row3...............................
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textField.setText(textField.getText()+"4");			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(22, 192, 73, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"5");
			
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(112, 192, 73, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(200, 192, 73, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//textField.setText(textField.getText()+"*");			
				
				num=Double.parseDouble(textField.getText());
				calculation=3;
				textField.setText("");
			
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul.setBounds(285, 192, 73, 50);
		frame.getContentPane().add(btnmul);
		
		
		//...............................row4...............................
				
		        JButton btn1 = new JButton("1");
		        btn1.addActionListener(new ActionListener() {
		        	
		        	public void actionPerformed(ActionEvent arg0) {
		        	
		        		textField.setText(textField.getText()+"1");
		        	}
		        });
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(22, 255, 73, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						textField.setText(textField.getText()+"2");
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(112, 255, 73, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
					
						
						textField.setText(textField.getText()+"3");
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(200, 255, 73, 50);
				frame.getContentPane().add(btn3);
				
				JButton btndiv = new JButton("/");
				btndiv.addActionListener(new ActionListener() {
					
					
				public void actionPerformed(ActionEvent arg0) {
				
					//textField.setText(textField.getText()+"/");
				
					
					num=Double.parseDouble(textField.getText());
					calculation=4;
					textField.setText("");
				}
				});
				btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btndiv.setBounds(285, 255, 73, 50);
				frame.getContentPane().add(btndiv);
	
		
				
//...............................row5...............................
				
		        JButton btn0 = new JButton("0");
		        btn0.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent arg0) {
		        	
		        		textField.setText(textField.getText()+"0");
		        	}
		        });
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(22, 318, 73, 50);
				frame.getContentPane().add(btn0);
				
				JButton btndot = new JButton(".");
				btndot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						textField.setText(textField.getText()+".");
					}
				});
				btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btndot.setBounds(112, 318, 73, 50);
				frame.getContentPane().add(btndot);
				
				JButton btnpm = new JButton("\u00B1");
				btnpm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						double ops = Double.parseDouble(String.valueOf(textField.getText()));
						ops =ops*(-1);
						textField.setText(String.valueOf(ops));
					
					}
				});
				btnpm.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnpm.setBounds(200, 318, 73, 50);
				frame.getContentPane().add(btnpm);
				
				JButton btnequal = new JButton("=");
				btnequal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						arithmetic_operation();
											
					num=0;
					ans=0;
					}
				});
				btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnequal.setBounds(285, 320, 73, 50);
				frame.getContentPane().add(btnequal);
		
	}
}

