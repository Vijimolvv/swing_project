package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JTextPane;

public class Sample {

	private JFrame frame;
	private JTable table;
	private JTextField txtEnterYourName;
	private JTextField txtEnterYourPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setForeground(Color.MAGENTA);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(123, 223, -63, -22);
		frame.getContentPane().add(table);
		
		txtEnterYourName = new JTextField();
		txtEnterYourName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		txtEnterYourName.setText("enter your user name");
		txtEnterYourName.setBounds(200, 95, 150, 20);
		frame.getContentPane().add(txtEnterYourName);
		txtEnterYourName.setColumns(10);
		
		txtEnterYourPassword = new JPasswordField();
		txtEnterYourPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		txtEnterYourPassword.setText("enter your password");
		txtEnterYourPassword.setBounds(200, 131, 173, 20);
		frame.getContentPane().add(txtEnterYourPassword);
		txtEnterYourPassword.setColumns(10);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserName.setBounds(93, 69, 79, 75);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setBounds(76, 121, 96, 41);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("FORGOT PASSWORD");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 8));
		chckbxNewCheckBox.setBounds(276, 158, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.setBounds(284, 228, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBounds(173, 232, 89, 23);
		frame.getContentPane().add(btnSignUp);
	}
}
