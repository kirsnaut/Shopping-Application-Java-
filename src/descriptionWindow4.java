package FINALS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class descriptionWindow4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					descriptionWindow4 window = new descriptionWindow4();
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
	public descriptionWindow4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\Android-Tools.jpg"));
		lblNewLabel.setBounds(10, 11, 291, 215);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Android Dev");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(99, 237, 176, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblComputeintensiveusocket = new JLabel("<html>\tAndroid software development is the process by which new applications are created for devices running the Android operating system.</html>");
		lblComputeintensiveusocket.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComputeintensiveusocket.setBounds(10, 237, 291, 135);
		frame.getContentPane().add(lblComputeintensiveusocket);
		frame.setBounds(100, 100, 327, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
