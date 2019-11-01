package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class ticket {
String tot;
String tax1,cal;

String name,nam1,nam, number;
double ac=500,nac=300,seater=300,sleeper=500,single=500,doub=700,nsss=2800,per,tax2,,tax3;
double tax;
double t=0,n;
String m="";
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
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
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setBounds(77, 11, 557, 50);
		lblTicketBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketBooking.setFont(new Font("Times New Roman", Font.BOLD, 28));
		frame.getContentPane().add(lblTicketBooking);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(42, 120, 46, 14);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(104, 119, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(6, 164, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnAdult = new JRadioButton("adult");
		rdbtnAdult.setBounds(222, 164, 49, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnSingle = new JRadioButton("single ");
		rdbtnSingle.setBounds(111, 164, 63, 23);
		frame.getContentPane().add(rdbtnSingle);
		
		

		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setBounds(92, 206, 46, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(162, 206, 70, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		
		
		
		
		JRadioButton rdbtnFirstClass = new JRadioButton("first class");
		rdbtnFirstClass.setBounds(6, 206, 70, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnChild = new JRadioButton("child");
		rdbtnChild.setBounds(237, 206, 62, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 241, 98, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ARUNACHAL PRADESH", "GOA", "KERALA", "TAMILNADU", "KARNATAKA", "UTTARPRADESH", "BIHAR", "GUJARAT"}));
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(139, 241, 81, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ARUNACHAL PRADESH", "GOA", "KERALA", "TAMILNADU", "KARNATAKA", "UTTARPRADESH", "BIHAR", "GUJARAT"}));
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(232, 241, 54, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 296, 263, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 155, 276, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(327, 283, 86, 2);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setToolTipText("");
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(293, 155, 18, 303);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setBounds(10, 309, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(6, 348, 70, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(6, 388, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 306, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 345, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 385, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.setBounds(6, 435, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				
				
				
				
				
				
				
				//String m="";
				if(rdbtnSingle.isSelected())
				{
					t=t+500;
				}
				else {
					t=t+700;
				}
				
				
				
				if(rdbtnAc.isSelected())
				{
					t=t+500;
				}
				else {
					
					t=t+300;
				}
				
				
				if(rdbtnSleeper.isSelected())
				{
					t=t+500;
				}
				else {
					t=t+300;
				}
				m=m+t;
				tax2=Double.parseDouble(textField_1.getText());
				
number=(String)comboBox_2.getSelectedItem();
				
				textField_2.setText(number);
				tax3=(Double.valueOf(m))*number;
			
			
			textField_2.setText(String.valueOf(tax3));
			tax=tax3+tax2;
				
				textField_3.setText(String.valueOf(tax));
			
				
				
				
				
				
				
				
				
				
textField_10.setText(String.valueOf(tax));
				
				
				name=textField.getText();
				textField_4.setText(name);
				nam=(String)comboBox.getSelectedItem();
				
				textField_5.setText(nam);
nam1=(String)comboBox_1.getSelectedItem();
				
				textField_6.setText(nam1);
				
				
				
				Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_8.setText(tTime.format(timer.getTime()));
                //Date
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_7.setText(tdate.format(timer.getTime()));
				
				
				
				
				
				
			
			}

			private boolean rdbtnSleeper(boolean b) {
				// TODO Auto-generated method stub
				return false;
			}

			private boolean rdbtnAc(boolean b) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(111, 435, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				
				textField.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				
				
				
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(210, 435, 70, 23);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame, "Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{		
		System.exit(0);
			}}
		});
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(-20, 413, 307, 2);
		frame.getContentPane().add(separator_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(372, 99, 322, 331);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(30, 86, 46, 14);
		panel.add(lblName_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(86, 83, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(30, 127, 46, 14);
		panel.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(30, 163, 46, 14);
		panel.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(30, 206, 46, 14);
		panel.add(lblDate);
		
		JLabel lblNewLabel_1 = new JLabel("Time");
		lblNewLabel_1.setBounds(30, 241, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(86, 124, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(86, 160, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(86, 203, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(86, 238, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblTicketNumber = new JLabel("Ticket Number");
		lblTicketNumber.setBounds(228, 67, 84, 14);
		panel.add(lblTicketNumber);
		
		textField_9 = new JTextField();
		textField_9.setBounds(228, 83, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(228, 140, 73, 14);
		panel.add(lblPrice);
		
		textField_10 = new JTextField();
		textField_10.setBounds(228, 163, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(228, 217, 46, 14);
		panel.add(lblRoute);
		
		textField_11 = new JTextField();
		textField_11.setBounds(226, 238, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_10.setText(String.valueOf(tax));
				
				
				name=textField.getText();
				textField_4.setText(name);
				nam=(String)comboBox.getSelectedItem();
				
				textField_5.setText(nam);
nam1=(String)comboBox_1.getSelectedItem();
				
				textField_6.setText(nam1);
				
				
				
				Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_8.setText(tTime.format(timer.getTime()));
                //Date
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_7.setText(tdate.format(timer.getTime()));
				
				
				
			}
		});
		btnConfirm.setBounds(150, 295, 89, 23);
		panel.add(btnConfirm);
		
		table = new JTable();
		table.setBounds(10, 485, 691, 109);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of seats", "Time", "Date", "Ac/NonAc", "Price"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		frame.getContentPane().add(table);
		
	}
}
