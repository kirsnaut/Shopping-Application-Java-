package FINALS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class descriptionWindow1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					descriptionWindow1 window = new descriptionWindow1();
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
	public descriptionWindow1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\DELLservers.jpg"));
		lblNewLabel.setBounds(10, 11, 291, 215);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CISCO Router");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(91, 237, 144, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblComputeintensiveusocket = new JLabel("<html>\tCisco routers and routing products can transform your network and deliver high security and reliable service to campus, data center, and branch networks.</html>");
		lblComputeintensiveusocket.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComputeintensiveusocket.setBounds(10, 237, 291, 135);
		frame.getContentPane().add(lblComputeintensiveusocket);
		frame.setBounds(100, 100, 327, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
