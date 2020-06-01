package FINALS;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class listMenu {
	private static JTable contactTable = new JTable();
public static void listProduct()
{
	 String columns[] =  { "Name", "Starting Inventory", "Received", "Shipped", "On Hand", "Minimum Required", "Needs Reorder", "Product Details", "Price"  };
	    
	  //JTable contactTable = new JTable();
	    DefaultTableModel tableModel;

	    // table with 4 columns
	    
	    tableModel = new DefaultTableModel(0,10);
	    tableModel.setColumnIdentifiers(columns);
	    contactTable.setModel(tableModel);
	    
	    String line;
	    BufferedReader reader;


	    try{       
	        reader = new BufferedReader(new FileReader("Products.txt"));

	        while((line = reader.readLine()) != null) 
	        {
	           tableModel.addRow(line.split("\t"));  
	        }
	        reader.close();
	     }
	    catch(IOException e1){
	        JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
	    }

	    JFrame f = new JFrame();
	   contactTable.setDefaultEditor(Object.class, null);
	  contactTable.addMouseListener(new Click());
	    JOptionPane.showMessageDialog(f, new JScrollPane(contactTable));
}
public static class Click extends MouseAdapter{
    public void mouseClicked(MouseEvent e) {
    	JFrame f = new JFrame();
        if(e.getClickCount()==2)
        {
            if(contactTable.getSelectedRow()==0)
            {
            	descriptionWindow1.main(null);
        	}
        
        	else if(contactTable.getSelectedRow()==1) 
            {
            	descriptionWindow2.main(null);
            }
        	else if(contactTable.getSelectedRow()==2)
        	{
        		descriptionWindow3.main(null);
        	}
        	else if(contactTable.getSelectedRow()==3)
            	{
        		descriptionWindow4.main(null);
            	}
        
        
    
    
    }

}
}
}



        
    

   



	  