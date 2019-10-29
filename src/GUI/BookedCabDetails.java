package GUI;

import Backend.DriverDetails;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class BookedCabDetails {

	private JFrame frame;
	private String pickup;
	private String drop;
	private DriverDetails driverDetails;

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
	public BookedCabDetails(DriverDetails driverDetails,String pickup,String drop) {
		this.driverDetails=driverDetails;
		this.pickup=pickup;
		this.drop=drop;
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
		lblCabDetails.setBounds(120, 190, 231, 40);
		frame.getContentPane().add(lblCabDetails);
		
		JLabel lbldriverName = new JLabel(driverDetails.name);
		lbldriverName.setFont(new Font("Arial", Font.PLAIN, 20));
		lbldriverName.setBounds(159, 248, 316, 64);
		frame.getContentPane().add(lbldriverName);
		
		JLabel lblcarNumber = new JLabel(driverDetails.carNo);
		lblcarNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		lblcarNumber.setBounds(503, 248, 338, 65);
		frame.getContentPane().add(lblcarNumber);
		
		JLabel lblRating = new JLabel("rating");
		lblRating.setFont(new Font("Arial", Font.PLAIN, 20));
		lblRating.setBounds(503, 322, 64, 40);
		frame.getContentPane().add(lblRating);
		
		JLabel label = new JLabel(""+driverDetails.rating);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(569, 322, 55, 40);
		frame.getContentPane().add(label);
		
		JLabel lblStars = new JLabel("stars");
		lblStars.setFont(new Font("Arial", Font.PLAIN, 20));
		lblStars.setBounds(622, 322, 110, 40);
		frame.getContentPane().add(lblStars);
		
		JLabel lblphoneNo = new JLabel(""+driverDetails.phone_no);
		lblphoneNo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblphoneNo.setBounds(161, 322, 231, 40);
		frame.getContentPane().add(lblphoneNo);
		
		JLabel lblEstimatedPrice = new JLabel("Estimated Price:");
		lblEstimatedPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEstimatedPrice.setBounds(178, 412, 148, 40);
		frame.getContentPane().add(lblEstimatedPrice);

		int distance=(int)pickup.charAt(0)-(int)drop.charAt(0);
		distance=Math.abs(distance);
		JLabel lblEstimPrice = new JLabel(distance*10+" Rs");
		lblEstimPrice.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEstimPrice.setBounds(336, 412, 206, 40);
		frame.getContentPane().add(lblEstimPrice);
		
		JLabel lblApproximateDistance = new JLabel("Approx Distance:");
		lblApproximateDistance.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApproximateDistance.setFont(new Font("Arial", Font.PLAIN, 20));
		lblApproximateDistance.setBounds(120, 450, 206, 40);
		frame.getContentPane().add(lblApproximateDistance);
		
		JLabel lblApproxDist = new JLabel(distance+" km");
		lblApproxDist.setFont(new Font("Arial", Font.PLAIN, 20));
		lblApproxDist.setBounds(336, 450, 206, 40);
		frame.getContentPane().add(lblApproxDist);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Arial", Font.PLAIN, 20));
		btnClose.setBounds(751, 464, 185, 55);
		frame.getContentPane().add(btnClose);
		
		JLabel lblstartingPlace = new JLabel(pickup);
		lblstartingPlace.setFont(new Font("Arial", Font.PLAIN, 18));
		lblstartingPlace.setBounds(328, 118, 64, 40);
		frame.getContentPane().add(lblstartingPlace);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setFont(new Font("Arial", Font.BOLD, 18));
		lblTo.setBounds(414, 120, 42, 37);
		frame.getContentPane().add(lblTo);
		
		JLabel lblend = new JLabel(drop);
		lblend.setFont(new Font("Arial", Font.PLAIN, 18));
		lblend.setBounds(466, 119, 110, 39);
		frame.getContentPane().add(lblend);
		
		JLabel lblJourney = new JLabel("Journey:");
		lblJourney.setFont(new Font("Arial", Font.BOLD, 20));
		lblJourney.setBounds(195, 117, 84, 40);
		frame.getContentPane().add(lblJourney);
	}
}
