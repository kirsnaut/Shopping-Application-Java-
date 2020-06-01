package FINALS;
import java.util.*;
import java.io.*;
import java.nio.file.*;


public class IO 
{
	private static final Path productsPath = Paths.get("Products.txt");
	private static final File productsFile = productsPath.toFile();
	private static final String FIELD_SEP = "\t";
	private static List <Product> products = getAll();
	//
	IO()
	{
		
	}
	//
	public static Product get(String name)
	{	
		for(Product p : products)
		{
			if(p.getName().equals(name))
				return p;
		}
		return null;
	}
	//
	public static List <Product> getAll()
	{
		if(products!= null)
		{
			return products;
		}
		
		products = new ArrayList<Product>();
		if(Files.exists(productsPath))
		{
			try (BufferedReader in = new BufferedReader(new FileReader(productsFile)))
			{
			// read all products stored in the file into the array list
			String line = in.readLine();
					while(line!=null)
					{
						String [] columns = line.split(FIELD_SEP);
						String name = columns[0];
						String startingInventory = columns[1];
						String received = columns[2];
						String shipped = columns[3];
						String onHand = columns[4];
						String minimumRequired = columns[5];
						String needsReorder = columns[6];
						String productDetails = columns[7];
						String price = columns[8];
						
						Product p = new Product();
						p.setName(name);
						p.setStartingInventory(startingInventory);
						p.setReceived((received));
						p.setShipped(shipped);
						p.setOnHand((onHand));
						p.setMinimumRequired(minimumRequired);
						p.setNeedsReorder(needsReorder);
						p.setProductDetails(productDetails);
						p.setPrice((price));
						
						products.add(p);
						line = in.readLine();
					}
					
			}
			catch(IOException e)
			{
				System.out.println(e);
				return null;
			}	
		}
		return products;
	}
	private static boolean saveAll()
	{
		try(PrintWriter out = new PrintWriter( new BufferedWriter( new FileWriter(productsFile))))
		{
			//write all products in the array list to the file
			
			for(Product p: products)
			{
				out.print(p.getName() + FIELD_SEP);
				out.print(p.getStartingInventory() + FIELD_SEP);
				out.print(p.getReceived() + FIELD_SEP);
				out.print(p.getShipped() + FIELD_SEP);
				out.print(p.getOnHand() + FIELD_SEP);
				out.print(p.getMinimumRequired() + FIELD_SEP);
				out.print(p.getNeedsReorder() + FIELD_SEP);
				out.print(p.getProductDetails()+FIELD_SEP);
				out.println(p.getPrice());
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			return false;
		}
		return true;
	}
	//
	public static boolean add(Product p)
	{
		products.add(p);
		return saveAll();
	}
	//
	public static boolean delete(Product p)
	{
		products.remove(p);
		return saveAll();
	}
	
	/*public static boolean update(Product newProduct)
	{
		Product oldProduct = get(newProduct.getName());
		int i = products.indexOf(oldProduct);
		products.remove(i);
		
		products.add(i,newProduct);
		return saveAll();
	}  */
	
	@SuppressWarnings("resource")
	public static boolean checkDuplicate(String name) throws IOException
	{
		final Scanner scanner = new Scanner(productsPath);

		while (scanner.hasNextLine()) {
		   final String lineFromFile = scanner.nextLine();
		   if(lineFromFile.contains(name)) { 
		       // a match!

		       return true;
		   }
		}
		    	return false;

	}
  
}