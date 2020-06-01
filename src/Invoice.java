package FINALS;
import java.text.NumberFormat;
import java.util.*;

public class Invoice 
{
	// the instance variable
		private ArrayList<LineItem> lineItems = new ArrayList<LineItem>();
		
		public Invoice()
		{
			lineItems = new ArrayList<LineItem>();
		}
		
		public void addItem(LineItem m)
		{
			lineItems.add(m);
		}
		
		public ArrayList<LineItem> getLineItems()
		{
			return lineItems;
		}
		
		public double Total()
		{
			double invoiceTotal=0;
			for(LineItem lineItem : lineItems)
			{
				invoiceTotal+=lineItem.getTotal();
			}
			return invoiceTotal;
		}
		public String getTotalFormatted()
		{
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			return currency.format(Total());
		}

}