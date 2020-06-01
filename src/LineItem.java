package FINALS;
import java.text.*;

public class LineItem 
{
// data member variables
	private Product product;
	private int quantity;
	
	public LineItem()
	{
		this.product = new Product();
		this.quantity = 0;
	}
	
	public LineItem(Product product, int quantity)
	{
		this.product = product;
		this.quantity = quantity;
	}
	//
	public void setProduct(Product product)
	{
		this.product = product;
	}
	public Product getProduct()
	{
		return product;
	}
	//
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
		double total = quantity * product.getPrice();
		return total;
	}
	public String getTotalFormatted()
	{
		double total = this.getTotal();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(total);
	}
	public String getQuantityFormatted()
	{
		int quantity = this.getQuantity();
		NumberFormat currency = NumberFormat.getNumberInstance();
		return currency.format(quantity);
	}
	
}