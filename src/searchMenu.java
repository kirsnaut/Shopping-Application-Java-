package FINALS;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class searchMenu {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchMenu window = new searchMenu();
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
	public searchMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Search a Product");
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Product Name:");
		label.setBounds(37, 46, 79, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(123, 43, 169, 20);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("Search Product");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JFrame f = new JFrame();
				
			    BufferedReader reader = null;
			    File file = new File("Products.txt");
				Scanner scanner = null;
				try {
					scanner = new Scanner(file);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  boolean nameFound = false;
				  while (scanner.hasNextLine()) {
				     final String lineFromFile = scanner.nextLine();
				     if(lineFromFile.contains(textField.getText())) 
				     { 	
				    	 StringBuilder sb = new StringBuilder();
				    	 String line = lineFromFile.toString();
				    	 String columns[] =  {  "Name", "Starting Inventory", "Received", "Shipped", "On Hand", "Minimum Required", "Needs Reorder", "Product Details", "Price"  };
				 	    JTable contactTable = new JTable();
				 	    
				 	    DefaultTableModel tableModel;
				    	   tableModel = new DefaultTableModel(0,5);
				   	    tableModel.setColumnIdentifiers(columns);
				   	    contactTable.setModel(tableModel);
					    tableModel.addRow(line.split("\t"));  


					    JOptionPane.showMessageDialog(null, new JScrollPane(contactTable),"PRODUCT FOUND!",JOptionPane.PLAIN_MESSAGE);
						nameFound = true;
	
				         frame.dispose();
				     }	   
				     }
				   if(!nameFound)
				   {
				    	JOptionPane.showMessageDialog(f,"Product name is not found.","Error",JOptionPane.WARNING_MESSAGE);
				    	/* String Condition=Console.getString("Would you like to add it?(y/n) ");
				    	 if(Condition.equalsIgnoreCase("y")||Condition.equalsIgnoreCase("yes"))
				    	 addProduct();*/
				  }
			  }

			
		});
		button.setBounds(55, 95, 103, 23);
		frame.getContentPane().add(button);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
			}
		});
		cancelButton.setBounds(179, 95, 103, 23);
		frame.getContentPane().add(cancelButton);
		frame.setBounds(100, 100, 328, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}