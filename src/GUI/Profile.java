package GUI;

import Backend.DatabaseInterface;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Profile {

	private JFrame frame;
	private DatabaseInterface databaseInterface;
	private String user_name;
	private int wallet;
	/**
	 * Launch the application.
	 */
	 void launch() {
		initialize();
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
	 Profile(DatabaseInterface databaseInterface,String user_name,int wallet) {
		this.databaseInterface=databaseInterface;
		this.user_name=user_name;
		this.wallet=wallet;
	}

	private void notFound(){

	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBookCab = new JLabel("Book Cab");
		lblBookCab.setFont(new Font("Arial", Font.BOLD, 25));
		lblBookCab.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookCab.setBounds(282, 114, 429, 54);
		frame.getContentPane().add(lblBookCab);
		
		JLabel lblAvailableBalance = new JLabel("Available Balance");
		lblAvailableBalance.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAvailableBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvailableBalance.setBounds(811, 10, 165, 32);
		frame.getContentPane().add(lblAvailableBalance);
		
		JLabel lblBalDisp = new JLabel(String.valueOf(wallet));
		lblBalDisp.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalDisp.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBalDisp.setBackground(Color.WHITE);
		lblBalDisp.setBounds(845, 35, 96, 32);
		frame.getContentPane().add(lblBalDisp);
		
		JLabel lblPickup = new JLabel("Pick-up");
		lblPickup.setHorizontalAlignment(SwingConstants.CENTER);
		lblPickup.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPickup.setBounds(219, 194, 129, 40);
		frame.getContentPane().add(lblPickup);
		
		JLabel lblDrop = new JLabel("Drop");
		lblDrop.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrop.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDrop.setBounds(221, 260, 127, 40);
		frame.getContentPane().add(lblDrop);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItem("A");
		comboBox.addItem("B");
		comboBox.addItem("C");
		comboBox.addItem("D");
		comboBox.addItem("E");
		comboBox.addItem("F");
		comboBox.addItem("G");
		comboBox.addItem("H");
		comboBox.addItem("I");
		comboBox.addItem("J");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(358, 194, 285, 40);
		frame.getContentPane().add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<>();
		comboBox_1.addItem("A");
		comboBox_1.addItem("B");
		comboBox_1.addItem("C");
		comboBox_1.addItem("D");
		comboBox_1.addItem("E");
		comboBox_1.addItem("F");
		comboBox_1.addItem("G");
		comboBox_1.addItem("H");
		comboBox_1.addItem("I");
		comboBox_1.addItem("J");
		comboBox_1.setSelectedItem(null);
		comboBox_1.setBounds(360, 257, 283, 40);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnBookMyCab = new JButton("Book my Cab!");
		btnBookMyCab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BookedCabDetails().launch();
			}
		});
		btnBookMyCab.setFont(new Font("Arial", Font.BOLD, 16));
		btnBookMyCab.setBounds(398, 336, 210, 54);
		frame.getContentPane().add(btnBookMyCab);
		
		JLabel lblWelcome = new JLabel("Welcome,");
		lblWelcome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblWelcome.setBounds(10, 35, 112, 24);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblname = new JLabel(user_name);
		lblname.setFont(new Font("Arial", Font.PLAIN, 20));
		lblname.setBounds(132, 37, 182, 24);
		frame.getContentPane().add(lblname);
	}
}
