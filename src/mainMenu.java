package FINALS;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;


public class mainMenu {
	private JFrame frmInvoiceV;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenu window = new mainMenu();
					window.frmInvoiceV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public mainMenu() {
		initialize();
	}

	private void initialize() {
		frmInvoiceV = new JFrame("Invoice Application v1.2");
		frmInvoiceV.setTitle("Invoice v1.2");
		frmInvoiceV.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\b331-u18\\Downloads\\icons8-shopping-cart-32.png"));
		frmInvoiceV.getContentPane().setLayout(null);

		JButton add = new JButton("ADD");
		add.setBorderPainted(false);
		add.setContentAreaFilled(false);
		add.setBorder(new CompoundBorder());
		add.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\icons8-add-new-32.png"));
		  add.setBackground(UIManager.getColor("Button.background"));
	       add.setForeground(Color.BLACK);
	       add.setFocusPainted(false);
	        add.setFont(new Font("Tahoma", Font.BOLD, 12));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
addMenu.main(null);

			}
		});
		add.setBounds(0, 11, 72, 28);
		frmInvoiceV.getContentPane().add(add);
		
		JButton del = new JButton("DELETE");
		del.setContentAreaFilled(false);
		del.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\icons8-cancel-32.png"));
		del.setBorderPainted(false);
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				deleteMenu.main(null);
			}
		});
		  del.setBackground(new Color(59, 89, 182));
	        del.setForeground(Color.BLACK);
	       del.setFocusPainted(false);
	        del.setFont(new Font("Tahoma", Font.BOLD, 12));
		del.setBounds(65, 11, 118, 28);
		frmInvoiceV.getContentPane().add(del);
		
		JButton search = new JButton("SEARCH");
		search.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\icons8-search-32.png"));
		search.setContentAreaFilled(false);
		search.setBorderPainted(false);
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				searchMenu.main(null);
			}
		});
		search.setBounds(162, 11, 122, 28);
		   search.setBackground(new Color(59, 89, 182));
	        search.setForeground(Color.BLACK);
	        search.setFocusPainted(false);
	        search.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmInvoiceV.getContentPane().add(search);
		
		JButton order = new JButton("ORDER");
		order.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\icons8-shopping-cart-32 (1).png"));
		order.setBorderPainted(false);
		order.setContentAreaFilled(false);
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				orderMenu.main(null);
			}
		});
		order.setBounds(75, 283, 118, 28);
		   order.setBackground(new Color(59, 89, 182));
	        order.setForeground(Color.BLACK);
	        order.setFocusPainted(false);
	        order.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmInvoiceV.getContentPane().add(order);
		
		JButton print = new JButton("PRINT");
		print.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\icons8-document-32.png"));
		print.setContentAreaFilled(false);
		print.setBorderPainted(false);
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				orderMenu.displayInvoice();
			}
		});
		print.setBounds(186, 283, 110, 28);
		   print.setBackground(new Color(59, 89, 182));
	        print.setForeground(Color.BLACK);
	        print.setFocusPainted(false);
	        print.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmInvoiceV.getContentPane().add(print);
		
		JButton help = new JButton("HELP");
		help.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\icons8-help-32.png"));
		help.setBorderPainted(false);
		help.setContentAreaFilled(false);
		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JFrame f=new JFrame(); 
				JOptionPane.showMessageDialog(f,events.displaymenu(),"Help Menu",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		help.setBounds(-22, 322, 118, 28);
		   help.setBackground(new Color(59, 89, 182));
	        help.setForeground(Color.BLACK);
	        help.setFocusPainted(false);
	        help.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmInvoiceV.getContentPane().add(help);
		//exit button
		JButton exit = new JButton("EXIT");
		exit.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\icons8-delete-32.png"));
		exit.setBorderPainted(false);
		exit.setContentAreaFilled(false);
		exit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		exit.setBounds(186, 322, 98, 28);
		   exit.setBackground(new Color(59, 89, 182));
	        exit.setForeground(Color.BLACK);
	        exit.setFocusPainted(false);
	        exit.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmInvoiceV.getContentPane().add(exit);
		
		JButton list = new JButton("LIST");
		list.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\icons8-database-32.png"));
		list.setContentAreaFilled(false);
		list.setBorderPainted(false);
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			listMenu.listProduct();
			}
			
		});
		
		list.setBounds(-13, 283, 98, 28);
		   list.setBackground(new Color(59, 89, 182));
	        list.setForeground(Color.BLACK);
	        list.setFocusPainted(false);
	        list.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmInvoiceV.getContentPane().add(list);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kirsnet\\Desktop\\sasa\\ezgif.com-resize (1).gif"));
		lblNewLabel.setBounds(46, 60, 228, 212);
		frmInvoiceV.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kirsnet\u2122");
		lblNewLabel_1.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(112, 330, 67, 14);
		frmInvoiceV.getContentPane().add(lblNewLabel_1);
		//frame properties
		frmInvoiceV.setBounds(100, 100, 300, 400);
		frmInvoiceV.setLocationRelativeTo(null);
		frmInvoiceV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}