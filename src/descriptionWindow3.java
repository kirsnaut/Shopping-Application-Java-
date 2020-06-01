package FINALS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class descriptionWindow3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					descriptionWindow3 window = new descriptionWindow3();
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
	public descriptionWindow3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\flex_Chromebooks-ValueSeekers.jpg"));
		lblNewLabel.setBounds(0, 11, 311, 215);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Google ChromeBooks");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(52, 237, 223, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblComputeintensiveusocket = new JLabel("<html>\tThe Chromebook is a new, faster computer. It starts in seconds, and offers thousands of apps. It has built-in virus protection, and backs up your stuff in the cloud. With automatic updates, it keeps getting better.</html>");
		lblComputeintensiveusocket.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComputeintensiveusocket.setBounds(10, 237, 291, 135);
		frame.getContentPane().add(lblComputeintensiveusocket);
		frame.setBounds(100, 100, 327, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
