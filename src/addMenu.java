package FINALS;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class addMenu {

	private JFrame frame;
	private JTextField nameInput;
	private JTextField startingInventoryInput;
	private JTextField receivedInput;
	private JTextField shippedInput;
	private JTextField onHandInput;
	private JTextField minimumRequirementInput;
	private JTextField productDetailsInput;
	private JTextField priceInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMenu window = new addMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public addMenu() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Add a Product");
		frame.getContentPane().setLayout(null);
		JLabel name = new JLabel("Product Name:");
		name.setBounds(30, 32, 60, 14);
		frame.getContentPane().add(name);
		
		nameInput = new JTextField();
		nameInput.setBounds(132, 29, 161, 20);
		frame.getContentPane().add(nameInput);
		nameInput.setColumns(10);
		
		JLabel startingInventory = new JLabel("Starting Inventory:");
		startingInventory.setBounds(30, 60, 110, 14);
		frame.getContentPane().add(startingInventory);
		
		startingInventoryInput = new JTextField();
		startingInventoryInput.setColumns(10);
		startingInventoryInput.setBounds(132, 57, 161, 20);
		frame.getContentPane().add(startingInventoryInput);
		
		JLabel received = new JLabel("Received:");
		received.setBounds(30, 88, 60, 14);
		frame.getContentPane().add(received);
		
		receivedInput = new JTextField();
		receivedInput.setColumns(10);
		receivedInput.setBounds(132, 85, 161, 20);
		frame.getContentPane().add(receivedInput);
		
		JLabel shipped = new JLabel("Shipped:");
		shipped.setBounds(30, 116, 46, 14);
		frame.getContentPane().add(shipped);
		
		shippedInput = new JTextField();
		shippedInput.setColumns(10);
		shippedInput.setBounds(132, 113, 161, 20);
		frame.getContentPane().add(shippedInput);
		
		JLabel onHand = new JLabel("On Hand:");
		onHand.setBounds(30, 144, 46, 14);
		frame.getContentPane().add(onHand);
		
		onHandInput = new JTextField();
		onHandInput.setColumns(10);
		onHandInput.setBounds(132, 141, 161, 20);
		frame.getContentPane().add(onHandInput);
		
		JLabel minimumRequired = new JLabel("Minimum Requirement:");
		minimumRequired.setBounds(30, 172, 110, 14);
		frame.getContentPane().add(minimumRequired);
		
		minimumRequirementInput = new JTextField();
		minimumRequirementInput.setColumns(10);
		minimumRequirementInput.setBounds(150, 169, 143, 20);
		frame.getContentPane().add(minimumRequirementInput);
		
		JLabel needsReorder = new JLabel("Needs Reorder:");
		needsReorder.setBounds(30, 200, 89, 14);
		frame.getContentPane().add(needsReorder);
		
		JLabel productDetails = new JLabel("Product Details:");
		productDetails.setBounds(30, 228, 89, 14);
		frame.getContentPane().add(productDetails);
		
		productDetailsInput = new JTextField();
		productDetailsInput.setColumns(10);
		productDetailsInput.setBounds(132, 225, 161, 20);
		frame.getContentPane().add(productDetailsInput);
		
		JLabel price = new JLabel("Price:");
		price.setBounds(30, 256, 46, 14);
		frame.getContentPane().add(price);
		
		priceInput = new JTextField();
		priceInput.setColumns(10);
		priceInput.setBounds(132, 253, 161, 20);
		frame.getContentPane().add(priceInput);
		
		JRadioButton yesInput = new JRadioButton("Yes");
		yesInput.setBounds(160, 195, 46, 23);
		frame.getContentPane().add(yesInput);
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton noInput = new JRadioButton("No");
		noInput.setBounds(208, 195, 46, 23);
		frame.getContentPane().add(noInput);
		group.add(noInput);
		group.add(yesInput);
		JButton btnNewButton = new JButton("Add Product");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{

				JFrame f=new JFrame();
									Product product = new Product();
									product.setName(nameInput.getText());
									product.setStartingInventory(startingInventoryInput.getText());
									product.setReceived((receivedInput.getText()));
									product.setShipped(shippedInput.getText());
									product.setOnHand(onHandInput.getText());
									product.setMinimumRequired(minimumRequirementInput.getText());
										if(yesInput.isSelected())
										{
											product.setNeedsReorder("Yes");
										}
										else
										{
											product.setNeedsReorder("no");
										}
									product.setProductDetails(productDetailsInput.getText());
									product.setPrice(priceInput.getText());
									try {
										if(IO.checkDuplicate(nameInput.getText())==false)
										{
										IO.add(product);
										JOptionPane.showMessageDialog(f,product.getName() + " was added to the database.");
										frame.dispose();
										}
										else
										{
											 f=new JFrame();
											JOptionPane.showMessageDialog(f,"The product already exists in the database. Please use a different product name.","Error",JOptionPane.ERROR_MESSAGE);
										}
									} catch (HeadlessException | IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									

					}
					});

				
			
		
		btnNewButton.setBounds(67, 298, 105, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				frame.dispose();	
			}
		});
		btnNewButton_1.setBounds(182, 298, 105, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		frame.setBounds(100, 100, 335, 408);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}