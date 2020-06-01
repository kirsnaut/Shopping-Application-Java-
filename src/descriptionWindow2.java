package FINALS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class descriptionWindow2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					descriptionWindow2 window = new descriptionWindow2();
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
	public descriptionWindow2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\419Z4Et-nhL._SL500_AC_SS350_.jpg"));
		lblNewLabel.setBounds(10, 11, 291, 215);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dell Server");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(104, 237, 105, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblComputeintensiveusocket = new JLabel("<html>\tCompute-intensive 4U, 4-socket rack server designed <br>for demanding\r\nenterprise applications and featuring<br>\r\nindustry-leading internal storage and\r\nmemory scalability to optimize application\r\nperformance.</html>");
		lblComputeintensiveusocket.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComputeintensiveusocket.setBounds(10, 237, 291, 135);
		frame.getContentPane().add(lblComputeintensiveusocket);
		frame.setBounds(100, 100, 327, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
