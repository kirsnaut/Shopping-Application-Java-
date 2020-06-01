package FINALS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deleteMenu {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteMenu window = new deleteMenu();
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
	public deleteMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Delete a Product.");
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Product Name:");
		label.setBounds(31, 45, 79, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(117, 42, 169, 20);
		frame.getContentPane().add(textField);
		
		JButton deleteProduct = new JButton("Delete Product");
		deleteProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Product product = IO.get(textField.getText());
				if(product == null)
				{
					JFrame frame= new JFrame();
					JOptionPane.showMessageDialog(frame ,"Error. Unable to get product", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					IO.delete(product);
					JFrame f= new JFrame();
					JOptionPane.showMessageDialog(f , product.getName() + " was deleted from the database.");
					frame.dispose();
				}

			}
		});
		deleteProduct.setBounds(49, 94, 103, 23);
		frame.getContentPane().add(deleteProduct);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
			}
		});
		cancelButton.setBounds(173, 94, 103, 23);
		frame.getContentPane().add(cancelButton);
		
		
		frame.setBounds(100, 100, 328, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}