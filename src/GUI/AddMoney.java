package GUI;

import Backend.DatabaseInterface;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMoney {

	private JFrame frame;
	private String user_id;
	private DatabaseInterface databaseInterface;

	/**
	 * Launch the application.
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

	/**
	 * Create the application.
	 */
	public AddMoney(String user_id,DatabaseInterface databaseInterface) {
		this.databaseInterface=databaseInterface;
		this.user_id=user_id;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInsufficientBalance = new JLabel("Cannot login, Insufficient Balance!");
		lblInsufficientBalance.setFont(new Font("Arial", Font.PLAIN, 20));
		lblInsufficientBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsufficientBalance.setBounds(58, 23, 329, 49);
		frame.getContentPane().add(lblInsufficientBalance);

		JTextField money = new JTextField();
		money.setFont(new Font("Arial", Font.PLAIN, 17));
		money.setBounds(161, 116, 90, 42);
		frame.getContentPane().add(money);
		money.setColumns(10);
		
		JButton btnAddMoney = new JButton("Add Money");
		btnAddMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int addMoney=Integer.parseInt(money.getText());
				databaseInterface.addMoney(user_id,addMoney);
				JOptionPane.showMessageDialog(frame, "added successfully.");

			}
		});
		btnAddMoney.setFont(new Font("Arial", Font.PLAIN, 20));
		btnAddMoney.setBounds(107, 179, 209, 39);
		frame.getContentPane().add(btnAddMoney);
		
		JLabel lblminimumBalanceReqired = new JLabel("Minimum balance required: 300");
		lblminimumBalanceReqired.setFont(new Font("Arial", Font.PLAIN, 17));
		lblminimumBalanceReqired.setBounds(98, 63, 251, 28);
		frame.getContentPane().add(lblminimumBalanceReqired);
	}
}
