package FINALS;

import java.util.*;

public class events 
{

	events(){}
	
	public static String displaymenu()
	{
		String m=
		("Command Menu\n" +
		"Add - input new product in the database\n" +
		"Delete - delete product in the database\n" +
		"Search - search product in the database\n" +

		"List - list all products in the database\n" +
		"Order Items - create invoice\n" +
		"Print - display invoice\n" +
		"Help - show Command Menu\n" +
		"Exit - exit this application");
		return m;
	}

}