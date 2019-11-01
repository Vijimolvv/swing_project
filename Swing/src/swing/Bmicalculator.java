package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Dimension;

public class Bmicalculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	double hight;
	double weight;
	double bm;
String bmi;
private JTable table;
private JTable table_2;
	//String height;
	//String ans;
	//String  ans1;
	
	//double result1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bmicalculator window = new Bmicalculator();
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
	public Bmicalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("BODY MASS INDEX");
		frame.getContentPane().setSize(new Dimension(300, 30));
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setBounds(100, 100, 450, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(242, 145, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(348, 145, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		textField = new JTextField();
		textField.setBounds(242, 37, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 90, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(99, 40, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(111, 106, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(111, 145, 46, 14);
		frame.getContentPane().add(lblBmi);
		
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				hight=Double.parseDouble(textField.getText());
				textField.setText("");
				weight=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
			bm=(hight*hight);
			double result=weight/bm;
				//ans=String.format("%2f",result);
				//textField_3.setText(ans);
				//ans1=String.format("%2f",result1);
				//textField_2.setText(ans1);
				
				bmi=String.format("%.2f",result);
				lblNewLabel.setText(bmi);
				//ans1=String.format("%.2f",result1);
				//label_1.setText(ans1);
				if(result<=18.5)
				{
					lblNewLabel_1.setText("Under weight");
				}
				else if(result<=24.9 && result>18.5)
				{
					lblNewLabel_1.setText("Normal weight");
				}
				else if(result< 29.9 && result>25)
				{
					lblNewLabel_1.setText("Over weight");
				}
				else
				{
					lblNewLabel_1.setText("Obesity");
				}
					
			}
		});
		btnNewButton.setBounds(132, 177, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		btnNewButton_1.setBounds(242, 177, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(348, 177, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 437, 36);
		frame.getContentPane().add(panel);
		
		JLabel lblBodyMassIndex = new JLabel("BODY MASS INDEX");
		lblBodyMassIndex.setForeground(new Color(34, 139, 34));
		lblBodyMassIndex.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(0, 37, 434, 167);
		frame.getContentPane().add(panel_1);
		
		table = new JTable();
		table.setBounds(86, 250, 1, 1);
		frame.getContentPane().add(table);
		
		table_2 = new JTable();
		table_2.setBounds(20, 355, 417, -30);
		frame.getContentPane().add(table_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(39, 246, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
