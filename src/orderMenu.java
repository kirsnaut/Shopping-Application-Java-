package FINALS;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.*;
import java.awt.event.ActionEvent;

public class orderMenu {

	private JFrame frame;
	private JTextField textField;
	private JTextField productNameText;
	static Invoice invoice = new Invoice();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderMenu window = new orderMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */

	public orderMenu() throws IOException {
		initialize();
	}
	public static void displayInvoice()
	{
		JFrame f = new JFrame();
	StringBuilder sb = new StringBuilder();

	sb.append(StringUtil.pad("Description", 34));
	sb.append(StringUtil.pad("Price: ", 10));
	sb.append(StringUtil.pad("Qty: ", 5));
	sb.append(StringUtil.pad("Total: ", 10));
	sb.append("\n");
	
	for(LineItem lineItem : invoice.getLineItems())
	{
		Product product = lineItem.getProduct();
		product.decreaseOnHand(lineItem.getQuantity());
		sb.append(StringUtil.pad(product.getName(), 34));
		sb.append(StringUtil.pad(product.getPriceFormatted(), 10));
		sb.append(StringUtil.pad(lineItem.getQuantityFormatted(), 5));
		sb.append(StringUtil.pad(lineItem.getTotalFormatted(), 10));
		sb.append("\n" + "\n");
	}
	sb.append(StringUtil.spad("Invoice Total:  " +invoice.getTotalFormatted(), 64));
	JOptionPane.showMessageDialog(f,sb + "\n","Order List",JOptionPane.PLAIN_MESSAGE);
}



	private void initialize() throws IOException  {
		frame = new JFrame("Order a Product");
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Product Name:");
		label.setBounds(27, 37, 79, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(113, 62, 169, 20);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("Order Product");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JFrame f = new JFrame();
					
						try {
							if(IO.checkDuplicate(productNameText.getText())==true) 
							{
							int quantity = Integer.parseInt(textField.getText());
							
							Product product = new Product();
							 product = IO.get(productNameText.getText());
							invoice.addItem(new LineItem(product,quantity));
							JOptionPane.showMessageDialog(f,"Product " + productNameText.getText()+" was succesfully added to your list.","Success",JOptionPane.INFORMATION_MESSAGE);
							textField.setText(null);
							productNameText.setText(null);
							}
							 
							else
							{
								JOptionPane.showMessageDialog(f,"Product does not exist in the database.","Error",JOptionPane.WARNING_MESSAGE);
							}
						} catch (NumberFormatException | HeadlessException | IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

		
			}
		});
		button.setBounds(26, 114, 103, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				frame.dispose();
			}
		});
		button_1.setBounds(216, 114, 68, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_1 = new JLabel("Quantity:");
		label_1.setBounds(27, 65, 79, 14);
		frame.getContentPane().add(label_1);
		
		productNameText = new JTextField();
		productNameText.setColumns(10);
		productNameText.setBounds(113, 34, 169, 20);
		frame.getContentPane().add(productNameText);
		
		JButton button_2 = new JButton("Help");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				listMenu.listProduct();
			}
		});
		button_2.setBounds(139, 114, 68, 23);
		frame.getContentPane().add(button_2);
		frame.setBounds(100, 100, 328, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}