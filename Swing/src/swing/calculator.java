package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator1");
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setForeground(Color.RED);
		button.setBackground(Color.MAGENTA);
		button.setBounds(115, 74, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBackground(Color.MAGENTA);
		button_1.setForeground(Color.RED);
		button_1.setBounds(199, 74, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBackground(Color.MAGENTA);
		button_2.setForeground(Color.RED);
		button_2.setBounds(284, 74, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(368, 74, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBackground(Color.MAGENTA);
		button_3.setForeground(Color.BLACK);
		button_3.setBounds(115, 94, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setBackground(Color.MAGENTA);
		button_4.setForeground(Color.BLACK);
		button_4.setBounds(199, 94, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setBackground(Color.MAGENTA);
		button_5.setBounds(284, 94, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_6.setBackground(Color.MAGENTA);
		button_6.setBounds(368, 94, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBackground(Color.MAGENTA);
		button_7.setBounds(115, 117, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setBackground(Color.MAGENTA);
		button_8.setBounds(199, 117, 89, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBackground(Color.MAGENTA);
		button_9.setBounds(284, 117, 89, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_10.setBackground(Color.MAGENTA);
		button_10.setBounds(368, 117, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBackground(Color.MAGENTA);
		button_11.setBounds(115, 137, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_12.setBackground(Color.MAGENTA);
		button_12.setBounds(199, 137, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%2f",result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%2f",result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%2f",result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%2f",result);
					textField.setText(ans);
				}
			}
		});
		button_13.setBackground(Color.MAGENTA);
		button_13.setBounds(284, 137, 89, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_14.setBackground(Color.MAGENTA);
		button_14.setBounds(368, 137, 89, 23);
		frame.getContentPane().add(button_14);
		
		textField = new JTextField();
		textField.setBounds(115, 25, 209, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("CLEAR");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				
			}
		});
		btnC.setBackground(Color.MAGENTA);
		btnC.setBounds(115, 162, 103, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("BACK");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
					
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
					
				}
		
			}
		});
		btnB.setBackground(Color.MAGENTA);
		btnB.setBounds(209, 162, 103, 23);
		frame.getContentPane().add(btnB);
		
		JButton button_15 = new JButton("%");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_15.setBackground(Color.MAGENTA);
		button_15.setBounds(312, 162, 122, 23);
		frame.getContentPane().add(button_15);
	}
}
