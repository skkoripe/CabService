import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class BookedCabDetails {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookedCabDetails window = new BookedCabDetails();
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
	public BookedCabDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCabBookingConfirmed = new JLabel("Cab Booking Confirmed!");
		lblCabBookingConfirmed.setFont(new Font("Arial", Font.BOLD, 25));
		lblCabBookingConfirmed.setHorizontalAlignment(SwingConstants.CENTER);
		lblCabBookingConfirmed.setBounds(189, 30, 604, 64);
		frame.getContentPane().add(lblCabBookingConfirmed);
		
		JLabel lblCabDetails = new JLabel("Cab Details:");
		lblCabDetails.setFont(new Font("Arial", Font.BOLD, 20));
		lblCabDetails.setBounds(120, 148, 231, 40);
		frame.getContentPane().add(lblCabDetails);
		
		JLabel lbldriverName = new JLabel("//Driver name");
		lbldriverName.setFont(new Font("Arial", Font.PLAIN, 20));
		lbldriverName.setBounds(158, 198, 316, 64);
		frame.getContentPane().add(lbldriverName);
		
		JLabel lblcarNumber = new JLabel("//Car number");
		lblcarNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		lblcarNumber.setBounds(502, 198, 338, 65);
		frame.getContentPane().add(lblcarNumber);
		
		JLabel lblRating = new JLabel("Rating:");
		lblRating.setFont(new Font("Arial", Font.PLAIN, 20));
		lblRating.setBounds(502, 272, 64, 40);
		frame.getContentPane().add(lblRating);
		
		JLabel label = new JLabel("//0.5");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(568, 272, 55, 40);
		frame.getContentPane().add(label);
		
		JLabel lblStars = new JLabel("stars");
		lblStars.setFont(new Font("Arial", Font.PLAIN, 20));
		lblStars.setBounds(621, 272, 110, 40);
		frame.getContentPane().add(lblStars);
		
		JLabel lblphoneNo = new JLabel("//Phone no");
		lblphoneNo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblphoneNo.setBounds(160, 272, 231, 40);
		frame.getContentPane().add(lblphoneNo);
		
		JLabel lblEstimatedPrice = new JLabel("Estimated Price:");
		lblEstimatedPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEstimatedPrice.setBounds(178, 389, 148, 40);
		frame.getContentPane().add(lblEstimatedPrice);
		
		JLabel lblEstimPrice = new JLabel("//estimated Price");
		lblEstimPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEstimPrice.setBounds(336, 389, 206, 40);
		frame.getContentPane().add(lblEstimPrice);
		
		JLabel lblApproximateDistance = new JLabel("Approx Distance:");
		lblApproximateDistance.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApproximateDistance.setFont(new Font("Arial", Font.PLAIN, 20));
		lblApproximateDistance.setBounds(120, 450, 206, 40);
		frame.getContentPane().add(lblApproximateDistance);
		
		JLabel lblApproxDist = new JLabel("//approx Dist");
		lblApproxDist.setFont(new Font("Arial", Font.PLAIN, 20));
		lblApproxDist.setBounds(336, 450, 206, 40);
		frame.getContentPane().add(lblApproxDist);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Arial", Font.PLAIN, 20));
		btnClose.setBounds(751, 464, 185, 55);
		frame.getContentPane().add(btnClose);
	}
}
