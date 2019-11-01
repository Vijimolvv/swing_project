package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scientific {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	double sqrt;
double y;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific window = new Scientific();
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
	public Scientific() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 691, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnSqrt.getText();
				textField.setText(Number);
				
				
				
				
			}
		});
		btnSqrt.setBounds(10, 80, 89, 23);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnx = new JButton("1/x");
		btnx.setBounds(98, 80, 89, 23);
		frame.getContentPane().add(btnx);
		
		JButton btnSin = new JButton("sin");
		btnSin.setBounds(184, 80, 89, 23);
		frame.getContentPane().add(btnSin);
		
		JButton button = new JButton("%");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
				
			}
		});
		button.setBounds(10, 102, 89, 23);
		frame.getContentPane().add(button);
		
		JButton btnExp = new JButton("Exp");
		btnExp.setBounds(98, 102, 89, 23);
		frame.getContentPane().add(btnExp);
		
		JButton btnCos = new JButton("cos");
		btnCos.setBounds(184, 102, 89, 23);
		frame.getContentPane().add(btnCos);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnXy.getText();
				textField.setText(Number);
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
			}
		});
		btnXy.setBounds(10, 124, 89, 23);
		frame.getContentPane().add(btnXy);
		
		JButton btnLn = new JButton("ln");
		btnLn.setBounds(98, 124, 89, 23);
		frame.getContentPane().add(btnLn);
		
		JButton btnTab = new JButton("tab");
		btnTab.setBounds(184, 124, 89, 23);
		frame.getContentPane().add(btnTab);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnX.getText();
				textField.setText(Number);
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^2";
				
			
			
			}
		});
		btnX.setBounds(10, 148, 89, 23);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setBounds(98, 148, 89, 23);
		frame.getContentPane().add(btnN);
		
		JButton btnSec = new JButton("sec");
		btnSec.setBounds(184, 148, 89, 23);
		frame.getContentPane().add(btnSec);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setBounds(10, 55, 46, 14);
		frame.getContentPane().add(lblScientific);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(292, 80, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(381, 80, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBounds(470, 80, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("/");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_4.setBounds(558, 80, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(302, 102, 26, 1);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String Number=textField.getText()+button_5.getText();
			textField.setText(Number);
		}
		});
		button_5.setBounds(292, 102, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setBounds(381, 102, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(470, 102, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_8.setBounds(558, 102, 89, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(292, 124, 89, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(381, 124, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(470, 124, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_12.setBounds(558, 124, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_13.getText();
				textField.setText(Number);
				
			}
		});
		button_13.setBounds(292, 148, 89, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton(".");
		button_14.setBounds(381, 148, 89, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
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
				if(op=="x^2")
				{
					result=num1*num1;
				ans=String.format("%2f",result);
				textField.setText(ans);
				
			
			}
				if(op=="x^y")
				{
					result=(Math.pow(num1, num2));
				ans=String.format("%2f",result);
				textField.setText(ans);
				
			
			}
			if(op=="%")
			{
				result=((num1/num2)*100);
				ans=String.format("%2f",result);
				textField.setText(ans);
			}}
		});
		button_15.setBounds(470, 148, 89, 23);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("+");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_16.setBounds(558, 148, 89, 23);
		frame.getContentPane().add(button_16);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setBounds(293, 50, 46, 25);
		frame.getContentPane().add(lblStandard);
		
		textField = new JTextField();
		textField.setBounds(10, 23, 634, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(21, 0, 46, 14);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(63, -4, 46, 23);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(113, 0, 46, 14);
		frame.getContentPane().add(lblHelp);
	}
}
