package GUI;

import Backend.DatabaseInterface;
import Backend.UserInfoValidator;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SignUp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private DatabaseInterface databaseInterface;
	/**
	 * Launch the application.
	 */
	 void signUp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	 SignUp(DatabaseInterface databaseInterface) {
		this.databaseInterface=databaseInterface;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSighUp = new JLabel("Sign Up");
		lblSighUp.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblSighUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSighUp.setBounds(253, 45, 494, 53);
		frame.getContentPane().add(lblSighUp);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(164, 150, 126, 40);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setBounds(300, 150, 398, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserId.setFont(new Font("Arial", Font.PLAIN, 20));
		lblUserId.setBounds(164, 200, 126, 40);
		frame.getContentPane().add(lblUserId);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_1.setBounds(300, 200, 398, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("Phone no.");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPhoneNo.setBounds(164, 250, 126, 40);
		frame.getContentPane().add(lblPhoneNo);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_2.setBounds(300, 251, 398, 40);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmailID = new JLabel("E-mail ID");
		lblEmailID.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailID.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEmailID.setBounds(164, 300, 126, 40);
		frame.getContentPane().add(lblEmailID);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_3.setBounds(300, 301, 398, 40);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPassword.setBounds(164, 350, 126, 40);
		frame.getContentPane().add(lblPassword);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_4.setBounds(300, 351, 398, 40);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok");
				int validityCheck=new UserInfoValidator(databaseInterface).validate(textField.getText(),
                        textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText());
				switch(validityCheck){
					case -2: JOptionPane.showMessageDialog(frame, "user_id needs to be unique, please try again.");
					break;
					case -1: JOptionPane.showMessageDialog(frame, "Fields cannot be left blank/ invalid phone number.");
					break;
					case 1: boolean store=databaseInterface.store(textField.getText(),textField_1.getText()
							,textField_2.getText(),textField_3.getText(),textField_4.getText());
					if(!store){
						JOptionPane.showMessageDialog(frame, "Server issue, try later.");
					}
					else{
						JOptionPane.showMessageDialog(frame, "Added successfully.");
					}
				}
			}
		});
		btnCreate.setFont(new Font("Arial", Font.BOLD, 20));
		btnCreate.setBounds(394, 452, 227, 46);
		frame.getContentPane().add(btnCreate);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
