package GUI;

import Backend.DatabaseInterface;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class MainPage {

	private JFrame frame;
	private JLabel lblBitsCabs;
	private JLabel lblGrerger;
	private JLabel lblPassword;
	private JTextField txtUserId;
	private JTextField textField;
	private JButton btnLogIn;
	private JLabel lblNewUser;
	private JButton btnSignUp;
	private JLabel lblSignIn;
	private DatabaseInterface databaseInterface;



	/**
	 * Create the application.
	 */
	public MainPage(DatabaseInterface databaseInterface) {
		this.databaseInterface=databaseInterface;
	    initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void launch() {
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

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblGrerger = new JLabel("User ID");
		lblGrerger.setForeground(Color.BLACK);
		lblGrerger.setBackground(Color.LIGHT_GRAY);
		lblGrerger.setToolTipText("Enter User ID here.");
		lblGrerger.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrerger.setFont(new Font("Arial", Font.PLAIN, 20));
		lblGrerger.setBounds(209, 177, 151, 42);
		frame.getContentPane().add(lblGrerger);
		
		lblBitsCabs = new JLabel("BITS CABS SERVICES\r\n");
		lblBitsCabs.setHorizontalAlignment(SwingConstants.CENTER);
		lblBitsCabs.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblBitsCabs.setBounds(241, 10, 462, 42);
		frame.getContentPane().add(lblBitsCabs);
		
		lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPassword.setBounds(209, 243, 151, 42);
		frame.getContentPane().add(lblPassword);
		
		txtUserId = new JTextField();
		txtUserId.setFont(new Font("Arial", Font.PLAIN, 17));
		txtUserId.setBounds(368, 179, 321, 42);
		frame.getContentPane().add(txtUserId);
		txtUserId.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 17));
		textField.setBounds(367, 243, 322, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String user_id=txtUserId.getText();
                String password=textField.getText();
                System.out.println("ok");
                int wallet=databaseInterface.check(user_id,password);
                System.out.println(wallet);
                if(wallet==-1){
					JOptionPane.showMessageDialog(frame, "Wrong Credentials/New User please sign up.");
				}
                else if(wallet<300){
					new AddMoney(user_id,databaseInterface).launch();
				}
                else {
					new Profile(databaseInterface, user_id,wallet).launch();
				}
			}
		});
		btnLogIn.setFont(new Font("Arial", Font.PLAIN, 18));
		btnLogIn.setBounds(390, 340, 167, 44);
		frame.getContentPane().add(btnLogIn);
		
		lblNewUser = new JLabel("New user?");
		lblNewUser.setForeground(Color.WHITE);
		lblNewUser.setFont(new Font("Arial", Font.ITALIC, 20));
		lblNewUser.setBounds(726, 513, 107, 42);
		frame.getContentPane().add(lblNewUser);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignUp(databaseInterface).signUp();
			}
		});
		btnSignUp.setFont(new Font("Arial", Font.PLAIN, 20));
		btnSignUp.setBounds(842, 513, 134, 42);
		frame.getContentPane().add(btnSignUp);
		
		lblSignIn = new JLabel("Sign in");
		lblSignIn.setFont(new Font("Arial", Font.BOLD, 20));
		lblSignIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignIn.setBounds(320, 100, 299, 29);
		frame.getContentPane().add(lblSignIn);
	}
}
