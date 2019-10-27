import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMoney {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMoney window = new AddMoney();
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
	public AddMoney() {
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
		
		JLabel lblInsufficientBalance = new JLabel("Insufficient Balance!");
		lblInsufficientBalance.setFont(new Font("Arial", Font.PLAIN, 25));
		lblInsufficientBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsufficientBalance.setBounds(58, 47, 317, 49);
		frame.getContentPane().add(lblInsufficientBalance);
		
		JButton btnAddMoney = new JButton("Add Money (+300)");
		btnAddMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddMoney.setFont(new Font("Arial", Font.PLAIN, 20));
		btnAddMoney.setBounds(107, 139, 209, 39);
		frame.getContentPane().add(btnAddMoney);
	}

}
