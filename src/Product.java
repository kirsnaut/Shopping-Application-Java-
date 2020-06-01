package FINALS;
import java.text.*;
public class Product
{
			private String name;
			private String startingInventory;
			private int received;
			private String shipped;
			private int onHand;
			private String minimumRequired;
			private String needsReorder;
			private String productDetails;
			private double price;
			private int quantity;
			public Product()
			{
				name = "";
				startingInventory = "";
				received = 0;
				shipped = "";
				onHand=0;
				needsReorder="";
				productDetails = "";
				price = 0;
				quantity = 0;
			}
			public void setName(String name)
			{
			this.name = name;
			}
			public String getName()
			{
				return name;
			}
			public void setStartingInventory(String startinginventory)
			{
			this.startingInventory = startinginventory;
			}
			public String getStartingInventory()
			{
				return startingInventory;
			}
			public void setReceived(String received)
			{

			this.received = Integer.parseInt(received);
			}
			public int getReceived()
			{
				return received;
			}
			public void setShipped(String shipped)
			{
			this.shipped = shipped;
			}
			public String getShipped()
			{
				return shipped;
			}
			public void setOnHand(String onHand)
			{
			this.onHand = Integer.parseInt(onHand);
			}
			public void decreaseOnHand(int number)
			{
			this.onHand-= number;
			}
			public String getOnHand()
			{
				String m = "" + onHand;
				return m;
			}
			public void setMinimumRequired(String minimumRequired)
			{
			this.minimumRequired = minimumRequired;
			}
			public String getMinimumRequired()
			{
				return minimumRequired;
			}
			public void setNeedsReorder(String needsReorder)
			{
			this.needsReorder = needsReorder;
			}
			public String getNeedsReorder()
			{
				return needsReorder;
			}
			public void setProductDetails(String productDetails)
			{
			this.productDetails = productDetails;
			}
			public String getProductDetails()
			{
				return productDetails;
			}
			public void setPrice(String price)
			{
			this.price = Double.parseDouble(price);
			}
			public double getPrice()
			{
				return price;
			}
			public void setQuantity(int quantity)
			{
				this.quantity = quantity;
			}
			public int getQuantity()
			{
				return quantity;
			}

			public double getTotal()
			{

				double total = quantity * price;
				return total;
			}

			public String getPriceFormatted()
			{
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String priceFormatted = currency.format(price);
			return priceFormatted;
			}
			public String getTotalFormatted()
			{
				double total = this.getTotal();
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				return currency.format(total);
			}

			

}