package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class Weight {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double kg;
	String height;
	String ans;
	String  ans1;
	double result;
	double result1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Weight window = new Weight();
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
	public Weight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and weight Converter");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Help");
		lblNewLabel.setBounds(10, 11, 120, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(286, 81, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(286, 131, 46, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				num2=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				result=num1*30.48;
				result1=num2*.45;
				//ans=String.format("%2f",result);
				//textField_3.setText(ans);
				//ans1=String.format("%2f",result1);
				//textField_2.setText(ans1);
				
				ans=String.format("%.2f",result);
				label.setText(ans);
				ans1=String.format("%.2f",result1);
				label_1.setText(ans1);
				
				
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(150, 171, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setBounds(278, 171, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("About");
		lblNewLabel_1.setBounds(84, 20, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblUsMeasurement = new JLabel("US measurement");
		lblUsMeasurement.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsMeasurement.setBounds(150, 50, 109, 14);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMetric.setBounds(286, 50, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(97, 81, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(97, 131, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		textField = new JTextField();
		textField.setBounds(153, 75, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 128, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
	}
}
